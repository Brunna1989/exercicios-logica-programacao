# 🕹️ Jokenpô - Pedra, Papel e Tesoura (Java Swing)

## 📌 Descrição do Projeto

Este projeto é uma implementação do clássico jogo **Jokenpô (Pedra, Papel e Tesoura)** utilizando **Java 17** e **interface gráfica com Swing**. O jogo permite que o usuário jogue contra o computador, visualize o resultado de cada rodada e acompanhe o histórico acumulado das partidas jogadas durante a sessão. Além disso, os resultados são gravados em um arquivo `.txt` para consulta futura.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17 (JDK 17)**
- **Swing (javax.swing) para interface gráfica**
- Organização em pacotes:
    - `model` (Enum `Opcao`)
    - `model.service` (lógica do jogo)
    - `ui` (interface gráfica)
- **Testes unitários com JUnit 4.13.2 e Hamcrest 1.3**  
  Os testes são realizados utilizando as bibliotecas:
    - `junit-4.13.2.jar`
    - `hamcrest-core-1.3.jar`  
      Ambas estão incluídas na pasta `lib` do projeto.

---

## 💡 Objetivo e Motivação

Este projeto foi desenvolvido com os seguintes objetivos:

- Praticar **programação orientada a objetos (POO)** em Java.
- Separar corretamente responsabilidades entre **camadas de modelagem, serviço e interface**.
- Criar uma interface gráfica simples e funcional com **Java Swing**.
- Persistir o histórico de partidas em um arquivo externo.
- Permitir interações intuitivas para o jogador, com botões para jogar, reiniciar e sair.

---

## 🎮 Como Jogar

1. Ao iniciar o programa, será exibida uma janela com o título **"Jokenpô"**.
2. O jogador deve clicar em um dos três botões: **PEDRA**, **PAPEL** ou **TESOURA**.
3. O computador fará uma escolha aleatória.
4. O resultado será exibido no topo da tela, informando:
    - A jogada do jogador.
    - A jogada do computador.
    - O resultado da partida (**Vitória**, **Derrota** ou **Empate**).
5. O resultado da partida também é:
    - Adicionado a uma área de **histórico de partidas** na lateral direita.
    - Impresso no **console**.
    - Gravado em um arquivo chamado `historico_jogo.txt`.

6. Botões adicionais:
    - **Nova Rodada**: Limpa o histórico da interface e reseta o status da tela.
    - **Sair**: Encerra o jogo imediatamente.

---

## 🧩 Estrutura do Projeto

```
📦 src
├── Main.java
├── model
│   └── Opcao.java
├── model.service
│   └── JogoService.java
└── ui
    └── JokenpoUI.java
└── test
    └── JogoServiceTest.java
```

---

## 📂 Histórico de Partidas

Os resultados são armazenados linha a linha no arquivo:

```
historico_jogo.txt
```

Formato dos logs:

```
Jogador: PEDRA | Computador: TESOURA => Você venceu!
Jogador: PAPEL | Computador: PAPEL => Empate!
```

---

## 🚀 Requisitos para Execução

- **JDK 17** instalado
- IDE compatível com Java (IntelliJ, Eclipse, VS Code, etc.) ou compilação manual via terminal

### Compilando via terminal:
```bash
javac Main.java model/Opcao.java model/service/JogoService.java ui/JokenpoUI.java
java Main
```

---

## ✅ Funcionalidades

- Escolha interativa entre **PEDRA**, **PAPEL** e **TESOURA**
- Resultado dinâmico e visual
- **Histórico exibido em tempo real**
- Salva resultados em **arquivo externo**
- Botão para reiniciar a partida
- Botão para sair do jogo

---

## 🧑‍💻 Autor

Desenvolvido como prática de Java com interface gráfica e separação de camadas.
