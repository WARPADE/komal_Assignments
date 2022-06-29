package com.cg.generics;

import java.util.Date;
//Scenario B - One String and another Date

public class ClientClassB {
  public static void main(String[] args) {
      Date objc=new Date();
      pair<String, java.util.Date> object=new pair<String,java.util.Date> ("1",objc);
      System.out.println("{"+object.getObj1()+"="+object.getObj2()+"}");
  }
}
class pair1<K,V>{
  private K obj1;
  private V obj2;

  public pair1(K obj1,V obj2){
      this.obj1=obj1;
      this.obj2=obj2;
  }
  public K getObj1() {
      return obj1;
  }
  public V getObj2() {
      return obj2;
  }

}
