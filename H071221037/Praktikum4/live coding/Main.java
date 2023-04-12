public class Main {
    
    public static void main(String[] args) {
        
        Country country1 = new Country();
        country1.setName("Indonesia");
        country1.setCapital("Jakarta");
        country1.setHeadOfState("Presiden");
        country1.setPopulation(300_000_000);
        country1.setLanguage("Bahasa Indonesia");
        country1.displayInfo();
        System.out.println();
        
        Country country2 = new Country("Amerika","Washington DC","Presiden",200_000_000,"Bahasa Inggris");
        country2.getName();
        country2.getCapital();
        country2.getHeadOfState();
        country2.getPopulation();
        country2.getLanguage();
        System.out.println(country2.getName());
        System.out.println(country2.getCapital());
        System.out.println(country2.getHeadOfState());
        System.out.println(country2.getPopulation());
        System.out.println(country2.getLanguage());
        System.out.println();

        SelfUtils.displaySelfData();
        
    }
}
