#include<stdio.h>

int main() {
    int n;
    printf("enter number of rows: ");
    scanf("%d",&n);
   /*int m;
    printf("enter number of columns : ");
    scanf("%d",&m);*/

    for(int i=1;i<=4;i++){
        for(int j=1;j<=4;j++) {
            printf("%d",j);

        }
        printf("\n");
    }
    return 0;


}

