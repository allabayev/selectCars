package uz.cars;

public class View {
    public String name;
    public String country;
    public String city;
    public String marka;
    public int price;

    public View (String name, String country, String marka, int price) {
        this.name=name;
        this.country=country;
        this.marka=marka;

        this.price=price;
    }

    public View(String name, String country, String city, String marka, int price) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.marka = marka;
        this.price = price;
    }

    public View (String city) {
        this.city=city;
    }


    String [] arrays1 = {"Nexia", "Cobolt", "Lacetty", "Traccar", "Malibu"};
    String [] arrays2 = {"MAN", "Isuzy", "Kamaz"};


    public void PrintSelect () {

        switch (city) {

            case "Andijon" :{
                System.out.println(city);
                for (int i=0; i<arrays1.length; i++){
                    System.out.print(arrays1[i] + " ");
                }
                System.out.println("\n___________________________");
                break;
            }
            case "Samarqand" : {
                System.out.println(city);
                for (int i=0; i<arrays2.length; i++) {
                    System.out.print(arrays2[i] + " ");
                }
                System.out.println("\n___________________________");
                break;
            }
            case "Jizzax" : {
                System.out.println(city);
                System.out.print("Volkswagen");
                System.out.println("\n___________________________");
                break;
            }
            default:
                System.out.print("Bunday moshina ishlab chiqadigan shahar yuq");
                System.out.println("\n__________________________");
        }
    }

    public void PrintAll () {
        System.out.println("Name: " + name + " Country: " + country + "  City  " + city +" Marka: " + marka + " Price: " + price + "$");
        System.out.println("\n__________________________");
    }

    public String PrintAgain(String name){

        return "Name: " + name;
    }
}