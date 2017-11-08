# Design Patterns: Decorator
Explicação do padrão de desenvolvimento DECORATOR para a disciplina Engenharia de Software III - Senac Fatec Pelotas


Padrões de desenvolvimento, comumente chamados de design patterns, são criados quando nos deparamos com problemas recorrentes, aqueles pelos quais a maioria dos desenvolvedores de software se deparam na maioria das vezes. Entre os vários design patterns existentes temos o decorator.

O decorator surge como uma alternativa à criação de subclasses quando queremos estender as funcionalidades de uma classe. Usamos esse padrão para adicionar responsabilidades a um objeto dinamicamente.

## O problema que o Decorator quer solucionar

Você quer adicionar comportamento ou características em <b>objetos individuais</b> em tempo de execução. Usar herança não é viável pois ela é estática aplicando-se à classe e não a um objeto.

## A solução

Esse padrão permite que você adicione responsabilidades a um objeto, não à interface a qual a classe desse objeto implementa. A interface deve permanecer intocada. 

O contexto em que um decorador é necessário é aquele em que temos um único componente básico, vários "embelezamentos" opcionais e uma interface que é comum a todos eles. Fazendo uma analogia, podemos pensar em uma lancheria em que temos um "x-coração", mas podem haver várias combinações para esse lanche como "sem salada", "com ovo extra", "com bacon", "com queijo duplo", etc. Nesse caso, não queremos criar uma subclasse para cada combinação (XCoracaoComQueijoDuploClass, XCoracaoComBaconClass, XCoracaoComQueijoDuploEBaconClass), o decorator faz com que não seja necessária a criação de uma nova implementação toda vez que surje um detalhe ("decoração") novo na implementação principal.

### Vê-se abaixo dois trechos de código que fazem a mesma coisa (adição de queijo-duplo no x-salada), o primeiro fazendo parte de um projeto que está usando o padrão decorator e o segundo não, para ilustrar a gambiarra estratosférica que pode ser criada, em alguns casos, se não nos beneficiamos de padrões de desenvolvimento:

#### Com decorator:

```
case 2:
   if (!(comida instanceof QueijoDuplo)) {

        comida = new QueijoDuplo(comida);
        System.out.println("Queijo duplo adicionado!");
        System.out.println("Mais alguma coisa?");
        
        } else {
           
           System.out.println("Opção já selecionada");
        }

 break;

```


#### Sem padrão:

```
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

```

## Uso do Padrão Decorator no Java
O Java também utiliza bastante o padrão de projeto Decorator. A API java.io é amplamente baseada nesse padrão de projeto.

Os objetos da API java.io que tipicamente usam esse objeto são os bem conhecidos LineNumberInputStream, BufferedInputStream e FileInputStream. Abaixo veja como eles estão decorados:

![](https://github.com/brunaNobre/design-patterns-decorators/blob/master/PadraoDecorator_Java2.jpg)<br>
<i><b>Figura 1:</b> Organização típica do padrão decorator para os objetos acima</i>

Na figura acima temos que LineNumberInputStream é um decorador concreto que tem como função contar as linhas de um determinado arquivo. O BufferInputStream também é um decorador concreto que tem como objetivo colocar a entrada em buffer para melhorar o desempenho e também oferece o método readLine() que lê a entrada baseada em caracteres linha por linha. Por fim FileInputStream é quem está sendo decorado (componente concreto no diagrama de classe) e oferece um componente básico através do qual os bytes serão lidos.

Todas as informações acima foram retiradas do site da Devmedia em um artigo que fala sobre o [Padrão de Projeto Decorator em Java](https://www.devmedia.com.br/padrao-de-projeto-decorator-em-java/26238).






## Estrutura básica (diagrama uml):

![](https://github.com/brunaNobre/design-patterns-decorators/blob/master/400px-Decorator_UML_class_diagram.svg.png)<br>
<i>Fonte: Wikipedia</i><br>
<i><b>Figura 2:</b> Exemplo de diagrama de classes do padrão decorator</i>


<br>

<b> Usando o exemplo da lancheria: </b> <br>
![](https://github.com/brunaNobre/design-patterns-decorators/blob/master/Class%20Diagram0.png)<br>
<i><b>Figura 3:</b> Exemplo de diagrama de classes do padrão decorator voltado para o exemplo da lancheria</i>

## Enumeração dos pontos fortes:

* Nos dá uma alternativa à criação de subclasses que proporciona flexibilidade.

* Permite modificação de comportamento em tempo de execução ao invés de voltar ao codigo de uma classe existente e fazer modificações

* É uma solução muito boa para problemas de permutação (combinações) porque podemos anexar um componente base a um número indefinido de decoradores.

* Dá suporte ao princípio que diz que classes devem ser abertas à extensão mas fechadas para modificação.

## Enumeração dos pontos fracos:


* Os decoradores podem resultar em muitos objetos pequenos no design do projeto, e o uso excessivo pode ser complexo.

* Os decoradores podem causar problemas se o cliente depende fortemente dos objetos do tipo concreto.

* Os decoradores podem complicar o processo de instanciar o componente, porque não é preciso apenas  instanciar o componente, mas também envolvê-lo em vários decoradores.

* Pode ser complicado ter decoradores que acompanhem outros decoradores, porque olhar para trás em múltiplas camadas da cadeia decoradora começa a empurrar o padrão do decorador para além da sua verdadeira intenção.


## API's que utilizam Decorator:
* [Angular JS](https://angularjs.org/): Framework Javascript;
* [Draft JS](https://draftjs.org/): Framework Javascript para desenvolvimento de um editor de texto.
* [ES7 Decorators](https://github.com/wycats/javascript-decorators): Api Javascript
