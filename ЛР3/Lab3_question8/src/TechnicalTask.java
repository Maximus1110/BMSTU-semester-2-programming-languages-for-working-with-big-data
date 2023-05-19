class TechnicalTask {
    private int taskId;
    private String description;

    public TechnicalTask(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }
}
