import java.sql.SQLOutput;

public class TiposVariaveis {
    public static void main(String[] args) {

        double salarioMninimo = 5000;// TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;

        System.out.println("Variavel: "+ numero);

        final int VALOR_NUNCA_PODE_MUDAR=5;

        System.out.println("Constante: "+ VALOR_NUNCA_PODE_MUDAR);
    }
}