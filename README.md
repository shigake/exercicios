## 📍 Objetivo

Refatorar o código aplicando boas práticas de arquitetura e design.
---

## 🚫 Problemas presentes (Anti-patterns)

O código atual contém os seguintes **anti-patterns**:

- 🔁 **Spaghetti code**: lógica embaralhada, difícil de manter e entender.
- 📦 **God class**: `main` faz tudo: entrada, regra de negócio, exibição, armazenamento.
- ❌ **Falta de separação de responsabilidades**: quebra do princípio SRP (Single Responsibility).
- 😵 **Baixa coesão**: funcionalidades não agrupadas de forma lógica.
- 💥 **Acoplamento alto**: tudo depende de tudo diretamente.

---

## ✅ O que aplicar na refatoração

Você deverá aplicar os seguintes **design patterns** e boas práticas:

### ✔ Princípios SOLID
- **SRP (Single Responsibility)**: cada classe com uma única responsabilidade.
- **OCP (Open/Closed)**: prepare o sistema para futuras mudanças sem editar muito código.

### ✔ Design Patterns sugeridos
- **Facade (opcional)**: caso queira encapsular os fluxos do `controller`.
- **Service Layer**: lógica de negócio isolada em uma camada.
- **Repository Pattern**: simular acesso a dados com lista em memória.
- **MVC básico**: separar Model, Controller e Serviço.

---

## 📂 Estrutura esperada após a refatoração
├── App.java # Ponto de entrada limpo

├── controller/

│ └── UserController.java # Entrada e saída do sistema

├── model/

│ └── User.java # Representação do usuário

├── service/

│ └── UserService.java # Lógica de cadastro, listagem, exclusão

└── repository/

└── UserRepository.java # Simula armazenamento em memória

## 🧪 O que você deve entregar

1. Uma nova estrutura com as responsabilidades separadas
2. A lógica de cadastro, listagem e exclusão funcionando como antes
3. Comentários ou README indicando quais padrões foram aplicados

---

## 💡 Dica

Você pode começar quebrando o `main` em métodos pequenos, e depois mover esses métodos para suas classes adequadas. Vá passo a passo.

---

## 🚀 Desafio extra

- Implemente testes unitários para o `UserService`
- Permita salvar os dados em arquivo `.txt` usando `BufferedWriter` (sem perder a separação)

---

## 📚 Referências

- [Design Patterns em Java](https://refactoring.guru/design-patterns/java)
- [Princípios SOLID](https://medium.com/educative/s-o-l-i-d-principles-in-java-6b6c7e1b3d4e)
