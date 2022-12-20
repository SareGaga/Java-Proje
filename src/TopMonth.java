import java.util.HashSet;


public class TopMonth <K> {
    public HashSet<K> TopMonth = new HashSet<K>();
    public void add(K eleman){

        this.TopMonth.add(eleman);
    }


    public HashSet<K> getirHashSet() {
        return this.TopMonth;
    }
}



