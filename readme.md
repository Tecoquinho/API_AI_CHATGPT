# API de Integração com ChatGPT

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-green.svg)
![OpenAI](https://img.shields.io/badge/OpenAI-ChatGPT-orange.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

Este repositório contém uma API RESTful desenvolvida em **Spring Boot** que integra com a API da **OpenAI ChatGPT**. O projeto é um exemplo prático de como consumir a API do ChatGPT para criar aplicações inteligentes e interativas.

## 📋 Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

- **Java JDK 17** ou superior
- **Maven** para gerenciamento de dependências
- **Git** para clonar o repositório
- **Postman** ou qualquer outra ferramenta para testar APIs (opcional)

## 🚀 Como executar o projeto

Siga os passos abaixo para configurar e executar o projeto localmente:

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Tecoquinho/API_AI_CHATGPT.git
   cd API_AI_CHATGPT
   ```

2. **Compile o projeto com Maven:**
     ```bash
   mvn clean install
   ```
3. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```
4. **Acesse a API:**
Após iniciar a aplicação, a API estará disponível em:
```bash
http://localhost:8080
```

## 📚 Documentação da API

A API permite enviar mensagens para o ChatGPT e receber respostas. Aqui estão os endpoints disponíveis:

- **POST /api/chat**
  - Envia uma mensagem para o ChatGPT.
  - Exemplo de requisição:
    ```json
    {
      "message": "Olá, como você está?"
    }
    ```
  - Exemplo de resposta:
    ```json
    {
      "response": "Olá! Estou bem, obrigado por perguntar. Como posso ajudar você hoje?"
    }
    ```

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **OpenAI API**: Integração com o ChatGPT para respostas inteligentes.
- **Maven**: Gerenciador de dependências e build.
- **Swagger**: Documentação automática da API (opcional).

## 📂 Estrutura do Projeto

A estrutura do projeto segue o padrão do Spring Boot:
```bash
API_AI_CHATGPT/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── ApiAiChatGptApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── static/
│ └── test/
│ └── java/
│ └── com/
│ └── example/
│ └── ApiAiChatGptApplicationTests.java
├── pom.xml
└── README.md
```
## 🤝 Como Contribuir

Contribuições são sempre bem-vindas! Se você quiser contribuir para este projeto, siga os passos abaixo:

1. Faça um **fork** do projeto.
2. Crie uma nova branch com sua feature ou correção: `git checkout -b minha-feature`.
3. Faça commit das suas alterações: `git commit -m 'Adicionando nova feature'`.
4. Envie para o repositório remoto: `git push origin minha-feature`.
5. Abra um **Pull Request** e aguarde a revisão.

## 📄 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito com por [Tecoquinho](https://github.com/Tecoquinho)🚀
