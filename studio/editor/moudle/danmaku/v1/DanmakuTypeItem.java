package com.bilibili.studio.editor.moudle.danmaku.v1;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/DanmakuTypeItem.class */
@Keep
public class DanmakuTypeItem implements Serializable, Cloneable {
    public static final int DANMAKU_TYPE_COOPERATE = 3;
    public static final int DANMAKU_TYPE_LIVE = 2;
    public static final int DANMAKU_TYPE_MANUSCRIPT = 1;
    public String assetLic;
    public String assetPath;

    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "ctime")
    public String ctime;

    @JSONField(name = "download_url")
    public String downloadUrl;

    @JSONField(name = "download_url_aurora")
    public String downloadUrlAurora;

    @JSONField(name = "id")
    public String id;

    @JSONField(name = "mtime")
    public String mtime;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "barrage_type")
    public int type;
    private boolean downloading = false;
    private boolean downloaded = false;
    private boolean selected = false;
    private boolean isLocal = false;
    public DanmakuItemList danmakuItemList = null;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DanmakuTypeItem m9899clone() {
        DanmakuTypeItem danmakuTypeItem;
        try {
            danmakuTypeItem = (DanmakuTypeItem) super.clone();
        } catch (CloneNotSupportedException e7) {
            e = e7;
            danmakuTypeItem = null;
        }
        try {
            danmakuTypeItem.danmakuItemList = null;
            danmakuTypeItem.assetLic = null;
            danmakuTypeItem.assetPath = null;
            danmakuTypeItem.downloading = false;
            danmakuTypeItem.downloaded = false;
            danmakuTypeItem.selected = false;
            danmakuTypeItem.isLocal = false;
        } catch (CloneNotSupportedException e8) {
            e = e8;
            e.printStackTrace();
        }
        return danmakuTypeItem;
    }

    public String getAssetLic() {
        return this.assetLic;
    }

    public String getAssetPath() {
        return this.assetPath;
    }

    public String getCover() {
        return this.cover;
    }

    public int getType() {
        return this.type;
    }

    public boolean isDownloaded() {
        return this.downloaded;
    }

    public boolean isDownloading() {
        return this.downloading;
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setAssetLic(String str) {
        this.assetLic = str;
    }

    public void setAssetPath(String str) {
        this.assetPath = str;
    }

    public void setCover(String str) {
        this.cover = str;
    }

    public void setDownloaded(boolean z6) {
        this.downloaded = z6;
    }

    public void setDownloading(boolean z6) {
        this.downloading = z6;
    }

    public void setLocal(boolean z6) {
        this.isLocal = z6;
    }

    public void setSelected(boolean z6) {
        this.selected = z6;
    }

    public void setType(int i7) {
        this.type = i7;
    }

    public String toString() {
        return "type:";
    }
}
