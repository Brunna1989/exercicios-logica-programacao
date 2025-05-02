# Verificador de Idade - Java Puro

Este projeto é um exemplo simples e bem estruturado de uma aplicação Java que verifica se uma pessoa é **maior de idade** (18 anos ou mais). Ele foi desenvolvido **sem o uso de frameworks**, utilizando apenas **Java puro (Java SE)**, com foco em **boas práticas de programação** e **organização por camadas**.

---

## 🧱 Estrutura do Projeto

O código foi dividido em três camadas principais, separando responsabilidades conforme os princípios da programação orientada a objetos:

```
VerificadorIdade/
├── Main.java                           // Ponto de entrada da aplicação (opcional com testes)
├── model/
│   └── Pessoa.java                    // Classe que representa a entidade Pessoa
├── service/
│   └── PessoaService.java            // Lógica de negócio para verificar a idade
├── test/
│   └── PessoaServiceTest.java       // Testes unitários com JUnit
├── lib/                               // Diretório para armazenar os JARs do JUnit (caso necessário)

```

---

## 📋 Como Funciona

1. Ao executar o projeto, os testes já executam os cenários automaticamente.
2. A classe `PessoaService` contém a lógica para verificar se a idade é maior ou igual a 18.
3. A propriedade `isMaiorDeIdade` da entidade é atualizada de acordo com o resultado.
4. No caso dos testes, os dados são simulados e o resultado da verificação é exibido no console com `System.out.println`.

---

## 🧪 Testes Unitários com JUnit

Este projeto também contém testes automatizados com **JUnit 4**, localizados no pacote `test`. Eles validam os comportamentos esperados do sistema, e também imprimem no console o resultado da verificação de maioridade.

### ✅ O que os testes fazem:
- Criam instâncias da classe `Pessoa` com idades diferentes.
- Chamam o método `isMaiorDeIdade()` da `PessoaService`.
- Verificam se o resultado está correto com `assertTrue()` ou `assertFalse()`.
- Exibem no console a frase: `"Nome tem X anos e é maior/menor de idade."`

---

## ▶️ Como Executar os Testes

### 1. Certifique-se de ter os arquivos JAR do JUnit e Hamcrest no diretório `lib/`

Você pode baixar os arquivos aqui:
- [junit-4.13.2.jar](https://search.maven.org/artifact/junit/junit/4.13.2/jar)
- [hamcrest-core-1.3.jar](https://search.maven.org/artifact/org.hamcrest/hamcrest-core/1.3/jar)

Coloque ambos os arquivos na pasta `lib`.

### 2. Compile os arquivos:
```bash
javac -cp "lib/*" -d out src/model/Pessoa.java src/service/PessoaService.java src/test/PessoaServiceTest.java
```

### 3. Rode os testes:
```bash
javac -cp "lib/junit-4.13.1.jar;lib/hamcrest-core-1.3.jar;out/production/exercicio_02" src/test/ProdutoServiceTest.java
java -cp "lib/junit-4.13.1.jar;lib/hamcrest-core-1.3.jar;out/production/exercicio_02;src/test" org.junit.runner.JUnitCore test.ProdutoServiceTest
```

> Obs.: no Linux/Mac, troque `;` por `:` no classpath. 

---

## 🛠️ Tecnologias Utilizadas

- **Java SE (puro)** — Sem frameworks.
- **JUnit 4** — Para testes automatizados.
- **hamcrest-core-1.3.jar**  - Biblioteca complementar do Junit para realização de testes.
- **Orientação a Objetos (OOP)** — Com separação de camadas: modelo, serviço e teste.
- **Execução via console** — Simples e direto, ideal para aprendizado.

---

## ✅ Autor

Este projeto foi organizado para fins de estudo e boas práticas com Java puro. Sinta-se à vontade para usar como base em projetos didáticos ou profissionais.
