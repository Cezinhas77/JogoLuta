public static void main(String[] args) {
    Scanner ent = new Scanner((System.in));

    System.out.println("=== CADASTRO DO PLAYER 1");
    Personagem p1 = new Personagem();

    System.out.println("=== CADASTRO DO PLAYER 2");
    Personagem p2 = new Personagem();

    System.out.println("Digite o cenário da luta: ");
    String cenario = ent.nextLine();
    Luta luta = new Luta(cenario, p1, p2);

    System.out.println("A Luta começa em " + cenario + "!!");

    int turno = 1;
    while (true) {
        Personagem executor = (turno % 2 != 0) ? p1 : p2;
        Personagem vitima   = (turno % 2 != 0) ? p2 : p1;

        System.out.println("===== Turno" + turno + "Vez de: " + executor.getNome() + "=====");

        System.out.println("1 - Soco | 2 - Chute | 3 - Especial");
        int opcao = ent.nextInt();

        switch(opcao){
            case 1 : luta.desferirSoco     (executor, vitima); break;
            case 2 : luta.desferirChute    (executor, vitima); break;
            case 3 : luta.desferirEspecial (executor, vitima); break;
            default: System.out.println("Opção Invalida!");    break;
        }

        if (luta.verificarMorreu(vitima)){
            System.out.println(vitima.getNome() + "Morreu !");
            System.out.println(executor.getNome() + "Ganhou!");
            break;
        }
    }

}


