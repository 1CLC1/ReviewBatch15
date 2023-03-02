package review8;

public class InsuranceTest {

    public static void main(String[] args) {

        //can I create an Object of Insurance Class - NO, since it is abstract

        Insurance carPolicy=new CarPolicy("I968789","John Smith",200,22);

        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy=new PetPolicy("P967807","Jane L",20,22);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

    }
}
