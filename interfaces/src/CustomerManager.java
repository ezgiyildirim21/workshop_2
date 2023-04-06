public class CustomerManager {


            // 1.YOL
//    ICustomerDal customerDal;
//    public void add(){
//        // iş kodları yazılır
//        customerDal.add();
//    }

            // 2.YOL
    private ICustomerDal customerDal;
    public CustomerManager (ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        // iş kodları yazılır
        customerDal.add();
    }
}
