public class Quicksort {
    int[] nums = {15,3,2,1,9,5,7,8,6};
    int[] numNums = new int[nums.length];
    int openSpace = 0;
    public Quicksort(){
        runAlgorithm(0,nums.length-1, nums);
//        runAlgorithm(0,7, nums);

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

    }

    public void runAlgorithm(int startIndex, int endIndex, int[] nums) {
        int endingIndex = endIndex;
        int startingIndex = startIndex;
        if (startIndex == endIndex) {
            //Done
            System.out.println("Placing "+nums[startIndex]+" at open space: "+openSpace);
//            numNums[openSpace] = nums[startIndex];
//            openSpace = openSpace + 1;
            System.out.println("Open space is now: "+openSpace);
        } else {

            int midPoint = (startIndex + endIndex) / 2;
            System.out.println("Midpoint Index: " + midPoint + " value: " + nums[midPoint]);
            while (startIndex != endIndex - 1) {
                int leftVal = nums[startIndex];
                if (leftVal > nums[midPoint]) {
                    System.out.println(leftVal + " Is greater then " + nums[midPoint]);
                    while (endIndex - 1 != startIndex) {
                        int rightVal = nums[endIndex];
                        if (rightVal < nums[midPoint]) {
                            System.out.println(rightVal + " is less then: " + nums[midPoint]);
                            //Swap left and right and break
                            System.out.println("Swapping " + nums[startIndex] + " and " + nums[endIndex]);
                            int tempVal = leftVal;
                            nums[startIndex] = rightVal;
                            nums[endIndex] = tempVal;
                            break;
                        }
                        System.out.println("End index decreasing.");
                        endIndex = endIndex - 1;
                        if (endIndex - 1 == startIndex) {
                            //The next index is at the pivot, so if the right value is less then startIndex, do one swap and move on
                            int tempVal = nums[midPoint];
                            System.out.println("The pivots are next to each other: comparing: ");
                            if(tempVal < nums[startIndex]) {
                                System.out.println(tempVal + " is less then: " + nums[startIndex]);
                                System.out.println("Swapping " + tempVal+ " and " + nums[startIndex]);
                                nums[midPoint] = nums[startIndex];
                                nums[startIndex] = tempVal;
                            }
                        }
                    }
                } else {
                    startIndex = startIndex + 1;
                    System.out.println("Start index increasing.");

                }
            }
            System.out.println("Left index: " + startIndex + " Right Index: " + endIndex);
            System.out.println("Finished iteration: Numbers ~");
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
            System.out.println("Running algorithm on Index: "+0+" to Index: "+startIndex);
            System.out.println("Running algorithm on Index: "+(endIndex)+" to Index: "+endingIndex);

            runAlgorithm(0,startIndex,nums);
            runAlgorithm(endIndex, endingIndex, nums );
        }
    }
}
