#include<stdio.h>
int main() {
    int n;
    printf("enter the number of rows : \n");
    scanf("%d",&n);
    int m;
    printf("enter number of columns: \n");
    scanf("%d",&m);


   /* for(int i=1;i<=n;i++){
        int a=1;
        for(int j=1;j<=n;j++) {
            int d = a+64;
            char ch =(char)d;
            printf("%c",ch);
            a++;


        }
        printf("\n");
    }
return 0;
}*/
int nst= 1;
for(int i=1;i<=n;i++) {
    for (int k=1;k<=nst;k++) {
        printf(" ");
    }
for(int j=1;j<=nst;j++) {
//if (i==1||i==n||j==1||j==m) printf("*");
 printf("* ");
}
 nst=nst+2;


printf("\n");

}
return 0;
}

 