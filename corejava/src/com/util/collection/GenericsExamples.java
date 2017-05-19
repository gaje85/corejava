package com.util.collection;

import java.util.ArrayList;
import java.util.List;

class FruitOne {
   @Override
   public String toString() {
      return "I am a Fruit !!";
   }
}
 
class AppleOne extends FruitOne {
   @Override
   public String toString() {
      return "I am an Apple !!";
   }
}
 
class AsianApple extends AppleOne {
   @Override
   public String toString() {
      return "I am an AsianApple !!";
   }
}
 
public class GenericsExamples
{
   public static void main(String[] args)
   {
      //List of apples
      List<AppleOne> apples = new ArrayList<AppleOne>();
      apples.add(new AppleOne());
       
      //We can assign a list of apples to a basket of apples
      List<? super AppleOne> basket = apples;
       
      basket.add(new AppleOne());      //Successful
      basket.add(new AsianApple()); //Successful
     // basket.add(new FruitOne());      //Compile time error
   }
}