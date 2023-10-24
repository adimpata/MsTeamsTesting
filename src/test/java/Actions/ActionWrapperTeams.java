package Actions;

import DesktopObjects.NotepadObject;
import DesktopObjects.TeamsObject;
import org.sikuli.script.FindFailed;

public class ActionWrapperTeams {
    private TeamsObject teamsObject;
    private TeamsObject waitProgram = new TeamsObject();

    public ActionWrapperTeams() {
        teamsObject = new TeamsObject();
    }

    public void openTeams() {
        try {
            teamsObject.openTeamsEXE();
        } catch (FindFailed | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openNewTeams() {
        try {
            teamsObject.openNewTeamsEXE();
        } catch (FindFailed | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void chatNewTeams() {
        try {
            teamsObject.chatNewTeams();
        } catch (FindFailed | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void typeNewTeams() {
        try {
            teamsObject.typeNewTeams();
        } catch (FindFailed | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sentNewTeams() {
        try {
            teamsObject.sentNewTeams();
        } catch (FindFailed | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void callNewTeamsExe() {
        try {
            teamsObject.callNewTeams();
        } catch (FindFailed | InterruptedException e) {
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
