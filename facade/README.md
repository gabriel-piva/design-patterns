## Facade

Design pattern estrutural que fornece uma interface simplificada para um subsistema complexo, tornando-o mais fácil de usar. Ele envolve um conjunto de interfaces mais complexas em uma interface mais simples, reduzindo a complexidade do código do cliente.

### Exemplo

![facade-diagram](../UML_Diagrams/facade.png)

O exemplo utilizado vem de "O Hobbit", em que 

TODO

### Demonstração

```java
AdventureFacade adventureFacade = new AdventureFacade();

adventureFacade.addDwarf("Thorin");
adventureFacade.addHobbit("Bilbo");
adventureFacade.addWizard("Gandalf");

adventureFacade.describeCharacters(); 
// The Dwarf Thorin is in the adventure!
// The Hobbit Bilbo is in the adventure!
// The Wizard Gandalf is in the adventure!

adventureFacade.useAxes();  // Thorin uses their axe to chop through obstacles
adventureFacade.useAgility();  // Bilbo uses their agility and size to infiltrate or go unnoticed
adventureFacade.useSpells(); // Gandalf casts a powerful spell

```

O código acima cria uma lista usando a classe AdventureFacade, que funciona como uma fachada para a criação dos personagens. São adicionados um Dwarf, um Hobbit e um Wizard à lista, utilizando os métodos addDwarf(), addHobbit() e addWizard() da fachada. Em seguida, o método describeCharacters() é chamado, percorrendo a lista e imprimindo uma descrição de cada personagem.  

Depois, são chamados os métodos useAxes(), useAgility() e useSpells(), que percorrem  percorre a lista novamente e, se encontrar um personagem do tipo Dwarf por exemplo (no caso do método useAxes()), executa a habilidade específica de usar um machado. O mesmo para os outros métodos. 

Dessa forma, o padrão Facade é utilizado com a fachada AdventureFacade para  para simplificar a criação e utilização dos personagens e suas habilidades. Assim, o cliente não precisa saber detalhes de como os personagens são criados ou como suas habilidades são implementadas, ele não precisa interagir diretamente com as classes, bastando chamar os métodos adequados na fachada.

Isso torna o código mais simples, modular e flexível, pois caso seja necessário adicionar novos tipos de personagens ou habilidades, isso pode ser feito sem afetar o código do cliente. Além disso, o padrão Facade também facilita a manutenção do código, já que as alterações são restritas a um único ponto de acesso.