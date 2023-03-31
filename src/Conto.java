import serge.servlet.SaldoInsufficienteException;

public class Conto {
    private int numeroConto;
    private double saldo;
    private Cliente proprietario;

    public Conto(int numeroConto, double saldo, Cliente proprietario) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public void deposita(double importo) {
        saldo += importo;
    }

    public void preleva(double importo) throws SaldoInsufficienteException {
        if (saldo < importo) {
            throw new SaldoInsufficienteException();
        }
        saldo -= importo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }
}
