package de.tim0_12432.flyweight;

public class File implements Flyweight {

    public File(int number) {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
        } finally {
            System.out.println("File " + number + " created");
        }
    }

    @Override
    public String[] loadCaptions() {
        return new String[]{
                "File",
                "Datei",
                "Fichier",
                "Archivo",
                "Bestand",
                "Файл",
                "ファイル",
                "文件",
                "Tiedosto",
                "Plik",
                "Arquivo"
        };
    }
}
