usuarios = {'123456': 'C3c@56789', '123123': 'C3c@9999#', '456456': 'C3c@12345', '789789': 'C3c@78910'}

user = str(input("Digite o código de usuário: "))
verificacao = str(usuarios.get(user, 'Usuário inválido!'))

while verificacao == "Usuário inválido!":
    print('Usuário Inválido!\n')
    user = str(input("Digite o código de usuário: "))
    verificacao = str(usuarios.get(user, 'Usuário inválido!'))

if verificacao == 'Usuário inválido!\n':
    print(verificacao)
else:
    senha = str(input("Digite a senha: "))
    while senha != verificacao:
        print("Senha Inválida!\n")
        print('Usuário: ' + user)
        senha = str(input("Digite a senha: "))

    print("Acesso permitido!\n")


