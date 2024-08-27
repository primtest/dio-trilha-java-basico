public class Usuário {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.descerCanal();
        smartTv.descerCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);



    }
}