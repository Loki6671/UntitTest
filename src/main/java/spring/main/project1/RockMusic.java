package spring.main.project1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

public class RockMusic implements Music {
    ArrayList<String> list= new ArrayList();
    Random random= new Random();






    @Override
    public String getSong() {
        list.add("Rock-1");
        list.add("Rock-2");
        list.add("Rock-3");



        return list.get(random.nextInt(2));
    }
}
