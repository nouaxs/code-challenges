public class SumSquaredOdds {
   public static void main(String[] args) {
        long counter = 1;
        long squared = 0;
        long solution = 0;
        
        while (counter <= 684) {
            squared = counter*counter;
            System.out.println(solution);
            if (squared % 2 != 0) {
                solution += squared;
            }
            counter++;
        }
        System.out.println(solution);
    } 
}
