public abstract class Pokemon {
    private int num_pokedex ;
    private String nombre_pokemon;
    private double peso;
    private String sexo;
    private String temporada;
    private String tipo;

    protected Pokemon() {
    }


    //Metodos

    protected abstract void placaje();
    protected abstract void Araniazo();
    protected abstract void Mordisco();


    public Pokemon(int num_pokedex, String nombre_pokemon, double peso, String sexo, String temporada, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombre_pokemon = nombre_pokemon;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
        this.tipo = tipo;
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNombre_pokemon() {
        return nombre_pokemon;
    }

    public void setNombre_pokemon(String nombre_pokemon) {
        this.nombre_pokemon = nombre_pokemon;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

