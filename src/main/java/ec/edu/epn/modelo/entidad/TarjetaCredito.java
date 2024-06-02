package ec.edu.epn.modelo.entidad;

import java.util.Stack;

public class TarjetaCredito {
    static Stack<Integer> pilaOriginalInvertida = new Stack<>();
    static String operacion = "";
    static String numeroOriginal;

    public static boolean validarTarjeta(char cadena[]){
        numeroOriginal = String.valueOf(cadena);
        invertirOrden(cadena);
        return doblarSegundosDigitos();
    }

    private static void invertirOrden(char cadena[]){
        for (char c : cadena) {
            pilaOriginalInvertida.push(c-'0');
        }
    }

    private static boolean doblarSegundosDigitos(){
        int indice = 0;
        int nuevoNumero;
        int sumaMultiplo10=0;
        while(pilaOriginalInvertida.size()>0){
            if (indice%2==1) {
                int numeroDoble = pilaOriginalInvertida.peek()*2;
                if (numeroDoble>9) {
                    int segundoDigito = numeroDoble%10;
                    nuevoNumero = 1+ (segundoDigito);
                    sumaMultiplo10+=nuevoNumero;
                    operacion+="+(1+"+numeroDoble%10+")";
                }else{
                    sumaMultiplo10+=numeroDoble;
                    operacion+="+"+numeroDoble;
                }
            }else{
                sumaMultiplo10+=pilaOriginalInvertida.peek();
                operacion+= (indice==0 ? "" : "+" )+pilaOriginalInvertida.peek();
            }
            indice++;
            pilaOriginalInvertida.pop();
        }

        if (sumaMultiplo10%10==0) {
            return true;
        }else{
            return false;
        }
    }
}
