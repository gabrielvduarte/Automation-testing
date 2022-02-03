# language: pt

Funcionalidade: Usuario efetua Registro e Login


  Cenario: Usuario se loga com sucesso
    Dado que o cliente cadastrado acessa a tela de MyAccount
    Quando preenche o formulario de login
    Entao aparecerá uma mensagem "Hello gato.lino (not gato.lino? Sign out)"

    @Valida
 Cenario: Usuario nao cadastrado tentar se loga
   Dado que o usuario nao cadastrado tentar se loga na tela de MyAccount
   Quando informar nome de usuario não cadastrado e senha
   Entao o usuario continua na mesma tela e retornar a seguinte mensagem "Error: A user could not be found with this email address."

 Cenario: Usuario tentar se cadastrar com senha em branco
   Dado que o usuario acesse a tela do MyAccount
   Quando usuario tentar se logar com email completo e senha em branco
   Entao usuario continuar na pagina de login com a seguinte mensagem de erro "Error: Password is required."

 Cenario: Usuario tentar com email em branco
   Dado que o usuario acesse a telo MyAccount
   Quando usuario tentar se logar com email em branco e senha correta
   Entao usuario continua na mesma tela de login que retorna a seguinte mensagem "Error: Username is required."

 Cenario: Tentar se logar passando numeros no campo nome
   Dado que o usuario acesse a tela MyAccount
   Quando usuario tentar se logar passado numeros no campo email e senha correta
   Entao o usuario continuar na mesma tela com a seguinte mensagem "Error: Username is required."

 Cenario: Usuario tentar se logar passando nome com sobrenome no campo email
   Dado que o usuario acesse a tela MyAccount
   Quando usuario tentar se logar passando nome com sobrenome no campo email
   Entao a seguinte mensagem sera retornada "ERROR: Invalid username. Lost your password?"

 Cenario: Usuario ja cadastrado tentar se logar com senha incorreta
    Dado que o cliente cadastrado acessa a tela de MyAccount
    Quando usuario ja cadastrado tentar se loga com email correto e com a senha incorreta
    Entao devera retornar a seguinte mensagem "ERROR: The password you entered for the username gato.lino@bol.com.br is incorrect. Lost your password?"

 Cenario: Usuario preenche formulario de registro
   Dado que o cliente ainda nao cadastrado acessa a tela de MyAccount
   Quando preenche o formulario de registro
   Entao sera retornado a mensagem "Hello gato.lino (not gato.lino? Sign out)"

 Cenario: Usuario tenta se registrar com senha muito fraca
   Dado que o cliente ainda nao cadastrado acessa a tela de MyAccount
   Quando preenche o formulario de registro com senha fraca
   Entao ele continua na pagina de MyAccount com a mensagem "Weak - Please enter a stronger password."

 Cenario: Usuario tenta se registrar com email em branco
   Dado que o cliente ainda nao cadastrado acessa a tela de MyAccount
   Quando preenche o formulario de registro com email em branco e senha corretamente
   Entao ele sera retornado a seguinte mensagem "Error: Please provide a valid email address."

 Cenario: Usuario tenta se registrar com email e senha em branco
   Dado que o cliente ainda nao cadastrado acessa a tela de MyAccount
   Quando preenche formulario com email em branco e senha
   Entao retornara  mensagem "Error: Please provide a valid email address."

 Cenario: Usuario se registra e apos efetuar login
   Dado que o cliente ainda nao cadastrado acessa a tela de MyAccount
   Quando preenche o formulario de registro com email e senha corretamente
   E preenche o formulario de login com dados validos
   Entao retornara a seguinte mensagem "Hello gato.lino"