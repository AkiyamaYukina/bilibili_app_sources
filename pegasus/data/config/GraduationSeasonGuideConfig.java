package com.bilibili.pegasus.data.config;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.media3.exoplayer.C4690e;
import androidx.room.B;
import bilibili.live.app.service.resolver.a;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/GraduationSeasonGuideConfig.class */
@Keep
public final class GraduationSeasonGuideConfig {

    @SerializedName("display_count_all")
    private final int displayCountAll;

    @SerializedName("display_count_per_day")
    private final int displayCountPerDay;

    @SerializedName("duration_seconds")
    private final int durationSeconds;

    @SerializedName("icon_light")
    @Nullable
    private final String iconLight;

    @SerializedName("icon_night")
    @Nullable
    private final String iconNight;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("trigger_screen_count")
    private final int triggerScreenCount;

    public GraduationSeasonGuideConfig() {
        this(0, null, null, null, 0, 0, 0, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public GraduationSeasonGuideConfig(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, int i8, int i9, int i10) {
        this.triggerScreenCount = i7;
        this.iconLight = str;
        this.iconNight = str2;
        this.title = str3;
        this.durationSeconds = i8;
        this.displayCountPerDay = i9;
        this.displayCountAll = i10;
    }

    public /* synthetic */ GraduationSeasonGuideConfig(int i7, String str, String str2, String str3, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i7, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? 0 : i8, (i11 & 32) != 0 ? 0 : i9, (i11 & 64) != 0 ? 0 : i10);
    }

    public static /* synthetic */ GraduationSeasonGuideConfig copy$default(GraduationSeasonGuideConfig graduationSeasonGuideConfig, int i7, String str, String str2, String str3, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = graduationSeasonGuideConfig.triggerScreenCount;
        }
        if ((i11 & 2) != 0) {
            str = graduationSeasonGuideConfig.iconLight;
        }
        if ((i11 & 4) != 0) {
            str2 = graduationSeasonGuideConfig.iconNight;
        }
        if ((i11 & 8) != 0) {
            str3 = graduationSeasonGuideConfig.title;
        }
        if ((i11 & 16) != 0) {
            i8 = graduationSeasonGuideConfig.durationSeconds;
        }
        if ((i11 & 32) != 0) {
            i9 = graduationSeasonGuideConfig.displayCountPerDay;
        }
        if ((i11 & 64) != 0) {
            i10 = graduationSeasonGuideConfig.displayCountAll;
        }
        return graduationSeasonGuideConfig.copy(i7, str, str2, str3, i8, i9, i10);
    }

    public final int component1() {
        return this.triggerScreenCount;
    }

    @Nullable
    public final String component2() {
        return this.iconLight;
    }

    @Nullable
    public final String component3() {
        return this.iconNight;
    }

    @Nullable
    public final String component4() {
        return this.title;
    }

    public final int component5() {
        return this.durationSeconds;
    }

    public final int component6() {
        return this.displayCountPerDay;
    }

    public final int component7() {
        return this.displayCountAll;
    }

    @NotNull
    public final GraduationSeasonGuideConfig copy(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, int i8, int i9, int i10) {
        return new GraduationSeasonGuideConfig(i7, str, str2, str3, i8, i9, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraduationSeasonGuideConfig)) {
            return false;
        }
        GraduationSeasonGuideConfig graduationSeasonGuideConfig = (GraduationSeasonGuideConfig) obj;
        return this.triggerScreenCount == graduationSeasonGuideConfig.triggerScreenCount && Intrinsics.areEqual(this.iconLight, graduationSeasonGuideConfig.iconLight) && Intrinsics.areEqual(this.iconNight, graduationSeasonGuideConfig.iconNight) && Intrinsics.areEqual(this.title, graduationSeasonGuideConfig.title) && this.durationSeconds == graduationSeasonGuideConfig.durationSeconds && this.displayCountPerDay == graduationSeasonGuideConfig.displayCountPerDay && this.displayCountAll == graduationSeasonGuideConfig.displayCountAll;
    }

    public final int getDisplayCountAll() {
        return this.displayCountAll;
    }

    public final int getDisplayCountPerDay() {
        return this.displayCountPerDay;
    }

    public final int getDurationSeconds() {
        return this.durationSeconds;
    }

    @Nullable
    public final String getIconLight() {
        return this.iconLight;
    }

    @Nullable
    public final String getIconNight() {
        return this.iconNight;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getTriggerScreenCount() {
        return this.triggerScreenCount;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.triggerScreenCount);
        String str = this.iconLight;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.iconNight;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return Integer.hashCode(this.displayCountAll) + I.a(this.displayCountPerDay, I.a(this.durationSeconds, ((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i7 = this.triggerScreenCount;
        String str = this.iconLight;
        String str2 = this.iconNight;
        String str3 = this.title;
        int i8 = this.durationSeconds;
        int i9 = this.displayCountPerDay;
        int i10 = this.displayCountAll;
        StringBuilder sbB = a.b(i7, "GraduationSeasonGuideConfig(triggerScreenCount=", ", iconLight=", str, ", iconNight=");
        B.a(str2, ", title=", str3, ", durationSeconds=", sbB);
        C4690e.a(i8, i9, ", displayCountPerDay=", ", displayCountAll=", sbB);
        return C4277b.a(i10, ")", sbB);
    }
}
