#include<stdio.h>
int main() {
    int num;
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    printf("enter numbers (0 to exxist)\n");
   

    while(1) {
        printf("enter a number : ");
        scanf("%d", &num);

        if (num ==0) {
            break;
        }else if (num >0){
            positiveCount++;
        }else {
            negativeCount++;
        }

 
    }
    printf("count of positive numbers: %d\n");
    printf("count of negative number : %d\n");
    printf("Count of zeros entered: %d\n");
return 0;
}