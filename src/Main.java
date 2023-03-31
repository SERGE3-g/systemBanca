public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("Banca del Popolo", "Via Formia 32", "123456789");
        Cliente cliente1 = new Cliente("Serge", "Guea", "123456789");
        Cliente cliente2 = new Cliente("Frank", "Guea", "987654321");

        Conto conto1 = new Conto(1, 1000, cliente1);
        Conto conto2 = new Conto(2, 2000, cliente1);
        Conto conto3 = new Conto(3, 3000, cliente2);
        banca.aggiungiConto(conto1);
        banca.aggiungiConto(conto2);
        banca.aggiungiConto(conto3);
        System.out.println("Conti di Serge Guea:");
        for (Conto conto : banca.getConti(cliente1)) {
            System.out.println(conto.getNumeroConto());
        }
        System.out.println("Conti di  Guea:");
        for (Conto conto : banca.getConti(cliente2)) {
            System.out.println(conto.getNumeroConto());
        }
        System.out.println("Conti di Fatim Guea:");
        for (Conto conto : banca.getConti("Serge", "Guea")) {
            System.out.println(conto.getNumeroConto());
        }
        System.out.println("Conti di Frank Guea:");
        for (Conto conto : banca.getConti("Frank", "Guea")) {
            System.out.println(conto.getNumeroConto());
        }
    }
}
