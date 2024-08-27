public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte numeroCurto = 1;
        short numeroMeioCurto = numeroCurto;
        int numeroNormal = numeroMeioCurto;
        long numeroLongo = numeroNormal;
        int numeroParaCasting = (int) numeroLongo;

        String texto= "º Texto";

        System.out.println(numeroParaCasting+texto+21*7); 
    }
}
