package testpack;

public class Converter {
    static int romeTOarab(String romen){        //перевод римского на арабский
        int number=0;
        romen=romen.toUpperCase();
        int i=0;

        while (i< romen.length()){
            switch (romen.charAt(i)){
                case 'I':
                    number+=1;
                    break;
                case 'V':
                    number+=5;
                    break;
                case 'X':
                    number+=10;
                    break;
                default:
                    System.out.println("Ошибка");
            }
            if(i>0&&(romen.charAt(i)=='V'||romen.charAt(i)=='X')){
                number=number-2;
            }
            i++;
        }
        return number;
    }

    static String arabTOrome(int numb){         //перевод арабского на римский
        String romenum = "";

        if(numb==100){
            romenum+="C";
            numb%=100;
        }
        romenum+=func(numb/10,"C", "L", "X");
        numb%=10;
        romenum+=func(numb,"X", "V", "I");
        return romenum;
    }
    static String func(int num, String bol, String sr, String mal){
        switch (num){
            case 9:
                return mal + bol;
            case 8:
                return sr + mal + mal + mal;
            case 7:
                return sr + mal + mal;
            case 6:
                return sr + mal;
            case 5:
                return sr;
            case 4:
                return mal + sr;
            case 3:
                return mal + mal + mal;
            case 2:
                return mal + mal;
            case 1:
                return mal;
            default:
                return "";
        }
    }
}
