package DesktopObjects;

import Base.Base;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class MsTeamsObject extends Base {


    public MsTeamsObject(Screen screen) {
        this.screen = screen;
    }

    public Pattern teamsOpen = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\teams.PNG");
    public Pattern openNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\newTeams.PNG");
    public Pattern chatNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\chatTeams.PNG");
    public Pattern typeNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\typeTeams.PNG");

    public Pattern sentNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\sentTeams.PNG");
    public Pattern callNewTeamss = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\callTeams.PNG");

    public MsTeamsObject() {

    }

    public void openTeams() throws FindFailed {
        screen.doubleClick(teamsOpen);
    }

    public void openNewTeamsChat() throws FindFailed {
        screen.click(openNewTeams);
        screen.click(chatNewTeams);
    }

    public void sendChatMessage(String message) throws FindFailed {
        screen.click(typeNewTeams);
        screen.type(message);
        screen.type("\n");
    }

    public void makeACall() throws FindFailed {
        screen.click(callNewTeamss);
    }
}

