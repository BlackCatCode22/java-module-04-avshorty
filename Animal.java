public abstract class Animal {
    String name;
    String Species;
    int age;
    public Animal(String name, int age, String Species){
        this.name=name;
        this.age=age;
        this.Species=Species;
    }
    public String getName(){return name;}
    public int getAge(){return age;}

    public String getSpecies() {return Species;}

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public void setSpecies(String species) {Species = species;}

    public abstract void Feature();
}
