inicial = int(input("Digite a hora inicial (Entre 0 e 23): "))
final = int(input("Digite a hora final (Entre 0 e 23): "))

if inicial > 23:
    print("A hora inicial é inválida!")
elif final > 23:
    print("A hora final é inválida!")
elif final < inicial:
   duracao = 24 - (inicial - final)
   print("Duração do jogo: " + str(duracao))
elif final > inicial:
    duracao = final - inicial
    print("Duração do jogo: " + str(duracao))
elif final - inicial > 24:
    print("Duração inválida! Um jogo só pode ter 24 horas de duração.")