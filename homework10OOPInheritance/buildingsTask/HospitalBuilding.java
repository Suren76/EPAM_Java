package homework10OOPInheritance.buildingsTask;

public class HospitalBuilding extends Building{
    private int roomsCount;

    public HospitalBuilding(int drainageSystemOutsCount, int electricitySystemVoltage, int roomsCount) {
        super(drainageSystemOutsCount, electricitySystemVoltage);
        setRoomsCount(roomsCount);
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    private void setRoomsCount(int roomsCount) {
        if (roomsCount > 0) {
            this.roomsCount = roomsCount;
        } else {
            System.out.println("Rooms count can't be less 1");
        }
    }
}
