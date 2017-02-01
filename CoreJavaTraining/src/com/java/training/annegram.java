package com.java.training;

import java.util.Scanner;

/**
 * Created by 22arsh on 1/31/17.
 */
public class annegram {

    public boolean isannegram(String str1,String str2)
    {
       int len1 = str1.length(),sum1=0;
       int len2 = str2.length(),sum2=0,match=0;
        //char s1[] = str1.toCharArray();
        //char s2[] = str2.toCharArray();


        if(len1!=len2)
            {
                return false;
            }
        else
            {
                for(int i=0;i<len1;i++)
                {

                    char m = str1.charAt(i);
                    for(int j=0;j<len1;j++)
                    {
                        char n = str2.charAt(j);

                        if(m==n)
                        {
                            str2 = str2.substring(0,j)+str2.substring(j+1);
                          match++;
                          break;
                        }
                        else
                        {
                            continue;
                        }


                    }

                    if(match==len1)
                    {
                        return true;
                    }


                }
                return false;
                /*if(sum1==sum2)
                {
                    return true;
                }
                else
                {
                    return false;
                }*/

            }
    }

    public static void main(String[] args) {

        annegram obj1 = new annegram();
        System.out.println(obj1.isannegram("aabbcc","ccbbaa"));
    }

}
