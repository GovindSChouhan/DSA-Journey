#include<stdio.h>
int main() {
    int n;
    printf("entrer no of rows : ");
    scanf("%d",&n);
    
  //  printf("enter no of col : ");
   // scanf("%d",&m);
      int a=1;
    for(int i=1;i<=n;i++){
      if(i%2!=0) a=1; 
      else a=0;
    for(int j=1;j<=i;j++){
        printf("%d",a);
        if (a==0) a=1;
        else a=0;
        
    
    }
    printf("\n");
    }

    return 0;
}

    