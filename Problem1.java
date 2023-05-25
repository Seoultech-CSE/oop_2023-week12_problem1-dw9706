import java.util.*;

public class week13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList< Number > list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");
        for(int i = 0; i < 5; i++){
          list.add(input.nextInt());
        }
        for(int i = 0; i < 5; i++){
            list.add(input.nextDouble());
          }
      

        sort(list);

        for(int i =0; i < 10; i++){
            System.out.print(list.get(i));
            System.out.print(' ');
        }
    }

    public static void sort(ArrayList<Number> list ) {
        Collections.sort(list, new Comparator<Number>() {
            @Override
            public int compare(Number a, Number b) {
                double aValue = a.doubleValue();
                double bValue = b.doubleValue();
                return Double.compare(aValue, bValue);
            }
        });
    }
}
