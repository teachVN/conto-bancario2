package com.epicode;

public class Conto {
    private String numeroConto;
    private double saldo;
    private String intestatario;

    public Conto(String numeroConto, double saldo, String intestatario) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.intestatario = intestatario;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato. Nuovo saldo: " + saldo);
        } else {
            System.out.println("Importo non valido per il deposito.");
        }
    }

    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato. Nuovo saldo: " + saldo);
        } else {
            System.out.println("Importo non valido per il prelievo.");
        }
    }

    public void stampaDettagli() {
        System.out.println("Numero: " + numeroConto);
        System.out.println("bravo: " + intestatario);
    }
}
