package uz.cars;

public class PolyView {
    public static void main(String[] args) {

        View name = new View("Nexia", "Andijon", "Engil", 7000);
        name.PrintAll();

        View city = new View("Andijon");
        city.PrintSelect();

        View city2 = new View("Samarqand");
        city2.PrintSelect();

        View city3 = new View("New York");
        city3.PrintAll();

        View city4 = new View("Google");
        System.out.println(city4.PrintAgain("VolsWagen"));
    }
}