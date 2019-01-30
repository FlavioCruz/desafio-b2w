# desafio-b2w
Desafio de desenvolvimento do processo seletivo da B2W.

Projeto de API REST que realiza pequenas operações acerca dos planetas do universo de Star Wars. Os dados iniciais foram coletados de [The Star Wars API](https://swapi.co/).

## Funcionalidades:

### GET
- "/" (getAll) - Lista todos os planetas;
- "/id/{id}" (getById) - Recupera um planeta dado um ID válido;
- "/name/{name}" (getByName) - Recupera um planeta com o dado nome;

### POST

- "/" (create) - Cria um novo registro de planeta;

### DELETE

- "/{id}" (delete) - Remove um planeta dado um ID válido.

## Tecnologias
O projeto foi escrito em Java utilizando o Framework Spring Boot e banco de dados não relacional MongoDB.

## Como usar
Pode ser utilizado via IDE, como [IntelliJ](https://www.jetbrains.com/idea/), onde se deve atualizar as dependências do Maven e
iniciar o projeto normalmente. Deve ser acessível via porta 8080.
Para utilizar os endpoints, recomendo a utilização de ferramentas como [Postman](https://www.getpostman.com/) para fazer as requisições.

A url base deverá ser <http://localhost:8080/planets>

Para utilizar a funcionalidade de criar um novo planeta, deve seguir a seguinte estrutura no corpo da requisição POST:

~~~javascript
  {
        "id": 9,
        "name": "Coruscant",
        "climate": [
            "temperate"
        ],
        "terrain": [
            "cityscape",
            "mountains"
        ],
        "movieAppearances": 4,
        "movies": [
            "https://swapi.co/api/films/5/",
            "https://swapi.co/api/films/4/",
            "https://swapi.co/api/films/6/",
            "https://swapi.co/api/films/3/"
        ]
    }
~~~

As respostas de todas as requisições seguem um padrão onde:

~~~~javascript
{
    "response": "Objeto de retorno",
    "status": "Status",
    "message": "Mensagem de status"
}
~~~~
Exemplo /id/9 :
~~~~javascript
{
    "response": {
        "id": 9,
        "name": "Coruscant",
        "climate": [
            "temperate"
        ],
        "terrain": [
            "cityscape",
            "mountains"
        ],
        "movieAppearances": 4,
        "movies": [
            "https://swapi.co/api/films/5/",
            "https://swapi.co/api/films/4/",
            "https://swapi.co/api/films/6/",
            "https://swapi.co/api/films/3/"
        ]
    },
    "status": "SUCCESS",
    "message": "Sucess"
}
~~~~
## Desenvolvedor
Flávio Cruz
