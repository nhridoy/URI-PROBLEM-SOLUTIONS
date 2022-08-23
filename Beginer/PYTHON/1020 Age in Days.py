days = int(input())
year = days//365
days -= year*365
month = days//30
days -= month*30
print(year, "ano(s)")
print(month, "mes(es)")
print(days, "dia(s)")
