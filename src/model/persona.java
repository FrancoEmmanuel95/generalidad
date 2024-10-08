package model;

public class persona {
    private String nombre;
    private String apellido;
    private Integer dni;

    public persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

   /* @Override
    public String toString(){
        return super.toString()+"\nnombre: "+nombre+"\napellido: "+apellido+"\nDNI: "+dni;
    }*/
    @Override
    public String toString(){
        return "\nnombre: "+nombre+"\napellido: "+apellido+"\nDNI: "+dni;
    }
}
