public class Country {
    /*
    Country деген класс тузунуз .  Анын поляларын бериниз. Аты , калкы, аянты , тили ушундай полялары болсун .
Маанилерин конструктор аркылуу бериниз. 3 объект тузунуз . Ошондой эле 1 static метод кошунуз.
Mетод параметирине Country-нин массивин алып бизге аянты боюнча эн чон олкону таап берсин.
     */
    private String name;
    private double population;
    private String language;
    private double square;

    public Country() {
    }

    public Country( String name, double population, String language,double square ) {
        this.name = name;
        this.population = population;
        this.language = language;
        this.square = square;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }


    public static Country staticMethod(Country[] countries){
        Country largest = countries[0];
        for(Country giant : countries){
            if(giant.square > largest.square){
                largest = giant;
            }
        }
        return largest;
    }


    @Override
    public String toString() {
        return "Country's" +
                " name:  " + name +
                ",    population: " + population +
                ",      language: " + language +
                ",        square: " + square ;
    }
}
