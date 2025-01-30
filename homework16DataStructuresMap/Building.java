package homework16DataStructuresMap;


import java.util.*;

public class Building {
    private Map<Integer, List<Apartment>> apartments;
    private int parkingCount;

    public Building(Map<Integer, List<Apartment>> apartments, int parkingCount) {
        setApartments(apartments);
        setParkingCount(parkingCount);
    }

    public Map<Integer, List<Apartment>> getApartments() {
        return apartments;
    }

    public void setApartments(Map<Integer, List<Apartment>> apartments) {
        this.apartments = apartments;
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return getParkingCount() == building.getParkingCount() && Objects.equals(getApartments(), building.getApartments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getApartments(), getParkingCount());
    }

    @Override
    public String toString() {
        return "Building{" +
                "apartments=" + apartments +
                ", parkingCount=" + parkingCount +
                '}';
    }
}
