package Wrapper;

import DesktopObjects.MsTeamsObject;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class ScreenWrapper  extends MsTeamsObject{
    private MsTeamsObject teamsObject;
    public MsTeamsObject waitProgram = new MsTeamsObject();
    public ScreenWrapper(Screen screen) {
        super(screen);
        this.teamsObject = new MsTeamsObject(screen);
    }



    public void openTeams() throws FindFailed {
        teamsObject.openTeams();
    }

    public void openNewTeamsChat() throws FindFailed {
        teamsObject.openNewTeamsChat();
    }

    public void sendChatMessage(String message) throws FindFailed {
        teamsObject.sendChatMessage(message);
    }

    public void makeACall() throws FindFailed {
        teamsObject.makeACall();
    }

    public void wait(int ms) throws InterruptedException {
        synchronized (waitProgram) {
            waitProgram.wait(ms);
        }
    }
    // You can add more methods as needed
}

