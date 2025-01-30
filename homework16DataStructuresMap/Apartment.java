package homework16DataStructuresMap;

import java.util.Objects;

public class Apartment {
    private int apartmentNumber;
    private int rooms;
    private int area;
    private boolean presenceOfAnOpenBalcony;

    public Apartment(int apartmentNumber, int rooms, int area, boolean presenceOfAnOpenBalcony) {
        setApartmentNumber(apartmentNumber);
        setRooms(rooms);
        setArea(area);
        setPresenceOfAnOpenBalcony(presenceOfAnOpenBalcony);
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        if (apartmentNumber <= 0) {
            System.out.println("invalid range: " + apartmentNumber);
        };
        this.apartmentNumber = apartmentNumber;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isPresenceOfAnOpenBalcony() {
        return presenceOfAnOpenBalcony;
    }

    public void setPresenceOfAnOpenBalcony(boolean presenceOfAnOpenBalcony) {
        this.presenceOfAnOpenBalcony = presenceOfAnOpenBalcony;
    }

    public int getFloor() {
        // calculate the floor number by apartment number
        return getApartmentNumber() / 100;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return getApartmentNumber() == apartment.getApartmentNumber() && getRooms() == apartment.getRooms() && getArea() == apartment.getArea() && isPresenceOfAnOpenBalcony() == apartment.isPresenceOfAnOpenBalcony();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getApartmentNumber(), getRooms(), getArea(), isPresenceOfAnOpenBalcony());
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentNumber=" + apartmentNumber +
                ", rooms=" + rooms +
                ", area=" + area +
                ", presenceOfAnOpenBalcony=" + presenceOfAnOpenBalcony +
                '}';
    }
}
