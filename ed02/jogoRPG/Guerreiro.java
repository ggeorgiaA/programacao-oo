class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 100, 20);
    }

    @Override
    public void defender(int dano) {
        hp -= dano / 2; // Reduz dano pela metade
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
    }
}