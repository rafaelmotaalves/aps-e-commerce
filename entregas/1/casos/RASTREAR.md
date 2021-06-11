## Rastrear pedido
Esse caso de uso é responsável por prover a funcionalidade de rastreamento de pedidos para os clientes.

### Pré-condição:
O usuário deve estar logado e ter um pedido ativo (em processo de entrega)

### Pós-condição: 
O usuário poderá visualizar o estado de seu pedido

### Fluxo de eventos principal:
1. O cliente solicita o rastreamento do pedido passando o identificador do pedido
2. O sistema consulta o serviço de entrega
3. O sistema retorna as informações de rastreamento do pedido, exibindo todos os estados em que ele passou
### Fluxos secundários:
1. No passo 2, caso o serviço de entrega esteja inativo, será retornada uma mensagem de erro para o cliente.

