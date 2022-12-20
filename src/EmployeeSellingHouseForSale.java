public class EmployeeSellingHouseForSale extends BaseBonusManager  implements DatabaseManager {


    @Override
    public void Bonusaddprice() {
        int nocomissionprice=3500;
        int comission=10;
        int price=8500*10/100+nocomissionprice;
        System.out.println("The new salary to be received by the employee who is a partner in selling the house together with the commission $"  + price);
    }
    @Override
    public void makeRaise() {
        System.out.println("If the house is sold, a %10 commission will be taken.");

    }


    @Override
    public void Add() {
        System.out.println("\n" +"Added to home sales database");
    }
}