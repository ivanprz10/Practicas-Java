package org.example;

public class Orden {
    private String id;
    private int total;

    public Orden(String id, int total) {
        this.id = id;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id='" + id + '\'' +
                ", total=" + total +
                '}';
    }
}
