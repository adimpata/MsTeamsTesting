package Actions;

import DesktopObjects.NotepadObject;
import org.sikuli.script.FindFailed;

public class ActionWrapper {
    private NotepadObject notepadObject;
    private NotepadObject waitProgram = new NotepadObject();

    public ActionWrapper() {
        notepadObject = new NotepadObject();
    }

    public void openNotepad() {
        try {
            notepadObject.openNotepadEXE();
        } catch (FindFailed | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickFileOption() {
        try {
            notepadObject.fileNotepad();
        } catch (FindFailed | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void createNewFile() {
        notepadObject.newOption();
    }
    public void editWithText(String text) throws FindFailed {
        notepadObject.editorOption(text);
    }

    public void clickFile1() {
        try {
            notepadObject.file1Option();
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    public void saveFile() {
        try {
            notepadObject.saveOption();
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    public void clickPath() {
        try {
            notepadObject.pathOption();
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    public void enterFileName(String fileName) throws FindFailed {
        notepadObject.fileNamePattern(fileName);
    }

    public void saveFile1() {
        try {
            notepadObject.save1Option();
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }
    public void wait(int milliseconds) {
        synchronized (waitProgram) {
            try {
                waitProgram.wait(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
