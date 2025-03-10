package tr.edu.maltepe.oop;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bilgileriGoster() {
        System.out.println("🐱 Name: " + name);
        System.out.println("📅 Age: " + age);
    }

    public void meow() {
        // Print name and age before playing sound
        System.out.println(name + " (Age: " + age + ") is meowing...");

        playSound("/Users/berilozelsel/Documents/GitHub/my-cat-class-brlozelsel/module1/src/tr/edu/maltepe/oop/cat_meow.wav"); // Ensure correct path
    }

    public void playSound(String filePath) {
        try {
            File soundFile = new File(filePath);
            if (!soundFile.exists()) {
                System.out.println("❌ Sound file not found: " + soundFile.getAbsolutePath());
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

