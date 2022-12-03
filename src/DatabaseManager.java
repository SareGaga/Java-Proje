public  interface DatabaseManager  {



      void Add(DatabaseManager databaseManager);

      default void Add() {
            System.out.println("Updated new commissions percentages"    );
      }
}


