package informacion;
/**
 * 
 * @author danie
 */
public class Libros {
    private String nombre;
    private String autor;
    private String genero;
    private String ano;

    public Libros(String nombre, String autor, String genero, String ano) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
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

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }
    

    @Override
    public String toString() {
        return "Nombre: " + nombre +" | autor: " + autor +" | genero: " + genero+" | Año de Salida: "+ano+".";
    }
}