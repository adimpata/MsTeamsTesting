package Test;

import Actions.ActionWrapper;
import Actions.ActionWrapperTeams;

public class TeamsTest {
    public static void main(String[] args) {
        ActionWrapperTeams actionWrapperTeams = new ActionWrapperTeams();

        actionWrapperTeams.openTeams();
        actionWrapperTeams.wait(10000);
        actionWrapperTeams.openNewTeams();
        actionWrapperTeams.wait(2000);
        actionWrapperTeams.chatNewTeams();
        actionWrapperTeams.typeNewTeams();
        actionWrapperTeams.sentNewTeams();
        actionWrapperTeams.wait(2000);
        actionWrapperTeams.callNewTeamsExe();


    }
}
