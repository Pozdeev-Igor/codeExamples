//BubbleSort example


public class BubbleSort {

    public static int solution (int x) {
        String[] nums = Integer.toString(x).split("");
        return sortMethod(nums);
    }

    public static int  sortMethod(String nums[]) {

        String a, string;
        for (int i = 0; i < nums.length-1; i++) {
           for (int j = i+1; j < nums.length; j++) {
               if (Integer.parseInt(nums[i]) < Integer.parseInt(nums[j])) {
                   a = nums[i];
                   nums[i] = nums[j];
                   nums[j] = a;
               }
           }
       }
        string = String.join("", nums);
            return Integer.parseInt(string);
    }

    public static void main(String[] args) {

        System.out.println(solution(192873645));
    }
}
