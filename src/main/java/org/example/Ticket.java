package org.example;

class Ticket {
    private int seat;
    private int code;

    public Ticket(int seat, int code) {
        this.seat = seat;
        this.code = code;
    }

    public int getSeat() {
        return seat;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Ticket Code: " + code + ", Seat: " + seat;
    }
}