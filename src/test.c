void myFunction(int myNumbers[5], char isOdd) {
    char character[10] = "hello";
    for (int i = 0; i < 5; i++) {
        if(isOdd == 'y'){
            printf("%d\n", myNumbers[i]);
        }
    }
}
int main(int args[100]) {
    int myNumbers[5] = {10, 20, 30, 40, 50};
    int counter = 5;
    char c;
    myFunction(myNumbers, 'y');
    return 0;
}