n = int(input())
total_animal = 0
rabbit = 0
rat = 0
frog = 0
for _ in range(n):
    animal_number, name = input().split()
    animal_number = int(animal_number)
    total_animal = total_animal + animal_number
    if name == 'C':
        rabbit = rabbit + animal_number
    elif name == 'R':
        rat = rat + animal_number
    elif name == 'S':
        frog = frog + animal_number

p_rabbit = (rabbit / total_animal) * 100
p_rat = (rat / total_animal) * 100
p_frog = (frog / total_animal) * 100

print("Total:", total_animal, "cobaias")
print("Total de coelhos:", rabbit)
print("Total de ratos:", rat)
print("Total de sapos:", frog)
print("Percentual de coelhos: {:.2f} %".format(p_rabbit))
print("Percentual de ratos: {:.2f} %".format(p_rat))
print("Percentual de sapos: {:.2f} %".format(p_frog))
