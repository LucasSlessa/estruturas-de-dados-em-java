# ListaLigada

Esta é uma implementação de uma lista ligada em Java. A lista ligada é uma estrutura de dados linear, dinâmica e homogênea, onde cada elemento é um nó que contém um valor e uma referência para o próximo nó.

## Métodos

- `adiciona(E elemento)`: Adiciona um elemento no final da lista.
- `adicionaNoComeco(E elemento)`: Adiciona um elemento no início da lista.
- `pega(int posicao)`: Retorna o elemento na posição especificada.
- `pegaCelula(int posicao)`: Retorna a célula na posição especificada.
- `removeDoComeco()`: Remove o primeiro elemento da lista.
- `posicaoOcupada(int posicao)`: Verifica se a posição especificada está ocupada.

## Exemplo de uso

```java
ListaLigada<Integer> lista = new ListaLigada<>();

// Adição de elementos
lista.adiciona(1);
lista.adiciona(2);
lista.adiciona(3);
lista.adicionaNoComeco(0);

// Acessando elementos
System.out.println("Elemento na posição 0: " + lista.pega(0));
System.out.println("Elemento na posição 1: " + lista.pega(1));
System.out.println("Elemento na posição 2: " + lista.pega(2));

// Verificando se posições estão ocupadas
System.out.println("Posição 0 ocupada: " + lista.posicaoOcupada(0));
System.out.println("Posição 3 ocupada: " + lista.posicaoOcupada(3));

// Removendo elementos
lista.removeDoComeco(); 
``` 


## Implementação
A classe ListaLigada é composta por quatro atributos:

- `private Celula primeira`: Referência para o primeiro nó da lista.
- `private Celula ultima`: Referência para o último nó da lista.
- `private int total`: Contém o número total de elementos na lista.
- `private static class Celula<E>`: Representa um nó da lista ligada, contendo um valor do tipo genérico E e uma referência para o próximo nó.

## Complexidade

Adição de elementos: O(1)
Acesso a elementos: O(n)
Remoção de elementos: O(1) para remoção no início, O(n) para remoção no final ou em uma posição intermediária.
Testes
Para testar a classe ListaLigada, consulte a classe Programa no mesmo diretório. Ela demonstra a adição, acesso e remoção de elementos, além de verificar se posições estão ocupadas. O usuário pode decidir a posição para os métodos pega(), pegaCelula() e posicaoOcupada()

## Testes
Para testar a classe ListaLigada, consulte a classe Programa no mesmo diretório. Ela demonstra a adição, acesso e remoção de elementos, além de verificar se posições estão ocupadas. O usuário pode decidir a posição para os métodos pega(), pegaCelula() e posicaoOcupada().