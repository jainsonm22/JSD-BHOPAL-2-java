public class ArrayDemo1 {

    public static void main(String args[]) {

        int[] defalutarr = { 10, 20, 30, 40, 50 };

        int[] val = new int[5];
        String[] arr1 = new String[2];
        double[] arr2 = new double[2];
        boolean[] arr3 = new boolean[2];
        float[] arr4 = new float[2];
        arr1[0] = "user1";
        arr1[1] = "user2";

        val[0] = 10;
        val[1] = 20;
        val[2] = 30;
        val[3] = 40;
        val[4] = 50;

        System.out.println(arr1[0] + " " + arr1[1]);

        System.out.println("a= " + val[0] + " b= " + val[1] + " c= " + val[2] + " d= " + val[3] + " e= " + val[4]);
    }
}
