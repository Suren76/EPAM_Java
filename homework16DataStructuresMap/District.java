package homework16DataStructuresMap;

import java.util.List;
import java.util.Objects;

public class District {
    private List<Building> buildings;

    public District(List<Building> buildings) {
        setBuildings(buildings);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(getBuildings(), district.getBuildings());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBuildings());
    }

    @Override
    public String toString() {
        return "District{" +
                "buildings=" + buildings +
                '}';
    }
}
