package FinalProject;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class MusicPlay {
    public static void main(String[] args) {
        playMusic();
    }

    public static void playMusic() {
        try {
            URL cb;
            File f = new File("src/FinalProject/TheFatRat-Unity.flac"); // 引号里面的是音乐文件所在的路径
            cb = f.toURL();
            AudioClip aau;
            aau = Applet.newAudioClip(cb);

            aau.play();
            aau.loop();//循环播放
            System.out.println("Can play");
            // 循环播放 aau.play()
            //单曲 aau.stop()停止播放
        } catch(MalformedURLException e) {
            e.printStackTrace();
        }
//        AudioClip ac;
//        ac = new AudioClip;
//        ac.play();
//        AudioClip ac;
//        ac = new AudioClip() {
//            @Override
//            public void play() {
//
//            }
//
//            @Override
//            public void loop() {
//
//            }
//
//            @Override
//            public void stop() {
//
//            }
//        }
    }
}
