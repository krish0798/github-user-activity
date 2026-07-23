import java.util.*;

public class Formatter {
    ArrayList<GitHubEvent> events = new ArrayList<>();

    public void printEvent(){
        events = GitHubFetcher.fetch();
                        
        if(events.size()==0){
            System.out.println("No recent activities found.");
            return;
        }

        for(int i=0; i<events.size(); i++){
            System.out.println(+events.get(i).type+ "to" +events.get(i).repo+" "+events.get(i).date);
        }
    }
}
