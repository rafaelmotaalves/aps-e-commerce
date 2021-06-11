## Login
Este caso de uso é responsável por autenticar um usuário do sistema.

### Pré-condição: 
Nenhuma.

### Pós-condição: 
Um usuário válido é logado e sua sessão é registrada no sistema.

#### Fluxo de eventos principal:
1. O usuário informa login e senha.
2. O sistema verifica se o login e senha são válidos (verifica-se se o login e senha pertencem a um usuário).
3. O sistema registra o início de uma sessão de uso.

#### Fluxos secundários:
1. No passo 2, se o login ou a senha forem inválidos, o sistema exibe
uma mensagem e volta ao passo 1.
