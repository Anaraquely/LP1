public class Temperatura {
    int maxima;
    int minima;
    int momento;

    public Temperatura(){
    }
    public void Temperatura(int maxima, int minima, int momento){
        this.maxima = maxima;
        this.minima = minima;
        this.momento = momento;
    }
    void quente(int maxima){
        if (maxima >= 28) {
            System.out.println("Recomenda-se o uso de roupas leves e protetor solar :)");
        } else if (maxima <= 27 && maxima >=21) {
            System.out.println("Temperatura agradavel");
        }
    }
    void frio (int minima){
        if (minima<=15) {
            System.out.println("Recomenda-se o uso de roupas mais reforçadas e hidratante");
        } else if (minima>= 21 && minima <=27) {
            System.out.println("Temperatura agradavel");
        }
    }
    void recomendacao (int momento){
        if (maxima >=38) {
            System.out.println("Temperatura elevada, se hidrate bastante e evite exposição prolongada ao sol");
        } else if (minima<=8) {
            System.out.println("Temperaturas baixas, se agaselhe bem");
        } else if ( momento>=21 || momento<=27 ){
            System.out.println("Otimo dia para viver :)");
        }
    }
    void previsao (){
        System.out.println("A minima e maxima de hoje são: " + this.minima +"ºC"+" "+ this.maxima+"ºC");
        System.out.println("Sensação termica de "+this.momento+"ºC");
        }
}
