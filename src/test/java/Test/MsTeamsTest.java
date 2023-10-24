package Test;

import Wrapper.ScreenWrapper;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class MsTeamsTest  {
    public static void main(String[] args) throws FindFailed, InterruptedException {

        Screen screen = new Screen();
        ScreenWrapper teamsWrapper = new ScreenWrapper(screen);

        teamsWrapper.openTeams();
        teamsWrapper.wait(10000);
        teamsWrapper.openNewTeamsChat();
        teamsWrapper.wait(2000);
        teamsWrapper.sendChatMessage("Hello, this is a chat message.");
        teamsWrapper.makeACall();

        // You'll see custom messages printed for wait, click, and type actions
    }

}
