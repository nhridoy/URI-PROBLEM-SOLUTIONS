name = input()
salary = float(input())
sold = float(input())

commission = (sold*15)/100;
total_salary = salary+commission;

print("TOTAL = R$ %.2f"%total_salary)