package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.util.C4638g;
import androidx.room.B;
import cf.i;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.VideoTextItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/VideoTimeAxisItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class VideoTimeAxisItem {
    public static final int $stable = 8;
    private boolean hasClicked;
    private int hasImgUrl;

    @Nullable
    private String imgUrl;
    private boolean isExposed;

    @JSONField(name = "jump_url")
    @Nullable
    private String jumpUrl;

    @JSONField(name = "start_second")
    private long startSecond;

    @Nullable
    private String subModuleName;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @JSONField(name = "type")
    private int type;

    @Nullable
    private String videoTime;
    private int viewType;

    public VideoTimeAxisItem() {
        this(null, 0L, null, 0, false, false, null, null, null, 0, 0, 2047, null);
    }

    public VideoTimeAxisItem(@NotNull VideoTextItem videoTextItem) {
        this(null, 0L, null, 0, false, false, null, null, null, 0, 0, 2047, null);
        this.jumpUrl = videoTextItem.getJumpUrl();
        this.startSecond = videoTextItem.getStartSecond();
        this.text = videoTextItem.getText();
        this.type = videoTextItem.getType();
        this.imgUrl = videoTextItem.getImgUrl();
        this.videoTime = videoTextItem.getVideoTime();
    }

    public VideoTimeAxisItem(@Nullable String str, long j7, @Nullable String str2, int i7, boolean z6, boolean z7, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i8, int i9) {
        this.jumpUrl = str;
        this.startSecond = j7;
        this.text = str2;
        this.type = i7;
        this.hasClicked = z6;
        this.isExposed = z7;
        this.subModuleName = str3;
        this.imgUrl = str4;
        this.videoTime = str5;
        this.hasImgUrl = i8;
        this.viewType = i9;
    }

    public /* synthetic */ VideoTimeAxisItem(String str, long j7, String str2, int i7, boolean z6, boolean z7, String str3, String str4, String str5, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0L : j7, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? 0 : i7, (i10 & 16) != 0 ? false : z6, (i10 & 32) != 0 ? false : z7, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? 2 : i8, (i10 & 1024) != 0 ? 0 : i9);
    }

    public static /* synthetic */ VideoTimeAxisItem copy$default(VideoTimeAxisItem videoTimeAxisItem, String str, long j7, String str2, int i7, boolean z6, boolean z7, String str3, String str4, String str5, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = videoTimeAxisItem.jumpUrl;
        }
        if ((i10 & 2) != 0) {
            j7 = videoTimeAxisItem.startSecond;
        }
        if ((i10 & 4) != 0) {
            str2 = videoTimeAxisItem.text;
        }
        if ((i10 & 8) != 0) {
            i7 = videoTimeAxisItem.type;
        }
        if ((i10 & 16) != 0) {
            z6 = videoTimeAxisItem.hasClicked;
        }
        if ((i10 & 32) != 0) {
            z7 = videoTimeAxisItem.isExposed;
        }
        if ((i10 & 64) != 0) {
            str3 = videoTimeAxisItem.subModuleName;
        }
        if ((i10 & 128) != 0) {
            str4 = videoTimeAxisItem.imgUrl;
        }
        if ((i10 & 256) != 0) {
            str5 = videoTimeAxisItem.videoTime;
        }
        if ((i10 & 512) != 0) {
            i8 = videoTimeAxisItem.hasImgUrl;
        }
        if ((i10 & 1024) != 0) {
            i9 = videoTimeAxisItem.viewType;
        }
        return videoTimeAxisItem.copy(str, j7, str2, i7, z6, z7, str3, str4, str5, i8, i9);
    }

    @Nullable
    public final String component1() {
        return this.jumpUrl;
    }

    public final int component10() {
        return this.hasImgUrl;
    }

    public final int component11() {
        return this.viewType;
    }

    public final long component2() {
        return this.startSecond;
    }

    @Nullable
    public final String component3() {
        return this.text;
    }

    public final int component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.hasClicked;
    }

    public final boolean component6() {
        return this.isExposed;
    }

    @Nullable
    public final String component7() {
        return this.subModuleName;
    }

    @Nullable
    public final String component8() {
        return this.imgUrl;
    }

    @Nullable
    public final String component9() {
        return this.videoTime;
    }

    @NotNull
    public final VideoTimeAxisItem copy(@Nullable String str, long j7, @Nullable String str2, int i7, boolean z6, boolean z7, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i8, int i9) {
        return new VideoTimeAxisItem(str, j7, str2, i7, z6, z7, str3, str4, str5, i8, i9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTimeAxisItem)) {
            return false;
        }
        VideoTimeAxisItem videoTimeAxisItem = (VideoTimeAxisItem) obj;
        return Intrinsics.areEqual(this.jumpUrl, videoTimeAxisItem.jumpUrl) && this.startSecond == videoTimeAxisItem.startSecond && Intrinsics.areEqual(this.text, videoTimeAxisItem.text) && this.type == videoTimeAxisItem.type && this.hasClicked == videoTimeAxisItem.hasClicked && this.isExposed == videoTimeAxisItem.isExposed && Intrinsics.areEqual(this.subModuleName, videoTimeAxisItem.subModuleName) && Intrinsics.areEqual(this.imgUrl, videoTimeAxisItem.imgUrl) && Intrinsics.areEqual(this.videoTime, videoTimeAxisItem.videoTime) && this.hasImgUrl == videoTimeAxisItem.hasImgUrl && this.viewType == videoTimeAxisItem.viewType;
    }

    public final boolean getHasClicked() {
        return this.hasClicked;
    }

    public final int getHasImgUrl() {
        return this.hasImgUrl;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final long getStartSecond() {
        return this.startSecond;
    }

    @Nullable
    public final String getSubModuleName() {
        return this.subModuleName;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getVideoTime() {
        return this.videoTime;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public final boolean hasImage() {
        boolean z6 = true;
        if (this.hasImgUrl != 1) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        String str = this.jumpUrl;
        int iHashCode = 0;
        int iA = C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.startSecond);
        String str2 = this.text;
        int iA2 = z.a(z.a(I.a(this.type, (iA + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.hasClicked), 31, this.isExposed);
        String str3 = this.subModuleName;
        int iHashCode2 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.imgUrl;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.videoTime;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return Integer.hashCode(this.viewType) + I.a(this.hasImgUrl, (((((iA2 + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31, 31);
    }

    public final boolean isExposed() {
        return this.isExposed;
    }

    public final void setExposed(boolean z6) {
        this.isExposed = z6;
    }

    public final void setHasClicked(boolean z6) {
        this.hasClicked = z6;
    }

    public final void setHasImgUrl(int i7) {
        this.hasImgUrl = i7;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setStartSecond(long j7) {
        this.startSecond = j7;
    }

    public final void setSubModuleName(@Nullable String str) {
        this.subModuleName = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setVideoTime(@Nullable String str) {
        this.videoTime = str;
    }

    public final void setViewType(int i7) {
        this.viewType = i7;
    }

    @NotNull
    public String toString() {
        String str = this.jumpUrl;
        long j7 = this.startSecond;
        String str2 = this.text;
        int i7 = this.type;
        boolean z6 = this.hasClicked;
        boolean z7 = this.isExposed;
        String str3 = this.subModuleName;
        String str4 = this.imgUrl;
        String str5 = this.videoTime;
        int i8 = this.hasImgUrl;
        int i9 = this.viewType;
        StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(j7, "VideoTimeAxisItem(jumpUrl=", str, ", startSecond=");
        bf.a.a(i7, ", text=", str2, ", type=", sbA);
        C4638g.b(", hasClicked=", ", isExposed=", sbA, z6, z7);
        B.a(", subModuleName=", str3, ", imgUrl=", str4, sbA);
        bf.a.a(i8, ", videoTime=", str5, ", hasImgUrl=", sbA);
        return i.a(i9, ", viewType=", ")", sbA);
    }
}
