package Cw2;

public enum Status {
    NEW("Nowe"), PAID("Opłacone"), SHIPPED("Wysłane"), DELIVERED("Dostarczone"), CANCELLED("Anulowane");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
