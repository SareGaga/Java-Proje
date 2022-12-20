
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("     ");


        BonusPayUI bonusPayUI = new BonusPayUI();
        bonusPayUI.showprice();
        System.out.println("     ");

        bonusPayUI.BonusAddprice(new EmployeeSellingHouseForRent());
        bonusPayUI.makeRaise(new EmployeeSellingHouseForRent());

        System.out.println("     ");

        bonusPayUI.BonusAddprice(new EmployeeSellingHouseForSale());
        bonusPayUI.makeRaise(new EmployeeSellingHouseForSale());

        bonusPayUI.Add(new EmployeeSellingHouseForSale());

        bonusPayUI.Add(new EmployeeSellingHouseForRent());

        System.out.println("     ");




        System.out.println("     ");



        System.out.println("\tEmployees who will sell and receive commissions this month");

        System.out.println("     ");


        Records<String> employerName = new Records<String>();
        employerName.add("Oliver Smith   ");
        employerName.add("Abbey Jones    ");
        employerName.add("Harry Williams ");
        employerName.add("Agatha Carney  ");
        employerName.add("Amy Lewis      ");
        employerName.add("Angelina Gray  ");
        ArrayList<String> employerNameList = employerName.getirArrayList();


        Records<Integer> price = new Records<Integer>();
        price.add(500);
        price.add(700);
        price.add(800);
        price.add(200);
        price.add(100);
        price.add(250);
        ArrayList<Integer> priceList = price.getirArrayList();

        for(int i = 0; i < priceList.size(); i++){
            System.out.print(" Employee Name : "+employerNameList.get(i));
            System.out.println("   Price to be added on top of their salary : $" + priceList.get(i));
        }


        System.out.println("");
        System.out.println("\tOur top 5 home sales employees this month");
        System.out.println("");

        TopMonth<String> TopEmployee = new TopMonth<String>();
        TopEmployee.add("Harry Williams ");
        TopEmployee.add("Abbey Jones   ");
        TopEmployee.add("Oliver Smith   ");
        TopEmployee.add("Angelina Gray  ");
        employerName.add("Agatha Carney  ");

        LinkedList<String> TopEmployeeList = TopEmployee.getirLinkedList();





        for(int i = 0; i < TopEmployeeList.size(); i++){
            System.out.println(" Employee Name  " + TopEmployeeList.get(i));
        }




    }
}