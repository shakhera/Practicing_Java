package practice_java;

/**
 *
 * @author SHAKHERA
 */
public class for_each_lopp {

    public static void main(String[] args) {
       
        String[] names = new String[5];
        names[0] = "shifa";
        names[1] = "sadia";
        names[2] = "shika";
        names[3] = "shakhera";
        names[4] = "saadi";
         for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
         
       String[] str = {"hi", "i", "am", "a", "shifa"};
        for (String x : str) {
            System.out.print(x+ " ");
        }
    }
}
