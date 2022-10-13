public class Test {
     static void run() {

        Kid k1 = new Kid("Wei", 6);
        Kid k2 = new Kid("Isaac", 6);
        Kid k3 = new Kid("Dave", 6);
        Kid k4 = new Kid("Kevin", 6);
        Kid k5 = new Kid("Brad", 6);

        k1.name = "Wei";
        k2.name = "Isaac";
        k3.name = "Dave";
        k4.name = "Kevin";
        k5.name = "Brad";


        System.out.println(k1.name);
        System.out.println(k2.name);
        System.out.println(k3.name);
        System.out.println(k4.name);
        System.out.println(k5.name);

        Kid theKid = new Kid("Dave", 6);
        theKid.name = "Dive Bread";
        theKid.age = 5;
        theKid.gender = ' ';
        theKid.height = 1.02;
        theKid.weight = 14.30;
        theKid.sweetness = 0.00000002;

        System.out.println(theKid);
        System.out.println("Name: " + theKid.name);
        System.out.println("Age: " + theKid.age);
        System.out.println("Gender: " + theKid.gender);
        System.out.println("Height: " + theKid.height);
        System.out.println("Weight: " + theKid.weight);
        System.out.println("Sweetness: " + theKid.sweetness);
    }

   public static void main(String[] args) {
      Test.run();
   }
}
