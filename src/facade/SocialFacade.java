package facade;

public class SocialFacade {
    private Facebook facebook;
    private Twitter twitter;
    private Instagram instagram;

    public SocialFacade() {
    }

    public SocialFacade(Facebook facebook, Twitter twitter, Instagram instagram) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
    }

    public void share(String message) {
        this.facebook.setMessage(message);
        this.twitter.setMessage(message);
        this.instagram.setMessage(message);

        this.facebook.share();
        this.twitter.share();
        this.instagram.share();
    }
}
