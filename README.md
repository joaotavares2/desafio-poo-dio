
# 🇧🇷 README -- Português

# Desafio POO – Bootcamp em Java

Este projeto foi desenvolvido como parte de um **desafio prático de Programação Orientada a Objetos (POO)** utilizando **Java 11**, com o objetivo de aplicar na prática os principais pilares desse paradigma.

O sistema simula um **Bootcamp de programação**, onde desenvolvedores podem se inscrever, consumir conteúdos (cursos e mentorias) e acumular experiência (XP) conforme progridem.

---

## Objetivos do desafio

* Praticar os conceitos fundamentais de **POO**
* Entender a modelagem de um domínio real usando classes e objetos
* Aplicar boas práticas de organização e encapsulamento
* Consolidar o uso de herança e polimorfismo em Java

---

## Conceitos de POO aplicados

### 🔹 Abstração

A classe abstrata `Conteudo` representa um conceito genérico de aprendizado, servindo como base para outros tipos de conteúdo.

### 🔹 Encapsulamento

Os atributos das classes são privados e acessados por meio de getters e setters, garantindo maior controle e segurança dos dados.

### 🔹 Herança

As classes `Curso` e `Mentoria` herdam de `Conteudo`, reutilizando atributos e comportamentos comuns.

### 🔹 Polimorfismo

Cada tipo de conteúdo possui sua própria implementação do método `calcularXp()`, permitindo comportamentos diferentes a partir da mesma abstração.

---

## Estrutura do projeto

```
src
└── main
    └── java
        └── org.exemple
            ├── dominio
            │   ├── Conteudo.java
            │   ├── Curso.java
            │   ├── Mentoria.java
            │   ├── Bootcamp.java
            │   └── Dev.java
            └── Main.java
```

---

## Funcionalidades

* Criação de cursos e mentorias
* Criação de um bootcamp com múltiplos conteúdos
* Inscrição de desenvolvedores no bootcamp
* Progresso do desenvolvedor nos conteúdos
* Cálculo automático de XP com base nos conteúdos concluídos

---

## Tecnologias utilizadas

* **Java 11**
* **Programação Orientada a Objetos**
* **IntelliJ IDEA** (ou IDE similar)
* **Git e GitHub**

---

## Como executar o projeto

1. Clone este repositório:

```bash
git clone https://github.com/joaotavares2/desafio-poo-dio.git
```

2. Abra o projeto em sua IDE Java
3. Certifique-se de estar usando o **Java 11**
4. Execute a classe `Main.java`

---

## Aprendizados

Com este projeto foi possível:

* Reforçar a base de POO em Java
* Entender herança e polimorfismo na prática
* Trabalhar com coleções (`Set`)
* Modelar regras de negócio simples
* Organizar um projeto Java de forma limpa e compreensível

---

## Autor

**João Pedro**
Estudante de Análise e Desenvolvimento de Sistemas
Projeto desenvolvido para fins educacionais.

---

<br>

# 🇺🇸 README -- English

# POO Challenge – Bootcamp in Java

This project was developed as part of a **practical Object-Oriented Programming (OOP) challenge** using **Java 11**, aiming to apply in practice the main pillars of this programming paradigm.

The system simulates a **programming bootcamp**, where developers can enroll, consume content (courses and mentoring sessions), and earn experience points (XP) as they progress.

---

## Challenge goals

* Practice the fundamental concepts of **OOP**
* Understand how to model a real-world domain using classes and objects
* Apply good practices of organization and encapsulation
* Strengthen the use of inheritance and polymorphism in Java

---

## OOP concepts applied

### 🔹 Abstraction

The abstract class `Conteudo` represents a generic learning concept, serving as the base for other content types.

### 🔹 Encapsulation

Class attributes are private and accessed through getters and setters, ensuring better data control and security.

### 🔹 Inheritance

The `Curso` and `Mentoria` classes inherit from `Conteudo`, reusing common attributes and behaviors.

### 🔹 Polymorphism

Each content type has its own implementation of the `calcularXp()` method, allowing different behaviors from the same abstraction.

---

## Project structure

```
src
└── main
    └── java
        └── org.exemple
            ├── dominio
            │   ├── Conteudo.java
            │   ├── Curso.java
            │   ├── Mentoria.java
            │   ├── Bootcamp.java
            │   └── Dev.java
            └── Main.java
```

---

## Features

* Creation of courses and mentoring sessions
* Bootcamp creation with multiple contents
* Developer enrollment in the bootcamp
* Developer progress through contents
* Automatic XP calculation based on completed contents

---

## Technologies used

* **Java 11**
* **Object-Oriented Programming**
* **IntelliJ IDEA** (or similar IDE)
* **Git and GitHub**

---

## How to run the project

1. Clone this repository:

```bash
git clone https://github.com/joaotavares2/desafio-poo-dio.git
```

2. Open the project in your Java IDE
3. Make sure you are using **Java 11**
4. Run the `Main.java` class

---

## Learnings

Through this project, it was possible to:

* Strengthen OOP fundamentals in Java
* Better understand inheritance and polymorphism
* Work with collections (`Set`)
* Model simple business rules
* Organize a Java project in a clean and readable way

---

## Author

**João Pedro**
Student of Systems Analysis and Development
Project developed for educational purposes.

