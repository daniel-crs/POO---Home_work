package application;

import entities.CamaroteInferior;
import entities.CamaroteSuperior;
import entities.Ingresso;
import entities.Normal;
import entities.Vip;

public class App {
    public static void main(String[] args) throws Exception {

        Ingresso ticket = new Ingresso(200.0);
        System.out.println(ticket.imprimeValor());

        Ingresso ticketNormal = new Normal(200.0);
        System.out.println(ticketNormal.imprimeValor());

        Ingresso ticketVip = new Vip(200.0, 15.0);
        System.out.println(ticketVip.imprimeValor());

        Ingresso ticketCi = new CamaroteInferior(200.0, 15.0, 12);
        System.out.println(ticketCi.imprimeValor());

        Ingresso ticketCs = new CamaroteSuperior(200.0, 15.0, 35.0);
        System.out.println(ticketCs.imprimeValor());
    }
}
