# language: pt

Funcionalidade: Efetua Registro e login

  Cenario: Usuario se loga com sucesso
    Dado que o cliente cadastrado acessa a tela de MyAccount
    Quando preenche o formulario de registro
    Entao aparecerá uma mensagem de cadastrado com sucesso

 Cenario: Usuario nao cadastrado tentar se loga
   Dado que o usuario nao cadastrado tentar se loga na tela de MyAccount
   Quando informar nome de usuario não cadastrado e senha
   Entao o usuario continua na mesma tela e retornar a seguinte mensagem "Erro: Não foi possível encontrar um usuário com este endereço de e-mail."

 Cenario: Usuario tentar se cadastrar com senha em branco
   Dado que o usuario acesse a tela do MyAccount
   Quando usuario tentar se logar com email completo e senha em branco
   Entao usuario continuar na pagina de login com a seguinte mensagem de erro " A senha é necessária."

 Cenario: Usuario tentar com email em branco
   Dado que o usuario acesse a telo MyAccount
   Quando usuario tentar se logar com email em branco e senha correta
   Entao usuario continua na mesma tela de login que retorna a seguinte mensagem "Erro: o nome de usuário é obrigatório."

 Cenario: Tentar se logar passando numeros no campo nome
   Dado que o usuario acesse a tela MyAccount
   Quando usuario tentar se logar passado numeros no campo email e senha correta
   Entao o usuario continuar na mesma tela com a seguinte mensagem "ERRO : Nome de usuário inválido. Perdeu sua senha?"

 Cenario: Usuario tentar se logar passando nome com sobrenome no campo email
   Dado que o usuario acesse a tela MyAccount
   Quando usuario tentar se logar passando nome com sobrenome no campo email
   Entao a seguinte mensagem sera retornada "Nome de usuário inválido. Perdeu sua senha?"

 Cenario: Usuario ja cadastrado tentar se logar mais de uma vez
   Dado que um usuario ja castrado acessa a tela MyAccount
   Quando usuario ja cadastrado tentar se logar novamente
   Entao devera retornar a seguinte mensagem "Uma conta já está registrada com seu endereço de e-mail. Por favor entre."

 Cenario: Usuario ja cadastrado tentar se logar com senha incorreta
    Dado que o cliente cadastrado acessa a tela de MyAccount
    Quando usuario ja cadastrado tentar se registra com email correto e com a senha incorreta
    Entao devera retornar a seguinte mensagem "Uma conta já está registrada com seu endereço de e-mail. Por favor entre."