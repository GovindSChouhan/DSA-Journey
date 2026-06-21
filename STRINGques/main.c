#include<stdio.h>
#include<string.h>
struct employee{
    int emp_id ;
    char emp_name[50];
    char emp_city[50];
   
};

void takeRecord(struct employee emp[],int*n){//1
    for(int i = *n;i<*n+5;i++){
        printf("enter the emp name");
        scanf("%s",&emp[i].emp_name);
        printf("enter employee id");
        scanf("%d",&emp[i].emp_id);
        printf("enter emp city");
        scanf("%s",&emp[i].emp_city);
    }
    *n = *n+5;
}
void printData(struct employee emp[],int n){//2
    for(int i =  0;i<n;i++){
        printf("emp_name: %s, emp_id: %d, emp_city: %s",emp[i].emp_name,emp[i].emp_id,emp[i].emp_city);
    }
}
  struct employee* findemployeebyId(struct employee emp[],int n,int emp_id){//3
    for(int i = 0;i<n;i++){
       if(emp[i].emp_id == emp_id){
        return &emp[i];
       }
    }
    return NULL;

}
//The code you are referring to is a common implementation of a sorting algorithm called Bubble Sort. This algorithm is used to sort the array of employee records based on their emp_id in ascending order.
//Outer Loop: Picks an element.
//Inner Loop: Compares it with all subsequent elements and swaps if necessary.
//We use n - 1 in the outer loop to ensure that every element in the array has been compared without going out of bounds.
//This makes sure that the array is fully sorted after all iterations.
    //asscending order.

  void sortEmp_id(struct employee emp[],int n){
    struct employee temp;
    for(int i = 0;i<n-1;i++){
        for(int j = i+1;j<n;j++){
            if(emp[i].emp_id > emp[j].emp_id){
                temp = emp[i];
                emp[i] = emp[j];
                emp[j] = temp;
            }
        }
    }
}    
  void sortEmp_name(struct employee emp[],int n){
    struct employee temp;
    for(int i = 0;i<n-1;i++){
        for(int j = i +1;j<n;j++){
           if(strcmp(emp[i].emp_name,emp[j].emp_name)>0){
                  temp = emp[i];
                emp[i] = emp[j];
                emp[j] = temp;
            }
        }
    }
}
int countEmployees(int n){
    return n;
}
int main(){
     struct employee emp[10];
     int n= 5;

     for(int i = 0;i<n;i++){
          printf("employ name :%s, employee id : %d, employee city :%s",emp[i].emp_name,emp[i].emp_id,emp[i].emp_city);
        }
    printData(emp,n);

    int id;
    printf("enter id");
    scanf("%d",id);
    struct employee* emp_record =  findemployeebyId(emp,n,id);
    printf("enter id to search employee");

    sortEmp_id(emp,n);
    printf("employe are sort");
    printData(emp,n);

    sortEmp_name(emp,n);
    printf("name are soted ");
    printData(emp,n);

    return 0;

}
