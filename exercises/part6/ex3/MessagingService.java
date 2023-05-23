package part6.ex3;

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> inbox ;

    public MessagingService(){
        this.inbox = new ArrayList<>();
    }

    public void add(Message message){
        if(message.getContent().length()<=280){
            inbox.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return inbox;
    }
}
