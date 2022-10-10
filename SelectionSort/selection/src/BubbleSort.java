public  class BubbleSort {

    public BubbleSort(){
        int[] nums = {116, 2, 73, 138, 99, 189, 6, 79, 142, 55, 169, 107, 170, 50, 197, 14, 193, 140, 106, 92, 38, 71, 83, 81, 17, 58, 155, 168, 62, 173, 191, 41, 88, 114, 12, 195, 200, 74, 141, 34, 179, 18, 64, 190, 7, 128, 39, 176, 102, 171};
        executeSort(0, nums);

    }
    public void executeSort(int index, int[] nums){
        System.out.println("On index: "+index);
        if(index == nums.length){
            for (int i = 0; i < nums.length; i++){
//                System.out.println(nums[i]);
            }
        }
        else {

            for (int i = 0; i < nums.length; i++) {
                int nextIndex = i + 1;
                int currentVal = nums[i];
                if (nextIndex < nums.length && nums[nextIndex] < currentVal) {
                    //Swap the two indexes
                    System.out.println("Swapping "+currentVal+" with "+nums[nextIndex]);
                    int tempVal = currentVal;
                    nums[i] = nums[nextIndex];
                    nums[nextIndex] = tempVal;
                }
            }
            System.out.println("Finished iteration: Numbers ~");
            for (int i = 0; i < nums.length; i++){
                System.out.println(nums[i]);
            }
            executeSort(index+1,nums);
        }
    }
}
