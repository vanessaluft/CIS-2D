import java.util.Arrays;

public class SortedCustomersApp
{
    public static void main(String[] args)
    {
        Customer[] customerArray = new Customer[3];
        Customer firstCustomer = new Customer("booksaretheanswer@mail.com", "Hermione", "Granger");
        Customer secondCustomer = new Customer("theboywholived@mail.com", "Harry", "Potter");
        Customer thirdCustomer = new Customer("chessmaster@mail.com", "Ron", "Weasley");
        
        customerArray[0] = firstCustomer;
        customerArray[1] = secondCustomer;
        customerArray[2] = thirdCustomer;
        
        Arrays.sort(customerArray);
        System.out.println();
        for( Customer i : customerArray) {
            System.out.println("Email: " + i.getEmail());
            System.out.println("First Name: " + i.getFirstName());
            System.out.println("Last Name: " + i.getLastName());
        }
        }
}
