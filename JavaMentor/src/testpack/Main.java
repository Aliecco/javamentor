package testpack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String exp= scn.nextLine();
        char [] charsArr = exp.toCharArray();
        char ch=' ';
        boolean math=false;
        int a=0, b=0, len = 1;
        for(int i=0;i<exp.length();i++){
            switch (charsArr[i]){
                case '-':
                case '+':
                case '*':
                case '/':
                    ch =charsArr[i];
                    math=true;
                    len++;
                    break;
            }
        }

        String asd = String.valueOf(ch);
        String[] numbs = new String[len];
        if(math&&len==2) {
            switch (asd){
                case "-":
                case "/":
                    numbs = exp.split(asd);
                    break;
                case "*":
                    numbs = exp.split("\\*");
                    break;
                case "+":
                    numbs = exp.split("\\+");
            }
        }
        else {
            System.out.println("Не математическая функция");
        }
        int z=0;
        try {
            a = Integer.parseInt(numbs[0]);
            z++;
        }
        catch (NumberFormatException ex){
            if(exam(numbs[0])) a = Converter.romeTOarab(numbs[0]);
            else z=10;
        }
        try {
            b = Integer.parseInt(numbs[1]);
            z++;
        }
        catch (NumberFormatException ex){
            if(exam(numbs[1])) b = Converter.romeTOarab(numbs[1]);
            else z=10;
        }

        int result;

        switch (z){
            case 2:
                result = calculator(a,b,ch);
                System.out.println(result);
                break;
            case 0:

                result = calculator(a,b,ch);
                System.out.println(Converter.arabTOrome(result));
                break;
            default:
                System.out.println("Ошибка");
        }
    }
    static boolean exam(String rome){
        boolean numb=false;
        int len=0;
        rome=rome.toUpperCase();
        for(int i = 0; i < rome.length();i++){
            switch (rome.charAt(i)){
                case 'I':
                case 'V':
                case 'X':
                    len++;
                    break;
            }
        }
        if(len==rome.length())numb=true;
        return numb;
    }
    public static int calculator(int a,int b, char oper){
        int res=0;
        switch (oper){
            case '-':
                res=a-b;
                break;
            case '+':
                res=a+b;
                break;
            case '*':
                res=a*b;
                break;
            case '/':
                res=a/b;
                break;
        }
        return res;
    }
}
