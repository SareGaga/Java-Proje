import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        BonusPayUI bonusPayUI = new BonusPayUI();
        bonusPayUI.showprice();

        bonusPayUI.BonusAddprice(new EmployeeSellingHouseForRent());
        bonusPayUI.makeRaise(new EmployeeSellingHouseForRent());

        bonusPayUI.BonusAddprice(new EmployeeSellingHouseForSale());
        bonusPayUI.makeRaise(new EmployeeSellingHouseForSale());

        bonusPayUI.Add(new EmployeeSellingHouseForRent());




        System.out.println("Employees selling or leasing this month ");

        ArrayList<String> isimler1 = new ArrayList<String>();

        ArrayList<Integer> notlar1 = new ArrayList<Integer>();

        Records<String> employerName = new Records<String>();
        employerName.add("Oliver Smith ");
        employerName.add("Jack Jones");
        employerName.add("Harry Williams");
        ArrayList<String> employerNameList = employerName.getirArrayList();


        Records<Integer> price = new Records<Integer>();
        price.add(595);
        price.add(2550);
        price.add(800);


        ArrayList<Integer> priceList = price.getirArrayList();

        for(int i = 0; i < priceList.size(); i++){
            System.out.println("Employer Name : "+employerNameList.get(i)  );
            System.out.println(" Price to be added on top of their salary : $" + priceList.get(i));
        }





    }
}