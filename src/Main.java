import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {

        /*      LMS     Task 1
        Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area жана circumference деген статик методдору болсун.
      area ны табуу учун: PI * (radius * radius)  circumference ти табуу учун PI * 2 * radius деген формулалар колдонулат
         */

        Circle circle = new Circle(5);
        double radius = circle.getRadius();
        System.out.println( "PI = "+ PI+ " * (" + (radius  + " * " + radius + ") = ")+Circle.area(radius));
        System.out.println("PI = "+ PI + " * " + 2 + " * " + radius + " = " + Circle.circumference(radius));



        //      LMS     Task 2
//        Country country1 = new Country("JAPAN", 124.000000, " Japanese", 3.7);
//        Country country2 = new Country("CANADA", 40.000000, " French", 9.9);
//        Country country3 = new Country("CHINA", 1.000000000, "Chinese", 9.6);
//
//        Country[] countries = {country1, country2, country3};
//
//        for(Country country: countries){
//            System.out.println(country.toString());
//        }
//
//        System.out.print("\nЭН ЧОН МАМЛЕКЕТ:  ");
//        System.out.println(Country.staticMethod(countries));









        }

}