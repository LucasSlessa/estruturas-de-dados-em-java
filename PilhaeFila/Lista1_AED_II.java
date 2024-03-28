/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) - (Univap)
 * Curso: Engenharia da Computacao - Data de Entrega: 28/02/2024
 * Autor: Prof. Wagner dos Santos Clementino de Jesus
 *
 * Turma: 8UNA Disciplina: Algoritmos Estrutura de Dados - II
 * Exercicio Resolvido em aula pelo professor
 * Observacao: <colocar se houver>
 *
 * nome_arquivo.java
 * ***************************************************************************************/
import java.util.Scanner;
public class Lista1_AED_II {
       public static void print(String str) {
               System.out.println(str);
       }

        public static void main(String args[]){
             Scanner entrada = new Scanner(System.in);
             String valor = entrada.nextLine();             
             
             for(int i=0;i<=valor.length()-1;i++){
                  int v = Integer.parseInt(""+valor.charAt(i));
                  Pilhas.push(v);  
             }
             
              String numero = "";
              while(Pilhas.top()) {
                    numero += Pilhas.pop();
              }
             
              print("Valor Original:"+valor);
              print("Valor Inverso:"+numero);
              
              if(valor.equals(numero))
                     print("*** O numero "+valor+" eh palidromo *** ");
              else
                     print("*** O numero "+valor+" Nao eh palidromo ***");         
              
        }
}