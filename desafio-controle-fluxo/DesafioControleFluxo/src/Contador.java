import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        // recebendo os parâmetros
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o primeiro parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o metodo que contem a lógica de contagem
            contar(parametroUm,parametroDois);


        } catch (ParametrosInvalidosException e) {
            // exceção para o caso do primeiro parâmetro ser maior que o segundo
            System.err.println("O segundo parâmetro deve ser maior que o primeiro.");

        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se o parametroUm é MAIOR que o parametroDois lançando a exeção
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem

        for(int impressao = 0; impressao < contagem; impressao++ )
            System.out.println("Imprimindo o numero" + impressao);


    }
}