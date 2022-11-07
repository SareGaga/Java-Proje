public  class BonusPayUI  {





    public void showprice2(){

    }

    public void makeRaise(EmployeeSellingHouseForSale baseBonusManager){
        baseBonusManager.makeRaise();
        //arayüz classı managerda yazdığınız kodu burada çağırısınız

    }
    public void makeRaise(EmployeeSellingHouseForRent baseBonusManager){
        baseBonusManager.makeRaise();
        //arayüz classı managerda yazdığınız kodu burada çağırısınız

    }


    public void Add(EmployeeSellingHouseForRent databaseManager) {
        databaseManager.Add();


    }


    public void showprice() {
        System.out.println("salary before commission : $3500");
    }

    public void  BonusAddprice(EmployeeSellingHouseForRent employeeSellingHouseForRent){
        employeeSellingHouseForRent.Bonusaddprice();



    }
    public void  BonusAddprice (EmployeeSellingHouseForSale employeeSellingHouseForSale){
        employeeSellingHouseForSale.Bonusaddprice();



    }


}