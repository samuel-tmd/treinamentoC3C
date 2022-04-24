import Modulo2

nome = ""
quantMin = 0
quantMax = 0
quant = 0
valor = 0
decisao = "S"
valorFinal = 0
mercadorias = {}

while decisao == "S" or decisao == "s":
    nome = str(input("\nDigite o Nome da Mercadoria: "))
    quant = str(input("Digite a Quantidade Atual da Mercadoria: "))
    quantMax = str(input("Digite a Quantidade Máxima da Mercadoria: "))
    quantMin = str(input("Digite a Quantidade Mínima da Mercadoria: "))
    valor = str(input("Digite o Valor da Mercadoria: "))
    if Modulo2.adicionaMercadoria(nome, quant, quantMin, quantMax, valor, mercadorias) != False:
        mercadorias = Modulo2.adicionaMercadoria(nome, quant, quantMin, quantMax, valor, mercadorias)
        decisao = str(input("\nDeseja cadastrar mais mercadorias? (S/N) "))
    else:
        decisao = str(input("\nDeseja tentar novamente? (S/N) "))

if len(mercadorias) != 0:
    valorFinal = Modulo2.calculaPreco(mercadorias)
    print("\nO valor total das mercadorias é: R$" + str(valorFinal))