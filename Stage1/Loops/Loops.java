public class Loops {
    public static void main(String[] args) {
        
        // for loop 
        byte num  = 10;
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        // for each loop: used for arrays n all
        int[] nums = {1,2,3,4,5};
        for(int number : nums){
            System.out.println("Array: "+ number);
        }

        //while loop
        while(num < 20){
            num++;
            System.out.println(num);
        }

        // do while loop
        do{
            System.out.println("DO is running");
        }while(num < 10);
    }
}
