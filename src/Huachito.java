public class Huachito extends Personaje{


    //colorPuerta
    private String colorPuerta;

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }

    public Huachito(String nombre, double estatura, double peso, String colorPuerta) {
        super(nombre, estatura, peso);
        this.colorPuerta = colorPuerta;
        System.out.println("Estoy en el constructor de Huachito");
    }

    //reir
    //llorar

    public void reir(){
        System.out.println("hahahaha");
    }


    public void llorar(){
        System.out.println("cuñaaaaa cuñaaaaa");
    }

}
