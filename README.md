# mudi

# Sobre o projeto

Nessa página principal nós conseguimos ver uma lista de últimos pedidos que foram 
feitos pelos usuários, todos os usuários que foram concluídos. 
Então ele já tem um valor e uma data de entrega.

![Web 1](https://github.com/MatheusSaraiva/mudi/blob/main/img/home.png)


Temos dois tipos de usuários na aplicação:
O primeiro é o usuário que vai gerar ofertas para os pedidos que forem feitos 
e o outro usuário é o que vai cadastrar os pedidos. 


Seguindo um exemplo real, imagine que uma pessoa do Brasil está viajando para 
os Estados Unidos e tem alguém aqui no Brasil interessado em algum produto de lá.
Ela vai e cadastra - “eu estou fazendo um pedido e gostaria que alguém que foi para
os Estados Unidos, pudesse me trazer isso”.

Os outros usuários que estão cadastrados podem ver os pedidos que foram feitos, 
que estão aguardando ofertas, e podem fazer uma proposta.
Por exemplo: o produto custa $ 30 e a pessoa vai e coloca uma oferta.
No Brasil a pessoa vê que custa R$ 500, ou que nem vende no Brasil, 
e ele põe uma oferta de R$ 250.

O usuário vai poder aceitar ou não essa oferta.

Então esse é o objetivo. É conseguir comprar produtos feitos por pessoas que estão viajando em outros lugares.

Temos uma interface gráfica que é feita usando o Bootstrap. Essa requisição “Home” é feita para uma aplicação 
que está rodando Spring em Java. Quando a requisição é feita, ela bate no método que faz a consulta, no banco 
de dados por pedidos que já foram concluídos e essa é a página principal da aplicação, os últimos pedidos que 
foram entregues. Depois disso, se o usuário se cadastrar, ele pode fazer o login na aplicação.

Então aqui, por exemplo: eu vou logar com o usuário “joao” e nesse momento ele tem mais três opções. Além da 
página “Home”, que ele pode ver logo depois do login, ele já cai na página “Meus Pedidos”

Ele pode ver os pedidos que ele fez que estão aguardando, aprovado ou que foram entregues ou todos os pedidos
nessa lista. Ele pode criar através desse link, novos pedidos. Ele pode preencher o formulário, clicar em 
“Cadastrar”, fazer uma requisição para ter um pedido novo para os outros usuários poderem criar ofertas para
esse pedido.

![Web 1](https://github.com/MatheusSaraiva/mudi/blob/main/img/login.png)
![Web 1](https://github.com/MatheusSaraiva/mudi/blob/main/img/meus-pedidos.png)

Depois você pode fazer a sua própria oferta. Então você consegue ver pedidos de outros usuários e você pode fazer ofertas.
Por mais que seja parecida com a tela de “Meus Pedidos”, ela é feita com outra tecnologia. Aqui eu estou
usando “Vue JS” que é uma biblioteca de Front End feita em Java Script que consegue construir a interface gráfica
buscando os dados que ela precisa para fazer isso, usando endpoints REST, usando serviços REST. Ou seja, ela faz uma requisição
AJAX usando a tecnologia chamada Axios, uma biblioteca chamada Axios.

![Web 1](https://github.com/MatheusSaraiva/mudi/blob/main/img/facaOferta.png)
![Web 1](https://github.com/MatheusSaraiva/mudi/blob/main/img/facaOferta2.png)


# Como executar o projeto

Pré-requisitos: Java 8

```bash
# clonar repositório
$ git clone -b dev https://github.com/MatheusSaraiva/mudi.git

```

# Autor

Matheus Saraiva

https://www.linkedin.com/in/matheus-saraiva-37568520b/

