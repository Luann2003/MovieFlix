# MovieFlix
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Luann2003/MovieFlix/blob/main/LICENSE) 

## Sobre o projeto
* Este é um projeto de desenvolvimento de uma API Restful em Java utilizando o framework Spring Boot. O desenvolvimento desta API seguiu a abordagem TDD (Test-Driven Development), onde os testes foram criados antes da implementação das funcionalidades, garantindo assim a qualidade e a confiabilidade do código.
* Este projeto foi desenvolvido como parte dos meus estudos no programa Dev Superior, um programa intensivo de desenvolvimento back-end.

## Funcionalidades Principais
* Realização de Casos de Uso: O projeto implementa vários casos de uso que abrangem diferentes aspectos da aplicação.
* Consultas a Banco de Dados Relacional: Utilizamos o Spring Data JPA para realizar consultas a um banco de dados relacional. Isso nos permite armazenar e recuperar dados de forma eficiente.
* Tratamento de Erros Personalizados: Implementamos um tratamento de erros robusto que retorna respostas HTTP customizadas para fornecer informações claras e úteis sobre erros que ocorrem durante a execução da API.
* Controle de Acesso por Perfil de Usuário e Rotas: A aplicação inclui um sistema de controle de acesso que restringe o acesso a determinadas rotas com base no perfil do usuário autenticado. Isso aumenta a segurança e a confidencialidade dos dados.
```bash
# Clone o repositório
git clone https://github.com/Luann2003/MovieFlix.git

# Navegue até o diretório do projeto
cd MovieFlix
# Compile e execute o programa
java main.java
```



## Filtragem de Filmes por Gênero

Nesta imagem, podemos ver a página de filtragem de filmes por gênero. 
Os filmes estão agrupados de acordo com seus gêneros e o usuário pode selecionar um gênero específico para ver os filmes associados a ele. Isso facilita a navegação e a descoberta de filmes de interesse.
   
![](https://github.com/Luann2003/MovieFlix/blob/main/filtragem%20paginada%20por%20genre.png)


## Busca de Reviews de Usuários por ID do Filme

Nesta imagem, é possível observar a funcionalidade de busca de reviews de usuários com base no ID do filme.
Os usuários podem inserir o ID de um filme e obter uma lista de avaliações e comentários associados a esse filme. Isso permite que os usuários obtenham informações valiosas sobre a qualidade e a recepção de um filme específico.
![](https://github.com/Luann2003/MovieFlix/blob/main/filtragem%20de%20reviews%20por%20id%20do%20filme.png)

## POST de Review

Nesta imagem, é mostrada a funcionalidade de criação de uma avaliação (review) por um usuário.
O usuário pode preencher os detalhes da avaliação, como classificação, comentário e outras informações relevantes, e então submetê-los por meio de um POST request. Isso permite que os usuários compartilhem suas opiniões e feedback sobre os filmes no sistema.
![](https://github.com/Luann2003/MovieFlix/blob/main/insert%20de%20review.png)


# Autor
Luan Victor de Ramos Luciano

https://www.linkedin.com/in/luan-luciano-1603b4197/

