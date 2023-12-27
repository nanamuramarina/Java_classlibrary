import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
  public static void main (String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("これからも");
    list.add("Javaの勉強を");
    list.add("楽しんでいきましょう！");

    Iterator<String> it = list.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}