import java.util.ArrayList;

public class Banca {
    private String nome;
    private String indirizzo;
    private String partitaIva;
    private ArrayList<Conto> conti;

    public Banca(String nome, String indirizzo, String partitaIva) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.partitaIva = partitaIva;
        this.conti = new ArrayList<Conto>();
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void aggiungiConto(Conto conto) {
        conti.add(conto);
    }

    public Conto getConto(int numeroConto) {
        for (Conto conto : conti) {
            if (conto.getNumeroConto() == numeroConto) {
                return conto;
            }
        }
        return null;
    }

    public ArrayList<Conto> getConti() {
        return conti;
    }

    public ArrayList<Conto> getConti(Cliente cliente) {
        ArrayList<Conto> contiCliente = new ArrayList<Conto>();
        for (Conto conto : conti) {
            if (conto.getProprietario().equals(cliente)) {
                contiCliente.add(conto);
            }
        }
        return contiCliente;
    }

    public ArrayList<Conto> getConti(String nome, String cognome) {
        ArrayList<Conto> contiCliente = new ArrayList<Conto>();
        for (Conto conto : conti) {
            if (conto.getProprietario().getNome().equals(nome) && conto.getProprietario().getCognome().equals(cognome)) {
                contiCliente.add(conto);
            }
        }
        return contiCliente;
    }

    public ArrayList<Conto> getConti(String nome, String cognome, String codiceFiscale) {
        ArrayList<Conto> contiCliente = new ArrayList<Conto>();
        for (Conto conto : conti) {
            if (conto.getProprietario().getNome().equals(nome) && conto.getProprietario().getCognome().equals(cognome) && conto.getProprietario().getCodiceFiscale().equals(codiceFiscale)) {
                contiCliente.add(conto);
            }
        }
        return contiCliente;
    }
}
