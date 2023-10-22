public class Musica {

        int tempo;
        int ano;
        String nome;
        String video;

        public Musica(){
        }
        public void Musica (int tempo, int ano, String Video, String nome){
            this.nome = nome;
            this.tempo = tempo;
            this.ano = ano;
            this.video = video;
        }
        void clipe (String video){
            if (video.equals("TEM")){
            System.out.println("Esta musica possui video clipe :)");
        } else if (video.equals("NAO TEM")) {
                System.out.println("Esta musica não possui video clipe :)");
            }
        }
        void duracao (int tempo){
            if (tempo >= 420){
                System.out.println("Musica muito longa");
            } else if (tempo <= 419 || tempo >= 240) {
                System.out.println("Musica com tempo de duraçao normal");
            } else if (tempo <= 239) {
                System.out.println("Musica curta");
            }
        }
        void lancamento (int ano){
            if (ano <= 1980){
                System.out.println("Musica antiga");
            } else if (ano >= 1981){
                System.out.println("Musica atual");
            }
        }
        void informacoes (){
            System.out.println("A musica: "+ this.nome+", foi lançado em "+this.ano+", e possui "+this.tempo+" segundos e "+this.video+ " video clipe.");
        }
    }

