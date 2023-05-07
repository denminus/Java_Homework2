package Task_0;

/*

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

*/

//package For_java_HW;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите названия драгоценных камней =  ");
        String jewels = sc.nextLine();
        System.out.print("Перечислите все камни в куче =  ");
        String stones = sc.nextLine();
        String res = findjewelsInStones(jewels, stones);
        System.out.println(res);
        sc.close();
    }
    public static String findjewelsInStones(String jewels,String stones){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < jewels.length(); i++){
            int count = 0;
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
            res.append(jewels.charAt(i)).append(count);
        }
        return res.toString();
    }
}