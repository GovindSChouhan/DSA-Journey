#include<stdio.h>

int main() {
int num,octal = 0,remainder, reverse = 0;

printf("enter integer: \n");
scanf("%d", &num );
 
while(num != 0)
{
    remainder = num % 8;
    octal = octal * 10 + remainder;
    num /= 8;
}
while(octal != 0)
{
    remainder = octal % 10;
    reverse = octal * 10 + remainder;
    octal /= 10;

}
printf("octal eqivalent : %d\n",reverse);
return 0;
}