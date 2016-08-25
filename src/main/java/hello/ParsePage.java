package hello;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ParsePage {
    private Document doc;
    private String url;

    public ParsePage(String url) throws IOException {
        this.url = url;
        doc = Jsoup.connect(url).get();

    }

    public String getTwitterAuthorHandle(){
        Elements title = doc.select("span.author-twitter > a");
        return title.first().text().trim();

    }

    public List<String> getTwitterHandlers(){
        Elements titles = doc.select("blockquote.twitter-tweet p");
        List<String> twitterhandles = new ArrayList<String>();

        for(int i =0; i < titles.size(); i++)
        {
            String word = titles.get(i).text().split("\\(")[1].split("\\)")[0];
            if(!twitterhandles.contains(word))
                twitterhandles.add(word);
        }
        return twitterhandles;
    }



}
