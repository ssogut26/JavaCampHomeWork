public class App {
    public static void main(String[] args) throws Exception {
       Customer customer = new Customer();
    Employee employee = new Employee();
    customer.id = 1;
    customer.firstName = "John";
    customer.lastName = "Doe";
    customer.age = 35;
    customer.email = "";

    employee.id = 2;
    employee.firstName = "Jane";
    employee.lastName = "Doe";
    employee.age = 30;
    employee.salary = 4069.0;
    

    PersonManager personManager = new PersonManager();
    CustomerManager customerManager = new CustomerManager();
    }
}
