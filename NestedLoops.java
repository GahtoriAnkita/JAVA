public class NestedLoops {
    public static void main(String[] args) {
        int i = 1, j;
        while (i <= 3) {
            System.out.print(i);
            for (j = 1; j <= 2; j++) {
                System.out.println("\t"+j);
            }
            i++;
        }
        System.out.println("---------------");
    }
}
