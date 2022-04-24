atual = int(input("Digite a quantidade atual: "))
minima = int(input("Digite a quantidade minima: "))
maxima = int(input("Digite a quantidade maxima: "))

media = (maxima + minima)/2

if atual >= media:
    print("Não efetuar compra! - Média = " + str(media))
else:
    print("Efetuar compra! - Média = " + str(media))