import java.util.Arrays;

public class ProgModBas_EX8
{
    // 8. (primersArray)
    // Fer una funció que rebi un vector
    // i retorni un altre vector amb tots els elements del vector original que siguin primers.

    public static void main (String[] args)
    {

        creaVector();

    }

    public static int[] creaVector()
        {
            // CREACIÓN DEL VECTOR 1:

            int vector1 [] = new int[10];

            // Rellenamos el Vector 1:

            for (int i = 0; i < vector1.length; i++)
            {
                vector1[i]= (int) (Math.random()*20)+1;
            }

            // Imprimimos el Vector1:

            System.out.println("Vector1 :");

            for (int i = 0; i < vector1.length; i++)
            {
                System.out.println(vector1[i]);
            }
            System.out.println("------------------------");

            recibeVectorYDevuelveNuevoConPrimos(vector1);

            return vector1;

        }

        public static int[] recibeVectorYDevuelveNuevoConPrimos(int[] vector1)
        {
            // Imprimimos Vector 1 recibido:

            System.out.println("Vector1 recibido:");

            for(int i = 0 ; i < vector1.length; i++)
            {
                System.out.println(vector1[i]);
            }



            // Filtramos los numeros primos:

            boolean esPrimo = true;



            // Creamos el vector2:

            int [] vector2 = new int[10];

            // Rellenamos el Vector2


            for(int i=2;i<vector1.length;i++) {
                if(vector1[i]%i==0)
                {
                    vector1[i] = 0;
                    esPrimo = false;
                }
                else
                {
                    vector2[i] = vector1[i];
                }


            }




            for (int i = 0; i < vector1.length;i++)
            {
                if ( esPrimo = true) {
                    vector2[i] = vector1[i];
                }
            }

            System.out.println("Vector2");

            for (int i = 0; i < vector2.length;i++)
            {

                    System.out.println(vector2[i]);

            }




            // Imprimimos le Vector2 con numeros Primos solo:

            System.out.println("------------------------");

            System.out.println("Vector2 con Primos filtrados:");

            for (int i = 0; i < vector2.length;i++)
            {
                if (vector2[i] != 0) {
                    System.out.println(vector2[i]);
                }
            }


            return vector1;
        }

}
