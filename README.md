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



# Identificando e Nomeando Pacotes, Classes, Variáveis e Constantes

#### Pacotes

Os pacotes sempre tem todas as letras minúsculas.

```java
package meupacote;
package pacote;
```

#### Classes

As classes sempre terão as primeiras letras maiúculas.

```java
public class MinhaClasse{}
public class Pessoa{}
public class MinhaTerceiraClasse{}
```

**Obs.** Interfaces também seguem esse padrão.

#### Variáveis

As variáveis sempre serão minúsculas e em caso de duas palavras ou mais, a primeira palavra será minúsculas e as demais terão a primeira letra maiúscula.

```java
String nome;
int idade;
String enderecoCompleto;
String umaVariavelQualquerDeExemplo;
```

**Obs.** Vale ressaltar que as variáveis não são as únicas que seguem esse padrão. Métodos e Atributos também seguem esse mesmo padrão.

#### Constantes

As constantes sempre terão todas as letras maiúsculas.

```java
const SOUUMACONSTANTE;
const VALOR_DE_PI;
```



# Criando o primeiro programa em JAVA

```java
package primeiroprograma;

public class MeuPrimeiroPrograma{
	public static void main(String [] args){
		System.out.println("Olá Mundo!");
	}
}
```



# Exercícios

Indique a opção que contém o valor final da variável X, após a execução do trecho de programa em Português Estruturado mostrado. Considere os seguintes valores: A = 3 ; B = 2 ; C = 8 ; D = 7.

se .não. (A > 3) .e. .não. (B < 5) então 
	X <- 10
senão
	se(A >= 2) .ou. (C <= 1) então
		X <- (A + D) / 2
	senão
		se(A = 2) .ou. (B < 7) então
			X <- (A + 2) * (B - 2)
		senão
			X <- (A + C) / B * (C + D)
		fim_se
	fim_se
fim_se

a) 10
**b) 5**
c) zero
d) 82,5

Indique a alternativa que tem a representação na forma da expressão aritmética abaixo:
Z = 5² / (32-13) + 8.2

a) Z = 5 * 5 / (32-13) + 8X2
b) Z = ← (5 * 5 / (32-13) + (8X2)
c) Z = 5 ↑ 2 / (32-13) + 8X2
**d) Z ← ((5 ↑ 2) / (32-13) + (8X2))**

Construa um programa que mostre a data e hora atuais do sistema, o idioma do sistema e a resolução da tela. *Resolução Exercícios 4*



# Exemplos de Pacotes em JAVA

#### java.applet

Para criação de aplicativos

#### java.util

Pacote de utilitários, como por exemplo, monitoramento de teclado para entrada de dados.

#### java.math

Pacote para funções matemáticas

#### java.net

Pacote para redes

#### javax.sound

Pacote com funções estendidas para som

#### javax.swing

Pacote para interfaces visuais

#### E javafx.fxml



# Comentários em Códigos

#### // Para comentários de uma linha

```java
//Esse é um comentário de exemplo.
```

#### /* Para comentários de múltiplas linhas */ 

```java
/*Esse
é um
comentário de
multiplas linhas*/

// ou

/*
* Também pode
* fazer assim
* pra ficar mais
* bonitinho
*/
```

#### /* * Comentário para documentação */

```java
/**
Exemplo de comentário para documentação em JAVA
@author Wesley Jacques
@version 1.0
@since 2021-08-09
*/

```

Esse comentário  é muito semelhante ao anterior, mas repare que ele inicia com dois asteriscos na abertura do comentário, sendo assim, é utilizado para documentação do código.



# Introdução SWING

A biblioteca Swing, permite a criação de interfaces gráficas para ambientes de janelas.
Swing vem de outra biblioteca ainda mais antiga, a AWT (Abstract Window Toolkit)
Vídeo de explicação: [(6198) Curso de Java #05 - Introdução ao Swing e JavaFX - YouTube](https://www.youtube.com/watch?v=cYMruFKwqf0&t=983s)



# Tipos primitivos e manipulação de dados

Existem quatro tipos básicos de tipos primitivos, sendo eles:

* Inteiro

  * Para declaração de um tipo Inteiro utilizamos o nome do tipo + nome da variável + a(o) atribuição/valor da variável.

    ```java
    int idade = 3;
    ```

  * **Typecast** a declaração por typecast, seria da seguinte forma:

    ```java
    int idade = (int) 3;
    ```

  * Por meio de **classe/objeto/Wrapper Class**

    ```java
    Integer idade = new Integer(3);
    ```

  * Tipos primitivos:

    * byte
      * Ocupa o espaço de 1 byte na memória (Até 127)
    * short
      * Ocupa o espaço de 2 bytes na memória (Até 32 767)
    * int
      * Ocupa o espaço de 4 bytes na memória (Até 2 147 483)
    * long
      * Ocupa o espaço de 8 bytes na memória (Até 2⁶³)

* Real

  * Para declaração de um tipo Real utilizamos o nome do tipo + nome da variável + a(o) atribuição/valor da variável.

    ```java
    float salario = 1825.54f;
    ```

  * **Typecast** a declaração por typecast, seria da seguinte forma:

    ```java
    float salario = (float) 1825.54;
    ```

  * Por meio de **classe/objeto/Wrapper Class**

    ```java
    Float salario = new Float(1825.54);
    ```

  * Tipos primitivos:

    * float
      * Ocupa o espaço de 4 bytes na memória
    * double
      * Ocupa o espaço de 8 bytes na memória

* Caractere/Literais

  * Para declaração de um tipo Caractere utilizamos o nome do tipo + nome da variável + a(o) atribuição/valor da variável.

    ```java
    char letra = 'A';
    ```

  * **Typecast** a declaração por typecast, seria da seguinte forma:

    ```java
    char letra = (char) 'A';
    ```

  * Por meio de **classe/objeto/Wrapper Class**

    ```java
    Character letra = new Character('A');
    ```

  * Tipos primitivos:

    * char
      * Ocupa o espaço de 1 byte na memória
    * Classe Invólucro
      * String
        * Ocupa o espaço de 1 byte/cada na memória

* Logico

  * Para declaração de um tipo Logico utilizamos o nome do tipo + nome da variável + a(o) atribuição/valor da variável.

    ```java
    boolean casado = false;
    ```

  * **Typecast** a declaração por typecast, seria da seguinte forma:

    ```java
    boolean casado = (boolean) false;
    ```

  * Por meio de **classe/objeto/Wrapper Class**

    ```java
    Boolean casado = new Boolean(false);
    ```

  * Tipos primitivos:

    * boolean

      * Ocupa o espaço de 1 bit na memória

      

# Saídas de Dados

System.out....

**System** = Sistema;
**out** = Saída;
**...** = forma da saída;

* **print**

  * Esse comando para saída de dados, faz com que os dados apareçam em tela e a próxima informação aparece na mesma linha

  * System.out.print("");

    ```java
    float nota = 8.5f;
    System.out.print("Sua nota é: " + nota)
    System.out.print("Fim!")
    ```

    A saída em tela ficará `Sua nota é 8,5 Fim!`

* **println**

  * Esse comando faz com que crie uma nova linha após a exibição.

  * System.out.println("");

    ```java
    float nota = 8.5f;
    System.out.println("Sua nota é: " + nota)
    System.out.print("Fim!")
    ```

    A saída em tela ficará 

    ```
    Sua nota é 8,5
    Fim!
    ```

* **printf**

  * Esse comando é específico para formatação de texto/string

  * System.out.printf("");

    ```java
    float pi = (float) Math.PI;
    System.out.print("O valor de PI é " + pi);
    //Esse método irá retornar em tela 
    // " O valor de PI é 3.1415927 "
    
    /*Mas e se quisermos que o valor tenha apenas duas casas decimais?*/
    
    float pi = (float) Math.PI;
    System.out.printf("O valor de PI é %.2f", pi);
    //Esse método irá retornar em tela 
    // " O valor de PI é 3.14 "
    ```

* **format**

  * Esse comando é exatamente igual ao printf

  

# Entrada de dados

Ao contrário da saída de dados que o JAVA já vem com os comandos de prints dentro do pacote `.lang` junto com o JAVA.
Para entrada de dados não tem nenhum comando padrão já incluso, para isso, precisamos importar uma biblioteca que tem essa opção, que nesse caso, é a biblioteca `.util` e o objeto `.Scanner`.  

```java
import java.util.Scanner;
```

E para utilizar, como todo objeto, temos que inicia-lo, chamamos de instanciar o objeto.

```java
import ava.util.Scanner;

Scanner teclado = new Scanner(System.in);
//Scanner é a classe
// teclado é a variável
//new é a Instancia

System.out.print("Digite a primeira nota do aluno: ");
float nota1 = teclado.nextFloat();
System.out.print("\nA nota é: " + nota1);

```

#### Comandos de entrada para cada tipo

* int
  * nextInt();
* float
  * nextFloat();
* String
  * nextLine();



# Conversão de tipos

#### Convertendo Int > String

```java
int numero = 30;
String numeroString = Integer.toString(idade);
```

#### Convertendo String > Int

```java
String valor = "30";
int valorInt = Integer.parseInt(valor);
```

###### Para converter String para Float, é só alterar os Ints anteriores para Float.

# Exercícios

```java
/*Em relação aos tipos básicos de dados (tipos primitivos), assinale a opção INCORRETA.

a) booleano (ou Lógico): conjuto de valores falso e verdadeiro.
b) vetor: estrutura que suporta NxM posições de um mesmo tipo.
c) carcater: qualquer conjunto de caracteres alfanuméricos.
d) inteiro: qualquer número inteiro, negativou, nulo ou positivo.
e) real: qualquer número real, negativo, nulo ou positivo.
*/
```

`Resposta: b) Vetor. Justificativa: Vetor não é um tipo primitivo.`

```java
/*Marque 1 para dados do tipo inteiro e 2 para dados de outros tipos.
(2) "582.4"
(2) .verdadeiro.
(1) 105
(1) -102
(2) "0"
(2) "informação"
(2) 0.82

a) 2, 2, 1, 1, 1, 2, 1
b) 2, 2, 1, 1, 2, 2, 2
c) 1, 1, 1, 2, 2, 1, 2
d) 1, 2, 2, 2, 1, 1, 1*/
```

`Resposta: b) 2 2 1 1 2 2 2`

```java
/*Assinale a alternativa que contenha nomes válidos de variáveis.

a) índice, #pagina, contexto
b) nome1, sobrenome2, senha3
c) 2-nome, sobrenome, endereco
d) 1-nome, 2-sobrenome, 3-senha
*/
```

 `Resposta: b) nome1, sobrenome2, senha3`

```java
/*Assinale a alternativa que completa corretamente a lacuna da afirmativa a seguir.

São caracterizados como tipos __________ os dados númericos positivos ou negativos, excluindo-se destes qualquer fracionário.

a) caracteres
b) lógicos
c) inteiro
d) reais*/
```

 `Resposta: c) inteiros` 

 ```java
 /*Considerando os tipos de dados, relacione as colunas e, a seguir, assinale a alternativa com a sequencia correta.
 
 (1) Inteiros           () 35; 0; -56
 (2) Reais              () .F.;.V.
 (3) Caracteres         () "Rua Brigadeiro Lyra"
 (4) Lógicos            () -0.5; 1.8; -4
 
 a) 3, 1, 4, 2
 b) 2, 4, 3, 1
 c) 1, 2, 3, 4
 d) 1, 4, 3, 2*/
 ```

`Resposta: d) 1 4 3 2`



# Operadores Aritméticos

( + ) Adição:
		* 5 + 2 = 7

( - ) Subtração:

  * 5 - 2 = 3

( * ) Multiplicação:

  * 5 + 2 = 7

( / ) Divisão:

  * 5 / 2 = 2.5

( % ) Resto:

  * 5 % 2 = 1



# Operadores Unários

( ++ ) Incremento:
 * a++
    * a = a + 1

( -- ) Decremento:

 * a--
   	* a = a - 1

##### Pós Incremento

```java
int numero = 5;
int valor = 5 + numero++;
System.out.println(valor);

/*O código acima irá mostrar em tela o valor 10 e não 11. Pois ele vai primeiro somar os números e depois de somar, ele irá incrementar 'numero'*/
```

##### Pré Incremento

```java
int numero = 5;
int valor = 5 + ++numero;
System.out.println(valor);

/*O código acima irá mostrar em tela o valor 11. Pois ele vai primeiro incrementar 'numero' e depois somar com 5.*/
```



# Operadores de Atribuição

( += ) Somar e atribuir:

 * a += b
   	* a = a + b

( -= ) Subtrair e atribuir:

 * a -= b
    * a = a - b

( *= ) Multiplicar e atribuir:

 * a *= b
    * a = a * b

( /= ) Dividir e atribuir:

 * a /= b
    * a = a / b

( %= ) Resto e atribuir:

 * a %= b
    * a = a % b



# Classe Math

* PI
  * Constante π
    * Math.PI
* pow
  * Exponenciação
    * Math.pow(5,2)
* sqrt
  * Raiz Quadrada
    * Math.sqrt(25)
* cbrt
  * Raiz Cúbica
    * Math.cbrt(27)



# Arredondamentos

* abs
  * Valor Absoluto
    * Math.abs(-10)
      * 10
* floor
  * Arredonda para Baixo
    * Math.floor(3.9)
      * 3
* ceil
  * Arredonda para Cima
    * Math.ceil(4.2)
      * 5
* round
  * Arredonda Aritmeticamente
    * Math.round(5.6)
      * 6
    * Math.round(3.3)
      * 3



# Números aleatórios

##### Random

Para gerar números aleatórios, utilizamos o método random.

* Math.random()

  ```java
  double aleatorio = Math.random();
  //O método random gera somente um número entre 0 e 1.
  ```

  
