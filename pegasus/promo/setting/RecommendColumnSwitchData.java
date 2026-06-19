package com.bilibili.pegasus.promo.setting;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/RecommendColumnSwitchData.class */
@StabilityInferred(parameters = 1)
@Keep
public final class RecommendColumnSwitchData {
    public static final int $stable = 0;

    @SerializedName("double_column_item_title")
    @Nullable
    private final String doubleColumnItemTitle;

    @SerializedName("enable_entry")
    private final int enableEntry;

    @SerializedName("single_column_item_title")
    @Nullable
    private final String singleColumnItemTitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    public RecommendColumnSwitchData() {
        this(0, null, null, null, 15, null);
    }

    public RecommendColumnSwitchData(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.enableEntry = i7;
        this.title = str;
        this.doubleColumnItemTitle = str2;
        this.singleColumnItemTitle = str3;
    }

    public /* synthetic */ RecommendColumnSwitchData(int i7, String str, String str2, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ RecommendColumnSwitchData copy$default(RecommendColumnSwitchData recommendColumnSwitchData, int i7, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = recommendColumnSwitchData.enableEntry;
        }
        if ((i8 & 2) != 0) {
            str = recommendColumnSwitchData.title;
        }
        if ((i8 & 4) != 0) {
            str2 = recommendColumnSwitchData.doubleColumnItemTitle;
        }
        if ((i8 & 8) != 0) {
            str3 = recommendColumnSwitchData.singleColumnItemTitle;
        }
        return recommendColumnSwitchData.copy(i7, str, str2, str3);
    }

    public final int component1() {
        return this.enableEntry;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.doubleColumnItemTitle;
    }

    @Nullable
    public final String component4() {
        return this.singleColumnItemTitle;
    }

    @NotNull
    public final RecommendColumnSwitchData copy(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new RecommendColumnSwitchData(i7, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendColumnSwitchData)) {
            return false;
        }
        RecommendColumnSwitchData recommendColumnSwitchData = (RecommendColumnSwitchData) obj;
        return this.enableEntry == recommendColumnSwitchData.enableEntry && Intrinsics.areEqual(this.title, recommendColumnSwitchData.title) && Intrinsics.areEqual(this.doubleColumnItemTitle, recommendColumnSwitchData.doubleColumnItemTitle) && Intrinsics.areEqual(this.singleColumnItemTitle, recommendColumnSwitchData.singleColumnItemTitle);
    }

    @Nullable
    public final String getDoubleColumnItemTitle() {
        return this.doubleColumnItemTitle;
    }

    public final int getEnableEntry() {
        return this.enableEntry;
    }

    @Nullable
    public final String getSingleColumnItemTitle() {
        return this.singleColumnItemTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.enableEntry);
        String str = this.title;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.doubleColumnItemTitle;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.singleColumnItemTitle;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    @NotNull
    public String toString() {
        return A.a(this.doubleColumnItemTitle, ", singleColumnItemTitle=", this.singleColumnItemTitle, ")", bilibili.live.app.service.resolver.a.b(this.enableEntry, "RecommendColumnSwitchData(enableEntry=", ", title=", this.title, ", doubleColumnItemTitle="));
    }
}
