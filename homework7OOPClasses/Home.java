package homework7OOPClasses;

class Room {
    int width;
    int height;
    int length;

    public Room(int width, int height, int length) {

        if (width <= 0 || height <= 0 || length <= 0) {
            System.out.println("One of dimensions is lower than 1");
            System.out.println(
                    "width: " + width +
                    "height: " + height +
                    "length: " + length
            );
            System.exit(250);
        }
        this.width = width;
        this.height = height;
        this.length = length;
    }
}

public class Home {
    Room batroom;
    Room bedroom;
    Room hall;
    Room kitchen;
    Room livingRoom;

    Home(Room batroom, Room bedroom, Room hall, Room kitchen, Room livingRoom) {
        this.batroom = batroom;
        this.bedroom = bedroom;
        this.hall = hall;
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
    }

    public Home(
            int batroomWidth, int batroomHeight, int batroomLength,
            int bedroomWidth, int bedroomHeight, int bedroomLength,
            int hallWidth, int hallHeight, int hallLength,
            int kitchenWidth, int kitchenHeight, int kitchenLength,
            int livingRoomWidth, int livingRoomHeight, int livingRoomLength
    ) {
        new Home(
                new Room(batroomWidth, batroomHeight, batroomLength),
                new Room(bedroomWidth, bedroomHeight, bedroomLength),
                new Room(hallWidth, hallHeight, hallLength),
                new Room(kitchenWidth, kitchenHeight, kitchenLength),
                new Room(livingRoomWidth, livingRoomHeight, livingRoomLength)
        );
    }

    public Home(
            int bedroomWidth, int bedroomHeight, int bedroomLength,
            int hallWidth, int hallHeight, int hallLength,
            int kitchenWidth, int kitchenHeight, int kitchenLength,
            int livingRoomWidth, int livingRoomHeight, int livingRoomLength
    ) {
        int batroomWidthDefault = 10;
        int batroomHeightDefault = 10;
        int batroomLengthDefault = 10;

        new Home(
                batroomWidthDefault, batroomHeightDefault, batroomLengthDefault,
                bedroomWidth, bedroomHeight, bedroomLength,
                hallWidth, hallHeight, hallLength,
                kitchenWidth, kitchenHeight, kitchenLength,
                livingRoomWidth, livingRoomHeight, livingRoomLength
        );
    }

    public static void main(String[] args) {
        Home homeWithAllParamsConstructor = new Home(
                10, 15, 15,
                10, 15, 15,
                10, 15, 15,
                10, 15, 15,
                10, 15, 15
        );

        Home homeWithExcludedBathroomParamsConstructor = new Home(
                10, 15, 15,
                10, 15, 15,
                10, 15, 15,
                10, 15, 15
        );
    }
}
