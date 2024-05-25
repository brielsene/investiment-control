# Investiment Control

Investiment Control é uma aplicação Java para controle de investimentos pessoais, desenvolvida com base nos princípios da Clean Architecture.
Foi criada principalmente, para fins de estudo e prática.

## Visão Geral

Esta aplicação permite que os usuários registrem seus investimentos financeiros, acompanhem seu desempenho ao longo do tempo e obtenham insights sobre sua carteira de investimentos.

## Funcionalidades Principais

- Cadastro de investimentos: Os usuários podem adicionar novos investimentos, especificando detalhes como tipo de investimento, valor investido, data de compra, etc.
- Visualização de investimentos: Os investimentos registrados podem ser visualizados em uma lista ou em formatos gráficos, permitindo uma análise visual do desempenho da carteira.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Hibernate
- MySql
- Docker para MySql

## Estrutura do Projeto

O projeto segue uma arquitetura em camadas, com as seguintes principais:

- **Controllers**: Responsáveis por receber as requisições HTTP e chamar os serviços apropriados.
- **Services**: Contêm a lógica de negócios da aplicação.
- **Repositories**: Responsáveis pela interação com o banco de dados.
- **Entities**: Representam as entidades do domínio da aplicação.

## Organização das classes
![org-classes](https://github.com/brielsene/investiment-control/assets/87671071/06393cfe-8528-42b2-a260-5fb0230c5b43)

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Certifique-se de ter o Java e o Maven instalados.
3. Configure o banco de dados de acordo com suas preferências, atualizando as configurações no arquivo `application.properties`.
4. Execute o comando `mvn spring-boot:run` na raiz do projeto para iniciar o servidor.

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar solicitações de pull (pull requests) com melhorias, correções de bugs ou novas funcionalidades.


