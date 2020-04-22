import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.SourceDataLine;

public class Animals {
    int i;
    Random r = new Random(); // implementing random function
    String[] animaltype = { "cat", "dog", "ferret", "rabbit" };// array with types of animals
    String[] names = { "Chico", "Bambi", "Guido", "Mimi", "Black", "White", "Suzy", "Willy", "Suzy", "Hopper",
            "Marble" };
    String[] condition = { "Arthritis", "Cancer", "Dental Disease", "Diabetes", "Distemper", "Ear Mites", "Epilepsy", "Bloat", "Worm", "Rabies","Parvovirus" };

    ArrayList<String> animalname = new ArrayList<String>();// creates an arrray list of names for animals
    for(i=0; i<names.lenght;i++){
    animalname.add(names[i]);//populating list with array of names
    }

    ArrayList<String> medcond = new ArrayList<String>();
    for(i=0; i<condition.lenght;i++){
    medcond.add(condition[i]);//populating list with array of conditions
    }// creates an array list of medical conditions for animals
}}
