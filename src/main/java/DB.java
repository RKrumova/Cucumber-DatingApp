import model.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

class DB {
//user
    //user-user-match
    //user-user-chat<List>
    List<User> users = new ArrayList<>();
    List<Chat> chats = new ArrayList<>();
    List<Message> messages = new ArrayList<>();
    List<Match> matches = new ArrayList<>();
    List<Swipe> swipes = new ArrayList<>();
    public DB(){
        // Users user-age-gender
        User petya = new User("petya", 25, "f");
        User petya2 = new User("petya2", 21, "F");
        User ivan21 = new User("ivan21", 21, "m");
        User georgy = new User("georgy", 31, "m");
        User dimi = new User("dimi", 25, "u");
        User statUser = new User("statUser", 22, "u");
        users.add(petya);
        users.add(petya2);
        users.add(ivan21);
        users.add(georgy);
        users.add(dimi);
        users.add(statUser);
        // Matches - user1,user2,isMAtched
        Match match1 = new Match(petya, ivan21, true);
        Match match2 = new Match(ivan21, georgy, true);
        Match match3 = new Match(georgy, petya, false);
        Match match4 = new Match(dimi, petya2, false);
        matches.add(match1);
        matches.add(match2);
        matches.add(match3);
        matches.add(match4);

        // Chats user1-user2-text
        Chat chat1 = new Chat(petya, ivan21, "");
        Chat chat2 = new Chat(ivan21, georgy, "");
        chats.add(chat1);
        chats.add(chat2);

        //Messages sender-receiver-text
        Message message1 = new Message(petya, ivan21, "Hello, Ivan!");
        Message message2 = new Message(ivan21, georgy, "Hey, Georgy!");
        messages.add(message1);
        messages.add(message2);

        // For static user
        Swipe swipe1 = new Swipe(petya, true);
        Swipe swipe2 = new Swipe(petya2, false);
        swipes.add(swipe1);
        swipes.add(swipe2);
    }

}
/**
 *matched users:
 * petya - ivan21
 * ivan21 - georgy
 *
 *
 * not matched users:
 * georgy - petya
 * dimi - petya2
 *
 * users:
 * petya
 * petya2
 * ivan21
 * georgy
 * dimi
 * statUser - for tests
 * */