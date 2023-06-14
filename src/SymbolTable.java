import java.util.*;

public class SymbolTable {
    private final Hashtable<String, String> hashtable;
    private final ArrayList<SymbolTable> children = new ArrayList<>();
    private SymbolTable parent;
    private final int line;
    private final String name;

    public SymbolTable(int line, String name) {
        this.name = name;
        this.line = line;
        hashtable = new Hashtable<>();
        if (name.equals("program")) {
            parent = null;
        }
    }

    public void insert(String idefName, String attributes) {
        hashtable.put(idefName, attributes);
    }

    public String lookup(String idefName) {
        return hashtable.get(idefName);
    }

    public void addChild(SymbolTable childTable) {
        children.add(childTable);
    }

    public void setParent(SymbolTable parent) {
        this.parent = parent;
    }

    public ArrayList<SymbolTable> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public int getLine() {
        return line;
    }

    public SymbolTable getParent() {
        return parent;
    }

    public SymbolTable getChild(String name) {
        SymbolTable current = this;
        if (children.isEmpty()) {
            if (current.getName().equals(name)) return current;
            else return null;
        } else {
            for (SymbolTable table : children) {
                current = table.getChild(name);
                if (current != null) return current;
            }
        }
        return null;
    }

    public Set<SymbolTable> getAllChildren() {
        Set<SymbolTable> all = new LinkedHashSet<>();
        all.add(this);
        if (!children.isEmpty()) {
            for (SymbolTable table : children) {
                all.addAll(table.getAllChildren());
            }
        }
        return all;
    }

    @Override
    public String toString() {
        Set<SymbolTable> all = getAllChildren();
        StringBuilder string = new StringBuilder();
        for (SymbolTable table : all) {
            string.append(String.format("---------%s: %d---------\n", table.getName(), table.getLine()));
            for (String key : table.hashtable.keySet()) {
                string.append(String.format("Key: %s | %s\n", key, table.hashtable.get(key)));
            }
            string.append("\n===========================================================================\n\n");
        }

        return string.toString();
    }
}
