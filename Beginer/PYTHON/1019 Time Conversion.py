seconds = int(input())
hour = seconds//3600
seconds = seconds-(hour*3600)
minute = seconds//60
seconds = seconds-(minute*60)
print(hour, ":", minute, ":", seconds, sep="")
