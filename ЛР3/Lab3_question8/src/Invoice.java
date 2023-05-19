class Invoice {
    private int invoiceId;
    private double amount;

    public Invoice(int invoiceId, double amount) {
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public double getAmount() {
        return amount;
    }
}
