## Checkout Carrinho
Esse caso de uso é responsável por realizar a compra de produtos em um carrinho de compras.

### Pré-condição:
O usuário deve estar logado, ter cartão de crédito e endereço válidos cadastrados e estar na página de carrinho

### Pós-condição: 
O pedido deverá ser registrado pelo sistema, a compra encaminhada para a operadora de cartão de crédito e a solicitação de entrega para o serviço de estoque.

### Fluxo de eventos principal:
1. O cliente solicita a compra de seu carrinho atual passando as informações de:
    1. qual cartão de crédito cadastrado irá usar
    2. qual endereço de entrega cadastrado irá usar
2. O sistema calcula o valor do carrinho e solicita o pagamento para a operadora de cartão de crédito
3. O sistema registra o pedido
4. O sistema envia as informações do pedido e endereço de entrega para a transportadora
5. O cliente recebe uma mensagem de confirmação da compra.

### Fluxos secundários:
1. No passo 1, caso o carrinho esteja vazio, o cliente não conseguirá realizar o checkout.
2. No passo 3, caso a operadora rejeite a solicitação de pagamento, a compra é cancelada e o cliente recebe uma mensagem de erro.
3. No passo 4, caso o sistema da transportadora esteja inativo, os passos anteriores são revertidos, a compra é cancelada e o cliente recebe uma mensagem de erro.
4. No passo 3, caso o serviço da operadora de cartão esteja inativo, os passos anteriores são revertidos, a compra é cancelada e o cliente recebe uma mensagem de erro.
