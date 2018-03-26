package java8;
/*default methods  in interface*/
public class Java8Tester2 {
	   public static void main(String args[]){
		      Vehicle vehicle = new Car();
		      vehicle.print();
		   }
		}
		interface Vehicle {
		   default void print(){
		      System.out.println("I am a vehicle!");
		   }
		   static void blowHorn(){
		      System.out.println("Blowing horn!!!");
		   }
		}
		interface FourWheeler {
		   default void print(){
		      System.out.println("I am a four wheeler!");
		   }
		}
		class Car implements Vehicle, FourWheeler {
		   public void print(){
		      Vehicle.super.print();//default method of interface
		      FourWheeler.super.print();//default method of interface
		      Vehicle.blowHorn();
		      System.out.println("I am a car!");
		   }
		}