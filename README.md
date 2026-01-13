# 🤖 BotSimples

Bot simples em Java para interagir com o usuário via terminal e demonstrar conceitos básicos de programação.

## 📌 Sobre

Este projeto é um bot de console que:

* solicita o nome do usuário;
* tenta adivinhar a idade usando restos de divisões;
* demonstra contagem até um número escolhido pelo usuário;
* termina com uma mensagem amigável.

O objetivo é servir como **exercício de aprendizado em Java**, praticando:

* entrada de dados com `Scanner`
* operações matemáticas
* strings e concatenação
* estruturas básicas de programa

## 📁 Estrutura do Projeto

O projeto contém:

```
bot/
├── SimpleBot.java
└── (outros arquivos, se houver)
README.md
```

## 🚀 Como Usar

### ✔️ Pré-requisitos

* Java instalado (JDK 8 ou superior)
* Um terminal/console

### 📌 Rodando o projeto

1. Clone o repositório:

```bash
git clone https://github.com/figueiroa-filipe/BotSimples.git
```

2. Entre na pasta do projeto:

```bash
cd BotSimples
```

3. Compile o código:

```bash
javac bot/SimpleBot.java
```

4. Execute o programa:

```bash
java bot.SimpleBot
```

## 💡 O que o bot faz

1. **Saúda o usuário**;
2. Pede o **nome** e exibe uma mensagem personalizada;
3. Pede os **restos da divisão da sua idade por 3, 5 e 7**;
4. Calcula e mostra sua idade;
5. (Em breve) conta até um número escolhido pelo usuário;
6. Finaliza com uma mensagem de despedida.

## 📝 Exemplo de uso

```plaintext
Olá! Meu nome é Aid.
Fui criado em 2018.
Por favor, relembre-me o seu nome.
> João
Que nome maravilhoso você tem, João!
Deixe-me adivinhar sua idade.
Digite os restos da divisão da sua idade por 3, 5 e 7.
> 1
> 2
> 1
Sua idade é 22; esse é um bom momento para começar a programar!
```

## 🛠️ Dependências

Este projeto não usa dependências externas — apenas a biblioteca padrão do Java.

## 📄 Licença

Este projeto é de código aberto e pode ser usado e adaptado livremente.
