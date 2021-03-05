package spring.main.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{

    @Value("${musicName}")
    private String name;
    @Value("${musicVolume}")
    private String volume;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }


    @Override
    public String getSong() {
        return "Fur Elise";
    }
//    ArrayList<String> list= new ArrayList();
//    Random random= new Random();
//
//
//
//
//    @Override
//    public String getSong() {
//        list.add("Health");
//        list.add("One direction");
//        list.add("yerrr");
//
//
//
//        return list.get(random.nextInt(3)) ;
//    }
}
