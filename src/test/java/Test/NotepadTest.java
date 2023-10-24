package Test;


import Actions.ActionWrapper;

import org.sikuli.script.FindFailed;


public class NotepadTest  {

    public static void main(String[] args) throws FindFailed, InterruptedException {

        ActionWrapper actionWrapper = new ActionWrapper();
      //Open Notepad++
        actionWrapper.openNotepad();
        actionWrapper.wait(2000);
        //Click on file
        actionWrapper.clickFileOption();

        //Create a new file
        actionWrapper.createNewFile();
        actionWrapper.editWithText("Endava");
        actionWrapper.clickFile1();
        actionWrapper.saveFile();
        actionWrapper.wait(2000);
        actionWrapper.clickPath();
        actionWrapper.enterFileName("Fisier1");
        actionWrapper.saveFile1();
    //    synchronized (notepad) {
       //     notepad.wait(2000);
      //  }

    }



}
