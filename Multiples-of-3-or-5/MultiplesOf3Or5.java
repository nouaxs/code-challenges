public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        int upperLimit = 1000; 
        int solution = 0;

        for (int i = 1; i < upperLimit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                solution += i;
            }
        }
        System.out.println("The solution is " + solution); // output: "The solution is 233168" - correct :)
    } 

}
