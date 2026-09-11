import java.time.LocalDateTime;
import java.util.ArrayList;

public class Transaction {
    private String transactionId;
    private ArrayList<TransactionItem> items;
    private double discount;
    private PaymentMethod paymentMethod;
    private double subtotal;
    private double total;
    private LocalDateTime dateTime;

    public Transaction(String transactionId) {
        this.transactionId = transactionId;
        this.items = new ArrayList<>();
        this.dateTime = LocalDateTime.now();
    }

    public void addItem(TransactionItem item) {
        items.add(item);
    }

    public double calculateSubtotal() {
        subtotal = 0.0;
        for (TransactionItem item : items) {
            subtotal += item.getSubtotal();
        }
        return subtotal;
    }

    public double calculateTotal() {
        total = calculateSubtotal() - discount;
        return total;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ArrayList<TransactionItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<TransactionItem> items) {
        this.items = items;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
