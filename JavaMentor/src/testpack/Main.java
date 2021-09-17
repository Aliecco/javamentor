package testpack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scn = new Scanner(System.in);
        String exp= new String(scn.nextLine());
        System.out.println(exp);
        char [] charsArr = exp.toCharArray();
        char a,b, ch=' ';
        boolean math=false;
        int len = 1;
        for(int i=0;i<exp.length();i++){
            if(charsArr[i]=='-'){
                ch =charsArr[i];
                math=true;
                len++;
            }
            else if(charsArr[i]=='+'){
                ch =charsArr[i];
                math=true;
                len++;
            }
            else if(charsArr[i]=='*'){
                ch =charsArr[i];
                math=true;
                len++;
            }
            else if(charsArr[i]=='/'){
                ch =charsArr[i];
                math=true;
                len++;
            }


        }
        String asd = String.valueOf(ch);
        String[] nums = new String[len];
        if(math&&len==2) {
            nums = exp.split(asd);
            System.out.println(nums[0]);
            System.out.println(nums[1]);
        }
        else {
            System.out.println("Не математическая функция");
        }

    }
}
