package sempadrao;

import java.util.ArrayList;
import sempadrao.Comida;
import utilidades.Util;

/**
 *
 * @author Bruna Almeida
 */
public class Lancheria {

    public void menu() {
        int opcao = 0;
        
        
        Comida comida = null;

        MENU:
        do {
            System.out.println("\n\n### SÓ VENDEMOS X-SALADA ###");
            System.out.println("\n                  =================================");
            System.out.println("                  |     1 - X SALADA                 |");
            System.out.println("                  |     2 - Adicionar acompanhamento |");
            System.out.println("                  |     0 - Concluir pedido          |");
            System.out.println("                  ==================================\n");

            opcao = Util.leInt();
            System.out.println("opcao:" + opcao);

            switch (opcao) {
                case 1:
                    
                    comida = new XSalada();
                    System.out.println("X Salada na chapa!");
                    System.out.println("Acompanhamentos? Se sim, digite 4.");
                    break;
                case 2:
                    int acomp = 0;
                   

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

                                if (!(comida instanceof XSaladaComOvo
                                        || comida instanceof XSaladaComOvoEBaconEQueijoDuplo
                                        || comida instanceof XSaladaComOvoEBacon
                                        || comida instanceof XSaladaComQueijoDuploEOvo)) {
                                    
                                    
                                    
                                    if(comida instanceof XSaladaComBacon){
                                        comida = new XSaladaComOvoEBacon();
                                    } else if (comida instanceof XSaladaComQueijoDuplo) {
                                        comida = new XSaladaComQueijoDuploEOvo();
                                    } else if (comida instanceof XSaladaComQueijoDuploEBacon) {
                                        comida = new XSaladaComOvoEBaconEQueijoDuplo();
                                    } else {
                                        comida = new XSaladaComOvo();
                                    }

                                    
                                    System.out.println("Ovo adicionado!");
                                    System.out.println("Mais alguma coisa?");
                                } else {
                                    System.out.println("Opção já selecionada");
                                }

                                break;
                            case 2:

                                if (!(comida instanceof XSaladaComQueijoDuplo
                                        || comida instanceof XSaladaComOvoEBaconEQueijoDuplo
                                        || comida instanceof XSaladaComQueijoDuploEOvo
                                        || comida instanceof XSaladaComQueijoDuploEBacon)) {
                                    
                                    
                                    
                                    if(comida instanceof XSaladaComBacon) {
                                        comida = new XSaladaComQueijoDuploEBacon();
                                    } else if (comida instanceof XSaladaComOvo) {
                                        comida = new XSaladaComQueijoDuploEOvo();
                                    } else if (comida instanceof XSaladaComOvoEBacon) {
                                        comida = new XSaladaComOvoEBaconEQueijoDuplo();
                                    } else {
                                        comida = new XSaladaComQueijoDuplo();
                                    }

                                    
                                    System.out.println("Queijo duplo adicionado!");
                                    System.out.println("Mais alguma coisa?");
                                } else {
                                    System.out.println("Opção já selecionada");
                                }

                                break;
                            case 3:

                                if (!(comida instanceof XSaladaComBacon
                                        || comida instanceof XSaladaComOvoEBacon
                                        || comida instanceof XSaladaComQueijoDuploEBacon
                                        || comida instanceof XSaladaComOvoEBaconEQueijoDuplo)) {
                                    
                                    
                                    if(comida instanceof XSaladaComOvo) {
                                        comida = new XSaladaComOvoEBacon();
                                    } else if (comida instanceof XSaladaComQueijoDuplo) {
                                        comida = new XSaladaComQueijoDuploEBacon();
                                    } else if (comida instanceof XSaladaComQueijoDuploEOvo) {
                                        comida = new XSaladaComOvoEBaconEQueijoDuplo();
                                    }
                                    
                                    comida = new XSaladaComBacon();
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
        

        if (comida == null) {
           System.out.println("Nada hoje? Ok. Volte sempre!");
        } else {
            System.out.println("Obrigada. Dados do seu pedido:");
            System.out.println(comida.getDescricao() + " - R$ " + comida.getPreco());
        }

    }

}
