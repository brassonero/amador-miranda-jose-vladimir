package main;

import java.util.Arrays;
import java.util.Date;

public class Ticket {

    Date fecha;
    String terminal;
    String user;
    String client;
    String payment;
    String[] items;

    public Ticket(Date fecha, String terminal, String user, String client, String payment, String[] items) {
        this.fecha = fecha;
        this.terminal = terminal;
        this.user = user;
        this.client = client;
        this.payment = payment;
        this.items = items.clone();
    }

    @Override
    public String toString() {

    }
}
a