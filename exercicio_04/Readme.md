# 📐 Calculadora em Java (Java Puro + JUnit)

Este é um projeto de uma **calculadora simples em Java puro**, com **arquitetura em camadas**, usando **JUnit 4.13.2** para testes e **Hamcrest 1.3** como dependência auxiliar. O projeto **não usa Maven nem Gradle** — todas as bibliotecas estão na pasta `lib`.

---

## 📁 Estrutura de Pacotes

```
calculadora/
├── lib/                          # Bibliotecas externas (.jar)
│   ├── junit-4.13.2.jar
│   └── hamcrest-core-1.3.jar
├── src/
│   ├── exception/               # Exceções customizadas
│   │   └── OperacaoInvalidaException.java
│   ├── model/                   # Enumerações e entidades
│   │   └── Operacao.java
│   ├── service/                 # Lógica de negócio
│   │   └── CalculadoraService.java
│   ├── test/                    # Testes unitários com JUnit
│   │   └── CalculadoraServiceTest.java
│                       # Interface de console (usuário)
│       └── Main.java
```

---

## ⚙️ Como Compilar

Abra o terminal na pasta raiz do projeto (onde estão as pastas `src/` e `lib/`) e execute:

```bash
javac -cp ".;lib/*" -d bin src/**/*.java
```

> 🔁 No Linux/macOS, troque `;` por `:`:
> ```bash
> javac -cp ".:lib/*" -d bin src/**/*.java
> ```

---

## ▶️ Como Executar a Aplicação

Após compilar, execute o programa no terminal com:

```bash
java -cp "bin" ui.Main
```

---

## 🧪 Como Executar os Testes

Use o comando abaixo para rodar os testes unitários com JUnit:

```bash
java -cp "bin;lib/*" org.junit.runner.JUnitCore test.CalculadoraServiceTest
```

> 🔁 No Linux/macOS, troque `;` por `:`:
> ```bash
> java -cp "bin:lib/*" org.junit.runner.JUnitCore test.CalculadoraServiceTest
> ```

Você verá uma saída como esta ao passar todos os testes:

```
JUnit version 4.13.2
......
Time: 0.01

OK (6 tests)
```

---

## 📌 Funcionalidades

- Adição, subtração, multiplicação e divisão
- Tratamento de erro para divisão por zero
- Validação de operação inválida
- Interface em modo texto via console
- Testes automatizados com JUnit

---

## 👨‍💻 Tecnologias Utilizadas

- Java 8+ (JDK)
- JUnit 4.13.2
- Hamcrest 1.3
- Terminal (compilação e execução manual)
- Nenhum framework adicional

---

## ✅ Autor

Desenvolvido como projeto de prática com foco em **organização de pacotes**, **boas práticas em Java** e **testes unitários manuais com `.jar`**.


