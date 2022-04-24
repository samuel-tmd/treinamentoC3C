arr = []
n1 = int(input("Digite o 1º número: "))
n2 = int(input("Digite o 2º número: "))
n3 = int(input("Digite o 3º número: "))

if n1 > n2 and n1 > n3 and n2 > n3:
    arr.append(n3)
    arr.append(n2)
    arr.append(n1)
    metodo = 1
elif n1 > n2 and n1 > n3 and n3 > n2:
    arr.append(n2)
    arr.append(n3)
    arr.append(n1)
    metodo = 2
elif n2 > n1 and n2 > n3 and n1 > n3:
    arr.append(n3)
    arr.append(n1)
    arr.append(n2)
    metodo = 3
elif n2 > n1 and n2 > n3 and n3 > n1:
    arr.append(n1)
    arr.append(n3)
    arr.append(n2)
    metodo = 4
elif n3 > n1 and n3 > n2 and n1 > n2:
    arr.append(n2)
    arr.append(n1)
    arr.append(n3)
    metodo = 5
elif n3 > n1 and n3 > n2 and n2 > n1:
    arr.append(n1)
    arr.append(n2)
    arr.append(n3)
    metodo = 6
else:
    print("Ocorreu um erro. Tente novamente!")

print(arr)
print(metodo)

# for i in range(1,4):
#    print("Digite um valor:")
#    arr.append(int(input()))
#
#print(arr.index())


