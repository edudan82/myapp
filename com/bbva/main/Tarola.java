package com.bbva.main;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Tarola {

    public void reproducirSonido(){

        reproducirSonido("c:/temp/torola.wav");
    }


    public void reproducirSonido(String path) {

        try

        {
            // Ruta del archivo de sonido (cambia la ruta según tu archivo)
            File soundFile = new File(path);

            // Cargar el archivo de sonido
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            // Obtener un clip de sonido
            Clip clip = AudioSystem.getClip();

            // Abrir el clip con el flujo de audio cargado
            clip.open(audioStream);

            // Reproducir el sonido
            clip.start();

            // Mantener el programa en ejecución hasta que el sonido termine de reproducirse
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch(
                UnsupportedAudioFileException e)

        {
            e.printStackTrace();
        } catch(
                IOException e)

        {
            e.printStackTrace();
        } catch(
                LineUnavailableException e)

        {
            e.printStackTrace();
        } catch(
                InterruptedException e)

        {
            e.printStackTrace();
        }
    }

}
