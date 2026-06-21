#include<stdio.h>

int main() {
    int count, num;
    int smallest, largest;

    printf("enter numbers of element\n");
    scanf("%d", &count);

    if (count <=0) {
        printf("invalid no pls enter number\n");
        return 1;
    }
printf("enter %d number:\n",count);
scanf("%d",&num);
smallest = largest =num;
int i= 1;
while (i < count) {
    scanf("%d",&num);


if (num < smallest ) {
smallest = largest = num;
}
if (num > largest) {
    largest = num;
}
i++;
}
int range = largest - smallest;
printf("the range of the number : %d\n", range);
return 0; 
}


