class Door {
    private boolean isLocked;

    public Door() {
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    @Override
    public String toString() {
        return "Door{" +
                "isLocked=" + isLocked +
                '}';
    }
}