#ifndef EMPLOYEE_H
#define EMPLOYEE_H

struct Employee {
    int emp_id;
    char emp_name[50];
    char emp_city[50];
};

void addRecords(struct Employee emp[], int *n);
void displayEmployee(struct Employee emp[], int n);
struct Employee* findEmployeeById(struct Employee emp[], int n, int emp_id);
void sortEmployeesById(struct Employee emp[], int n);
void sortEmployeeNames(struct Employee emp[], int n);
int countEmployees(int n);

#endif // EMPLOYEE_H
