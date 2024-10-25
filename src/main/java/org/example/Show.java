package org.example;
import java.util.ArrayList;
import java.util.List;
class Show {
    private String movie;
    private String time;
    private List<Ticket> tickets;

    public Show(String movie, String time) {
        this.movie = movie;
        this.time = time;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public String getMovie() {
        return movie;
    }

    public String getTime() {
        return time;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    @Override
    public String toString() {
        return "Show: " + movie + ", Time: " + time + ", Tickets Sold: " + tickets.size();
    }
}
