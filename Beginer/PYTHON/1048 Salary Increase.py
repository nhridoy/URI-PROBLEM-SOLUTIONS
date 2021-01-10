old_salary = float(input())

if 0 < old_salary <= 400:
    new_salary = old_salary + ((old_salary * 15)/100)
    money_earned = new_salary - old_salary
    print("Novo salario: %.2f" % new_salary)
    print("Reajuste ganho: %.2f" % money_earned)
    print("Em percentual: 15 %")
elif 400.01 <= old_salary <= 800:
    new_salary = old_salary + ((old_salary * 12)/100)
    money_earned = new_salary - old_salary
    print("Novo salario: %.2f" % new_salary)
    print("Reajuste ganho: %.2f" % money_earned)
    print("Em percentual: 12 %")
elif 800.01 <= old_salary <= 1200:
    new_salary = old_salary + ((old_salary * 10)/100)
    money_earned = new_salary - old_salary
    print("Novo salario: %.2f" % new_salary)
    print("Reajuste ganho: %.2f" % money_earned)
    print("Em percentual: 10 %")
elif 1200.01 <= old_salary <= 2000:
    new_salary = old_salary + ((old_salary * 7)/100)
    money_earned = new_salary - old_salary
    print("Novo salario: %.2f" % new_salary)
    print("Reajuste ganho: %.2f" % money_earned)
    print("Em percentual: 7 %")
elif old_salary > 2000:
    new_salary = old_salary + ((old_salary * 4)/100)
    money_earned = new_salary - old_salary
    print("Novo salario: %.2f" % new_salary)
    print("Reajuste ganho: %.2f" % money_earned)
    print("Em percentual: 4 %")
