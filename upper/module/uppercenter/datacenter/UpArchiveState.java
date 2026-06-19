package com.bilibili.upper.module.uppercenter.datacenter;

import G0.b;
import G0.d;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/UpArchiveState.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UpArchiveState {
    public static final int $stable = 8;

    @JSONField(name = "count")
    private long count;

    @JSONField(name = "count_str")
    @Nullable
    private String countStr;

    @JSONField(name = "stat_url")
    @Nullable
    private String dataUrl;

    @JSONField(name = "screen")
    private int screen;

    @JSONField(name = "show_type")
    @Nullable
    private Integer showType;

    @JSONField(name = "tip")
    @Nullable
    private String tip;

    @JSONField(name = "tip_url")
    @Nullable
    private String tipUrl;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "unit")
    @Nullable
    private String unit;

    @JSONField(name = "word")
    @Nullable
    private String word;

    public UpArchiveState() {
        this(null, null, 0L, null, null, null, null, null, null, 0, 1023, null);
    }

    public UpArchiveState(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, int i7) {
        this.title = str;
        this.word = str2;
        this.count = j7;
        this.countStr = str3;
        this.unit = str4;
        this.tip = str5;
        this.tipUrl = str6;
        this.dataUrl = str7;
        this.showType = num;
        this.screen = i7;
    }

    public /* synthetic */ UpArchiveState(String str, String str2, long j7, String str3, String str4, String str5, String str6, String str7, Integer num, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? 0L : j7, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : str5, (i8 & 64) != 0 ? null : str6, (i8 & 128) != 0 ? null : str7, (i8 & 256) != 0 ? null : num, (i8 & 512) != 0 ? 1 : i7);
    }

    public static /* synthetic */ UpArchiveState copy$default(UpArchiveState upArchiveState, String str, String str2, long j7, String str3, String str4, String str5, String str6, String str7, Integer num, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = upArchiveState.title;
        }
        if ((i8 & 2) != 0) {
            str2 = upArchiveState.word;
        }
        if ((i8 & 4) != 0) {
            j7 = upArchiveState.count;
        }
        if ((i8 & 8) != 0) {
            str3 = upArchiveState.countStr;
        }
        if ((i8 & 16) != 0) {
            str4 = upArchiveState.unit;
        }
        if ((i8 & 32) != 0) {
            str5 = upArchiveState.tip;
        }
        if ((i8 & 64) != 0) {
            str6 = upArchiveState.tipUrl;
        }
        if ((i8 & 128) != 0) {
            str7 = upArchiveState.dataUrl;
        }
        if ((i8 & 256) != 0) {
            num = upArchiveState.showType;
        }
        if ((i8 & 512) != 0) {
            i7 = upArchiveState.screen;
        }
        return upArchiveState.copy(str, str2, j7, str3, str4, str5, str6, str7, num, i7);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final int component10() {
        return this.screen;
    }

    @Nullable
    public final String component2() {
        return this.word;
    }

    public final long component3() {
        return this.count;
    }

    @Nullable
    public final String component4() {
        return this.countStr;
    }

    @Nullable
    public final String component5() {
        return this.unit;
    }

    @Nullable
    public final String component6() {
        return this.tip;
    }

    @Nullable
    public final String component7() {
        return this.tipUrl;
    }

    @Nullable
    public final String component8() {
        return this.dataUrl;
    }

    @Nullable
    public final Integer component9() {
        return this.showType;
    }

    @NotNull
    public final UpArchiveState copy(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, int i7) {
        return new UpArchiveState(str, str2, j7, str3, str4, str5, str6, str7, num, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpArchiveState)) {
            return false;
        }
        UpArchiveState upArchiveState = (UpArchiveState) obj;
        return Intrinsics.areEqual(this.title, upArchiveState.title) && Intrinsics.areEqual(this.word, upArchiveState.word) && this.count == upArchiveState.count && Intrinsics.areEqual(this.countStr, upArchiveState.countStr) && Intrinsics.areEqual(this.unit, upArchiveState.unit) && Intrinsics.areEqual(this.tip, upArchiveState.tip) && Intrinsics.areEqual(this.tipUrl, upArchiveState.tipUrl) && Intrinsics.areEqual(this.dataUrl, upArchiveState.dataUrl) && Intrinsics.areEqual(this.showType, upArchiveState.showType) && this.screen == upArchiveState.screen;
    }

    public final long getCount() {
        return this.count;
    }

    @Nullable
    public final String getCountStr() {
        return this.countStr;
    }

    @Nullable
    public final String getDataUrl() {
        return this.dataUrl;
    }

    public final int getScreen() {
        return this.screen;
    }

    @Nullable
    public final Integer getShowType() {
        return this.showType;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    public final String getTipUrl() {
        return this.tipUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.word;
        int iA = C3554n0.a(((iHashCode2 * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.count);
        String str3 = this.countStr;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.unit;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tip;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tipUrl;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.dataUrl;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Integer num = this.showType;
        if (num != null) {
            iHashCode = num.hashCode();
        }
        return Integer.hashCode(this.screen) + ((((((((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31);
    }

    public final void setCount(long j7) {
        this.count = j7;
    }

    public final void setCountStr(@Nullable String str) {
        this.countStr = str;
    }

    public final void setDataUrl(@Nullable String str) {
        this.dataUrl = str;
    }

    public final void setScreen(int i7) {
        this.screen = i7;
    }

    public final void setShowType(@Nullable Integer num) {
        this.showType = num;
    }

    public final void setTip(@Nullable String str) {
        this.tip = str;
    }

    public final void setTipUrl(@Nullable String str) {
        this.tipUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    public final void setWord(@Nullable String str) {
        this.word = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.word;
        long j7 = this.count;
        String str3 = this.countStr;
        String str4 = this.unit;
        String str5 = this.tip;
        String str6 = this.tipUrl;
        String str7 = this.dataUrl;
        Integer num = this.showType;
        int i7 = this.screen;
        StringBuilder sbA = b.a("UpArchiveState(title=", str, ", word=", str2, ", count=");
        d.a(j7, ", countStr=", str3, sbA);
        B.a(", unit=", str4, ", tip=", str5, sbA);
        B.a(", tipUrl=", str6, ", dataUrl=", str7, sbA);
        sbA.append(", showType=");
        sbA.append(num);
        sbA.append(", screen=");
        sbA.append(i7);
        sbA.append(")");
        return sbA.toString();
    }
}
