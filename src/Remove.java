/*
. In a string S, remove consecutive duplicates from it recursively.
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
 */
import java.util.Scanner;

public class Remove {
    String s,s2;
    Remove(String s)
    {
        this.s=s;
    }
    public  String m8(int l)
    {
        if(l==0)
        {
            s2=s.substring(0,1);
            System.out.print(s2);
            return s.substring(1);
        }
        String s1=m8(l-1);
        if(s2.equals(s1.substring(0,1)))
        {
            return s1.substring(1);
        }
        s2=s1.substring(0,1);
        System.out.print(s2);
        return s1.substring(1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Remove obj=new Remove(s);
        System.out.println(obj.m8(s.length()-1));



    }
}
