public class Pilhas {
       static int lista[] = new int[100];
       static int topo = 0;
       static int total = 0;

       public static void push(int elemento) {
              lista[topo++] = elemento;
              total++;
       }

       public static int pop() {
              if (total == 0)
                     return -1;
              total--;
              return lista[--topo];
       }

       public static boolean top() {
              return total > 0 ? true : false;
       }

}