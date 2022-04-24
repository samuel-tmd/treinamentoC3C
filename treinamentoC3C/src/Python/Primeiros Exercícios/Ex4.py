salario = float(input("Digite o salário: "))
vendas = float(input("Digite o valor das vendas realizadas: "))

if vendas == 0:
    print("O salario total é:"+ str(salario))
elif 0 < vendas <= 1500:
    vendas = vendas * 0.03
    salario = salario + vendas
    print("O salario total é:" + str(salario))
elif 1500 < vendas > 0:
    aux = vendas - 1500
    vendas = vendas - aux
    salario  = salario + (vendas * 0.03) + (aux * 0.05)
    print("O salario total é:" + str(salario))
else:
    print("Alguma informação era inválida! Por favor, digite novamente.")
