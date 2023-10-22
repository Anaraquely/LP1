public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[2];
            System.out.println("Antes da Exception ");
            vetor[4] = 1;

        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Escessão ao acessar um indice do vetor que não existe");
        }
    }
}
