public class Main {
    public static void main(String[] args) {
        AircraftCarrier aircraftCarrier = new AircraftCarrier("USS Enterprise", 50);
        aircraftCarrier.sail(); // Вызов метода sail() у объекта авианосца
        aircraftCarrier.dock(); // Вызов метода dock() у объекта авианосца

        // Пример полиморфизма: объект типа AircraftCarrier может быть приведен к типу Ship
        Ship ship = aircraftCarrier;
        ship.sail(); // Вызов метода sail() у объекта типа Ship (авианосец)
        ship.dock(); // Вызов метода dock() у объекта типа Ship (авианосец)
    }
}
