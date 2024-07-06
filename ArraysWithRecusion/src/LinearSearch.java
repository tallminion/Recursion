public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 9};
        System.out.println(findIndex(arr, 5, 0));
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
}
