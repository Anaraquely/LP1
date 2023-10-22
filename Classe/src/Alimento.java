public class Alimento {
    double peso;
    double caloria;
    double carboidrato;

    public Alimento(){
    }
    public void Alimento (double peso, double caloria, double carboidrato){
        this.peso = peso;
        this.caloria = caloria;
        this.carboidrato = carboidrato;
    }

    void quantidade (double peso){
        if (peso >= 200){
            System.out.println("Diminua a quantidade de comida");
        } else if (peso <= 199 || peso >=100){
            System.out.println("O suficiente!");
        } else if ( peso <99) {
            System.out.println("Talvez vocÊ possa tentar comer mais um pouco");
        }
    }
    void  calorias (double caloria){
        if (caloria > 2500){
            System.out.println("Talvez você esteja injerindo alimentos super caloricos");
        } else if (caloria <=2499 || caloria >= 2000){
            System.out.println("VocÊ esta injerindo o suficiente de calorias");
        } else if (caloria<= 1999) {
            System.out.println("Talvez seu consumo de alimentos caloricos deva ser maior");
        }
    }
    void carboidratos (double carboidrato){
        if (carboidrato >=130){
            System.out.println("Tente diminuir a quantidade de carboidratos");
        } else if (carboidrato >= 100 || carboidrato <= 139) {
            System.out.println("A quantidade injerida é o suficiente");
        } else if (carboidrato<= 99) {
            System.out.println("Injerir mais carboidratos");
        }
    }
    void prato (){
        System.out.println("No seu prato possui "+this.peso +"g, calorias:  "+this.caloria+"kcal, carboidratos: "+this.carboidrato+" carboidrados");
    }
}
