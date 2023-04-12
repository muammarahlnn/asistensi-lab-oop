package login_app;

class Country {
    private String name;
    private String capital;
    private String headOfState;
    private int population;
    private String language;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Country(String name, String capital, String headOfState, int population, String language) {
        this.name = name;
        this.capital = capital;
        this.headOfState = headOfState;
        this.population = population;
        this.language = language;
    }
    public Country() {
    }


    public void displayInfo(){
        System.out.println("nama negara : " + name);
        System.out.println("ibukota : " + capital);
        System.out.println("presiden : " + headOfState);
        System.out.println("populasi " + population);
        System.out.println("bahasa : " + language);

    }
    

}
