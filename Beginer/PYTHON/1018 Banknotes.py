money = int(input())
print(money)
note100 = money//100
money = money-(note100*100)
note50 = money//50
money = money-(note50*50)
note20 = money//20
money = money-(note20*20)
note10 = money//10
money = money-(note10*10)
note5 = money//5
money = money-(note5*5)
note2 = money//2
money = money-(note2*2)
note1 = money//1
money = money-(note1*1)
print(note100, "nota(s) de R$ 100,00")
print(note50, "nota(s) de R$ 50,00")
print(note20, "nota(s) de R$ 20,00")
print(note10, "nota(s) de R$ 10,00")
print(note5, "nota(s) de R$ 5,00")
print(note2, "nota(s) de R$ 2,00")
print(note1, "nota(s) de R$ 1,00")
