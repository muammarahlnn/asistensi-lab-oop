package login_app;

public class main2 {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("Indonesia");
        country.setCapital("Jkt");
        country.setHeadOfState("jkowi");
        country.setPopulation(20);
        country.setLanguage("indo");
        country.displayInfo();

        Country country2 = new Country("amerika", "washington dc", "obama", 10, "engish");
        System.out.println("nama negara :" + country2.getName());
        System.out.println("ibukota :" + country2.getCapital());
        System.out.println("presiden :" + country2.getHeadOfState());
        System.out.println("populasi :" + country2.getPopulation());
        System.out.println("language :" + country2.getLanguage());

        SelfUtils.displaySelfData();
    }

}
