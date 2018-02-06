package net.mehmetbalbay.riotapi.model.Staticdataitems;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ItemListDto {
    @SerializedName("data")
    @Expose
    private Map<String, ItemDto> data ;
    @SerializedName("version")
    @Expose
    private String version ;
    @SerializedName("tree")
    @Expose
    private List<ItemTreeDto> tree;
    @SerializedName("groups")
    @Expose
    private List<GroupDto> groups;
    @SerializedName("type")
    @Expose
    private String type;

    public ItemListDto(Map<String, ItemDto> data, String version, List<ItemTreeDto> tree, List<GroupDto> groups, String type) {
        this.data = data;
        this.version = version;
        this.tree = tree;
        this.groups = groups;
        this.type = type;
    }

    public Map<String, ItemDto> getData() {
        return data;
    }

    public void setData(Map<String, ItemDto> data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ItemTreeDto> getTree() {
        return tree;
    }

    public void setTree(List<ItemTreeDto> tree) {
        this.tree = tree;
    }

    public List<GroupDto> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDto> groups) {
        this.groups = groups;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
