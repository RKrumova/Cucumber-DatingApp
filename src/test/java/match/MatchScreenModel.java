package match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import model.User;

import java.util.List;
@AllArgsConstructor
@Getter
public class MatchScreenModel {
    private User user;
    private List<User> matches;
    public MatchScreenModel() {
        
    }

    public void addMatch(User match) {
        matches.add(match);
    }

    public String swipeCheck(String swipe1,String swipe2) {
        if(swipe1 == swipe2){
            return "You matched";
        } else if (swipe2 == "" || swipe2 == null) {
            return "Hasn't seen you yet";
        } else{
            return "You didn't match";
        }
    }

    public void setUser2() {
        this.user = user;
    }

    public void setSwiper() {
    }
}
