package review7;

public class Methods {

    //user defined : with return type and without

    void hello(){
        System.out.println("Hello");
    }

    void sayHello(String name){
        System.out.println("Hello "+name);
    }

    //create a method that finds the largest number between given 2 integer values

    int findLargest(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    private double findAverage(double num1, double num2){
        return (num1+num2)/2;
    }
    protected StringBuilder reverse(String given){
        StringBuilder sb=new StringBuilder(given);
        return sb.reverse();
    }

    public static int minFromArray(int[] array){

        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        String name="Joe";

        int characters=name.length();
        System.out.println(characters);

        Methods obj=new Methods();

        obj.sayHello(name);

        System.out.println("--------------------------");
        int largest=obj.findLargest(100,200);
        System.out.println("The largest number is "+largest);

        System.out.println(obj.findAverage(10,30));

        StringBuilder reverse= new StringBuilder(obj.reverse("olleH"));
        System.out.println(reverse);

        String myString="Batch15";

        boolean empty=myString.toUpperCase().isEmpty(); //false

        char character=myString.trim().charAt(2); //t
        System.out.println(character);

        System.out.println("--------------------");
        int[] array={10,49,89,60};
        Methods.minFromArray(array);
        int minimum=minFromArray(array);
        System.out.println("Min number = "+minimum);
    }
}
