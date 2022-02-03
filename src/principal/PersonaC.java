package principal;

public class PersonaC implements Cloneable {

    private String Nombre;
    private int edad;
    private String DNI;
    PesoAlturaC pesoAlturaC;


    public PersonaC(){

    }


    public PersonaC(int edad){
        this.edad=edad;
    }

  protected PersonaC clone() throws CloneNotSupportedException {
       PersonaC clown = new PersonaC(edad);
        return clown;
    }




    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public PesoAlturaC getPesoAlturaC() {
        return pesoAlturaC;
    }

    public void setPesoAlturaC(PesoAlturaC pesoAlturaC) {
        this.pesoAlturaC = pesoAlturaC;
    }
}
