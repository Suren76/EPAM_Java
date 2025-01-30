package homework16DataStructuresMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ResidentialComplex {
    private Map<District, String> districts;

    public ResidentialComplex() {
        this(new HashMap<>());
    }

    public ResidentialComplex(Map<District, String> districts) {
        setDistricts(districts);
    }

    public Map<District, String> getDistricts() {
        return districts;
    }

    private void setDistricts(Map<District, String> districts) {
        this.districts = districts;
    }

    public void addDistrict(String address, District district) {
        getDistricts().put(district, address);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ResidentialComplex that = (ResidentialComplex) o;
        return Objects.equals(getDistricts(), that.getDistricts());
    }

    @Override
    public String toString() {
        return "ResidentialComplex{" +
                "districts=" + districts +
                '}';
    }
}
