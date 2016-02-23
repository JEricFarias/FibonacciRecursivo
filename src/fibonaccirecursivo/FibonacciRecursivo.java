
package fibonaccirecursivo;

/**
 *
 * @author Eric Farias
 * 
 */

public class FibonacciRecursivo {
    /**
     * @param n = indice/posição do elemento Ex.: indice[valor]
     * 0[0],1[1],2[1],3[2],4[3],5[5],6[8],7[13]...
     * @return retorna um inteiro com Valor contido no indice especificado.
     */
    public static int fibonacci(int n){
        // passo base
        if(n == 1 || n == 0){
            return n;
        }
        //Passo recursivo
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
