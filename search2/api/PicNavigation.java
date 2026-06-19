package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/PicNavigation.class */
@StabilityInferred(parameters = 0)
@Keep
public final class PicNavigation {
    public static final int $stable = 8;

    @JSONField(name = "cover_night_url")
    @Nullable
    private String coverNightUrl;

    @JSONField(name = "cover_sun_url")
    @Nullable
    private String coverSunUrl;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    public PicNavigation() {
        this(null, null, null, null, 15, null);
    }

    public PicNavigation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.title = str;
        this.uri = str2;
        this.coverSunUrl = str3;
        this.coverNightUrl = str4;
    }

    public /* synthetic */ PicNavigation(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ PicNavigation copy$default(PicNavigation picNavigation, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = picNavigation.title;
        }
        if ((i7 & 2) != 0) {
            str2 = picNavigation.uri;
        }
        if ((i7 & 4) != 0) {
            str3 = picNavigation.coverSunUrl;
        }
        if ((i7 & 8) != 0) {
            str4 = picNavigation.coverNightUrl;
        }
        return picNavigation.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.uri;
    }

    @Nullable
    public final String component3() {
        return this.coverSunUrl;
    }

    @Nullable
    public final String component4() {
        return this.coverNightUrl;
    }

    @NotNull
    public final PicNavigation copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new PicNavigation(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PicNavigation)) {
            return false;
        }
        PicNavigation picNavigation = (PicNavigation) obj;
        return Intrinsics.areEqual(this.title, picNavigation.title) && Intrinsics.areEqual(this.uri, picNavigation.uri) && Intrinsics.areEqual(this.coverSunUrl, picNavigation.coverSunUrl) && Intrinsics.areEqual(this.coverNightUrl, picNavigation.coverNightUrl);
    }

    @Nullable
    public final String getCoverNightUrl() {
        return this.coverNightUrl;
    }

    @Nullable
    public final String getCoverSunUrl() {
        return this.coverSunUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.uri;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.coverSunUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.coverNightUrl;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setCoverNightUrl(@Nullable String str) {
        this.coverNightUrl = str;
    }

    public final void setCoverSunUrl(@Nullable String str) {
        this.coverSunUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.coverSunUrl, ", coverNightUrl=", this.coverNightUrl, ")", G0.b.a("PicNavigation(title=", this.title, ", uri=", this.uri, ", coverSunUrl="));
    }
}
