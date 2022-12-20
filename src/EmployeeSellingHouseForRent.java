public class EmployeeSellingHouseForRent extends BaseBonusManager implements DatabaseManager{



    @Override
    public void Bonusaddprice() {
        int nocomissionprice=3500;
        int comission=7;
        int price=8500*7/100+nocomissionprice;


        System.out.println("The new salary to be received by the employee who is a partner in renting the house together with the commission  $"  + price);



    }

    @Override
    public void makeRaise() {
       System.out.println("Real estate agents rent houses: %7 commission");

    }


    @Override
    public void Add() {
        System.out.println("Home rental sales added to database");
    }
}
