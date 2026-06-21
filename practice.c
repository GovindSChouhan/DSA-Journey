#include<stdio.h>
int main() {
    int num;
    int positiveCount=0;
    int negativeCount=0;
    int zerocount=0;
 
 printf("\nenter any number(0 to excist):\n");

 while(1)
{
    printf("enter number\n");
    scanf("%d",&num);
    
    if(num ==0) {
        break;
    }
    else if(num > 0) {
        positiveCount++;
    } else {
        negativeCount++;
    }

    
}
 printf("Count of positive numbers : %d\n",positiveCount);
 printf("Count of negative numbers : %d\n",negativeCount);
 printf("Count of zero entered: %d\n",zerocount);
 return 0;
}
