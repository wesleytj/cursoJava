# CURSO EM JAVA :coffee:



#### Linguagens de Alto Nível

* PASCAL

  ```pascal
  var
  	msg: String;
  begin
  	msg:= "Olá, Mundo!";
  	write(msg);
  end.
  ```

* Código fonte em Pascal, um código fonte de linguagem de alto nível. Uma linguagem que está próximo da linguagem de entendimento do usuário.

* C

  ````c
  #include <stdio.h>
  void main(){
      printf("Olá, Mundo!");
  }
  ````

  * A Linguagem C possui vários compiladores, para diversas plataformas, ex: Linux, Mac, MSDOS
  * C é uma linguagem multiplataforma
  * Softwares construídos utilizando linguagem C:
    * Firefox
    * Windows
    * Linux
    * MacOS
    * Mobile
  * Evolução da Linguagem C:
    * C > C++ > C#



## Exercícios: 

* Assinale a alternativa que contém a descrição correta de algoritmo.
  * Algoritmo é uma coleção de livros de uma mesma matéria, normalmente relacionada a Engenharia de Software.
  * Algoritmo é uma operação matemática usada, por exemplo, para calcular a intensidade sonora medida em decibéis.
  * **Algoritmo é uma descrição das etapas de resolução de um problema ou a indicação ordenada de uma sequencia de ações bem-definidas.**
  * Algoritmo é uma definição formal da hierarquia de funcionários de uma empresa de desenvolvimento de software de grande porte.
* Assinale a opção que não apresenta um exemplo de Linguagem de Programação.
  * Delphi
  * De Máquina
  * Assembly
  * **Windows XP**
  * Visual Basic
* Qual é o utilitário responsável por gerar, a partir de um programa escrito em uma linguagem de alto nível, um programa em linguagem de máquina não executável chamado de módulo-objeto?
  * Interpretador
  * Depurador
  * Loader
  * Linker
  * **Compilador**
* A expressão Z = X % Y corresponde a Z igual:
  * a X% do valor de Y
  * ao resto da divisão de Y por X
  * **ao resto da divisão de X por Y**
  * ao quociente da divisão de X por Y
  * ao quociente da divisão de Y por X
* Fluxograma é um tipo de:
  * **Representação gráfica de algoritmos**
  * Informação sobre tipo de dados
  * Livro de análise de sistemas
  * Análise de Sistemas

# Java Básico

#### Pacotes

Por padrão, o Java já vem com um pacote instalado `java.lang`, esse pacote já vem com as instruções básicas e iniciais do Java, não há necessidade de importa-lo.
Como por exemplo:

* java.applet (para desenvolvimento de aplicativos)
* java.util (para criar utilitários)
* java.math (para funções matemáticas)
* java.net (para redes)
* entre outros...

Esses pacotes mencionados acima, precisam ser importados, por meio do comando `import`.

# Biblioteca de Interface

#### Swing

A Biblioteca Swing permite que criemos interfaces gráficas para janelas. A Swing, ela vem de uma biblioteca ainda mais antiga, a `AWT` que significa `Abstract Window Toolkit` .
Para utilizarmos a Biblioteca Swing, utilizamos através do `import javax.swing`.

#### Herança

```java
public class TelaSwing extends javax.swing.JFrame{
    
}
```

`extends` faz parte dos conceitos de orientação a objetos (OOP), o conceito de herança.
No exemplo do código acima, a classe `TelaSwing` tem como herança `javax.swing.JFrame`.
Dessa forma, não precisamos criar telas e/ou comandos para as telas, podemos apenas herdar as características/conceitos/comandos e etc de JFrame. De forma figurativa, nós não precisamos recriar a roda, nós herdamos essas características.

```java
public class TelaSwing extends javax.swing.JFrame{
    private javax.swing.JButton btnClick;
    /*O código acima diz que btnClick é um JButton*/
    private javax.swing.JLabel lblMenssage;
    /*O código acima diz que lblMenssage é um JLabel*/
}
```

 Temos outro conceito dentro da orientação a objeto, chamado Encapsulamento, que é tornar "coisas" privadas, utilizando a palavra reservada `private`.

```java
public class TelaSwing extends javax.swing.JFrame{
    private javax.swing.JButton btnClick; //botão
    private javax.swing.JLabel lblMenssage; //label
    
    //evento btnClickActionPerformed (ação realizada)
    /*Método que definirá a ação que será executada
        quando clicar em cima do botão.*/
    private void btnClickActionPerformed(...){
        /*Comando irá alterar a mensagem exibida*/
        //setText é um método
        lblMenssage.setText("Hello, word!");
        
    }
}
```

#### JavaFX

```java
public class FXMLDocumentController implements Initializable{

}
```

A palavra reservada `implements` nos remete a outro conceito de orientação a objetos, que são as interfaces.
Ou seja, sempre que você se deparar com `implements`, significa que se trata de uma interface.

```java
public class FXMLDocumentController implements Initializable{
	
	@FXML
	//comandos para adição de controles
	private Button btnClick;
	private Label lblMenssage;
	
	@FXML
	//Código do evento
	private void clickButton(...){
		lblMenssage.setText("Hello, word!");
	}
}
```

