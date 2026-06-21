#include<stdio.h>
int main() {
    int otpay;
    float hour,i =1;

    while( i<=10){
    printf("enter number of hour u worked : \n");
    scanf("%d",&hour);

    if (hour>=40){
    otpay= (hour -\ 0}*12;
    printf("\nNumber of hour worked = %d\notpat =Rs%f",hour, otpay);
    } else{
        otpay = 0;
        printf("number of hour %d is less",hour);

    }
    i++;


    }
    return 0;
}