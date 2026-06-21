#include<stdio.h>

int main() {
    int day;
    printf("enter day (1-7): ");
    scanf("%d", &day);

    switch (day) {
        case 1: printf("mon");
                break;
        case 2: printf("thur");
                break;
        case 3: printf("wed");
                break;
        case 4: printf("fri");
                break;
        case 5&6&7:
        default : printf("not a valid day");

    }
    return 0;
}