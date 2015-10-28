package com.strategy;

public abstract class Duck{
  
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck(){}
  
  public void setFlyBehavior(FlyBehavior fb){
  
    flyBehavior = fb;
  }
 public void setQuackBehavior(QuackBehavior qu){
 
   quackBehavior=qu; 
 }
 abstract void display();
 
 public void performFly()
 {
   flyBehavior.fly();
 }
  
 public void performQuack()
 {
   quackBehavior.quack();
 }
 public void swim(){
 
    System.out.println("All ducks float, even decoys!");
 }
  
  
}