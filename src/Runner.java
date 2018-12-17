public class Runner {
    public static void main(String[] args) {
        System.out.println(new Walkup()); // → ...Price: 50
        System.out.println(new Advance(15)); // → ...Price: 30
        System.out.println(new Advance(5)); // → ...Price: 40
        System.out.println(new StudentAdvance(15)); // → ...Price: 15
        System.out.println(new StudentAdvance(5)); // → ...Price: 20
    }
}
