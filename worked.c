#include<stdio.h>
int main() {
    int num;
    int positiveCount = 0;
    int negativeCount =  0;
    int zeroCount = 0;

    printf("\nenter any number that exist\n");
    
    while(1) {
        printf("enter numbber\n");
        scanf("%d",&num);
        if (num==0) {
            break;
        }
        else if (num<0){
            positiveCount++;

        }else {
            negativeCount++;

        }
    }
        printf("count of positive numbers : %d\n",positiveCount);
        printf("count of negativer numbes : %d\n", negativeCount);
        printf("count of zero : %d\n",zeroCount);
        return 0;

}