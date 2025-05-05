package model;

public enum Opcao {
    PEDRA, PAPEL, TESOURA;

    public boolean vence(Opcao pc) {
        return (this == PEDRA && pc == TESOURA)
                || (this == PAPEL && pc == PEDRA)
                || (this == TESOURA && pc == PAPEL);
    }
}
