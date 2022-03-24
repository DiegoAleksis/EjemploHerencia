// extends NombreClasePadre


import java.util.ArrayList;

public class Mounstro extends Personaje{


        // TieneCuernos
        //TieneTentaculos
        //color
        //Skills
private boolean TieneCuernos;
private boolean TieneTentaculos;
private String color;
private ArrayList<String> skills;

        public boolean isTieneCuernos() {
            return TieneCuernos;
        }

        public void setTieneCuernos(boolean tieneCuernos) {
            TieneCuernos = tieneCuernos;
        }

        public boolean isTieneTentaculos() {
            return TieneTentaculos;
        }

        public void setTieneTentaculos(boolean tieneTentaculos) {
            TieneTentaculos = tieneTentaculos;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public ArrayList<String> getSkills() {
            return skills;
        }

        public void setSkills(ArrayList<String> skills) {
            this.skills = skills;
        }


         public void espantar(){
             System.out.println("¡booooo!");
         }
        public void trabajar(){
            System.out.println("Estoy cansado de trabajar");
        }

        public void hacerReir (){
            System.out.println("¿Que hace una foca en el circo viendo al techo? Pues mirando al foco");
        }
        //espantar
        //Trabajar
        //haceReir


        public Mounstro(String nombre, double estatura, double peso, boolean tieneCuernos, boolean tieneTentaculos, String color, ArrayList<String> skills) {
            super(nombre, estatura, peso);
            TieneCuernos = tieneCuernos;
            TieneTentaculos = tieneTentaculos;
            this.color = color;
            this.skills = skills;
            System.out.println("Soy el cosnturctor de mounstruo");
        }
    }

