class Petal {
    private String color;

    public Petal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Petal{" +
                "color='" + color + '\'' +
                '}';
    }
}