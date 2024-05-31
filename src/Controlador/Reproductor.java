package Controlador;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Reproductor {

    private Clip clip;

    public Reproductor() {
    }

    public void cargarSonido(String ruta) {
        try {
            File archivoSonido = new File(ruta);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reproducirLoop() {
        this.ajustarVolumen(-35.0f);
        try {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ajustarVolumen(float nivel) {
        try {
            if (clip != null) {
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(nivel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
