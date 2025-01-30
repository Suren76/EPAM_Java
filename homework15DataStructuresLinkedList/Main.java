package homework15DataStructuresLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Country> countriesList = new LinkedList<>();

        Country countryToCheckDuplicationRemove = new Country("Armenia", "Our Fatherland",
"emblem of 'Armenia'", "\uD83C\uDDE6\uD83C\uDDF2", 30000, 60000);

        countriesList.add(
                new Country("Andorra", "The Great Charlemagne", "emblem of 'Andorra'",
                        "\uD83C\uDDE6\uD83C\uDDE9", 30000, 60000)
        );
        countriesList.add(new Country(countryToCheckDuplicationRemove));
        countriesList.add(
                new Country("China", "March of the Volunteers", "emblem of 'China'",
                        "\uD83C\uDDE8\uD83C\uDDF3", 300000, 900000)
        );
        countriesList.add(new Country(countryToCheckDuplicationRemove));
        countriesList.add(
                new Country("Finland", "Our Land", "emblem of 'Finland'",
                        "\uD83C\uDDEB\uD83C\uDDEE", 300000, 900000)
        );

        System.out.println("### list with Countries containing duplicates ###");
        countriesList.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("### list with removed duplicates ###");
        RemoveDuplicatesFromLinkedList.removeDuplicatesFromLinkedList(countriesList)
                .forEach(System.out::println);
    }
}
