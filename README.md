# 💼 Sistema de Cadastro de Funcionários

Aplicação Java de console para gerenciamento de funcionários e gerentes, desenvolvida como projeto de prática em Programação Orientada a Objetos.

## 🎯 Funcionalidades

- Cadastro de funcionários e gerentes
- Listagem completa
- Busca por CPF
- Remoção
- Aplicação de aumento salarial em massa
- Cálculo de folha salarial total
- Validação de dados com exceções customizadas

## 🛠️ Tecnologias

- Programação Orientada a Objetos (Herança, Encapsulamento, Polimorfismo)
- Tratamento de exceções customizadas
- Coleções (ArrayList)

## 📁 Estrutura

sistema-funcionarios-java/
├── src/
│   ├── model.exception/
│   ├── model/
│   ├── service/
│   └── Main.java
├── .gitignore
└── README.md

## 🧠 Conceitos aplicados

- **Encapsulamento:** atributos privados acessados via getters/setters
- **Herança:** classe `Gerente` estende `Funcionario`
- **Polimorfismo:** sobrescrita do método `toString()`
- **Validações:** uso de exceções customizadas (`FuncionarioException`)
- **Separação de responsabilidades:** camadas `model`, `service` e `model.exception`

## ▶️ Como executar

```bash
javac -d bin src/**/*.java src/Main.java
java -cp bin Main
```

## 👤 Autor

**Arthur Pereira Camargo**  
Estudante de Engenharia de Software – PUC-PR  
[LinkedIn](https://www.linkedin.com/in/arthurcamargo03/)
