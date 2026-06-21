#include<stdio.h>
void printNamaste();
void printBonjour();

int main() {
    printf("enter f for french & i for india : ");
    char ch;
    scanf("%c" , &ch);
    if(ch == 'i') {
        namaste();
    } else {
        bonjour();
    }

    return 0;
    
}
void namaste() {
    printf("Namaste\n");
}
void bonjour() {
    printf("Bonjour");
} 


