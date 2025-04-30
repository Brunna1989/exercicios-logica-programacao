# Verificador de Idade - Java Puro

Este projeto é um exemplo simples e bem estruturado de uma aplicação Java que verifica se uma pessoa é **maior de idade** (18 anos ou mais). Ele foi desenvolvido **sem o uso de frameworks**, utilizando apenas **Java puro (Java SE)**, com foco em **boas práticas de programação** e **organização por camadas**.

---

## 🧱 Estrutura do Projeto

O código foi dividido em três camadas principais, separando responsabilidades conforme os princípios da programação orientada a objetos:

```
VerificadorIdade/
├── Main.java                           // Ponto de entrada da aplicação
├── model/
│   └── Pessoa.java                    // Classe que representa a entidade Pessoa
├── service/
│   └── PessoaService.java            // Lógica de negócio para verificar a idade
```

---

## 📋 Como Funciona

1. O usuário digita o nome e a idade de uma pessoa no terminal.
2. O sistema cria um objeto `Pessoa` com esses dados.
3. A classe `PessoaService` contém a lógica que verifica se a idade é maior ou igual a 18.
4. O resultado é exibido no console informando se a pessoa é maior ou menor de idade.

---

## 🛠️ Tecnologias Utilizadas

- **Java SE (puro)** — Sem uso de bibliotecas ou frameworks externos.
- **Orientação a Objetos (OOP)** — Uso de classes, encapsulamento e responsabilidades bem definidas.
- **Estrutura modular** — Separação entre entrada de dados, modelo de dados e regras de negócio.

---

## 🚀 Como Executar

### 1. Compile os arquivos:
```bash
javac Main.java model/Pessoa.java service/PessoaService.java
```

### 2. Execute o programa:
```bash
java Main
```

---

## 📌 Observações

- Este projeto foi desenvolvido com fins educacionais, para demonstrar como aplicar boas práticas mesmo em projetos pequenos.
- Ele pode ser expandido facilmente para aceitar entradas por arquivos, interface gráfica (JavaFX ou Swing), ou conectá-lo a um banco de dados futuramente.

---

## ✅ Autor

Este projeto foi organizado para fins de estudo e boas práticas com Java puro. Sinta-se à vontade para usar como base em projetos didáticos ou profissionais.
