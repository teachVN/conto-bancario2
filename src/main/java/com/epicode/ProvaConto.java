package com.epicode;

public class ProvaConto {
    public static void main(String[] args) {
        Conto conto1 = new Conto("123456789", 1000.0, "Mario Rossi");
        Conto conto2 = new Conto("987654321", 500.0, "Luigi Bianchi");

        System.out.println("Conto 1 - Numero: " + conto1.getNumeroConto() + ", Saldo: " + conto1.getSaldo() + ", Intestatario: " + conto1.getIntestatario());
        System.out.println("Conto 2 - Numero: " + conto2.getNumeroConto() + ", Saldo: " + conto2.getSaldo() + ", Intestatario: " + conto2.getIntestatario());

        conto1.deposita(200.0);
        conto2.deposita(-50.0);

        System.out.println("Conto 1 - Numero: " + conto1.getNumeroConto() + ", Saldo: " + conto1.getSaldo() + ", Intestatario: " + conto1.getIntestatario());
        System.out.println("Conto 2 - Numero: " + conto2.getNumeroConto() + ", Saldo: " + conto2.getSaldo() + ", Intestatario: " + conto2.getIntestatario());

    }
}
