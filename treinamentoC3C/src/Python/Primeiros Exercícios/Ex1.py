notas = {}

notas["N1"] = float(input("Digite a nota da N1"))


notas["N2"] = float(input("Digite a nota da N2"))

media = (notas["N1"] + notas["N2"])/2

if media >= 7:
    status = "aprovado"
else:
    status = "reprovado"

print("O aluno foi "+ status + "com média: " + str(media))