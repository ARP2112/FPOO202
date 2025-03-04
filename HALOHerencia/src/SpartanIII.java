public class SpartanIII extends Spartan {

    public SpartanIII (String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma, 80); //La durabilidad del escudo es menor
    }


    public void camuflajeActivo(){
        System.out.println(nombre + " Activó camuflaje para volverse invisible. ");
}

}

