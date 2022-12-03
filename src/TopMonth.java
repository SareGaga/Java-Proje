import java.util.LinkedList;

public class TopMonth <K> {
    public LinkedList<K> TopMonth = new LinkedList<K>();
    public void add(K eleman){

        this.TopMonth.add(eleman);
    }


    public LinkedList<K> getirLinkedList() {
        return this.TopMonth;
    }
}



