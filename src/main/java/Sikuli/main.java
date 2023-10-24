package Sikuli;

import org.openqa.selenium.Keys;
import org.sikuli.basics.Settings;
import org.sikuli.script.*;

import static java.lang.Character.CONTROL;


public class main {
    public static void main(String[] args) throws FindFailed, InterruptedException {

        System.out.println("Sikuli");

        Screen notepad = new Screen();

        Pattern notepadPattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\notepad.PNG");
        notepad.find(notepadPattern);
        notepad.doubleClick();

        Thread.sleep(2000);

        Pattern filePattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\file.PNG");
        notepad.find(filePattern);
        notepad.click();

        Pattern newPattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\new.PNG");
        notepad.find(newPattern);
        notepad.type(Keys.CONTROL + "N");

        Pattern editorPattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\editor.PNG");
        notepad.find(editorPattern);
        notepad.type("Endava");

        Pattern file1Pattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\file.PNG");
        notepad.find(file1Pattern);
        notepad.click();

        Pattern savePattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\save.PNG");
        notepad.find(savePattern);
        notepad.click();

        synchronized (notepad) {
            notepad.wait(2000);
        }


        Pattern pathPattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\path.PNG");
        notepad.find(pathPattern);
        notepad.click();

        Pattern filenamePattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\filename.PNG");
        notepad.find(filenamePattern);
        notepad.type("Fisier1");

        Pattern save1Pattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\save1.PNG");
        notepad.find(save1Pattern);
        notepad.click();


    }
}
