package net.mehmetbalbay.riotapi.model.Staticdataitems;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class ItemDto {
    @SerializedName("gold")
    @Expose
    private GoldDto gold;
    @SerializedName("plaintext")
    @Expose
    private String plaintext;
    @SerializedName("hideFromAll")
    @Expose
    private boolean hideFromAll;
    @SerializedName("inStore")
    @Expose
    private boolean inStore;
    @SerializedName("into")
    @Expose
    private List<String> into;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("stats")
    @Expose
    private InventoryDataStatsDto stats;
    @SerializedName("colloq")
    @Expose
    private String colloq;
    @SerializedName("maps")
    @Expose
    private Map<String, Boolean> maps;
    @SerializedName("specialRecipe")
    @Expose
    private int specialRecipe;
    @SerializedName("image")
    @Expose
    private ImageDto image;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("tags")
    @Expose
    private List<String> tags;
    @SerializedName("effect")
    @Expose
    private Map<String, String> effect;
    @SerializedName("requiredChampion")
    @Expose
    private String requiredChampion;
    @SerializedName("from")
    @Expose
    private List<String> from;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("consumeOnFull")
    @Expose
    private Boolean consumeOnFull;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("consumed")
    @Expose
    private Boolean consumed;
    @SerializedName("sanitizedDescription")
    @Expose
    private String sanitizedDescription;
    @SerializedName("depth")
    @Expose
    private int depth;
    @SerializedName("stacks")
    @Expose
    private int stacks;

    public ItemDto(GoldDto gold, String plaintext, boolean hideFromAll, boolean inStore, List<String> into, int id, InventoryDataStatsDto stats, String colloq, Map<String, Boolean> maps, int specialRecipe, ImageDto image, String description, List<String> tags, Map<String, String> effect, String requiredChampion, List<String> from, String group, Boolean consumeOnFull, String name, Boolean consumed, String sanitizedDescription, int depth, int stacks) {
        this.gold = gold;
        this.plaintext = plaintext;
        this.hideFromAll = hideFromAll;
        this.inStore = inStore;
        this.into = into;
        this.id = id;
        this.stats = stats;
        this.colloq = colloq;
        this.maps = maps;
        this.specialRecipe = specialRecipe;
        this.image = image;
        this.description = description;
        this.tags = tags;
        this.effect = effect;
        this.requiredChampion = requiredChampion;
        this.from = from;
        this.group = group;
        this.consumeOnFull = consumeOnFull;
        this.name = name;
        this.consumed = consumed;
        this.sanitizedDescription = sanitizedDescription;
        this.depth = depth;
        this.stacks = stacks;
    }

    public GoldDto getGold() {
        return gold;
    }

    public void setGold(GoldDto gold) {
        this.gold = gold;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public boolean isInStore() {
        return inStore;
    }

    public void setInStore(boolean inStore) {
        this.inStore = inStore;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InventoryDataStatsDto getStats() {
        return stats;
    }

    public void setStats(InventoryDataStatsDto stats) {
        this.stats = stats;
    }

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(int specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getEffect() {
        return effect;
    }

    public void setEffect(Map<String, String> effect) {
        this.effect = effect;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean getConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(Boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getStacks() {
        return stacks;
    }

    public void setStacks(int stacks) {
        this.stacks = stacks;
    }
}
