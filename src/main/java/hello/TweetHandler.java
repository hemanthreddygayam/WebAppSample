package hello;
import java.util.List;


public class TweetHandler {

    private String articleName;
    private List<String> tweetHandles;
    private String authorHandle;
    private int numberOfHandles;

    public TweetHandler(){
        numberOfHandles = 0;

    }
    public void setArticleName(String articleName)
    {
        this.articleName = articleName;
    }
    public void setTweetHandles(List<String> handles)
    {
        tweetHandles = handles;
        numberOfHandles = handles.size();
    }
    public void setNumberOfHandles(int numberOfHandles)
    {
        this.numberOfHandles = numberOfHandles;
    }
    public void setAuthorHandle(String author)
    {
        this.authorHandle = author;

    }

    public int getNumberOfHandles() {
        return numberOfHandles;
    }

    public List<String> getTweetHandles() {
        return tweetHandles;
    }
    public String getAuthorHandle(){
        return authorHandle;
    }
    public String getArticleName(){
        return articleName;
    }
}
