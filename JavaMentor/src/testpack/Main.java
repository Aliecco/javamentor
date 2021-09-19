package testpack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String exp= scn.nextLine();
        System.out.println(exp);
        char [] charsArr = exp.toCharArray();
        char ch=' ';
        boolean math=false;
        int a=0, b=0, len = 1;
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
            System.out.println(numbs[0]);
            System.out.println(numbs[1]);
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
        }
        try {
            b = Integer.parseInt(numbs[1]);
            z++;
        }
        catch (NumberFormatException ex){
        }
        switch (z){
            case 2:
                System.out.println(arab.Arab(a,b,ch));
                break;
            case 0:
                System.out.println(rome.Rome(numbs[0],numbs[1],ch));
                break;
            default:
                System.out.println("Ошибка");
        }

    }
}
