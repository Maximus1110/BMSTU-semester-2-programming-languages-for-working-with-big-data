import java.util.Arrays;

class House {
    private Window[] windows;
    private Door[] doors;

    public House(int windowCount, int doorCount) {
        windows = new Window[windowCount];
        for (int i = 0; i < windowCount; i++) {
            windows[i] = new Window();
        }

        doors = new Door[doorCount];
        for (int i = 0; i < doorCount; i++) {
            doors[i] = new Door();
        }
    }

    public void lockDoors() {
        for (Door door : doors) {
            door.lock();
        }
    }

    public int getWindowCount() {
        return windows.length;
    }

    public int getDoorCount() {
        return doors.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Arrays.equals(windows, house.windows) && Arrays.equals(doors, house.doors);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(windows);
        result = 31 * result + Arrays.hashCode(doors);
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + Arrays.toString(windows) +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}