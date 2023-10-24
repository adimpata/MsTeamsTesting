package DesktopObjects;

import Base.Base;
import org.openqa.selenium.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class TeamsObject extends Base {
    private Pattern teamsOpen = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\teams.PNG");
    private Pattern openNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\newTeams.PNG");
    private Pattern chatNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\chatTeams.PNG");
    private Pattern typeNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\typeTeams.PNG");

    private Pattern sentNewTeams = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\sentTeams.PNG");
    private Pattern callNewTeamss = new Pattern("C:\\Users\\mpata\\Project\\CleopartaSkiluli\\src\\callTeams.PNG");


    public void openTeamsEXE() throws FindFailed, InterruptedException {
        screen.find(teamsOpen);
        screen.doubleClick();
    }

    public void openNewTeamsEXE() throws FindFailed, InterruptedException {
        screen.find(openNewTeams);
        screen.click();
    }

    public void chatNewTeams() throws FindFailed, InterruptedException {
        screen.find(chatNewTeams);
        screen.click();
    }

    public void typeNewTeams() throws FindFailed, InterruptedException {
        screen.find(typeNewTeams);
        screen.type("Salut!");
    }

    public void sentNewTeams() throws FindFailed, InterruptedException {
        screen.find(sentNewTeams);
        screen.click();
    }

    public void callNewTeams() throws FindFailed, InterruptedException {
        screen.find(callNewTeamss);
        screen.click();
    }



}
