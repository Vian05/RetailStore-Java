public class Store {
    private ProductService productService;
    private TransactionService transactionService;
    private ReportService reportService;

    public Store() {
        this.productService = new ProductService();
        this.transactionService = new TransactionService();
        this.reportService = new ReportService();
    }

    public ProductService getProductService() {
        return productService;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }

    public ReportService getReportService() {
        return reportService;
    }
}
