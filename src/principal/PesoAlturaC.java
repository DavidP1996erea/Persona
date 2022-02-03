package principal;

public class PesoAlturaC implements Cloneable{



    private double altura;
    private double peso;

@Override
    protected Object clone(){


        Object obj = null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error de vegetacion");
        }

        return obj;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
