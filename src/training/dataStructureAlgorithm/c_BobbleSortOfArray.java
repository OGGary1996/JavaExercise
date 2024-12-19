package training.dataStructureAlgorithm;


import training.dataStructureAlgorithm.algorithmOfArray.SortOfArray;

public class c_BobbleSortOfArray {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*100); // Randomly generate elements and insert them into the array
        }
        SortOfArray.bobbleSort(nums);
    }
}
