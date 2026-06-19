package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.p;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/AvItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class AvItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "cover_badge")
    @Nullable
    private Tag coverBadge;

    @JSONField(name = "ctime")
    @Nullable
    private Integer ctime;

    @JSONField(name = "ctime_label")
    @Nullable
    private String ctimeLabel;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    @Nullable
    private String duration;

    @JSONField(name = "icon_type")
    private int iconType;

    @JSONField(name = "is_iaa_video")
    @Nullable
    private Integer isIaaVideo;

    @JSONField(name = "is_inline")
    private boolean isInline;

    @JSONField(name = "play")
    @Nullable
    private Integer play;

    @JSONField(name = "view_content")
    @Nullable
    private String viewContent;

    public AvItem() {
        this(null, null, null, null, null, 0, false, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    public AvItem(@NotNull com.bapis.bilibili.polymer.app.search.v1.AvItem avItem, @Nullable String str) {
        this(null, null, null, null, null, 0, false, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
        this.ctime = Integer.valueOf(avItem.getCtime());
        this.ctimeLabel = avItem.getCtimeLabel();
        this.duration = avItem.getDuration();
        this.play = Integer.valueOf(avItem.getPlay());
        setTitle(avItem.getTitle());
        setCover(avItem.getCover());
        setParam(avItem.getParam());
        setUri(avItem.getUri());
        setGoTo(avItem.getGoto());
        setServerPagePos(avItem.getPosition());
        setTrackId(str);
        this.viewContent = avItem.getViewContent();
        this.iconType = avItem.getIconType();
        this.isInline = avItem.getIsInline();
        if (avItem.hasCoverBadge()) {
            this.coverBadge = new Tag(avItem.getCoverBadge());
        }
        this.isIaaVideo = Integer.valueOf(avItem.getIsIaaVideo());
    }

    public AvItem(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, int i7, boolean z6, @Nullable Tag tag, @Nullable Integer num3) {
        this.ctime = num;
        this.ctimeLabel = str;
        this.duration = str2;
        this.play = num2;
        this.viewContent = str3;
        this.iconType = i7;
        this.isInline = z6;
        this.coverBadge = tag;
        this.isIaaVideo = num3;
    }

    public /* synthetic */ AvItem(Integer num, String str, String str2, Integer num2, String str3, int i7, boolean z6, Tag tag, Integer num3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : num, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) == 0 ? num2 : 0, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? 0 : i7, (i8 & 64) != 0 ? false : z6, (i8 & 128) != 0 ? null : tag, (i8 & 256) != 0 ? null : num3);
    }

    public static /* synthetic */ AvItem copy$default(AvItem avItem, Integer num, String str, String str2, Integer num2, String str3, int i7, boolean z6, Tag tag, Integer num3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = avItem.ctime;
        }
        if ((i8 & 2) != 0) {
            str = avItem.ctimeLabel;
        }
        if ((i8 & 4) != 0) {
            str2 = avItem.duration;
        }
        if ((i8 & 8) != 0) {
            num2 = avItem.play;
        }
        if ((i8 & 16) != 0) {
            str3 = avItem.viewContent;
        }
        if ((i8 & 32) != 0) {
            i7 = avItem.iconType;
        }
        if ((i8 & 64) != 0) {
            z6 = avItem.isInline;
        }
        if ((i8 & 128) != 0) {
            tag = avItem.coverBadge;
        }
        if ((i8 & 256) != 0) {
            num3 = avItem.isIaaVideo;
        }
        return avItem.copy(num, str, str2, num2, str3, i7, z6, tag, num3);
    }

    @Nullable
    public final Integer component1() {
        return this.ctime;
    }

    @Nullable
    public final String component2() {
        return this.ctimeLabel;
    }

    @Nullable
    public final String component3() {
        return this.duration;
    }

    @Nullable
    public final Integer component4() {
        return this.play;
    }

    @Nullable
    public final String component5() {
        return this.viewContent;
    }

    public final int component6() {
        return this.iconType;
    }

    public final boolean component7() {
        return this.isInline;
    }

    @Nullable
    public final Tag component8() {
        return this.coverBadge;
    }

    @Nullable
    public final Integer component9() {
        return this.isIaaVideo;
    }

    @NotNull
    public final AvItem copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, int i7, boolean z6, @Nullable Tag tag, @Nullable Integer num3) {
        return new AvItem(num, str, str2, num2, str3, i7, z6, tag, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvItem)) {
            return false;
        }
        AvItem avItem = (AvItem) obj;
        return Intrinsics.areEqual(this.ctime, avItem.ctime) && Intrinsics.areEqual(this.ctimeLabel, avItem.ctimeLabel) && Intrinsics.areEqual(this.duration, avItem.duration) && Intrinsics.areEqual(this.play, avItem.play) && Intrinsics.areEqual(this.viewContent, avItem.viewContent) && this.iconType == avItem.iconType && this.isInline == avItem.isInline && Intrinsics.areEqual(this.coverBadge, avItem.coverBadge) && Intrinsics.areEqual(this.isIaaVideo, avItem.isIaaVideo);
    }

    @Nullable
    public final Tag getCoverBadge() {
        return this.coverBadge;
    }

    @Nullable
    public final Integer getCtime() {
        return this.ctime;
    }

    @Nullable
    public final String getCtimeLabel() {
        return this.ctimeLabel;
    }

    @Nullable
    public final String getDuration() {
        return this.duration;
    }

    public final int getIconType() {
        return this.iconType;
    }

    @Nullable
    public final Integer getPlay() {
        return this.play;
    }

    @Nullable
    public final String getViewContent() {
        return this.viewContent;
    }

    public int hashCode() {
        Integer num = this.ctime;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.ctimeLabel;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.duration;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.play;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.viewContent;
        int iA = z.a(I.a(this.iconType, ((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.isInline);
        Tag tag = this.coverBadge;
        int iHashCode5 = tag == null ? 0 : tag.hashCode();
        Integer num3 = this.isIaaVideo;
        return ((iA + iHashCode5) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    @Nullable
    public final Integer isIaaVideo() {
        return this.isIaaVideo;
    }

    public final boolean isInline() {
        return this.isInline;
    }

    public final void setCoverBadge(@Nullable Tag tag) {
        this.coverBadge = tag;
    }

    public final void setCtime(@Nullable Integer num) {
        this.ctime = num;
    }

    public final void setCtimeLabel(@Nullable String str) {
        this.ctimeLabel = str;
    }

    public final void setDuration(@Nullable String str) {
        this.duration = str;
    }

    public final void setIaaVideo(@Nullable Integer num) {
        this.isIaaVideo = num;
    }

    public final void setIconType(int i7) {
        this.iconType = i7;
    }

    public final void setInline(boolean z6) {
        this.isInline = z6;
    }

    public final void setPlay(@Nullable Integer num) {
        this.play = num;
    }

    public final void setViewContent(@Nullable String str) {
        this.viewContent = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.ctime;
        String str = this.ctimeLabel;
        String str2 = this.duration;
        Integer num2 = this.play;
        String str3 = this.viewContent;
        int i7 = this.iconType;
        boolean z6 = this.isInline;
        Tag tag = this.coverBadge;
        Integer num3 = this.isIaaVideo;
        StringBuilder sbB = androidx.fragment.app.z.b("AvItem(ctime=", num, ", ctimeLabel=", str, ", duration=");
        p.a(num2, str2, ", play=", ", viewContent=", sbB);
        H0.e.b(i7, str3, ", iconType=", ", isInline=", sbB);
        sbB.append(z6);
        sbB.append(", coverBadge=");
        sbB.append(tag);
        sbB.append(", isIaaVideo=");
        return e4.c.a(sbB, num3, ")");
    }
}
