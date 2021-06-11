## Cadastro de usuário
Este caso de uso é responsável por cadastrar um novo usuário no sistema.

### Pré-condição:
Nenhuma.

### Pós-condição: 
Usuário possui uma conta cadastrada no sistema.

### Fluxo de eventos principal:
1. O usuário preenche informações de CPF, nome, endereço e email no sistema
2. O sistema válida as informações passadas
3. O sistema verifica checa se já existe um usuário com o mesmo CPF ou email
4. O sistema utiliza as informações para cadastrar um novo usuário usuário e redireciona o usuário para o Login

### Fluxos secundários:
1. Nos passos 2 e 3, se as informações não estiverem completas e válidas ou já existir um usuário com os dados o sistema exibe uma mensagem e volta ao passo 1

