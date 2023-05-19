import java.util.Arrays;
import java.util.Objects;

class Rose {
    private Petal[] petals;
    private Bud bud;

    public Rose(int petalCount) {
        petals = new Petal[petalCount];
        for (int i = 0; i < petalCount; i++) {
            petals[i] = new Petal("Red"); // Задаем цвет лепестков
        }

        bud = new Bud();
    }

    public void bloom() {
        bud.bloom();
    }

    public void wither() {
        bud.wither();
    }

    public String getBudColor() {
        return petals[0].getColor(); // Цвет бутона соответствует цвету первого лепестка
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return Arrays.equals(petals, rose.petals) && Objects.equals(bud, rose.bud);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(bud);
        result = 31 * result + Arrays.hashCode(petals);
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "petals=" + Arrays.toString(petals) +
                ", bud=" + bud +
                '}';
    }
}