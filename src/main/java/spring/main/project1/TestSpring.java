package spring.main.project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic =context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getName());
        System.out.println(classicalMusic.getVolume());

//        Music music2 = context.getBean("classicalMusic",Music.class);

//
//        MusicPlayer musicPlayer= context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        //Music music= context.getBean("musicBean", Music.class);
//        //MusicPlayer musicPlayer= new MusicPlayer(music);
//        MusicPlayer firstMusicPlayer= context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
//        firstMusicPlayer.setVolume(500);
//        System.out.println(secondMusicPlayer.getVolume());
//
//
//        //musicPlayer.playMusic();
//        //System.out.println(musicPlayer.getName());
//        //System.out.println(musicPlayer.getVolume());

    }
}
