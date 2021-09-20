package testpack;

public class Converter {
    static int romeTOarab(String romen){        //перевод римского на арабский
        int number=0;
        romen=romen.toUpperCase();
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
    static String arabTOrome(int numb){         //перевод с арабского на римский
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
    static String func(int num, String hi, String re, String lo){
        switch (num){
            case 9:
                return lo + hi;
            case 8:
                return re + lo + lo + lo;
            case 7:
                return re + lo + lo;
            case 6:
                return re + lo;
            case 5:
                return re;
            case 4:
                return lo + re;
            case 3:
                return lo + lo + lo;
            case 2:
                return lo + lo;
            case 1:
                return lo;
            default:
                return "";
        }
    }
}
