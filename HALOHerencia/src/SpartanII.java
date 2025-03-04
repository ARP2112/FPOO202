public class SpartanII extends Spartan {

    public SpartanII (String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma, 150); //La durabilidad del escudo es fija
    }

    public void usarManejoAvanzado(){
        System.out.println(nombre + " Usa tácticas avanzadas y cuenta con un Escudo más resistente. ");
    }
}
