class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 90, 18);
    }

    @Override
    public void defender(int dano) {
        hp -= dano * 0.75; // Defesa moderada
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        ataqueBase *= 3;
    }
}
