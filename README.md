# 💱 Conversor de Moedas – Java (Console)

Aplicação desenvolvida em Java para conversão de moedas via terminal, utilizando requisição externa para obtenção das taxas de câmbio.

O projeto foi estruturado com separação em pacotes, aplicando organização e responsabilidade única entre camadas.

---

## 🎯 Objetivo

- Praticar consumo de API em Java
- Trabalhar com organização em pacotes
- Aplicar tratamento de exceções
- Manipular listas para geração de extrato
- Criar fluxo interativo no console

---

## 🏗 Estrutura do Projeto

edu.reis  
│  
├── Main.java  
│  
├── model  
│   └── SaidaFormatada.java  
│  
└── service  
&nbsp;&nbsp;&nbsp;&nbsp;├── Conversao.java  
&nbsp;&nbsp;&nbsp;&nbsp;└── Requisicao.java  

---

## 📌 Responsabilidades

### Main
- Controla o fluxo da aplicação
- Gerencia entrada do usuário
- Armazena histórico das conversões
- Exibe extrato ao final da execução

### SaidaFormatada
- Centraliza todas as mensagens exibidas no console
- Mantém separação entre lógica e apresentação

### Requisicao
- Realiza chamada à API de câmbio
- Obtém taxa de conversão

### Conversao
- Processa valores
- Exibe resultado formatado
- Armazena dados da conversão realizada

---

## 💰 Conversões Disponíveis

1. BRL → USD  
2. BRL → CLP  
3. BRL → AUD  
4. USD → BRL  
5. CLP → BRL  
6. AUD → BRL  

---

## ⚙️ Funcionalidades

- Menu interativo
- Validação de entrada (`InputMismatchException`)
- Conversão com taxa atual
- Histórico das conversões realizadas
- Geração de extrato ao encerrar o programa

---

## ▶ Como Executar

Compile:

javac edu/reis/Main.java

Execute:

java edu.reis.Main

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos
- Organização em pacotes
- Separação de responsabilidades
- Tratamento de exceções
- Uso de `List`
- Estruturas de controle (`while`, `switch`)
- Consumo de API externa

---

## 🚀 Possíveis Melhorias

- Persistência do extrato em arquivo
- Testes unitários
- Interface gráfica
- Containerização com Docker
- Implementação de logs

---

## 👤 Autor

Aglemar Reis  
Java • Backend • Sistemas Linux
