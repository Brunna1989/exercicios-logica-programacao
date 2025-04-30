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

O projeto foi desenvolvido com **boas práticas de organização e código limpo**, utilizando pacotes separados para cada responsabilidade:

```
ProdutoDesconto/
├── Main.java                          // Ponto de entrada
├── model/
│   └── Produto.java                  // Entidade Produto
├── service/
│   └── ProdutoService.java          // Regra de negócio
├── util/
│   └── DescontoUtil.java            // Utilitário de cálculo de descontos
```

---

## ⚙️ Como Funciona

1. O usuário informa:
    - Nome do produto
    - Preço unitário
    - Quantidade comprada
2. O sistema calcula o valor total com desconto aplicado conforme a quantidade.
3. O nome do produto e o valor final a pagar são exibidos no console.

---

## 💡 Tecnologias Utilizadas

- **Java SE (Java Puro)**
- **Programação Orientada a Objetos**
- **Clean Code (código legível, modular e reutilizável)**

---

## ▶️ Como Executar o Projeto

1. Compile todos os arquivos Java:

```bash
javac Main.java model/Produto.java service/ProdutoService.java util/DescontoUtil.java
```

2. Execute o programa:

```bash
java Main
```

---

## 📌 Observações

- Nenhum framework externo foi utilizado.
- O código está pronto para ser estendido com testes unitários ou interface gráfica (como Swing ou JavaFX), se desejado.
- O projeto está estruturado para facilitar manutenção e testes.

---

## 👨‍💻 Autor

Projeto desenvolvido para fins didáticos e práticos com foco em Java puro, arquitetura limpa e organização modular.

