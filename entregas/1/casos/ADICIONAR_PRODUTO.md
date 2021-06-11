## Adicionar produto ao Carrinho
Esse caso de uso é responsável por realizar o fluxo de adicionar um produto ao carrinho de comprar do usuário, para que ele possa posteriormente realizar a compra.

### Pré-condição: 
O usuário deve estar logado e na página de um produto.

### Pós-condição: 
O produto com sua quantidade é adicionado ao carrinho de compras e fica disponível para realizar o checkout.

### Fluxo de eventos principal:
1. O cliente seleciona a quantidade do produto que deve ser adicionado ao carrinho
2. O cliente seleciona a opção de adicionar ao carrinho
3. O sistema adiciona o produto com sua quantidade ao carrinho
4. O cliente é redirecionado para a Tela de Checkout do carrinho

### Fluxos secundários:
1. Em qualquer momento o usuário pode cancelar a adição
2. Caso a quantidade de produtos exceda um limite de produtos por compra o usuário receberá uma mensagem de erro.
