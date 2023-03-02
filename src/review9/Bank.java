package review9;

public class Bank {

    public static void main(String[] args) {

        Customer c=new Customer();
        c.setName("Lava Freeze");
        System.out.println("Name of the customer is "+c.getName());

        c.setSsn(123456789);
        System.out.println("SSN of the customer is "+c.getSsn());

       PrivateClient pc=new PrivateClient("Dia Han",587665779);

        System.out.println("Private client name "+pc.getName());
        System.out.println("Private client ssn "+pc.getSsn());

    }
}
