# 💰 Calculadora de Descontos por Quantidade - Java Puro

Este projeto em **Java puro** calcula o valor final a ser pago por um produto com base em sua **quantidade comprada**, aplicando descontos conforme uma tabela progressiva.

---

## 📚 Regras de Negócio

A aplicação segue a seguinte tabela de descontos:

| Quantidade Comprada | Desconto Aplicado |
|---------------------|-------------------|
| Até 10 unidades     | 0% (sem desconto) |
| 11 a 20 unidades    | 10%               |
| 21 a 50 unidades    | 20%               |
| Acima de 50         | 25%               |

---

## 🧱 Estrutura do Projeto

O projeto está organizado com pacotes para separar responsabilidades, seguindo boas práticas de desenvolvimento:

```
exercicio_02/
├── src/
│   ├── app/
│   │   └── Main.java                  // Ponto de entrada da aplicação
│   ├── model/
│   │   └── Produto.java               // Classe que representa um produto
│   ├── service/
│   │   └── ProdutoService.java        // Contém as regras de negócio
│   └── test/
│       └── ProdutoServiceTest.java    // Testes unitários (JUnit)
├── lib/                               // Diretório para armazenar os JARs do JUnit (caso necessário)
```

---

## ⚙️ Como Funciona

1. O usuário informa:
   - Nome do produto
   - Preço unitário
   - Quantidade comprada
2. O sistema calcula:
   - Valor total sem desconto
   - Percentual de desconto conforme a quantidade
   - Valor final com desconto
3. Os dados são exibidos no console.

---

## 💡 Tecnologias Utilizadas

- **Java SE (Java Puro)**
- **JUnit 4 para testes**
- **hamcrest-core-1.3.jar**  - Biblioteca complementar do Junit para realização de testes.
- **Programação Orientada a Objetos**
- **Clean Code (modularização, responsabilidade única)**

---

## ▶️ Como Executar o Projeto

1. Compile os arquivos Java (a partir da raiz do projeto):

```bash
javac -d out/production/exercicio_02 src/model/*.java src/service/*.java src/app/Main.java
```

2. Execute o programa:

```bash
java -cp out/production/exercicio_02 app.Main
```

---

## 🧪 Como Rodar os Testes

Certifique-se de ter o JUnit no classpath. Exemplo de execução via terminal (com JUnit 4.13.1 e Hamcrest 1.3):

```bash
javac -cp "lib/junit-4.13.1.jar;lib/hamcrest-core-1.3.jar;out/production/exercicio_02" src/test/ProdutoServiceTest.java
java -cp "lib/junit-4.13.1.jar;lib/hamcrest-core-1.3.jar;out/production/exercicio_02;src/test" org.junit.runner.JUnitCore test.ProdutoServiceTest
```

---

## 📈 Como Gerar o Relatório de Coverage (JaCoCo)

Para gerar o relatório de cobertura de testes com **JaCoCo**, siga os passos abaixo:

1. Execute os testes com o agente do JaCoCo:

```bash
java -javaagent:lib/jacocoagent.jar=destfile=jacoco.exec -cp "lib/junit-4.13.1.jar;lib/hamcrest-core-1.3.jar;out/production/exercicio_02;src/test" org.junit.runner.JUnitCore test.ProdutoServiceTest
```

2. Gere o relatório (formato HTML) com o `jacococli.jar`:

```bash
java -jar lib/jacococli.jar report jacoco.exec \
  --classfiles out/production/exercicio_02 \
  --sourcefiles src \
  --html coverage-report
```

3. Abra o relatório gerado acessando o arquivo:

```
coverage-report/index.html
```

---

## 📌 Observações

- Nenhum framework externo foi utilizado além do JUnit para testes.
- A lógica de negócio está separada para facilitar manutenção e testes.
- Pode ser estendido facilmente para interface gráfica (Swing, JavaFX).

---

## 👨‍💻 Autor

Projeto desenvolvido com fins didáticos, utilizando Java puro e boas práticas de arquitetura e organização modular.
