hours = int(input())
kmph = int(input())
totalkm = hours*kmph
fuel = totalkm/12
frmt = format(fuel, '.3f')
print(frmt)
