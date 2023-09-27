Santander Bootcamp 2023 - Backend Java - Desafios 

Desafio de Código = Cofres Seguros

Codifique o seguinte cenário.

Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres: um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.

Entrada:
- O programa permitirá ao usuário digitar o tipo de cofre a ser criado: "digital" ou "físico". 
- Se for escolhido o tipo "digital", o usuário deve digitar a senha e a confirmação de senha do cofre digital (ambas com apenas números). 
- Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

Saída:
- O programa irá exibir as informações do cofre criado. Para o Cofre Digital, será exibido o tipo e o método de abertura (senha). Para o Cofre Físico, será exibido apenas o tipo e o método de abertura (chave).

Exemplos:

1. Entrada:

digital

12345

1234

1. Saída:

Tipo: Cofre Digital

Metodo de abertura: Senha

Senha incorreta!



2. Entrada:

fisico

2. Saída:

Tipo: Cofre Fisico

Metodo de abertura: Chave



3. Entrada:

digital

2525

2525

3. Saída:

Tipo: Cofre Digital

Metodo de abertura: Senha

Cofre aberto!
