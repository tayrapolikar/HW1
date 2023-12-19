public class Gen3 {
    public static void main(String[] args) {

        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int diff=Math.max(a,b)-Math.min(a,b);
        for (int i =0; i <3; i++) {
            int number=(int) (diff* Math.random()+Math.min(a,b));
            System.out.println(number); //burada max rakamı yazmaması lazım yazmıyor dimi?,minimal generated number
            // nasıl?


        }


    }
}
