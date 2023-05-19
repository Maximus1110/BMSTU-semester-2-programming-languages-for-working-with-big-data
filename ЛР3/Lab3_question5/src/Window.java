class Window {
    private boolean isOpen;

    public Window() {
        isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public String toString() {
        return "Window{" +
                "isOpen=" + isOpen +
                '}';
    }
}