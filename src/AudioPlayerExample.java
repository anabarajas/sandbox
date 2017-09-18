import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.InputStream;

/**
 * Created by abarajas on 4/28/17.
 *
 * * A simple Java sound file example (i.e., Java code to play a sound file).
 * AudioStream and AudioPlayer code comes from a javaworld.com example.
 * @author alvin alexander, devdaily.com.
 */
public class AudioPlayerExample {

    public void playRecording() throws Exception {

        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream is = getClass().getResourceAsStream("Users/abarajas/cancion.mp3");
        AudioStream as = new AudioStream(is);
        AudioPlayer.player.start(as);

// open the sound file as a Java input stream
//        String gongFile = "/Users/abarajas/cancion.mp3";
//        InputStream in = new FileInputStream(gongFile);

//        // create an audiostream from the inputstream
//        AudioStream audioStream = new AudioStream(in);
//
//        // play the audio clip with the audioplayer class
//        AudioPlayer.player.start(audioStream);

    }

    public static void main(String[] args){
        AudioPlayerExample audioPlayer = new AudioPlayerExample();
        try {
            audioPlayer.playRecording();
        } catch (Exception e) {
            System.out.println("Error is: " + e);
        }


    }
}
