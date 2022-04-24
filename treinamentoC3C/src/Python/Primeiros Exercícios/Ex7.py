homens = []
mulheres = []

for i in range(1, 3):
    homens.append(int(input("Digite a idade do homem " + str(i) + ":")))

if homens[0] > homens[1]:
    velho = homens[0]
    novo = homens[1]
else:
    velho = homens[1]
    novo = homens[0]

for i in range(1, 3):
    mulheres.append(int(input("Digite a idade da mulher " + str(i) + ":")))

if mulheres[0] > mulheres[1]:
    velha = mulheres[0]
    nova = mulheres[1]
else:
    velha = mulheres[1]
    nova = mulheres[0]

soma = velho + nova
produto = novo * velha

print("Soma: " + str(soma) + "; Produto: " + str(produto))