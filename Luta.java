public class Luta {
    private String cenario;
    private Personagem player1;
    private Personagem player2;

    public Luta(String cenario, Personagem p1, Personagem p2) {
        this.cenario = cenario;
        this.player1 = p1;
        this.player2 = p2;
    }

    public void desferirSoco(Personagem executor, Personagem vitima){
        vitima.setVida(vitima.getVida() - executor.getSocoHP());
        System.out.println(vitima.getNome() + "Perdeu: " + executor.getSocoHP() + "HP");
    }

    public void desferirChute(Personagem executor, Personagem vitima){
        vitima.setVida(vitima.getVida() - executor.getChuteHP());
        System.out.println(vitima.getNome() + "Perdeu: " + executor.getChuteHP() + "HP");

    }

    public void desferirEspecial(Personagem executor, Personagem vitima){
        vitima.setVida(vitima.getVida() - executor.getEspecialHP());
        System.out.println(vitima.getNome() + "Perdeu: " + executor.getEspecialHP() + "HP");

    }

    public boolean verificarMorreu(Personagem vitima){
        return vitima.getVida() <= 0;
    }

    public void exibirStatus(Personagem vitima){
        System.out.println(vitima.getNome() + "Vida: " + vitima.getVida());
    }

    public String getCenario(){
        return cenario;
    }

    public void setCenario(String cenario){
        this.cenario = cenario;
    }

}
