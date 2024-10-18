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
    Room bathroom;
    Room bedroom;
    Room hall;
    Room kitchen;
    Room livingRoom;

    Home(Room bathroom, Room bedroom, Room hall, Room kitchen, Room livingRoom) {
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.hall = hall;
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
    }

    public Home(
            int bathroomWidth, int bathroomHeight, int bathroomLength,
            int bedroomWidth, int bedroomHeight, int bedroomLength,
            int hallWidth, int hallHeight, int hallLength,
            int kitchenWidth, int kitchenHeight, int kitchenLength,
            int livingRoomWidth, int livingRoomHeight, int livingRoomLength
    ) {
        this(
                new Room(bathroomWidth, bathroomHeight, bathroomLength),
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
        this(
                // set default params for bathroom
                10, 10, 10,
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
