package listaligada;


import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        ListaLigadaDuplamente lista = new ListaLigadaDuplamente();

        // Adiciona elementos
        lista.adiciona("Elemento 1");
        lista.adiciona("Elemento 2");
        lista.adiciona("Elemento 3");
        lista.adiciona("Elemento 4");

        // Mostra o conteúdo da lista
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista: " + lista);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        // Adiciona no começo
        lista.adicionaNoComeco("Elemento 0");

        // Mostra o conteúdo da lista novamente
        System.out.println("Lista após adicionar no começo: " + lista);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        // Mostra o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        // Adiciona elementos
        lista.adiciona("Elemento 5");
        lista.adiciona("Elemento 6");
        lista.adiciona("Elemento 7");

        lista.adicionaNoComeco("Elemento -1");

        // Mostra o conteúdo da lista usando toString()
        System.out.println("Conteúdo da lista: " + lista.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nTeste de acesso a elementos:\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Elemento na posição 0: " + lista.pega(0));
        System.out.println("Elemento na posição 1: " + lista.pega(1));
        System.out.println("Elemento na posição 2: " + lista.pega(2));
        System.out.println("Elemento na posição 3: " + lista.pega(3));


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nTeste de posição ocupada:\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int posicaousuario;
        while (true) {
            System.out.print("Digite a posição (-1 para sair):");
            posicaousuario = scanner.nextInt();
            if (posicaousuario == -1) {
                break;
            }

            if (lista.posicaoOcupada(posicaousuario)) {
                System.out.println("Elemento na posição " + posicaousuario + ": " + lista.pega(posicaousuario));
            } else {
                System.out.println("Posição " + posicaousuario + " não existe.");
            }
        }

        scanner.close();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Posição 0 ocupada: " + lista.posicaoOcupada(0));
        System.out.println("Posição 3 ocupada: " + lista.posicaoOcupada(3));
        System.out.println("Posição 11 ocupada: " + lista.posicaoOcupada(11));


        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nTeste de remoção do início:\n");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        lista.removeDoComeco();
        System.out.println("Lista após remoção do primeiro elemento: " + lista);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    }
    }

