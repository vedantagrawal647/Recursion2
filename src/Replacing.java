/*
Given an input string S and two characters char1 and char2, you need to replace every occurrence of
character c1 with character c2 in the given string. Do this recursively.
Sample Input :
abaca
a x
Sample Output :
xbxcd
 */
import java.util.Scanner;

public class Replacing {
    String s1,s2,s3;
    Replacing(String s1,String s2,String s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public String m7(int l)
    {
        if(l==0)
        {

            return s1.substring(0,1);
        }
        String s4=m7(l-1);
        if(s4.equals(s2))
        {
            System.out.print(s3);
        }
        else
        {
            System.out.print(s4);
        }
        s1= s1.substring(1);
        return s1.substring(0,1);


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        String s3=s.next();
        Replacing obj=new Replacing(s1,s2,s3);
        String ss=obj.m7(s1.length()-1);
        if(ss.equals(s2))
        {
            System.out.print(s3);
        }
        else
        {
            System.out.print(ss);
        }


    }
}

