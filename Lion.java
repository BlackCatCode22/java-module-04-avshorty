public class Lion extends Animal{

public Lion(String name, int age){
    super(name, age,"Lion");
}

    @Override
    public void Feature() {
        System.out.println("(Lion): I have a golden brown fur!");
    }
}
