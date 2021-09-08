public class PlanetasNoMansSky {
    private String nome;
    private String tipo;
    private String biomaSubtipo;
    private float biomaProbabilidade;
    private String propriedades;

    public PlanetasNoMansSky(String nome,String tipo,String biomaSubtipo,float biomaProbabilidade,String propriedades){
        this.setNome(nome);
        this.setTipo(tipo);
        this.setBiomaSubtipo(biomaSubtipo);
        this.setBiomaProbabilidade(biomaProbabilidade);
        this.setPropriedades(propriedades);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBiomaSubtipo() {
        return biomaSubtipo;
    }

    public void setBiomaSubtipo(String biomaSubtipo) {
        this.biomaSubtipo = biomaSubtipo;
    }

    public float getBiomaProbabilidade() {
        return biomaProbabilidade;
    }

    public void setBiomaProbabilidade(float biomaProbabilidade) {
        this.biomaProbabilidade = biomaProbabilidade;
    }

    public String getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(String propriedades) {
        this.propriedades = propriedades;
    }

    @Override
    public PlanetasNoMansSky clone() throws CloneNotSupportedException {
        PlanetasNoMansSky planetClone = (PlanetasNoMansSky) super.clone();
        return planetClone;
    }

    @Override
    public String toString() {
        return "PlanetasNoMansSky{" + "Nome: '" + nome + '\'' + ", Tipo: '" + tipo + '\'' + ", Bioma Subtipo: " + biomaSubtipo + ", Bioma Probabilidade: '" + biomaProbabilidade + '\'' + ", Propriedades:'" + propriedades + '}';
    }
}
