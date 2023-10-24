package DesktopObjects;

import Base.Base;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;



public class NotepadObject extends Base {
    private Pattern notepadOpen = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\notepad.PNG");
    private Pattern fileOption = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\file.PNG");
    private Pattern editorPattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\editor.PNG");
    private Pattern file1Pattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\file.PNG");
    private Pattern savePattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\save.PNG");
    private Pattern pathPattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\path.PNG");
    private Pattern filenamePattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\filename.PNG");
    private Pattern save1Pattern = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\save1.PNG");


    // private Pattern newOption = new Pattern() ;

    public void openNotepadEXE() throws FindFailed, InterruptedException {
        screen.find(notepadOpen);
        screen.doubleClick();
    }

    public void fileNotepad() throws FindFailed, InterruptedException {
        screen.find(fileOption);
        screen.click();
    }

    public void newOption() {

        screen.type(Keys.CTRL + "N");
    }

    public void editorOption(String text) throws FindFailed {
        screen.find(editorPattern);
        screen.type("Endava");
    }
    public void file1Option() throws FindFailed {
        screen.find(file1Pattern);
        screen.click();
    }
    public void saveOption() throws FindFailed {
        screen.find(savePattern);
        screen.click();
    }
    public void pathOption() throws FindFailed {
        screen.find(pathPattern);
        screen.click();
    }
    public void fileNamePattern(String fileName) throws FindFailed {
        screen.find(filenamePattern);
        screen.type("Fisier1");
    }
    public void save1Option() throws FindFailed {
        screen.find(save1Pattern);{
            screen.click();
        }
    }


}
