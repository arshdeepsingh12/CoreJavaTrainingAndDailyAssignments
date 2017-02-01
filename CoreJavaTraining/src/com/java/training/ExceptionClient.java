package com.java.training;

/**
 * Created by 22arsh on 1/31/17.
 */
public class ExceptionClient {

    public static void main(String[] args) {
      try {
          method1();
      }
      catch(MyUserException e)
      {
          System.out.println(e);;
      }
      }
    public static void method1() throws MyUserException
    {
        throw new MyUserException("exception");
    }
}
