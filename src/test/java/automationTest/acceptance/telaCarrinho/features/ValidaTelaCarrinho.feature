# language: pt

  @RunAll
  Funcionalidade: Validar a adição e remoçã0 da tela de carrinho

  Contexto:
    Dado que usuario acesse a pagina inicial

  @AdicionaProdutoCarrinho
  Cenario:Usuário adiciona o produto ao carrinho com sucesso
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    Entao o numero de produtos no carrinho aumenta
    E aumenta o valor final do carrinho

  @RetiraProdutoCarrinho
  Cenario:Usuário retira prdutos da sua cesta com sucesso
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E remover o produto adicionado no carrinho
    Entao aparecera a mensagem da cesta vazia

  @AcessaRetornaEAcessaCarrinho
  Cenario:Usuário acesse o seu carrinho volta a pagina inicial e retorna ao seu carrinho
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E retorna a pagina principal
    E ao Acessar a tela de carrinho pelo span
    Entao a quantidade de produtos nao sofre alteracao

  @RetiraEAdicionaProdutoCarrinho
  Cenario:Usuário retira produtos da sua cesta e os retorna com sucesso
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E remover o produto adicionado no carrinho
    E retorna a pagina principal
    E o usuario clica no botão adicionar a cesta
    E ao acessar a tela de carrinho
    Entao o numero de produtos no carrinho aumenta
    E aumenta o valor final do carrinho

  @AdicionaProdutosRecarregaAPagina
  Cenario:Usuário adiciona o produto ao carrinho e recarrega a pagina
    E o usuario clica no botão adicionar a cesta
    Quando recarrega a pagina
    Entao aumenta o valor final do span carrinho

  @AcessaCarrinhoSemProduto
  Cenario:Usuário tenta acessar o carrinho sem adicionar nenhum produto
    Quando ao Acessar a tela de carrinho pelo span zerado
    Entao o usuario e redirecionado a tela shop

  @AdicionaZeroProdutos
  Cenario:O usuário tenta comprar zero(0) produtos
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E e adiciona manualmente zero produtos
    E atualiza sua cesta
    Entao aparecera a mensagem da cesta vazia

  @UtilizaCupom
  Cenario:O usuário utiliza o cupom de desconto e frete grátis
    E o usuario clica no botão adicionar a cesta
    Quando ao acessar a tela de carrinho
    E e adiciona manualmente a quantidade de produtos
    E atualiza sua cesta
    E adiciona cupom
    E aplica o cupom
    Entao o cupom e exibido na tela