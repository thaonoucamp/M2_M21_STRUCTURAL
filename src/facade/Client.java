package facade;

public class Client {
    public void share(String message){
        SocialFacade socialFacade = new SocialFacade(new Facebook(), new Twitter(), new Instagram());
        socialFacade.share(message);
    }
}
