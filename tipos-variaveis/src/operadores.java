public class operadores {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(numero--);
        System.out.println(numero);
        
        boolean verdade = true;

        System.out.println(!verdade);
        System.out.println(verdade);
    
        String variavelParaTeste = "Primeiro nome";
        String variavel2ParaTeste = new String ("Primeiro nome");

        System.out.println(variavelParaTeste.equals(variavel2ParaTeste));

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("Os dois são iguais");
    
        }
        System.out.println("Não confere com o operador");

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }

}
