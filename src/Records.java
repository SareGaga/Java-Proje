import java.util.ArrayList;

public class Records <T> {
 private ArrayList<T> Records = new ArrayList<T>();

 public void add(T eleman){

  this.Records.add(eleman);
 }

 public ArrayList<T> getirArrayList(){
  return this.Records;
 }


}
