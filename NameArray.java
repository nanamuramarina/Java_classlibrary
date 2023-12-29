public class NameArray {
  public static void main(String[] args) {
    String[] names = {"桜井", "田原", "中川", "鈴木"};

    if (args.length == 0) {
      System.out.println("Usage: java NameArray <search_name>");
      return;
    }

    String search = args[0];
    boolean result = false;

    for (int i = 0; i < names.length; i++) {
      if (search.equals(names[i])) {
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
