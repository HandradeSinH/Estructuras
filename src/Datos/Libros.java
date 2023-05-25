package Datos;

public class Libros {
    public String nombre;
    public String autor;
    public String genero;

    public Libros(String nombre, String autor, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre +", autor: " + autor +", genero: " + ""+genero+" ";
    }
}