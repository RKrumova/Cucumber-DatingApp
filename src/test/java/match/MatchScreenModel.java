package match;
import model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@AllArgsConstructor
@Getter
public class MatchScreenModel {
    private User swiper;
    private User user;
    private String matches;
    private String matchMessage;

    public MatchScreenModel() {}


    public void swipeCheckResult(String swipe1, String swipe2) {
        if(StringUtils.equals(swipe1, swipe2) && swipe1.equals("like")){
            matchMessage =  "You matched";
        } else if (StringUtils.isBlank(swipe2)) {
            matchMessage =  "Hasn't seen you yet";
        } else{
            matchMessage = "You didn't match";
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
