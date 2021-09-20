package testpack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String exp= scn.nextLine();
        char [] charsArr = exp.toCharArray();
        char ch=' ';
        boolean math=false;
        int a, b, len = 1;
        for(int i=0;i<exp.length();i++){    //Нахожу мат оператор
            switch (charsArr[i]){
                case '-':
                case '+':
                case '*':
                case '/':
                    ch =charsArr[i];
                    math=true;              //проверка есть ли мат оператор
                    len++;                  //кол-мат операторов, должно быть два операнда и один оператор
                    break;
            }
        }

        String asd = String.valueOf(ch);
        String[] numbs = new String[len];
        if(math&&len==2) {                  //разделяю на 2 строки
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
            a = Integer.parseInt(numbs[0]);     //определяю арабские или римские цифры
            z++;
        }
        catch (NumberFormatException ex){
            a = Converter.romeTOarab(numbs[0]);
        }
        try {
            b = Integer.parseInt(numbs[1]);
            z++;
        }
        catch (NumberFormatException ex){
            b = Converter.romeTOarab(numbs[1]);
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
