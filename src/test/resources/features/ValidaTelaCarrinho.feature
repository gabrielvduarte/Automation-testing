# language: pt

  Funcionalidade: Validar a adição e remoçã0 da tela de carrinho

  Contexto:
    Dado que usuario acesse a pagina inicial

  @AdicionaProdutoCarrinho
  Cenario:
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    Entao o numero de produtos no carrinho aumenta
    E aumenta o valor final do carrinho

  @AdicionaERetiraProdutoCarrinho
  Cenario:
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E remover o produto adicionado no carrinho
    Entao aparecera a mensagem do produto excluido do carrinho

  @AcessaRetornaEAcessaCarrinho
  Cenario:
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E retorna a pagina principal
    E ao Acessar a tela de carrinho novamente
    Entao a quantidade de produtos nao sofre alteracao

  @RetiraEAdicionaProdutoCarrinho
  Cenario:
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E remover o produto adicionado no carrinho
    E retorna a pagina principal
    E o usuario clica no botão adicionar a cesta
    E ao acessar a tela de carrinho
    Entao o numero de produtos no carrinho aumenta
    E aumenta o valor final do carrinho

  @AdicionaProdutosRecarregaAPagina
  Cenario:
    E o usuario clica no botão adicionar a cesta
    Quando recarrega a pagina
    Entao aumenta o valor final do span carrinho