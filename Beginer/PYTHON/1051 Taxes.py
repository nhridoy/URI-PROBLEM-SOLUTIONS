salary = float(input())

if 0 < salary <= 2000:
    print("Isento")
elif 2000 < salary <= 3000:
    tax = ((salary - 2000)*8)/100
    print("R$ %.2f" % tax)
elif 3000 < salary <= 4500:
    tax = (((salary - 2000) - 1000) * 18)/100 + (1000*8)/100
    print("R$ %.2f" % tax)
else:
    tax = ((((salary - 2000) - 1000) - 1500)*28)/100 + (1500 * 18)/100 + (1000 * 8)/100
    print("R$ %.2f" % tax)

