package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopicItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TopicItem implements n {
    public static final int $stable = 8;

    @JSONField(name = "description_content")
    @Nullable
    private String descriptionContent;

    @JSONField(name = "description_subject")
    @Nullable
    private String descriptionSubject;

    @JSONField(name = "id")
    private long id;

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

    @NotNull
    private transient TopixCenterItemType type;

    public TopicItem() {
        this(null, null, 0L, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    public TopicItem(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull TopixCenterItemType topixCenterItemType) {
        this.descriptionContent = str;
        this.descriptionSubject = str2;
        this.id = j7;
        this.jumpUrl = str3;
        this.name = str4;
        this.rcmdIconUrl = str5;
        this.rcmdText = str6;
        this.serverInfo = str7;
        this.type = topixCenterItemType;
    }

    public /* synthetic */ TopicItem(String str, String str2, long j7, String str3, String str4, String str5, String str6, String str7, TopixCenterItemType topixCenterItemType, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : j7, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : str6, (i7 & 128) != 0 ? null : str7, (i7 & 256) != 0 ? TopixCenterItemType.TOPIC_COMMON : topixCenterItemType);
    }

    private final TopixCenterItemType component9() {
        return this.type;
    }

    public static /* synthetic */ TopicItem copy$default(TopicItem topicItem, String str, String str2, long j7, String str3, String str4, String str5, String str6, String str7, TopixCenterItemType topixCenterItemType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = topicItem.descriptionContent;
        }
        if ((i7 & 2) != 0) {
            str2 = topicItem.descriptionSubject;
        }
        if ((i7 & 4) != 0) {
            j7 = topicItem.id;
        }
        if ((i7 & 8) != 0) {
            str3 = topicItem.jumpUrl;
        }
        if ((i7 & 16) != 0) {
            str4 = topicItem.name;
        }
        if ((i7 & 32) != 0) {
            str5 = topicItem.rcmdIconUrl;
        }
        if ((i7 & 64) != 0) {
            str6 = topicItem.rcmdText;
        }
        if ((i7 & 128) != 0) {
            str7 = topicItem.serverInfo;
        }
        if ((i7 & 256) != 0) {
            topixCenterItemType = topicItem.type;
        }
        return topicItem.copy(str, str2, j7, str3, str4, str5, str6, str7, topixCenterItemType);
    }

    @Nullable
    public final String component1() {
        return this.descriptionContent;
    }

    @Nullable
    public final String component2() {
        return this.descriptionSubject;
    }

    public final long component3() {
        return this.id;
    }

    @Nullable
    public final String component4() {
        return this.jumpUrl;
    }

    @Nullable
    public final String component5() {
        return this.name;
    }

    @Nullable
    public final String component6() {
        return this.rcmdIconUrl;
    }

    @Nullable
    public final String component7() {
        return this.rcmdText;
    }

    @Nullable
    public final String component8() {
        return this.serverInfo;
    }

    @NotNull
    public final TopicItem copy(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull TopixCenterItemType topixCenterItemType) {
        return new TopicItem(str, str2, j7, str3, str4, str5, str6, str7, topixCenterItemType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(TopicItem.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        TopicItem topicItem = (TopicItem) obj;
        return Intrinsics.areEqual(this.descriptionContent, topicItem.descriptionContent) && Intrinsics.areEqual(this.descriptionSubject, topicItem.descriptionSubject) && this.id == topicItem.id && Intrinsics.areEqual(this.jumpUrl, topicItem.jumpUrl) && Intrinsics.areEqual(this.name, topicItem.name) && Intrinsics.areEqual(this.rcmdIconUrl, topicItem.rcmdIconUrl) && Intrinsics.areEqual(this.rcmdText, topicItem.rcmdText) && Intrinsics.areEqual(this.serverInfo, topicItem.serverInfo);
    }

    @Nullable
    public final String getDescriptionContent() {
        return this.descriptionContent;
    }

    @Nullable
    public final String getDescriptionSubject() {
        return this.descriptionSubject;
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
        return this.type;
    }

    public int hashCode() {
        String str = this.descriptionContent;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.descriptionSubject;
        int iA = C3554n0.a(((iHashCode2 * 31) + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.id);
        String str3 = this.jumpUrl;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.name;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.rcmdIconUrl;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.rcmdText;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.serverInfo;
        if (str7 != null) {
            iHashCode = str7.hashCode();
        }
        return ((((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public final void setDescriptionContent(@Nullable String str) {
        this.descriptionContent = str;
    }

    public final void setDescriptionSubject(@Nullable String str) {
        this.descriptionSubject = str;
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

    public final void setType(@NotNull TopixCenterItemType topixCenterItemType) {
        this.type = topixCenterItemType;
    }

    @NotNull
    public String toString() {
        String str = this.descriptionContent;
        String str2 = this.descriptionSubject;
        long j7 = this.id;
        String str3 = this.jumpUrl;
        String str4 = this.name;
        String str5 = this.rcmdIconUrl;
        String str6 = this.rcmdText;
        String str7 = this.serverInfo;
        TopixCenterItemType topixCenterItemType = this.type;
        StringBuilder sbA = G0.b.a("TopicItem(descriptionContent=", str, ", descriptionSubject=", str2, ", id=");
        G0.d.a(j7, ", jumpUrl=", str3, sbA);
        androidx.room.B.a(", name=", str4, ", rcmdIconUrl=", str5, sbA);
        androidx.room.B.a(", rcmdText=", str6, ", serverInfo=", str7, sbA);
        sbA.append(", type=");
        sbA.append(topixCenterItemType);
        sbA.append(")");
        return sbA.toString();
    }
}
