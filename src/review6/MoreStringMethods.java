package review6;

public class MoreStringMethods {

    public static void main(String[] args) {

        String myString="Today is February 2nd";
        //Splits this string around matches of the given regular expression.
        String[] strArray=myString.split(" ");

        for(String s:strArray){
            System.out.println(s);
        }

        System.out.println("-----------------------------------------");
        System.out.println(myString); //Today is February 2nd

        String newStr=myString.substring(9);
        System.out.println(newStr);

        newStr=myString.substring(9,17);
        System.out.println(newStr);

       int index=newStr.indexOf('b');
        System.out.println("Index of character b is = "+index);

        String anotherStr="Today is Thursday";

        index=anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is = "+index);
    }
}
