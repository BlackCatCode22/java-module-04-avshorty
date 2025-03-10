import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zooKeeper {
    public static void main(String[] args) throws IOException {
        ArrayList<Animal> animalList = new ArrayList<>();
        HashMap<String, Integer> speciesCounter = new HashMap<>();BufferedReader animalFile = new BufferedReader(new FileReader("C:\\Users\\avsho\\IdeaProjects\\Animal3-8-25\\arrivingAnimal.txt"));
        BufferedReader nameFile = new BufferedReader(new FileReader("C:\\Users\\avsho\\IdeaProjects\\Animal3-8-25\\animalNames.txt"));
        String animalLine;
        while((animalLine= animalFile.readLine())!=null){
            String[] parts = animalLine.split("");
            if(parts.length !=2) continue;
            String species = parts[0];
            int age = Integer.parseInt(parts[1]);
            String name =nameFile.readLine();
            if(name== null) break;
            Animal animal = switch(species.toLowerCase()){
              case "hyena" ->new Hyena(name, age);
              case "lion" ->new Lion(name, age);
                case "tiger"-> new Bear(name, age);
                default -> null;

            };
            if(animal!=null){
                animalList.add(animal);
                speciesCounter.put(species, speciesCounter.getOrDefault(species,0)+1);
            }
        }
    animalFile.close();
    nameFile.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter("newAnimals.txt"));
        writer.write("New Arriving Animal Report\n");
        writer.write("===========\n");
        for(Animal animal : animalList){
            writer.write(animal.toString()+"\n");
        }
        writer.write("\nSpecies Count\n");
        for(Map.Entry<String,Integer> entry: speciesCounter.entrySet()){
            writer.write(entry.getKey()+ "; " +entry.getValue()+"\n");
            writer.close();
            System.out.println("Successfully added new arrvials.");
        }
    }

}