package com.bilibili.search2.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.D;
import androidx.media3.exoplayer.C4690e;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Column {
    public static final int $stable = 8;

    @JSONField(name = "author")
    @Nullable
    private Author author;

    @JSONField(name = "banner_url")
    @Nullable
    private String bannerUrl;

    @JSONField(name = "ctime")
    private long cTime;

    @JSONField(name = "categories")
    @Nullable
    private List<Category> categories;

    @JSONField(name = "category")
    @Nullable
    private Category category;

    @JSONField(name = TextSource.CFG_CONTENT)
    @Nullable
    private String content;

    @JSONField(name = "favorite_time")
    private long favoriteTime;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "image_urls")
    @Nullable
    private List<String> imageUrls;

    @JSONField(name = "like_state")
    private int likeState;

    @JSONField(name = "list")
    @Nullable
    private ArticleList list;

    @JSONField(name = "publish_time")
    private long publicTime;

    @JSONField(name = "rec_flag")
    private boolean rec;

    @JSONField(name = "rec_image_url")
    @Nullable
    private String recImage;

    @JSONField(name = "rec_text")
    @Nullable
    private String rectText;

    @JSONField(name = "reprint")
    private int reprint;

    @JSONField(name = "stats")
    @Nullable
    private Stats stats;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @JSONField(name = "summary")
    @Nullable
    private String summary;

    @JSONField(name = "tags")
    @Nullable
    private List<Tags> tags;

    @JSONField(name = EditCustomizeSticker.TAG_TEMPLATE_ID)
    private int templateId;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    @JSONField(name = "view_url")
    @Nullable
    private String viewUrl;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Author.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Author {
        public static final int $stable = 8;

        @JSONField(name = "face")
        @Nullable
        private String face;

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        private long mid;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "nameplate")
        @Nullable
        private NamePlate namePlate;

        @JSONField(name = "official_verify")
        @Nullable
        private OfficialVerify officialVerify;

        @JSONField(name = "pendant")
        @Nullable
        private Pendant pendant;

        @JSONField(name = "vip")
        @Nullable
        private Vip vip;

        @Nullable
        public final String getFace() {
            return this.face;
        }

        public final long getMid() {
            return this.mid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final NamePlate getNamePlate() {
            return this.namePlate;
        }

        @Nullable
        public final OfficialVerify getOfficialVerify() {
            return this.officialVerify;
        }

        @Nullable
        public final Pendant getPendant() {
            return this.pendant;
        }

        @Nullable
        public final Vip getVip() {
            return this.vip;
        }

        public final void setFace(@Nullable String str) {
            this.face = str;
        }

        public final void setMid(long j7) {
            this.mid = j7;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNamePlate(@Nullable NamePlate namePlate) {
            this.namePlate = namePlate;
        }

        public final void setOfficialVerify(@Nullable OfficialVerify officialVerify) {
            this.officialVerify = officialVerify;
        }

        public final void setPendant(@Nullable Pendant pendant) {
            this.pendant = pendant;
        }

        public final void setVip(@Nullable Vip vip) {
            this.vip = vip;
        }

        @NotNull
        public String toString() {
            return D.a("', face='", this.face, "'}", n.a(this.mid, "Author{mid=", ", name='", this.name));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Category.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Category implements Parcelable {

        @JSONField(name = "banner_url")
        @Nullable
        private String bannerUrl;

        @JSONField(name = "children")
        @Nullable
        private List<Category> children;

        @JSONField(name = "id")
        private long id;

        @JSONField(name = "intro")
        @Nullable
        private String intro;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "parent_id")
        private long parentId;
        private int selectedTagId;

        @NotNull
        public static final a CREATOR = new Object();
        public static final int $stable = 8;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Category$a.class */
        public static final class a implements Parcelable.Creator<Category> {
            @Override // android.os.Parcelable.Creator
            public final Category createFromParcel(Parcel parcel) {
                return new Category(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Category[] newArray(int i7) {
                return new Category[i7];
            }
        }

        public Category() {
        }

        public Category(@NotNull Parcel parcel) {
            this.id = parcel.readLong();
            this.parentId = parcel.readLong();
            this.name = parcel.readString();
            this.bannerUrl = parcel.readString();
            this.intro = parcel.readString();
            this.children = parcel.createTypedArrayList(CREATOR);
            this.selectedTagId = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String getBannerUrl() {
            return this.bannerUrl;
        }

        @Nullable
        public final List<Category> getChildren() {
            return this.children;
        }

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final String getIntro() {
            return this.intro;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final long getParentId() {
            return this.parentId;
        }

        public final int getSelectedTagId() {
            return this.selectedTagId;
        }

        public final void setBannerUrl(@Nullable String str) {
            this.bannerUrl = str;
        }

        public final void setChildren(@Nullable List<Category> list) {
            this.children = list;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setIntro(@Nullable String str) {
            this.intro = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setParentId(long j7) {
            this.parentId = j7;
        }

        public final void setSelectedTagId(int i7) {
            this.selectedTagId = i7;
        }

        @NotNull
        public String toString() {
            long j7 = this.id;
            long j8 = this.parentId;
            String str = this.name;
            String str2 = this.bannerUrl;
            String str3 = this.intro;
            List<Category> list = this.children;
            StringBuilder sbA = z.a(j7, "Category{id=", ", parentId=");
            G0.d.a(j8, ", name='", str, sbA);
            B.a("', bannerUrl='", str2, "', intro='", str3, sbA);
            sbA.append("', children=");
            sbA.append(list);
            sbA.append(ReporterMap.RIGHT_BRACES);
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeLong(this.id);
            parcel.writeLong(this.parentId);
            parcel.writeString(this.name);
            parcel.writeString(this.bannerUrl);
            parcel.writeString(this.intro);
            parcel.writeTypedList(this.children);
            parcel.writeInt(this.selectedTagId);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Label.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Label implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "path")
        @Nullable
        private String path;

        @Nullable
        public final String getPath() {
            return this.path;
        }

        public final void setPath(@Nullable String str) {
            this.path = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$NamePlate.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class NamePlate implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "condition")
        @Nullable
        private String condition;

        @JSONField(name = "image")
        @Nullable
        private String image;

        @JSONField(name = "image_small")
        @Nullable
        private String imageSmall;

        @JSONField(name = "level")
        @Nullable
        private String level;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "nid")
        private long nid;

        @Nullable
        public final String getCondition() {
            return this.condition;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final String getImageSmall() {
            return this.imageSmall;
        }

        @Nullable
        public final String getLevel() {
            return this.level;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final long getNid() {
            return this.nid;
        }

        public final void setCondition(@Nullable String str) {
            this.condition = str;
        }

        public final void setImage(@Nullable String str) {
            this.image = str;
        }

        public final void setImageSmall(@Nullable String str) {
            this.imageSmall = str;
        }

        public final void setLevel(@Nullable String str) {
            this.level = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNid(long j7) {
            this.nid = j7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$OfficialVerify.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class OfficialVerify implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "desc")
        @Nullable
        private String desc;

        @JSONField(name = "type")
        private int type;

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        public final int getType() {
            return this.type;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setType(int i7) {
            this.type = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Pendant.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Pendant implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "expire")
        @Nullable
        private String expire;

        @JSONField(name = "image")
        @Nullable
        private String image;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "pid")
        private long pid;

        @Nullable
        public final String getExpire() {
            return this.expire;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final long getPid() {
            return this.pid;
        }

        public final void setExpire(@Nullable String str) {
            this.expire = str;
        }

        public final void setImage(@Nullable String str) {
            this.image = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setPid(long j7) {
            this.pid = j7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Stats.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Stats {
        public static final int $stable = 8;

        @JSONField(name = "coin")
        private int coin;

        @JSONField(name = "dislike")
        private int dislike;

        @JSONField(name = "dynamic")
        private int dynamic;

        @JSONField(name = "favorite")
        private int favorite;

        @JSONField(name = IVideoLikeRouteService.ACTION_LIKE)
        private int like;

        @JSONField(name = "reply")
        private int reply;

        @JSONField(name = "share")
        private int share;

        @JSONField(name = "view")
        private int view;

        public final int getCoin() {
            return this.coin;
        }

        public final int getDislike() {
            return this.dislike;
        }

        public final int getDynamic() {
            return this.dynamic;
        }

        public final int getFavorite() {
            return this.favorite;
        }

        public final int getLike() {
            return this.like;
        }

        public final int getReply() {
            return this.reply;
        }

        public final int getShare() {
            return this.share;
        }

        public final int getView() {
            return this.view;
        }

        public final void setCoin(int i7) {
            this.coin = i7;
        }

        public final void setDislike(int i7) {
            this.dislike = i7;
        }

        public final void setDynamic(int i7) {
            this.dynamic = i7;
        }

        public final void setFavorite(int i7) {
            this.favorite = i7;
        }

        public final void setLike(int i7) {
            this.like = i7;
        }

        public final void setReply(int i7) {
            this.reply = i7;
        }

        public final void setShare(int i7) {
            this.share = i7;
        }

        public final void setView(int i7) {
            this.view = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Tags.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Tags {
        public static final int $stable = 8;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "tid")
        private int tid;

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final int getTid() {
            return this.tid;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setTid(int i7) {
            this.tid = i7;
        }

        @NotNull
        public String toString() {
            return androidx.customview.widget.b.b(this.tid, "Tags{tid=", ", name='", this.name, "'}");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Column$Vip.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Vip implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "due_date")
        private int dueDate;

        @JSONField(name = "label")
        @Nullable
        private Label label;

        @JSONField(name = "vip_pay_type")
        private int payType;

        @JSONField(name = NotificationCompat.CATEGORY_STATUS)
        private int status;

        @JSONField(name = "type")
        private int type;

        public final int getDueDate() {
            return this.dueDate;
        }

        @Nullable
        public final Label getLabel() {
            return this.label;
        }

        public final int getPayType() {
            return this.payType;
        }

        public final int getStatus() {
            return this.status;
        }

        public final int getType() {
            return this.type;
        }

        public final void setDueDate(int i7) {
            this.dueDate = i7;
        }

        public final void setLabel(@Nullable Label label) {
            this.label = label;
        }

        public final void setPayType(int i7) {
            this.payType = i7;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }

        public final void setType(int i7) {
            this.type = i7;
        }
    }

    public final void changeMyLikeState(boolean z6) {
        Stats stats = this.stats;
        if (stats == null) {
            return;
        }
        if (z6) {
            stats.setLike(stats.getLike() + 1);
        } else {
            stats.setLike(stats.getLike() - 1);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Column) && ((Column) obj).id == this.id;
    }

    @Nullable
    public final Author getAuthor() {
        return this.author;
    }

    public final long getAuthorMid() {
        Author author = this.author;
        return author == null ? 0L : author.getMid();
    }

    @NotNull
    public final String getAuthorName() {
        Author author = this.author;
        String name = "-";
        if (author != null && !TextUtils.isEmpty(author.getName())) {
            name = this.author.getName();
        }
        return name;
    }

    public final boolean getAuthorVip() {
        Author author = this.author;
        boolean z6 = false;
        if (author != null) {
            if (author.getVip() == null) {
                z6 = false;
            } else {
                z6 = false;
                if (this.author.getVip().getStatus() == 1) {
                    z6 = false;
                    if (this.author.getVip().getType() == 2) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    @Nullable
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final long getCTime() {
        return this.cTime;
    }

    @Nullable
    public final List<Category> getCategories() {
        return this.categories;
    }

    @Nullable
    public final Category getCategory() {
        return this.category;
    }

    @NotNull
    public final String getCategoryName() {
        Category category = this.category;
        String name = "-";
        if (category != null && !TextUtils.isEmpty(category.getName())) {
            name = this.category.getName();
        }
        return name;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getFaceUrl() {
        Author author = this.author;
        return author == null ? "-" : TextUtils.isEmpty(author.getFace()) ? null : this.author.getFace();
    }

    public final long getFavoriteTime() {
        return this.favoriteTime;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl1() {
        List<String> list = this.imageUrls;
        return (list == null || list.size() <= 0) ? null : this.imageUrls.get(0);
    }

    @Nullable
    public final String getImageUrl2() {
        List<String> list = this.imageUrls;
        return (list == null || list.size() <= 1) ? null : this.imageUrls.get(1);
    }

    @Nullable
    public final String getImageUrl3() {
        List<String> list = this.imageUrls;
        return (list == null || list.size() <= 2) ? null : this.imageUrls.get(2);
    }

    @Nullable
    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    public final int getLikeCount() {
        Stats stats = this.stats;
        return stats == null ? 0 : stats.getLike();
    }

    public final int getLikeState() {
        return this.likeState;
    }

    @Nullable
    public final ArticleList getList() {
        return this.list;
    }

    public final long getListId() {
        ArticleList articleList = this.list;
        return articleList == null ? 0L : articleList.id;
    }

    public final long getPublicTime() {
        return this.publicTime;
    }

    public final boolean getRec() {
        return this.rec;
    }

    @Nullable
    public final String getRecImage() {
        return this.recImage;
    }

    @Nullable
    public final String getRectText() {
        return this.rectText;
    }

    public final int getReplyCount() {
        Stats stats = this.stats;
        return stats == null ? 0 : stats.getReply();
    }

    public final int getReprint() {
        return this.reprint;
    }

    @Nullable
    public final Stats getStats() {
        return this.stats;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSummary() {
        return TextUtils.isEmpty(getSummary()) ? "-" : getSummary();
    }

    @Nullable
    public final List<Tags> getTags() {
        return this.tags;
    }

    public final int getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getTitle() {
        String string;
        if (TextUtils.isEmpty(getTitle())) {
            string = "-";
        } else {
            String strA = Cp.b.a("\n", getTitle(), "");
            int length = strA.length() - 1;
            int i7 = 0;
            boolean z6 = false;
            while (i7 <= length) {
                boolean z7 = Intrinsics.compare(strA.charAt(!z6 ? i7 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    }
                    length--;
                } else if (z7) {
                    i7++;
                } else {
                    z6 = true;
                }
            }
            string = strA.subSequence(i7, length + 1).toString();
        }
        return string;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public final int getViewCount() {
        Stats stats = this.stats;
        return stats == null ? 0 : stats.getView();
    }

    @Nullable
    public final String getViewUrl() {
        return this.viewUrl;
    }

    public int hashCode() {
        return (int) this.id;
    }

    public final boolean isAllowCopy() {
        boolean z6 = true;
        if (this.reprint != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isMe(@Nullable Context context) {
        long authorMid = getAuthorMid();
        return authorMid != 0 && authorMid == BiliAccounts.get(context).mid();
    }

    public final boolean isMyLike() {
        boolean z6 = true;
        if (this.likeState != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setAuthor(@Nullable Author author) {
        this.author = author;
    }

    public final void setBannerUrl(@Nullable String str) {
        this.bannerUrl = str;
    }

    public final void setCTime(long j7) {
        this.cTime = j7;
    }

    public final void setCategories(@Nullable List<Category> list) {
        this.categories = list;
    }

    public final void setCategory(@Nullable Category category) {
        this.category = category;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFavoriteTime(long j7) {
        this.favoriteTime = j7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setImageUrls(@Nullable List<String> list) {
        this.imageUrls = list;
    }

    public final void setLikeState(int i7) {
        this.likeState = i7;
    }

    public final void setList(@Nullable ArticleList articleList) {
        this.list = articleList;
    }

    public final void setPublicTime(long j7) {
        this.publicTime = j7;
    }

    public final void setRec(boolean z6) {
        this.rec = z6;
    }

    public final void setRecImage(@Nullable String str) {
        this.recImage = str;
    }

    public final void setRectText(@Nullable String str) {
        this.rectText = str;
    }

    public final void setReprint(int i7) {
        this.reprint = i7;
    }

    public final void setStats(@Nullable Stats stats) {
        this.stats = stats;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setSummary(@Nullable String str) {
        this.summary = str;
    }

    public final void setTags(@Nullable List<Tags> list) {
        this.tags = list;
    }

    public final void setTemplateId(int i7) {
        this.templateId = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    public final void setViewUrl(@Nullable String str) {
        this.viewUrl = str;
    }

    @NotNull
    public String toString() {
        Category category = this.category;
        String title = getTitle();
        String summary = getSummary();
        String str = this.bannerUrl;
        int i7 = this.templateId;
        int i8 = this.status;
        Author author = this.author;
        int i9 = this.reprint;
        List<String> list = this.imageUrls;
        long j7 = this.publicTime;
        long j8 = this.cTime;
        long j9 = this.favoriteTime;
        Stats stats = this.stats;
        StringBuilder sb = new StringBuilder("Article{category=");
        sb.append(category);
        sb.append(", title='");
        sb.append(title);
        sb.append("', summary='");
        B.a(summary, "', bannerUrl='", str, "', templateId=", sb);
        C4690e.a(i7, i8, ", status=", ", author=", sb);
        sb.append(author);
        sb.append(", reprint=");
        sb.append(i9);
        sb.append(", imageUrls=");
        sb.append(list);
        sb.append(", publicTime=");
        sb.append(j7);
        J1.z.a(j8, ", cTime=", ", favoriteTime", sb);
        sb.append(j9);
        sb.append(", stats=");
        sb.append(stats);
        sb.append(ReporterMap.RIGHT_BRACES);
        return sb.toString();
    }
}
