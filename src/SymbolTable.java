import java.util.ArrayList;
import java.util.Hashtable;

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

    public SymbolTable getParent() {
        return parent;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(String.format("---------%s: %d---------\n", name, line));
        for (String key : hashtable.keySet()) {
            string.append(String.format("Key: %s | %s\n", key, hashtable.get(key)));
        }
        string.append("\n===========================================================================\n\n");
        return string.toString();
    }
}
