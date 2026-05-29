import java.util.Scanner;

public class Personagem {
    String nome;
    int vida, socoHP, chuteHP,especialHP;

    public Personagem(){
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o nome do personagem: ");
        this.nome = ent.nextLine();
        System.out.print("Digite a vida do personagem: ");
        this.vida = ent.nextInt();
        System.out.print("Digite o dano do soco: ");
        this.socoHP = ent.nextInt();
        System.out.print("Digite o dano do chute: ");
        this.chuteHP = ent.nextInt();
        System.out.print("Digite o dano do especial: ");
        this.especialHP = ent.nextInt();



        exibirInformacao();

    }

    public void exibirInformacao(){
        System.out.println("\n===== Informações do Personagem =====");
        System.out.println("Nome:     " + nome);
        System.out.println("Vida:     " + vida);
        System.out.println("Soco:     " + socoHP);
        System.out.println("Chute:    " + chuteHP);
        System.out.println("Especial: " + especialHP);
        System.out.println("========================================");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEspecialHP() {
        return especialHP;
    }

    public void setEspecialHP(int especialHP) {
        this.especialHP = especialHP;
    }

    public int getChuteHP() {
        return chuteHP;
    }

    public void setChuteHP(int chuteHP) {
        this.chuteHP = chuteHP;
    }

    public int getSocoHP() {
        return socoHP;
    }

    public void setSocoHP(int socoHP) {
        this.socoHP = socoHP;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


}


