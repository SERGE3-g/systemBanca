package serge.model;


public class Cliente {

    private int id;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int eta;

    public Cliente() {

    }

    public Cliente(int id, String nome, String cognome,String codiceFiscale, int eta) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.eta = eta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String setCodiceFiscale(String codiceFiscale) {
        return this.codiceFiscale;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + ", eta=" + eta + "]";
    }

}
