package testpack;

public class rome {
  static int romeTOarab(String romen){        //перевод римского на арабский
        int arnum=0,number=0;

        int i=0;
        while (i< romen.length()){
            char letter = romen.charAt(i);
            switch (letter){
                case 'I':
                    number+=1;
                    break;
                case 'V':
                    number+=5;
                    break;
                case 'X':
                    number+=10;
                    break;
                default:System.out.println("Ошибка");
            }
            i++;
            if(romen.length()==1){
                arnum+=number;
                break;
            }
            else if(romen.charAt(i)=='V'||romen.charAt(i)=='X'){
                number=number-2;
            }
        }
        arnum=number;
        return arnum;
    }
    static String arabTOrome(int numb){         //перевод арабского в римский (еще не сделал)
        String romenum = " ";

        return romenum;
    }
    public static String Rome(String first, String second, char oper){
        String res = " ";
        int a=0, b=0 , c;
        first=first.toUpperCase();
        second=second.toUpperCase();
        a = romeTOarab(first);      //перевожу первое число в арабскую чтою в дальнейшем посчитать
        b = romeTOarab(second);     //перевоэу второе число
        c = arab.Arab(a,b,oper);    //через калькулятор считаю результат

        res = arabTOrome(c);        //тут результат надо перевести обратно в римский
        return res+c;
    }
}
