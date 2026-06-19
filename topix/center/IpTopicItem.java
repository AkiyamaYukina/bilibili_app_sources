package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/IpTopicItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class IpTopicItem implements n {
    public static final int $stable = 8;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @JSONField(name = "description")
    @Nullable
    private String description;

    @JSONField(name = "description_content")
    @Nullable
    private String descriptionContent;

    @JSONField(name = "description_subject")
    @Nullable
    private String descriptionSubject;

    @JSONField(name = "dynamics_text")
    @Nullable
    private String dynText;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "is_fav")
    private boolean isFav;

    @JSONField(name = "jump_url")
    @Nullable
    private String jumpUrl;

    @JSONField(name = "name")
    @Nullable
    private String name;
    private int pos;

    @JSONField(name = "rcmd_icon_url")
    @Nullable
    private String rcmdIconUrl;

    @JSONField(name = "rcmd_text")
    @Nullable
    private String rcmdText;

    @JSONField(name = "server_info")
    @Nullable
    private String serverInfo;

    public IpTopicItem() {
        this(0L, null, null, null, null, null, null, null, null, false, null, null, 4095, null);
    }

    public IpTopicItem(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, boolean z6, @Nullable String str9, @Nullable String str10) {
        this.id = j7;
        this.name = str;
        this.dynText = str2;
        this.jumpUrl = str3;
        this.rcmdText = str4;
        this.rcmdIconUrl = str5;
        this.description = str6;
        this.serverInfo = str7;
        this.cover = str8;
        this.isFav = z6;
        this.descriptionContent = str9;
        this.descriptionSubject = str10;
    }

    public /* synthetic */ IpTopicItem(long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z6, String str9, String str10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : str6, (i7 & 128) != 0 ? null : str7, (i7 & 256) != 0 ? null : str8, (i7 & 512) != 0 ? false : z6, (i7 & 1024) != 0 ? null : str9, (i7 & 2048) != 0 ? null : str10);
    }

    public static /* synthetic */ IpTopicItem copy$default(IpTopicItem ipTopicItem, long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z6, String str9, String str10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = ipTopicItem.id;
        }
        if ((i7 & 2) != 0) {
            str = ipTopicItem.name;
        }
        if ((i7 & 4) != 0) {
            str2 = ipTopicItem.dynText;
        }
        if ((i7 & 8) != 0) {
            str3 = ipTopicItem.jumpUrl;
        }
        if ((i7 & 16) != 0) {
            str4 = ipTopicItem.rcmdText;
        }
        if ((i7 & 32) != 0) {
            str5 = ipTopicItem.rcmdIconUrl;
        }
        if ((i7 & 64) != 0) {
            str6 = ipTopicItem.description;
        }
        if ((i7 & 128) != 0) {
            str7 = ipTopicItem.serverInfo;
        }
        if ((i7 & 256) != 0) {
            str8 = ipTopicItem.cover;
        }
        if ((i7 & 512) != 0) {
            z6 = ipTopicItem.isFav;
        }
        if ((i7 & 1024) != 0) {
            str9 = ipTopicItem.descriptionContent;
        }
        if ((i7 & 2048) != 0) {
            str10 = ipTopicItem.descriptionSubject;
        }
        return ipTopicItem.copy(j7, str, str2, str3, str4, str5, str6, str7, str8, z6, str9, str10);
    }

    public final long component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isFav;
    }

    @Nullable
    public final String component11() {
        return this.descriptionContent;
    }

    @Nullable
    public final String component12() {
        return this.descriptionSubject;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.dynText;
    }

    @Nullable
    public final String component4() {
        return this.jumpUrl;
    }

    @Nullable
    public final String component5() {
        return this.rcmdText;
    }

    @Nullable
    public final String component6() {
        return this.rcmdIconUrl;
    }

    @Nullable
    public final String component7() {
        return this.description;
    }

    @Nullable
    public final String component8() {
        return this.serverInfo;
    }

    @Nullable
    public final String component9() {
        return this.cover;
    }

    @NotNull
    public final IpTopicItem copy(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, boolean z6, @Nullable String str9, @Nullable String str10) {
        return new IpTopicItem(j7, str, str2, str3, str4, str5, str6, str7, str8, z6, str9, str10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IpTopicItem)) {
            return false;
        }
        IpTopicItem ipTopicItem = (IpTopicItem) obj;
        return this.id == ipTopicItem.id && Intrinsics.areEqual(this.name, ipTopicItem.name) && Intrinsics.areEqual(this.dynText, ipTopicItem.dynText) && Intrinsics.areEqual(this.jumpUrl, ipTopicItem.jumpUrl) && Intrinsics.areEqual(this.rcmdText, ipTopicItem.rcmdText) && Intrinsics.areEqual(this.rcmdIconUrl, ipTopicItem.rcmdIconUrl) && Intrinsics.areEqual(this.description, ipTopicItem.description) && Intrinsics.areEqual(this.serverInfo, ipTopicItem.serverInfo) && Intrinsics.areEqual(this.cover, ipTopicItem.cover) && this.isFav == ipTopicItem.isFav && Intrinsics.areEqual(this.descriptionContent, ipTopicItem.descriptionContent) && Intrinsics.areEqual(this.descriptionSubject, ipTopicItem.descriptionSubject);
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDescriptionContent() {
        return this.descriptionContent;
    }

    @Nullable
    public final String getDescriptionSubject() {
        return this.descriptionSubject;
    }

    @Nullable
    public final String getDynText() {
        return this.dynText;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPos() {
        return this.pos;
    }

    @Nullable
    public final String getRcmdIconUrl() {
        return this.rcmdIconUrl;
    }

    @Nullable
    public final String getRcmdText() {
        return this.rcmdText;
    }

    @Nullable
    public final String getServerInfo() {
        return this.serverInfo;
    }

    @Override // com.bilibili.topix.center.n
    @NotNull
    public TopixCenterItemType getType() {
        return TopixCenterItemType.TOPIC_IP;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.dynText;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.jumpUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.rcmdText;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rcmdIconUrl;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.description;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.serverInfo;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.cover;
        int iA = androidx.compose.animation.z.a(((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.isFav);
        String str9 = this.descriptionContent;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.descriptionSubject;
        return ((iA + iHashCode9) * 31) + (str10 == null ? 0 : str10.hashCode());
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDescriptionContent(@Nullable String str) {
        this.descriptionContent = str;
    }

    public final void setDescriptionSubject(@Nullable String str) {
        this.descriptionSubject = str;
    }

    public final void setDynText(@Nullable String str) {
        this.dynText = str;
    }

    public final void setFav(boolean z6) {
        this.isFav = z6;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPos(int i7) {
        this.pos = i7;
    }

    public final void setRcmdIconUrl(@Nullable String str) {
        this.rcmdIconUrl = str;
    }

    public final void setRcmdText(@Nullable String str) {
        this.rcmdText = str;
    }

    public final void setServerInfo(@Nullable String str) {
        this.serverInfo = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.name;
        String str2 = this.dynText;
        String str3 = this.jumpUrl;
        String str4 = this.rcmdText;
        String str5 = this.rcmdIconUrl;
        String str6 = this.description;
        String str7 = this.serverInfo;
        String str8 = this.cover;
        boolean z6 = this.isFav;
        String str9 = this.descriptionContent;
        String str10 = this.descriptionSubject;
        StringBuilder sbA = com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(j7, "IpTopicItem(id=", ", name=", str);
        androidx.room.B.a(", dynText=", str2, ", jumpUrl=", str3, sbA);
        androidx.room.B.a(", rcmdText=", str4, ", rcmdIconUrl=", str5, sbA);
        androidx.room.B.a(", description=", str6, ", serverInfo=", str7, sbA);
        cf.n.a(", cover=", str8, ", isFav=", sbA, z6);
        androidx.room.B.a(", descriptionContent=", str9, ", descriptionSubject=", str10, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
