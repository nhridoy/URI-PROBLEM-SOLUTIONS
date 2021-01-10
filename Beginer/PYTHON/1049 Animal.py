one = input()

if one == "vertebrado":
    two = input()
    if two == "ave":
        three = input()
        if three == "carnivoro":
            print("aguia")
        elif three == "onivoro":
            print("pomba")
    elif two == "mamifero":
        three = input()
        if three == "onivoro":
            print("homem")
        elif three == "herbivoro":
            print("vaca")
elif one == "invertebrado":
    two = input()
    if two == "inseto":
        three = input()
        if three == "hematofago":
            print("pulga")
        elif three == "herbivoro":
            print("lagarta")
    elif two == "anelideo":
        three = input()
        if three == "hematofago":
            print("sanguessuga")
        elif three == "onivoro":
            print("minhoca")
