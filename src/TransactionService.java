import java.util.ArrayList;

public class TransactionService {
    private ArrayList<Transaction> transactions;

    public TransactionService() {
        this.transactions = new ArrayList<>();
    }

    public Transaction createTransaction(String transactionId) {
        // TODO: Implement transaction creation and validation.
        return null;
    }

    public void addTransaction(Transaction transaction) {
        if (transaction != null) {
            transactions.add(transaction);
        }
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
