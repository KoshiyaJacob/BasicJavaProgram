public interface ANZBank {
    //Static and final --Since we no need to change value we use Uppercase Variable
    String ACCOUNTTYPEONE = "Savings";
    String ACCOUNTTYPETWO = "Current";


    //By default Interface -- Abstract methods:
    public void  viewAccountBalance();
    public void transferFunds();
    public void openFixedDeposit();

}
