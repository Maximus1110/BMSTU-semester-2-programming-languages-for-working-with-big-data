// Класс AircraftCarrier, наследуется от военного корабля
class AircraftCarrier extends Warship {
    private int aircraftCount;

    public AircraftCarrier(String name, int aircraftCount) {
        super(name);
        this.aircraftCount = aircraftCount;
    }

    public int getAircraftCount() {
        return aircraftCount;
    }

    // Переопределение метода отправки в плавание для авианосца
    @Override
    public void sail() {
        System.out.println("Авианосец " + getName() + " отправился в плавание. Количество самолетов на борту: " + getAircraftCount());
    }
}
