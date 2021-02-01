inter_win = 0
gremio_win = 0
draw = 0
total_match = 0


def match():
    global inter_win, gremio_win, draw, total_match
    goal = [int(n) for n in input().split()]
    inter = goal[0]
    gremio = goal[1]

    if inter > gremio:
        inter_win += 1
        total_match += 1
    elif gremio > inter:
        gremio_win += 1
        total_match += 1
    else:
        draw += 1
        total_match += 1

    print("Novo grenal (1-sim 2-nao)")
    n = int(input())
    if n == 1:
        match()
    else:
        print(f"{total_match} grenais")
        print(f"Inter:{inter_win}")
        print(f"Gremio:{gremio_win}")
        print(f"Empates:{draw}")
        if inter_win > gremio_win:
            print("Inter venceu mais")
        elif gremio_win > inter_win:
            print("Gremio venceu mais")
        else:
            print("Não houve vencedor")


match()
