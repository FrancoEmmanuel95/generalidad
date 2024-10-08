package model;

public class vehiculos {
    private String marca;
    private String modelo;
    private Integer anio;

    public vehiculos(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString(){
        return "\nMarca: "+marca+"\nModelo: "+modelo+"\naño: "+anio;
    }
}
