package com.bbva.main;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlatoAlto {

    public void reproducirSonidoAlto() {

        System.out.println("sonido agudo nota alta");
    }

    public void reproducirSonidoBajo() {

        System.out.println("sonido agudo nota bajo");
    }

    public void reproducirLoop2sec() {

        {
            for (int i = 0; i < 5; i++) {
                // Cambia 5 por el número de iteraciones deseadas
                reproducirSonidoAlto();
                try {
                    Thread.sleep(2000); // 2000 milisegundos = 2 segundos
                } catch (InterruptedException e) {
                    {
                        e.printStackTrace();

                    }
                }
            }
        }
    }

    public void reproducirLoop2secHastaCondicion() {

        {
            for (int i = 0; i < 15; i++) {
                // Cambia 5 por el número de iteraciones deseadas
                reproducirSonido("c:/temp/plato.wav");
                try {
                    Thread.sleep(2000); // 2000 milisegundos = 2 segundos
                } catch (InterruptedException e) {
                    {
                        e.printStackTrace();

                    }
                }
            }
        }
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
