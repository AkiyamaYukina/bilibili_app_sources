package com.bilibili.music.podcast.collection.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import com.bilibili.music.podcast.collection.enums.CollectionCoverEnum;
import com.bilibili.music.podcast.collection.enums.CollectionTypeEnum;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import li0.InterfaceC7859b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/PlaySet.class */
@Keep
public class PlaySet implements InterfaceC7859b {
    private static final int ATTR_CHECKED_NO = 4;
    private static final int ATTR_COVER_UPDATE_YES = 64;
    public static final int ATTR_DEFAULT_NO = 2;
    private static final int ATTR_DESC_UPDATE_YES = 32;
    public static final int ATTR_PUBLIC_NO = 1;
    private static final int ATTR_TITLE_UPDATE_YES = 16;
    private static final int ATTR_VALIDE_NO = 8;
    public static final int COVER_TYPE_AUDIO = 12;
    public static final int COVER_TYPE_CUSTOM = 0;
    public static final int COVER_TYPE_OGV = 24;
    public static final int COVER_TYPE_SEASON = 21;
    public static final int COVER_TYPE_VIDEO = 2;

    @JSONField(name = "attr")
    public int attr;

    @JSONField(name = "media_count")
    public int count;
    public String cover;

    @JSONField(name = "cover_type")
    public int coverType;

    @JSONField(name = "fav_state")
    public int favorite;
    public long folderId;
    public int folderType;
    public long id;
    public String intro;
    private boolean isReported = false;

    @JSONField(name = "use_view_vt")
    public boolean isVt;

    @Nullable
    @JSONField(name = "link")
    public String link;

    @Nullable
    @JSONField(name = "ogv")
    public OGV ogv;

    @JSONField(name = "view_count")
    public long playCount;
    public String title;

    @JSONField(name = "type")
    public int type;

    @Nullable
    @JSONField(name = "upper")
    public Upper upper;

    @JSONField(name = "state")
    public int valid;

    @Nullable
    @JSONField(name = "view_vt_text")
    public String viewContent;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/PlaySet$OGV.class */
    @Keep
    public static class OGV {

        @Nullable
        @JSONField(name = "type_name")
        public String typeName;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/PlaySet$Upper.class */
    @Keep
    public static class Upper {

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        public long mid;

        @Nullable
        @JSONField(name = "name")
        public String name;
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public InterfaceC7859b getAttached() {
        return null;
    }

    @JSONField(deserialize = false, serialize = false)
    public long getAuthorId() {
        Upper upper = this.upper;
        if (upper == null) {
            return 0L;
        }
        return upper.mid;
    }

    @NonNull
    @JSONField(deserialize = false, serialize = false)
    public String getAuthorName() {
        String str;
        Upper upper = this.upper;
        return (upper == null || (str = upper.name) == null) ? "" : str;
    }

    @Override // li0.InterfaceC7859b
    @NonNull
    public CollectionTypeEnum getCardType() {
        return this.type == 21 ? CollectionTypeEnum.SEASON : CollectionTypeEnum.FOLDER;
    }

    @Override // li0.InterfaceC7859b
    public long getCommentCounts() {
        return 0L;
    }

    @Override // li0.InterfaceC7859b
    public int getContentCounts() {
        return this.count;
    }

    @Override // li0.InterfaceC7859b
    @NonNull
    public CollectionCoverEnum getCoverType() {
        CollectionCoverEnum.a aVar = CollectionCoverEnum.Companion;
        int i7 = this.coverType;
        aVar.getClass();
        return CollectionCoverEnum.a.a(i7);
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getCoverUrl() {
        return this.cover;
    }

    @Override // li0.InterfaceC7859b
    public long getCreatorId() {
        return getAuthorId();
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getCreatorName() {
        return getAuthorName();
    }

    @Override // li0.InterfaceC7859b
    public long getDuration() {
        return 0L;
    }

    @Override // li0.InterfaceC7859b
    @org.jetbrains.annotations.Nullable
    public EventTracking getEventTracking() {
        return null;
    }

    @Override // li0.InterfaceC7859b
    public long getFolderId() {
        return this.folderId;
    }

    @Override // li0.InterfaceC7859b
    public int getFolderType() {
        return this.folderType;
    }

    @Override // li0.InterfaceC7859b
    public long getId() {
        return this.id;
    }

    @Nullable
    public String getIntro() {
        return this.intro;
    }

    @Override // li0.InterfaceC7859b
    public int getItemState() {
        return 0;
    }

    @Override // li0.InterfaceC7859b
    public int getItemType() {
        return -1;
    }

    @Nullable
    public String getJumpLink() {
        return this.link;
    }

    @Override // li0.InterfaceC7859b
    @NonNull
    public String getKey() {
        return Long.toString(this.id);
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getMessage() {
        return "";
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getOgvTag() {
        OGV ogv = this.ogv;
        return ogv != null ? ogv.typeName : "";
    }

    @Override // li0.InterfaceC7859b
    public long getPlayCounts() {
        return this.playCount;
    }

    @Override // li0.InterfaceC7859b
    public int getReportPosition() {
        return 0;
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // li0.InterfaceC7859b
    public int getTotalPage() {
        return 0;
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getViewContent() {
        return this.viewContent;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean hasCurrentVideo() {
        boolean z6 = true;
        if (this.favorite != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isDefault() {
        return (this.attr & 2) == 0;
    }

    public boolean isDefaultAttr() {
        return isDefault();
    }

    @Override // li0.InterfaceC7859b
    public boolean isInvalid() {
        return !isValid();
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isPublic() {
        boolean z6 = true;
        if ((this.attr & 1) != 0) {
            z6 = false;
        }
        return z6;
    }

    @Override // li0.InterfaceC7859b
    public boolean isPublicAttr() {
        return isPublic();
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public boolean isReported() {
        return this.isReported;
    }

    public boolean isUPDelete() {
        boolean z6 = true;
        if (((this.attr >> 3) & 1) != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isValid() {
        return this.valid == 0;
    }

    @Override // li0.InterfaceC7859b
    public boolean needToPay() {
        return false;
    }

    @Override // li0.InterfaceC7859b
    public void setReportPosition(int i7) {
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public void setReported(boolean z6) {
        this.isReported = z6;
    }

    @Override // li0.InterfaceC7859b
    public boolean useVt() {
        return this.isVt;
    }
}
