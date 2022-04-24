def calculaPreco(mercadorias):
    precoFinal = 0
    produtos = {}
    for i in mercadorias.values():
        if i.get("Valor Unitário", "Inexistente") != "Inexistente" and i.get("Quantidade Atual","Inexistente") != "Inexistente":
            precoFinal += (i.get("Valor Unitário") * i.get("Quantidade Atual"))
        if i.get("Quantidade Atual") == i.get("Quantidade Mínima") or i.get("Quantidade Atual") == (i.get("Quantidade Mínima") +1):
            produtos[i.get("Nome")] = {'Nome': i.get("Nome"),'Quantidade Mínima': i.get("Quantidade Mínima"), 'Quantidade Atual': i.get("Quantidade Mínima")}

    print("{:<8} {:<15} {:<10}".format('Nome', 'Quant Mínima', 'Quant Atual'))

    for j in produtos.values():
        print("\n{:<8} {:<15} {:<10}".format(str(j.get("Nome")), str(j.get("Quantidade Mínima")), str(j.get("Quantidade Atual"))))
    return precoFinal

def adicionaMercadoria(nome, quant, quantMin, quantMax, valor, mercadorias):
    iquant = 0
    iquantMin = 0
    iquantMax = 0
    ivalor = 0

    if(nome == ""):
        return False
    else:
        while True:
            try:
                iquant = int(quant)
                iquantMax = int(quantMax)
                iquantMin = int(quantMin)
                ivalor = int(valor)
                break
            except ValueError:
                print("A mercadoria não foi cadastrada corretamente!")
                return False
        if iquant <= 0 or iquantMin <= 0 or iquantMax <= 0:
            print("As quantidade inseridas devem ser maiores do que 0!")
            return False
        elif iquantMax < iquantMin or iquantMin > iquantMax:
            print("A Quantidade Mínima deve ser menor que a Máxima e a Máxima deve ser menor do que a Mínima!")
            return False
        elif iquant > iquantMax or iquant < iquantMin:
            print("A Quantidade Atual deve ser menor do que a Quantidade Máxima e maior do que a Quantidade mínima!")
            return False
        else:
            mercadoria = {'Nome': nome, 'Quantidade Atual': iquant, 'Quantidade Máxima': iquantMax, 'Quantidade Mínima': iquantMin, 'Valor Unitário': ivalor}
            mercadorias[nome] = mercadoria

            return mercadorias