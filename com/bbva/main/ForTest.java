package com.bbva.main;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ForTest {




    public static void main(String[] args) {
        var bombo = new Bombo();
        var plato = new Plato();
        var tarola = new Tarola();
        var platoAlto = new PlatoAlto();





                // Crear dos tareas asíncronas
                CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
                    try {
                        // Simular tarea larga
                        Thread.sleep(2000);
                        tarola.reproducirSonido();
                        tarola.reproducirSonido();
                        tarola.reproducirSonido();
                        tarola.reproducirSonido();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

                CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
                    try {
                        // Simular tarea larga
                        Thread.sleep(3000);
                        platoAlto.reproducirLoop2secHastaCondicion();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

                // Esperar a que ambas tareas se completen
                CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2);

                try {
                    combinedFuture.get(); // Bloquear hasta que ambas tareas se completen
                    System.out.println("Ambas tareas completadas");
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }

        }



    }

