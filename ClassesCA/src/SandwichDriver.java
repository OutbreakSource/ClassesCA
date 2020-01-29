public class SandwichDriver {
    public static void main(String[] args){
        Sandwich yum = new Sandwich(200, "Q-pounder", 2);

        System.out.println(yum.toString() + yum.isHealthy());
    }
}
