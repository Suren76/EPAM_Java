package homework16DataStructuresMap;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ResidentialComplex residentialComplex = new ResidentialComplex();
        residentialComplex.addDistrict("Poxos st.", new District(List.of(
                new Building( Map.of(
                        100, List.of(
                                new Apartment(101, 3, 250, true),
                                new Apartment(102, 2, 150, false),
                                new Apartment(103, 2, 200, true)
                        ),
                        200, List.of(
                                new Apartment(201, 3, 250, true),
                                new Apartment(202, 2, 150, false),
                                new Apartment(203, 2, 200, true)
                        )
                ),
                        25
                ),

                new Building( Map.of(
                        100, List.of(
                                new Apartment(101, 3, 250, false),
                                new Apartment(102, 2, 150, false),
                                new Apartment(103, 2, 200, false)
                        ),
                        200, List.of(
                                new Apartment(201, 3, 230, true),
                                new Apartment(202, 2, 170, true),
                                new Apartment(203, 2, 220, true)
                        )
                ),
                        20
                )
        )));

        ResidentialComplex residentialComplex1 = new ResidentialComplex();
        residentialComplex1.addDistrict("Poxos st.", new District(List.of(
                new Building( Map.of(
                        100, List.of(
                                new Apartment(101, 3, 250, true),
                                new Apartment(102, 2, 150, false),
                                new Apartment(103, 2, 200, true)
                        ),
                        200, List.of(
                                new Apartment(201, 3, 250, true),
                                new Apartment(202, 2, 150, false),
                                new Apartment(203, 2, 200, true)
                        )
                ),
                        25
                ),

                new Building( Map.of(
                        100, List.of(
                                new Apartment(101, 3, 250, false),
                                new Apartment(102, 2, 150, false),
                                new Apartment(103, 2, 200, false)
                        ),
                        200, List.of(
                                new Apartment(201, 3, 230, true),
                                new Apartment(202, 2, 170, true),
                                new Apartment(203, 2, 220, true)
                        )
                ),
                        20
                )
        )));

        System.out.println(residentialComplex);
        System.out.println(residentialComplex1);

        System.out.println(residentialComplex.equals(residentialComplex1));
    }
}
