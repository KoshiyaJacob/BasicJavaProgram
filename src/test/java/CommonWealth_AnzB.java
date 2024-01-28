public class CommonWealth_AnzB implements ANZBank
{
    @Override
    public void viewAccountBalance()
    {
        System.out.println("User Viewing Account Balance");
    }

    @Override
    public void transferFunds()
    {
        System.out.println("Fund Transfer Successfully");

    }
    @Override
    //we skipped to implement this method so we create child class
    public void openFixedDeposit()
    {
        NAB_Bank_Cwb V = new NAB_Bank_Cwb();
        V.openFixedDeposit();

    }

}
