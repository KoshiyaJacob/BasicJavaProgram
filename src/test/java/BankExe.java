public class BankExe
{
    public static void main(String[] args){

        //we cannot create object for abstract and interface class

        CommonWealth_AnzB cwBank = new CommonWealth_AnzB();
        cwBank.viewAccountBalance();
        cwBank.transferFunds();
        cwBank.openFixedDeposit();

        System.out.println(ANZBank.ACCOUNTTYPEONE);
        System.out.println(ANZBank.ACCOUNTTYPETWO);


    }

}
