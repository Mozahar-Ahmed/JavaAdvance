package json.parser;

        import com.google.gson.JsonArray;
        import com.google.gson.JsonElement;
        import com.google.gson.JsonObject;
        import com.google.gson.JsonParser;

        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.net.URL;
        import java.net.URLConnection;
        import java.util.ArrayList;
        import java.util.List;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api
      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY
      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f
      YOUR_API_KEY=fad0c5bec3ba44a1bcd0be3c92722864
      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.
      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]
	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.
	   You can follow How we implemented in Employee and JsonReaderUtil task.
	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.
     */
    private String source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getURL() {
        return url;
    }
    public void setURL(String url) {
        this.url = url;
    }
    public String getUrlToImage() {
        return urlToImage;
    }
    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) throws IOException {
        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=fad0c5bec3ba44a1bcd0be3c92722864";
        CnnAPI cnnAPI = null;
        List<Employee> cnnList = new ArrayList<>();
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            JsonObject rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray = root.getAsJsonArray();
        }
        for (int i = 0; i < jsonArray.size() - 1; i++) {
            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                String cnnSource = jsonobject.get("source").toString();
                System.out.print(cnnSource+" ");
                String cnnAuthor = jsonobject.get("author").toString();
                System.out.print(cnnAuthor+" ");
                String cnnTitle = jsonobject.get("title").toString();
                System.out.print(cnnTitle+" ");
                String cnnDescription = jsonobject.get("description").toString();
                System.out.print(cnnDescription+" ");
                String cnnURL = jsonobject.get("url").toString();
                System.out.print(cnnURL+" ");
                String cnnURLToImage = jsonobject.get("urlToImage").toString();
                System.out.print(cnnURLToImage+" ");
                String cnnPublishedAt = jsonobject.get("publishedAt").toString();
                System.out.print(cnnPublishedAt+" ");
                String cnnContent = jsonobject.get("content").toString();
                System.out.println(cnnContent);

            } catch (Exception ex) {

            }
        }
    }

}