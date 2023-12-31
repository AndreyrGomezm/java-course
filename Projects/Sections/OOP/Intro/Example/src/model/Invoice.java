package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    public static final int MAX_ITEMS = 12;
    private static int lastId;
    private final int id;
    private String description;
    private Date date;
    private Client customer;
    private final InvoiceItem[] items;
    private int indexItems;

    public Invoice(String description, Client customer) {
        this.description = description;
        this.customer = customer;
        items = new InvoiceItem[MAX_ITEMS];
        id = ++lastId;
        date = new Date();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    public InvoiceItem[] getItems() {
        return items;
    }

    public void addInvoiceItem(InvoiceItem item) {
        if (indexItems < MAX_ITEMS) {
            items[indexItems++] = item;
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < indexItems; i++) {
            total += items[i].calculateAmount();
        }
        return total;
    }

    public String detail() {
        StringBuilder sb = new StringBuilder("Invoice N°: ");
        sb.append(id)
                .append("\nClient: ").append(customer.getName())
                .append("\trut: ").append(customer.getRut())
                .append("\nDescription: ").append(description)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
        sb.append("Issue Date: ").append(df.format(date)).append("\n")
                .append("\n#\tname\t$\tAmount\tTotal\n");

        for (int i = 0; i < indexItems; i++) {
            sb.append(items[i]).append("\n");
        }
        sb.append("\nGrand Total: ").append(calculateTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return detail();
    }
}