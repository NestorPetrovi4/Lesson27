import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimalsInfo {
    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public AnimalsInfo(
            @JsonProperty("Id") String Id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes){
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }
}
