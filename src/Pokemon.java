
public class Pokemon {

    //aquí van los atributos
    private String nombre;
    private String tipo;
    private int nivel;
    private float altura;
    private float peso;

    //para crear un pokemón completo
    public Pokemon(String nombre, String tipo, int nivel, float altura, float peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
