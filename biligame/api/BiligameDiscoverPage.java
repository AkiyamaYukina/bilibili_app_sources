package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameDiscoverPage.class */
@Keep
public class BiligameDiscoverPage extends d {
    public static final int TYPE_BOOK = 1;
    public static final int TYPE_GROUP = 0;
    public static final int TYPE_RECENT_NEW_GAME = 4;
    public static final int TYPE_SMALL = 3;
    public static final int TYPE_TEST = 2;

    @JSONField(name = "collection_style_type")
    public int collectionStyleType;

    @JSONField(name = "immersion_cover_image")
    public String coverImage;

    @JSONField(name = "game_list")
    public List<BiligameDiscoverGame> gameList;
    public String name;

    @JSONField(name = "sub_title")
    public String subTitle;
    public String summary;
    public int type;

    @JSONField(name = "type_id")
    public long typeId;

    public boolean equals(Object obj) {
        boolean z6 = false;
        if (obj instanceof BiligameDiscoverPage) {
            if (this == obj) {
                return true;
            }
            z6 = false;
            if (this.typeId == ((BiligameDiscoverPage) obj).typeId) {
                z6 = true;
            }
        }
        return z6;
    }

    public int hashCode() {
        return String.valueOf(this.typeId).hashCode();
    }

    public String toString() {
        return "typeId:" + this.typeId + ",name:" + this.name + ",type:" + this.type + ",gameList:" + this.gameList.toString();
    }
}
