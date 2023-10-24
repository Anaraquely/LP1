public class Insetos {
    String movimento;
    String tamanho;
    int patas;
    String inseto;

    public Insetos() {
    }
    public void Insetos (String movimento, String tamanho, int patas){
        this.movimento = movimento;
        this.tamanho = tamanho;
        this.patas = patas;
    }
    void locomocao (String movimento){
        if (movimento.equals("Voa")){
        } else if (movimento.equals("é rasteiro"));
    }
    void dimensão (String tamanho) {
        if (tamanho.equals("Grande")){
        } else if (tamanho.equals("Pequeno"));
    }
    void qntdpatas (int patas){
        if (patas<=4 && patas>=0 ){
            System.out.println("Não possui mais que 4 patas");
        } else if (patas>=5) {
            System.out.println("Possui muitas patas :o");
        }
    }
    void bicho (){
        System.out.println("A " +this.inseto+" "+ this.movimento+ ", ela é "+this.tamanho+" e possui "+this.patas+" patas");
    }
}
