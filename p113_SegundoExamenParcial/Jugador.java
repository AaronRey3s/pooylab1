package p113_SegundoExamenParcial;

public abstract class Jugador {
    private String nombre;
    private char sexo;
    private String descripcion;
    private double salario;
    protected double total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador{" + "nombre='" + nombre + '\'' + ", sexo=" + sexo + ", descripcion='" + descripcion + '\''
                + ", salario=" + salario + ", total=" + total + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
