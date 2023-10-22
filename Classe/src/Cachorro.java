public class Cachorro {
    String cor;
    String nome;
    String raca;
    int velocidade;
    public Cachorro(){
    }
    public void Cachorro (String cor, String nome, String raca, int velocidade){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.velocidade = velocidade;
    }
    void tipo (String raca){
        if (raca.equals("Vira-lata")){
        } else if (raca.equals("Golden")) {
        } else if (raca.equals("Labrador"));
    }
    void corrida (int velocidade){
        if (velocidade >= 10 && velocidade <= 20){
            System.out.println("A cadela é rapida");
        } else if (velocidade >= 22){
            System.out.println("A cadela é muito veloz");
        }
    }
    void pelo (String cor){
        if (cor.equals("amarela")){
        } else if (cor.equals("preto"));
    }
    void sobre (){
        System.out.println("A cadela "+this.nome+" é uma "+this.raca+" com a pelagem "+this.cor+" e ela pode correr até "+this.velocidade+" quilometros por hora");
    }
}
