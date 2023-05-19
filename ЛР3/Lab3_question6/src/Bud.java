class Bud {
    private boolean isBlooming;

    public Bud() {
        isBlooming = false;
    }

    public void bloom() {
        isBlooming = true;
    }

    public void wither() {
        isBlooming = false;
    }

    public boolean isBlooming() {
        return isBlooming;
    }

    @Override
    public String toString() {
        return "Bud{" +
                "isBlooming=" + isBlooming +
                '}';
    }
}