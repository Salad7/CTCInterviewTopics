public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello world!");
        selectionSort();
    }
    public static void selectionSort(){
        int[] nums = {116, 2, 73, 138, 99, 189, 6, 79, 142, 55, 169, 107, 170, 50, 197, 14, 193, 140, 106, 92, 38, 71, 83, 81, 17, 58, 155, 168, 62, 173, 191, 41, 88, 114, 12, 195, 200, 74, 141, 34, 179, 18, 64, 190, 7, 128, 39, 176, 102, 171};

        int size = nums.length;
        int lowVal = 999;
        int lowestIndex = -1;
        int currentIndex = 0;


        for(int x = 0; x < size; x++) {
            for (int i = x; i < size; i++) {
//            for(int x = i+1; x < size; x++ ){
                if (nums[i] <= lowVal) {
//                System.out.println(nums[i] + " Is lower than " + lowVal);
                    lowVal = nums[i];
                    lowestIndex = i;
                }
            }
            System.out.println("Lowest number in the pass: "+lowVal);
            System.out.println("Index: "+lowestIndex);
            System.out.println("Current index of X: "+x);
            int tempVal = nums[x]; //Store the current index value in a temp value
            int tempIndex = x; //Store the current index in a temp value
            System.out.println("Swapping: "+nums[x]+" with "+lowVal);
            nums[tempIndex] = lowVal; //Swap the current number at the index with the low val
            nums[lowestIndex] = tempVal; //Swap the low index with the number at curr
            lowVal = 999;
            System.out.println("     ");

        }
        for (int i = 0; i < size; i++){
            System.out.println(nums[i]);
        }
                //We have reached end of loop, perform swap

//            }


    }
}