days = int(input())
year = days//365
days = days-(year*365)
month = days//30
days = days-(month*30)
print(year, "ano(s)")
print(month, "mes(es)")
print(days, "dia(s)")
