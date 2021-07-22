package day05;

public class h11 {
}
class Solution3 {
    private static String swap(int i){
        String str="";
        if(i>=0 && i<20){
            switch(i){
                case 0:
                    return "Zero";
                case 1:
                    return "One";
                case 2:
                    return "Two";
                case 3:
                    return "Three";
                case 4:
                    return "Four";
                case 5:
                    return "Five";
                case 6:
                    return "Six";
                case 7:
                    return "Seven";
                case 8:
                    return "Eight";
                case 9:
                    return "Nine";
                case 10:
                    return "Ten";
                case 11:
                    return "Eleven";
                case 12:
                    return "Twelve";
                case 13:
                    return "Thirteen";
                case 14:
                    return "Fourteen";
                case 15:
                    return "Fifteen";
                case 16:
                    return "Sixteen";
                case 17:
                    return "Seventeen";
                case 18:
                    return "Eighteen";
                case 19:
                    return "Nineteen";
            }
        }
        if(i>=20 && i<100){
            int x=i/10;
            int y=i%10;
            switch(x){
                case 2:
                    str="Twenty";
                    break;
                case 3:
                    str = "Thirty";
                    break;
                case 4:
                    str="Forty";
                    break;
                case 5:
                    str = "Fifty";
                    break;
                case 6:
                    str="Sixty";
                    break;
                case 7:
                    str = "Seventy";
                    break;
                case 8:
                    str="Eighty";
                    break;
                case 9:
                    str = "Ninety";
                    break;
            }
            return (y!=0)? str+" "+ swap(y) : str;
        }
        return str;
    }

    public String numberToWords(int num) {
        String str="";
        int L, pow;

        if(num==0){
            return "Zero";
        }

        while(num!=0){
            L=String.valueOf(num).length();
            //10的幂数
            pow=(L-1)/3;

            switch(pow){
                case 3:
                    str +=numberToWords(num/1000000000)+" Billion";
                    num=num%1000000000;
                    break;
                case 2:
                    str += numberToWords(num/1000000)+" Million";
                    num=num%1000000;
                    break;
                case 1:
                    str += numberToWords(num/1000)+" Thousand";
                    num=num%1000;
                    break;
                case 0:
                    //case 0 是小于等于3位时
                    //当是3位数时，
                    if(L==3){
                        str += numberToWords(num/100)+" Hundred";
                        num=num%100;
                        if(num==0){
                            return str;
                        }else{
                            str+=" ";
                            str+=swap(num);
                            return str;
                        }
                    }

                    str+=swap(num);
                    return str;
            }
            //余数是0的话，末尾不加空格，否则加空格
            str+= (num==0?"":" ");
        }
        return str;
    }
}