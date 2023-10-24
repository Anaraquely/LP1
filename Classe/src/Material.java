public class Material {
    String marca;
    String exclui;
    String manutencao;

    public Material(){
    }
    public void MaterialEscolar(String marca, String exclui, String manutencao){
        this.marca = marca;
        this.exclui = exclui;
        this.manutencao = manutencao;
    }
    void escreve (String marca){
        if (marca.equals("Estou Escrevendo")){
        } else if (marca.equals("Não estou escrevendo"));
    }
    void apagar (String exclui){
        if (exclui.equals("Estou Apagando")){
        } else if (exclui.equals("Não estou apagando"));
    }
    void auxiliar(String manutencao){
        if (manutencao.equals("Estou Medindo")){
        } else if (manutencao.equals("Estou cortando"));

    }
    void status (){
        System.out.println(this.marca+ ", "+exclui+ " e "+this.manutencao);
    }

}
