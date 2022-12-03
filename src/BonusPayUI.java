public  class BonusPayUI  {




    public void makeRaise(EmployeeSellingHouseForSale baseBonusManager){
        baseBonusManager.makeRaise();
        //arayüz classı managerda yazdığımız kodu burada çağırırız.

    }
    public void makeRaise(EmployeeSellingHouseForRent baseBonusManager){
        baseBonusManager.makeRaise();
        //arayüz classı managerda yazdığımız kodu burada çağırırız.

    }


    public void Add(EmployeeSellingHouseForRent databaseManager) {
        databaseManager.Add();


    }


    public void showprice() {
        System.out.println("Salary of employees before commission: $3500");
    }

    public void  BonusAddprice(EmployeeSellingHouseForRent employeeSellingHouseForRent){
        employeeSellingHouseForRent.Bonusaddprice();



    }
    public void  BonusAddprice (EmployeeSellingHouseForSale employeeSellingHouseForSale){
        employeeSellingHouseForSale.Bonusaddprice();



    }


}