package pidev.presentation;

import static java.lang.String.format;
import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.DefaultJsonMapper;
import com.restfb.Facebook;
import com.restfb.FacebookClient;
import com.restfb.JsonMapper;
import com.restfb.Parameter;
import com.restfb.json.JsonArray;
import com.restfb.json.JsonObject;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.Url;
import com.restfb.types.User;
import static java.lang.String.format;
import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pidev.util.MyConnection;

@SuppressWarnings("deprecation")
public class GraphReaderExample {
  private final FacebookClient facebookClient;
public static String firstname;
public static String lastname;
public static int idCC;

  public static void main(String[] args) {
    new GraphReaderExample("CAAUCUN468CQBAPVh2R1CMZCYhamxHOAVNb4efZAaZBmIGgMY0ruN24IYn9ucHxok2z1n2ZAQGipXpnbCFyqaXdN9iCLmYvLthvWJjeiBb4Rs4RCko7XkZBlyKWi4ZCdLNiXtY89lnuh3kZChzXvfxroW8b2whOzgZBgUIpGz2Og1ASDG5LfvmcKiF1ZBeXuvhYTgrhwUwBYJZCiAZDZD").runEverything();
  }

  GraphReaderExample(String accessToken) {
    facebookClient = new DefaultFacebookClient(accessToken);
   
  }
 
  void runEverything() {
      fetchObject();
//    fetchObjects();
//    fetchObjectsAsJsonObject();
//    fetchConnections();
//    fetchDifferentDataTypesAsJsonObject();
//    query();
//    multiquery();
//    search();
//    metadata();
//    paging();
//    selection();
//    parameters();
//    rawJsonResponse();
  }

  void fetchObject() {
    out.println("* Fetching single objects *");

    User user = facebookClient.fetchObject("me", User.class);
    Page page = facebookClient.fetchObject("cocacola", Page.class);

    out.println("Name: " + user.getFirstName());
    out.println("Username: " + user.getLastName());
    out.println("Email: " + user.getEmail());
    out.println("ID Facebook: " + user.getId());
    out.println("About: " + user.getAbout());
    out.println("Birthday: " + user.getBirthday());
    
 
     try {
             String  insertStr = "insert into Personne (nom,prenom,email,tel,etat,id_RS) values ('"+user.getFirstName()+"','"
         + user.getLastName()  + "','"+user.getEmail()+"',"+0+","+1+","+user.getId()+")"; 
             
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(insertStr);
           
            ps.executeUpdate();
            String  insertStr2 = "select (id_Personne) from Personne where id_RS="+user.getId()+""; 
             PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(insertStr2);
             ResultSet resultat = ps2.executeQuery();
            while (resultat.next())
            {
         idCC=(resultat.getInt(1));
            }
              firstname =user.getFirstName();
             lastname= user.getLastName();
               String  insertStr3 = "insert into Client (id_Client) values ("+idCC+")"; 
             
            PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(insertStr3);
           
            ps3.executeUpdate();
           
             
         
           
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    out.println("Page likes: " + page.getLikes());
  }

  void fetchObjectsAsJsonObject() {
    out.println("* Fetching multiple objects at once as a JsonObject *");

    List<String> ids = new ArrayList<String>();
    ids.add("btaylor");
    ids.add("http://www.imdb.com/title/tt0117500/");

    // Make the API call
    JsonObject results = facebookClient.fetchObjects(ids, JsonObject.class);

    // Pull out JSON data by key and map each type by hand.
    JsonMapper jsonMapper = new DefaultJsonMapper();
    User user = jsonMapper.toJavaObject(results.getString("btaylor"), User.class);
    Url url = jsonMapper.toJavaObject(results.getString("http://www.imdb.com/title/tt0117500/"), Url.class);

    out.println("User is " + user);
    out.println("URL is " + url);
  }

  void fetchObjects() {
    out.println("* Fetching multiple objects at once *");

    GraphReaderExample.FetchObjectsResults fetchObjectsResults =
        facebookClient.fetchObjects(Arrays.asList("me", "cocacola"), GraphReaderExample.FetchObjectsResults.class);

    out.println("User name: " + fetchObjectsResults.me.getName());
    out.println("Page likes: " + fetchObjectsResults.page.getLikes());
  }

  void fetchDifferentDataTypesAsJsonObject() {
    out.println("* Fetching different types of data as JsonObject *");

    JsonObject btaylor = facebookClient.fetchObject("btaylor", JsonObject.class);
    out.println(btaylor.getString("name"));

    JsonObject photosConnection = facebookClient.fetchObject("me/photos", JsonObject.class);
    JsonArray photosConnectionData = photosConnection.getJsonArray("data");

    if (photosConnectionData.length() > 0) {
      String firstPhotoUrl = photosConnectionData.getJsonObject(0).getString("source");
      out.println(firstPhotoUrl);
    }

    String query = "SELECT uid, name FROM user WHERE uid=220439 or uid=7901103";
    List<JsonObject> queryResults = facebookClient.executeQuery(query, JsonObject.class);

    if (queryResults.size() > 0)
      out.println(queryResults.get(0).getString("name"));
  }
  
  public static class FetchObjectsResults {
    @Facebook
    User me;

    @Facebook(value = "cocacola")
    Page page;
  }

  void fetchConnections() {
    out.println("* Fetching connections *");

    Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
    Connection<Post> myFeed = facebookClient.fetchConnection("me/feed", Post.class);

    out.println("Count of my friends: " + myFriends.getData().size());

    if (myFeed.getData().size() > 0)
      out.println("First item in my feed: " + myFeed.getData().get(0).getMessage());
  }

  void query() {
    out.println("* FQL Query *");

    List<GraphReaderExample.FqlUser> users =
        facebookClient.executeQuery("SELECT uid, name FROM user WHERE uid=220439 or uid=7901103", GraphReaderExample.FqlUser.class);

    out.println("User: " + users);
  }

  void multiquery() {
    out.println("* FQL Multiquery *");

    Map<String, String> queries = new HashMap<String, String>();
    queries.put("users", "SELECT uid, name FROM user WHERE uid=220439 OR uid=7901103");
    queries.put("likers", "SELECT user_id FROM like WHERE object_id=122788341354");

    GraphReaderExample.MultiqueryResults multiqueryResults = facebookClient.executeMultiquery(queries, GraphReaderExample.MultiqueryResults.class);

    out.println("Users: " + multiqueryResults.users);
    out.println("People who liked: " + multiqueryResults.likers);
  }

  public static class FqlUser {
    @Facebook
    String uid;

    @Facebook
    String name;

    @Override
    public String toString() {
      return format("%s (%s)", name, uid);
    }
  }

  public static class FqlLiker {
    @Facebook("user_id")
    String userId;

    @Override
    public String toString() {
      return userId;
    }
  }

  /**
   * Holds results from a "multiquery" call.
   */
  public static class MultiqueryResults {
    @Facebook
    List<GraphReaderExample.FqlUser> users;

    @Facebook
    List<GraphReaderExample.FqlLiker> likers;
  }

  void search() {
    out.println("* Searching connections *");

    Connection<Post> publicSearch =
        facebookClient.fetchConnection("search", Post.class, Parameter.with("q", "ben foulen"),
          Parameter.with("type", "post"));

    Connection<User> targetedSearch =
        facebookClient.fetchConnection("me/home", User.class, Parameter.with("q", "foulen"),
          Parameter.with("type", "user"));

    if (publicSearch.getData().size() > 0)
      out.println("Public search: " + publicSearch.getData().get(0).getMessage());

    out.println("Posts on my wall by friends named Mark: " + targetedSearch.getData().size());
  }

  void metadata() {
    out.println("* Metadata *");

    User userWithMetadata = facebookClient.fetchObject("me", User.class, Parameter.with("metadata", 1));

    out.println("User metadata: has albums? " + userWithMetadata.getMetadata().getConnections().hasAlbums());
  }

  void paging() {
    out.println("* Paging support *");

    Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
    Connection<Post> myFeed = facebookClient.fetchConnection("me/feed", Post.class, Parameter.with("limit", 100));

    out.println("Count of my friends: " + myFriends.getData().size());

    if (myFeed.getData().size() > 0)
      out.println("First item in my feed: " + myFeed.getData().get(0));

    for (List<Post> myFeedConnectionPage : myFeed)
      for (Post post : myFeedConnectionPage)
        out.println("Post from my feed: " + post);
  }

  void selection() {
    out.println("* Selecting specific fields *");

    User user = facebookClient.fetchObject("me", User.class, Parameter.with("fields", "id,name"));

    out.println("User name: " + user.getName());
  }

  void parameters() {
    out.println("* Parameter support *");

    Date oneWeekAgo = new Date(currentTimeMillis() - 1000L * 60L * 60L * 24L * 7L);

    Connection<Post> filteredFeed =
        facebookClient.fetchConnection("me/feed", Post.class, Parameter.with("limit", 3),
          Parameter.with("until", "yesterday"), Parameter.with("since", oneWeekAgo));

    out.println("Filtered feed count: " + filteredFeed.getData().size());
  }

  void rawJsonResponse() {
    out.println("* Raw JSON *");
    out.println("User object JSON: " + facebookClient.fetchObject("me", String.class));
  }
}