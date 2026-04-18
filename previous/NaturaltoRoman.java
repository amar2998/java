/**
 * NaturaltoRoman
 */
public class NaturaltoRoman {

    public static void main(String[] args) {
        int num=45;
        String[] thousand={"","M","MM","MMM"};
        String[] hundred={"","C","CC","CCC","CD","DCC","DCCC","CM"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] ones={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String ans=thousand[num/1000]+
        hundred[(num%1000)/100]
        +tens[(num%100)/10]+ones[num%10];
        System.out.println(ans);
    }
}