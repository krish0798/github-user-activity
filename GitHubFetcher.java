import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GitHubFetcher {
    public ArrayList<GitHubEvent> fetch(String username){
        String url = "https://api.github.com/users/"+username+"/events";
    }
}
