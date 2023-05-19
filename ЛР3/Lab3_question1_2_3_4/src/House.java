import java.util.ArrayList;

public class House {
    private int id;
    private int apartmentNumber;
    private double square;
    private int floor;
    private int roomCount;
    private String street;
    private String buildingType;
    private int exploitationTerm;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return this.apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getSquare() {
        return this.square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomCount() {
        return this.roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return this.buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getExploitationTerm() {
        return this.exploitationTerm;
    }

    public void setExploitationTerm(int exploitationTerm) {
        this.exploitationTerm = exploitationTerm;
    }

    public House(int id, int apartmentNumber, double square, int floor, int roomCount, String street, String buildingType, int exploitationTerm) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.square = square;
        this.floor = floor;
        this.roomCount = roomCount;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }

    public static House[] generateRandomHouses(int count) {
        House[] houses = new House[count];
        String[] streets = new String[]{"Street 1", "Street 2", "Street 3"};
        String[] buildingTypes = new String[]{"Type 1", "Type 2", "Type 3"};

        for(int i = 0; i < count; ++i) {
            double square = 50.0 + (double)((int)(Math.random() * 100.0));
            int floor = 1 + (int)(Math.random() * 20.0);
            int roomCount = 1 + (int)(Math.random() * 5.0);
            String street = streets[(int)(Math.random() * (double)streets.length)];
            String buildingType = buildingTypes[(int)(Math.random() * (double)buildingTypes.length)];
            int exploitationTerm = 5 + (int)(Math.random() * 20.0);
            houses[i] = new House(i, i, square, floor, roomCount, street, buildingType, exploitationTerm);
        }

        return houses;
    }

    public String toString() {
        return "House{id=" + this.id + ", apartmentNumber=" + this.apartmentNumber + ", square=" + this.square + ", floor=" + this.floor + ", roomCount=" + this.roomCount + ", street='" + this.street + "', buildingType='" + this.buildingType + "', exploitationTerm=" + this.exploitationTerm + "}";
    }

    public static House[] searchByRoomCount(House[] houses, int roomCount) {
        System.out.println("Список квартир с " + roomCount + " комнатами:");
        ArrayList<House> result = new ArrayList();
        House[] var3 = houses;
        int var4 = houses.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            House house = var3[var5];
            if (house.roomCount == roomCount) {
                result.add(house);
            }
        }

        return (House[])result.toArray(new House[result.size()]);
    }

    public static House[] searchByRoomCountAndFloor(House[] houses, int roomCount, int floorFrom, int floorTo) {
        System.out.println("Список квартир с " + roomCount + " комнатами, расположенных на этажах от " + floorFrom + " до " + floorTo + ":");
        ArrayList<House> result = new ArrayList();
        House[] var5 = houses;
        int var6 = houses.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            House house = var5[var7];
            if (house.roomCount == roomCount && house.floor >= floorFrom && house.floor <= floorTo) {
                result.add(house);
            }
        }

        return (House[])result.toArray(new House[result.size()]);
    }

    public static House[] searchBySquare(House[] houses, double square) {
        System.out.println("Список квартир с площадью более " + square + " кв.м.:");
        ArrayList<House> result = new ArrayList();
        House[] var4 = houses;
        int var5 = houses.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            House house = var4[var6];
            if (house.getSquare() > square) {
                result.add(house);
            }
        }

        return (House[])result.toArray(new House[result.size()]);
    }

    public static void demonstration(int n) {
        System.out.println("ЛР 3.6 'House'");
        House[] houses = generateRandomHouses(n);
        System.out.println("Сгенерированные значения");
        House[] var2 = houses;
        int var3 = houses.length;

        int var4;
        House b;
        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

        var2 = searchByRoomCount(houses, 2);
        var3 = var2.length;

        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

        var2 = searchByRoomCountAndFloor(houses, 2, 1, 5);
        var3 = var2.length;

        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

        var2 = searchBySquare(houses, 2000.0);
        var3 = var2.length;

        for(var4 = 0; var4 < var3; ++var4) {
            b = var2[var4];
            System.out.println(b);
        }

    }
}
