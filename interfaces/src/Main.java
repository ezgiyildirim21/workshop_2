public class Main {
    public static void main(String[] args) {

//        ICustomerDal customerDal = new MySqlCustomerDal();
//        customerDal.add();

//        CustomerManager customerManager = new CustomerManager();
//        customerManager.customerDal = new SqlServerCustomerDal();
//        customerManager.add();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}