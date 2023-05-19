class Customer {
    private int customerId;
    private String name;
    private TechnicalTask technicalTask;
    private Invoice invoice;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void submitTechnicalTask(TechnicalTask technicalTask) {
        this.technicalTask = technicalTask;
        System.out.println(name + " подал техническое задание.");
    }

    public void receiveInvoice(Invoice invoice) {
        this.invoice = invoice;
        System.out.println(name + " получил счет за проектирование.");
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public TechnicalTask getTechnicalTask() {
        return technicalTask;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
