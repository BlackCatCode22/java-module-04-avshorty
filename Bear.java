public class Bear extends Animal {
    public Bear(String name, int age) {
        super(name, age,"Bear");
    }

    @Override
    public void Feature() {
        System.out.println("(Bear):I have brown, white, or black fur");
    }
}
