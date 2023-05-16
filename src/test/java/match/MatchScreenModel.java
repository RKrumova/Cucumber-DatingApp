package match;
import model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MatchScreenModel {
    private User swiper;
    private User user;
    private String matches;
    private String matchMessage;

    public MatchScreenModel() {}


    public String swipeCheckResult(String swipe1, String swipe2) {
        if(swipe1.equals(swipe2)){
            return "You matched";
        } else if (swipe2.isEmpty() || swipe2 == null) {
            return "Hasn't seen you yet";
        } else{
            return "You didn't match";
        }
    }
    public void setSwiper() {
        this.swiper =swiper;
    }
    public void setUser2() {
        this.user = user;
    }


    public String getMessage() {
        return matchMessage;
    }
}
