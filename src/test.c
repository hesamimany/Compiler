void myFunction(int myNumbers[5], char isOdd) {
    char character[10] = "hello";
    int num = 12;
    for (int i = 0; i < 5; i++) {
        if(isOdd == 'y'){
            printf("%d\n", myNumbers[i]);
            if(1){
                int test = 5;
            }
            if(0){
               printf("%d\n", myNumbers[i]);
            }
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