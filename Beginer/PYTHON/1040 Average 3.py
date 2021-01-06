a, b, c, d = input().split()
a = float(a)
b = float(b)
c = float(c)
d = float(d)

a = a*2
b = b*3
c = c*4
d = d*1

avg = (a + b + c + d)/10

print("Media: %.1f" % avg)

if avg >= 7.00:
    print("Aluno aprovado.")
elif 5.0 <= avg <= 6.9:
    print("Aluno em exame.")
    rescore = float(input())
    print("Nota do exame: %.1f" % rescore)
    reavg = (avg + rescore)/2
    if reavg >= 5.0:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    reavg = format(reavg, ".1f")
    print("Media final:", reavg)
else:
    print("Aluno reprovado.")
