# Design Patterns: Decorator
Explicação do padrão de desenvolvimento DECORATOR para a disciplina Engenharia de Software III - Senac Fatec Pelotas


Padrões de desenvolvimento, comumente chamados de design patterns, são criados quando nos deparamos com problemas recorrentes, aqueles pelos quais a maioria dos desenvolvedores de software se deparam na maioria das vezes. Entre os vários design patterns existentes temos o decorator.

O decorator surge como uma alternativa à criação de subclasses quando queremos estender as funcionalidades de uma classe. Usamos esse padrão para adicionar responsabilidades a um objeto dinamicamente.

## O problema que o Decorator quer solucionar

Você quer adicionar comportamento ou características em <b>objetos individuais</b> em tempo de execução. Usar herança não é viável pois ela é estática aplicando-se à classe e não a um objeto.

## A solução

Esse padrão permite que você adicione responsabilidades a um objeto, não à interface a qual a classe desse objeto implementa. A interface deve permanecer intocada.
