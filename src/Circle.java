public class Circle {

   /* 1. Полени static кылсаңыз анда ал полеге доступту  класстын аты менен алсаңыз болот.
      2. Полени final кылсаңыз анда ал полеге бир жана акыркы жолу маани бере аласыз
     башкача айтканда поле константа болуп калат.
    Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area жана circumference деген статик методдору болсун.
    area ны табуу учун: PI * (radius * radius)  circumference ти табуу учун PI * 2 * radius деген формулалар колдонулат
     */

    private double radius;
    private static final double PI = 3.14159;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public static double area(double radius){
       return  PI * (radius * radius);
    }

    public static double circumference(double radius){
          return PI * 2 * radius;
    }






}
