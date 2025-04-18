public class demo4 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int SumEven=0;
        int SumOdd=0;
        for(int num:numbers){
        if(num%2==0){
            SumEven+=num;
        }else{
            SumOdd+=num;
        }
    }
    System.out.println("Even:"+SumEven);
    System.out.println("Odd:"+SumOdd);
}
}
