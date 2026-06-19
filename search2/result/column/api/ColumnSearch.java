package com.bilibili.search2.result.column.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchArticleCard;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/api/ColumnSearch.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ColumnSearch extends BaseSearchItem implements Parcelable {
    public static final int $stable = 8;

    @JSONField(name = "author")
    @Nullable
    private String author;

    @JSONField(name = "badge")
    @Nullable
    private String badge;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @Nullable
    private String desc;

    @Nullable
    private String exp_str;
    private long id;

    @JSONField(name = "image_urls")
    @Nullable
    private List<String> imageUrls;
    private boolean isExposed;

    @JSONField(name = "goto")
    @Nullable
    private String jump;

    @Nullable
    private String keyword;
    private int like;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private SparseBooleanArray mClickArray;
    private long mid;

    @Nullable
    private String name;
    private int page;

    @Nullable
    private String param;

    @JSONField(name = "pub_time")
    @Nullable
    private String publishTime;

    @Nullable
    private String qvId;
    private int reply;
    private int serverPagePos;

    @JSONField(name = EditCustomizeSticker.TAG_TEMPLATE_ID)
    private int templateId;

    @Nullable
    private String title;

    @Nullable
    private String trackId;

    @Nullable
    private String uri;
    private int view;

    @NotNull
    public static final b Companion = new Object();

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ColumnSearch> CREATOR = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/api/ColumnSearch$a.class */
    public static final class a implements Parcelable.Creator<ColumnSearch> {
        @Override // android.os.Parcelable.Creator
        public final ColumnSearch createFromParcel(Parcel parcel) {
            return new ColumnSearch(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ColumnSearch[] newArray(int i7) {
            return new ColumnSearch[i7];
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/api/ColumnSearch$b.class */
    public static final class b {
    }

    public ColumnSearch() {
    }

    public ColumnSearch(@NotNull Parcel parcel) {
        this.id = parcel.readLong();
        this.mid = parcel.readLong();
        this.name = parcel.readString();
        this.templateId = parcel.readInt();
        setTitle(parcel.readString());
        this.desc = parcel.readString();
        this.imageUrls = parcel.createStringArrayList();
        this.view = parcel.readInt();
        this.like = parcel.readInt();
        this.reply = parcel.readInt();
        setUri(parcel.readString());
        setParam(parcel.readString());
        this.jump = parcel.readString();
        setTrackId(parcel.readString());
        setServerPagePos(parcel.readInt());
        setKeyword(parcel.readString());
        this.page = parcel.readInt();
        this.exp_str = parcel.readString();
    }

    public ColumnSearch(@NotNull SearchArticleCard searchArticleCard) {
        this.id = searchArticleCard.getId();
        this.mid = searchArticleCard.getMid();
        this.name = searchArticleCard.getName();
        this.templateId = searchArticleCard.getTemplateId();
        setTitle(searchArticleCard.getTitle());
        this.desc = searchArticleCard.getDesc();
        this.imageUrls = searchArticleCard.getImageUrlsList();
        this.view = searchArticleCard.getView();
        this.like = searchArticleCard.getLike();
        this.reply = searchArticleCard.getReply();
        this.publishTime = searchArticleCard.getPubTime();
        this.badge = searchArticleCard.getBadge();
        setCover(searchArticleCard.getCover());
        this.author = searchArticleCard.getAuthor();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAuthor() {
        return this.author;
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getExp_str() {
        return this.exp_str;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    @Nullable
    public final String getJump() {
        return this.jump;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getKeyword() {
        return this.keyword;
    }

    public final int getLike() {
        return this.like;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPage() {
        return this.page;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getParam() {
        return this.param;
    }

    @Nullable
    public final String getPublishTime() {
        return this.publishTime;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getQvId() {
        return this.qvId;
    }

    public final int getReply() {
        return this.reply;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public int getServerPagePos() {
        return this.serverPagePos;
    }

    public final int getTemplateId() {
        return this.templateId;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getTrackId() {
        return this.trackId;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getUri() {
        return this.uri;
    }

    public final int getView() {
        return this.view;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public boolean isExposed() {
        return this.isExposed;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.bilibili.search2.api.BaseSearchItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isHasClicked(int r4) {
        /*
            r3 = this;
            r0 = r3
            android.util.SparseBooleanArray r0 = r0.mClickArray
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1c
            r0 = r7
            r1 = r4
            boolean r0 = r0.get(r1)
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1c
            goto L1e
        L1c:
            r0 = 0
            r5 = r0
        L1e:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.column.api.ColumnSearch.isHasClicked(int):boolean");
    }

    public final void setAuthor(@Nullable String str) {
        this.author = str;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setClicked(int i7, boolean z6) {
        if (this.mClickArray == null) {
            this.mClickArray = new SparseBooleanArray();
        }
        this.mClickArray.put(i7, z6);
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setExp_str(@Nullable String str) {
        this.exp_str = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setExposed(boolean z6) {
        this.isExposed = z6;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setImageUrls(@Nullable List<String> list) {
        this.imageUrls = list;
    }

    public final void setJump(@Nullable String str) {
        this.jump = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setLike(int i7) {
        this.like = i7;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPage(int i7) {
        this.page = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setPublishTime(@Nullable String str) {
        this.publishTime = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setQvId(@Nullable String str) {
        this.qvId = str;
    }

    public final void setReply(int i7) {
        this.reply = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setServerPagePos(int i7) {
        this.serverPagePos = i7;
    }

    public final void setTemplateId(int i7) {
        this.templateId = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setUri(@Nullable String str) {
        this.uri = str;
    }

    public final void setView(int i7) {
        this.view = i7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.mid);
        parcel.writeString(this.name);
        parcel.writeInt(this.templateId);
        parcel.writeString(getTitle());
        parcel.writeString(this.desc);
        parcel.writeStringList(this.imageUrls);
        parcel.writeInt(this.view);
        parcel.writeInt(this.like);
        parcel.writeInt(this.reply);
        parcel.writeString(getUri());
        parcel.writeString(getParam());
        parcel.writeString(this.jump);
        parcel.writeString(getTrackId());
        parcel.writeInt(getServerPagePos());
        parcel.writeString(getKeyword());
        parcel.writeInt(this.page);
        parcel.writeString(this.exp_str);
    }
}
