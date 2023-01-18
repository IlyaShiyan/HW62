public class Main {
    public static void main(String[] args) {

        int[] arr = {1,3,8,10,18,25,19,80,69};

        Function function;
        function = (int[] arr1) -> {
          int max = arr1[0];
          int preMax = arr1[1];
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]>max){
                    preMax = max;
                    max = arr1[i];
                } else
                    preMax = arr1[i];
            }
            return preMax;
        };
        int a = function.searchPreMax(arr);
        System.out.println(a);
    }
}
