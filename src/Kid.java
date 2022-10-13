public class Kid {
    String name;
    int age;
    double height;
    char gender;
    double sweetness;
    double weight;

    public Kid(String n, int a) {
        System.out.println("Kid created: " + name + ", " + age);
    }

    @Override
    public String toString() {
        return "Kid {" +
                " name= '" + name + '\'' +
                ", age=" + age +
                ", height= " + height +
                ", gender= " + gender +
                ", sweetness= " + sweetness +
                ", weight= " + weight + " " +
                '}';
    }
}
