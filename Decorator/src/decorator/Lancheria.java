package decorator;

import java.util.ArrayList;
import utilidades.Util;

/**
 *
 * @author Bruna Almeida
 */
public class Lancheria {

    public void menu() {
        int opcao = 0;
        
        Comida comida = null;
        //ArrayList<Comida> lanches = new ArrayList();

        MENU:
        do {
            System.out.println("\n\n### FAÇA SEU PEDIDO ###");
            System.out.println("\n                  =================================");
            System.out.println("                  |     1 - BAURU                    |");
            System.out.println("                  |     2 - X SALADA                 |");
            System.out.println("                  |     3 - X CORAÇÃO                |");
            System.out.println("                  |     4 - Adicionar acompanhamento |");
            System.out.println("                  |     0 - Concluir pedido          |");
            System.out.println("                  ==================================\n");

            opcao = Util.leInt();
            System.out.println("opcao:" + opcao);

            switch (opcao) {
                case 1:
                    //lanches.add(new Bauru());
                    comida = new Bauru();
                    System.out.println("Bauru na chapa!");
                    System.out.println("Acompanhamentos? Se sim, digite 4.");
                    break;
                case 2:
                    //lanches.add(new XSalada());
                    comida = new XSalada();
                    System.out.println("X Salada na chapa!");
                    System.out.println("Acompanhamentos? Se sim, digite 4.");
                    break;
                case 3:
                    //lanches.add(new XCoracao());
                    comida = new XCoracao();
                    System.out.println("X Coração na chapa!");
                    System.out.println("Acompanhamentos? Se sim, digite 4.");
                    break;
                case 4:
                    int acomp = 0;
                    //Comida comida = lanches.get((lanches.size()) -1);

                    ACOMPANHAMENTOS:
                    while (acomp != 9) {
                        System.out.println("\n");
                        System.out.println("Escolha o acompanhamento:");
                        System.out.println("1- Ovo");
                        System.out.println("2- Queijo duplo");
                        System.out.println("3- Bacon");
                        System.out.println("9- Pronto!");

                        acomp = Util.leInt();

                        switch (acomp) {
                            case 1:

                                if (!(comida instanceof Ovo)) {

                                    comida = new Ovo(comida);
                                    System.out.println("Ovo adicionado!");
                                    System.out.println("Mais alguma coisa?");
                                } else {
                                    System.out.println("Opção já selecionada");
                                }

                                break;
                            case 2:

                                if (!(comida instanceof QueijoDuplo)) {

                                    comida = new QueijoDuplo(comida);
                                    System.out.println("Queijo duplo adicionado!");
                                    System.out.println("Mais alguma coisa?");
                                } else {
                                    System.out.println("Opção já selecionada");
                                }

                                break;
                            case 3:

                                if (!(comida instanceof Bacon)) {
                                    comida = new Bacon(comida);
                                    System.out.println("Bacon adicionado!");
                                    System.out.println("Mais alguma coisa?");
                                } else {
                                    System.out.println("Opção já selecionada");
                                }

                                break;
                            case 9:
                                break ACOMPANHAMENTOS;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }

                    break;
                case 0:
                    break MENU;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 0);

        System.out.println("\n");
        System.out.println("Obrigada. Dados do seu pedido:");
        
        
        if(comida != null) {
            System.out.println("Lanche: " + comida.getDescricao() + " - R$ " + comida.getPreco());
        }

        /*
        if (lanches.isEmpty()) {
           System.out.println("Nada hoje? Ok. Volte sempre!");
        } else {
            for (int i = 0; i < lanches.size(); i++) {
                System.out.println("Lanche: " + lanches.get(i).getDescricao() + " - R$ " + lanches.get(i).getPreco());
            }
        }
        
        */

    }

}
