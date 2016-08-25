package hello;


import java.io.IOException;


public class Handles{

    public TweetHandler getHandles(String url) throws IOException {
        ParsePage p = new ParsePage(url);
        TweetHandler tweetHandler = new TweetHandler();
        tweetHandler.setAuthorHandle(p.getTwitterAuthorHandle());
        tweetHandler.setTweetHandles(p.getTwitterHandlers());
        return tweetHandler;
    }
}
