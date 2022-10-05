package Day_28_Array_Lab_Cont_2;

public class Array_Example_3 {
    public static void main(String[] args) {
        String str="dün akşam eve giderken onları görmüştüm";

        System.out.println(yeniKelimeUret(str));
    }
    public static String yeniKelimeUret (String str){
        String result="";
        if(str.charAt(0) == 'ü') result+=str.substring(1,2);
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i) == 'ü'){
                result+=str.substring(i-1,i);
                result+=str.substring(i+1,i+2);
            }
        }if(str.endsWith("ü")) result+=str.substring(str.length()-2,str.length()-1);
        return result;
    }
}
