public class Main1 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j % 2 == 0 && i * j % 3 == 0){
                    System.out.print(i * j + "\t");
                }
               else{
                    System.out.print("X\t");
                }
            }
            System.out.println();
        }
    }
}