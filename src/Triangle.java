public class Triangle {
    public static void main(String[] args) {
        int numb1= Integer.parseInt(args[0]);
        int numb2= Integer.parseInt(args[1]);
        int numb3= Integer.parseInt(args[2]);
        boolean result=false;
        if((numb1+numb2>numb3)&&(numb2+numb3>numb1)&&(numb1+numb3>numb2)){
            result=true;
        } else {
            result=false;
        }
        System.out.println(numb1+","+" "+numb2+","+" "+numb3+":"+" "+result);
    }
}
