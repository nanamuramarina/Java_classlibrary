import java.util.ArrayList;
import java.util.Iterator;

public class NameList2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("桜井");
    names.add("田原");
    names.add("中川");
    names.add("鈴木");
    if (args.length == 0) {
      System.out.println("Usage: java NameList2 <search_name>");
      return;
    }
    String search = args[0];
    boolean result = false;

    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      if (search.equals(it.next())) {
        result = true;
        break;
      }
    }

    if (result) {
      System.out.println(search + "さんは含まれています");
    } else {
      System.out.println(search + "さんは含まれていません");
    }
  }
}
