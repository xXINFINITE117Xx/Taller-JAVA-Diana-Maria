package MetodosPaciente;

import java.util.Date;

public class Paciente {
    private int codigo;
    private String cc;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Date fechaNacimiento;

    // Constructor vacío
    public Paciente() {
    }

    // Constructor con cédula
    public Paciente(String cc) {
        this.cc = cc;
    }

    // Constructor con cédula, nombre y apellido
    public Paciente(String cc, String nombre, String apellido) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor con todos los atributos
    public Paciente(int codigo, String cc, String nombre, String apellido, String correo, String telefono, Date fechaNacimiento) {
        this.codigo = codigo;
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos GET y SET
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Paciente{" +
                "codigo=" + codigo +
                ", cc='" + cc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    // Creación de objetos utilizando los constructores
    public static void main(String[] args) {
        // Objeto utilizando el constructor vacío
        Paciente paciente1 = new Paciente();

        // Objeto utilizando el constructor con cédula
        Paciente paciente2 = new Paciente("1234567890");

        // Objeto utilizando el constructor con cédula, nombre y apellido
        Paciente paciente3 = new Paciente("0987654321", "Juan", "Pérez");

        // Objeto utilizando el constructor con todos los atributos
        Date fechaNacimiento = new Date(90, 4, 15); // 15 de mayo de 1990
        Paciente paciente4 = new Paciente(1, "2345678901", "María", "González", "maria@example.com", "555-1234", fechaNacimiento);

        // Imprimir los objetos
        System.out.println(paciente1);
        System.out.println(paciente2);
        System.out.println(paciente3);
        System.out.println(paciente4);
    }
}

