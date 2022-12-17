package com8;
import java.util.*;
public class Dsa1 {
public static void main(String[] args) {
	int i=0,j=0,count=0,len=0;
    String sen="";
    String arr[];
    char ch=' ',last=' ';
    Scanner sc=new Scanner(System.in);
    System.out.print("Sentence: ");
    sen = sc.nextLine();
    sen = sen.trim();
    sen = sen.toUpperCase();
    len =sen.length();
  
    last =sen.charAt(len - 1);
    if(last!='.'&& last!='?'&& last!='!')
    {
        System.out.println("INVALID INPUT");

    }
    else
    {
        System.out.println(sen);
        StringTokenizer st = new StringTokenizer(sen, "? .!,");
        /* counting number of words in sentence*/
        count = st.countTokens();
        String a[] = new String[count];
        /*adding words to array*/
        for(i = 0; i < count; i++)
        {
            a[i] = st.nextToken();
        }

        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a.length - 1 - i; j++)
            {
                if(a[j].compareTo(a[j + 1]) > 0)
                {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a.length - 1 - i; j++)
            {
                if(a[j].length() > a[j + 1].length())
                {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

}
	