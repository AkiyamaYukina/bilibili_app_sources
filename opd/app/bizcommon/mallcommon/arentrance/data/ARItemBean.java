package com.bilibili.opd.app.bizcommon.mallcommon.arentrance.data;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mallcommon/arentrance/data/ARItemBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ARItemBean {
    public static final int $stable = 8;

    @Nullable
    private String imageUrl;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String modName;

    @Nullable
    private String tagName;

    @Nullable
    private String title;

    public ARItemBean() {
        this(null, null, null, null, null, 31, null);
    }

    public ARItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.tagName = str2;
        this.imageUrl = str3;
        this.jumpUrl = str4;
        this.modName = str5;
    }

    public /* synthetic */ ARItemBean(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ ARItemBean copy$default(ARItemBean aRItemBean, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = aRItemBean.title;
        }
        if ((i7 & 2) != 0) {
            str2 = aRItemBean.tagName;
        }
        if ((i7 & 4) != 0) {
            str3 = aRItemBean.imageUrl;
        }
        if ((i7 & 8) != 0) {
            str4 = aRItemBean.jumpUrl;
        }
        if ((i7 & 16) != 0) {
            str5 = aRItemBean.modName;
        }
        return aRItemBean.copy(str, str2, str3, str4, str5);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.tagName;
    }

    @Nullable
    public final String component3() {
        return this.imageUrl;
    }

    @Nullable
    public final String component4() {
        return this.jumpUrl;
    }

    @Nullable
    public final String component5() {
        return this.modName;
    }

    @NotNull
    public final ARItemBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new ARItemBean(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ARItemBean)) {
            return false;
        }
        ARItemBean aRItemBean = (ARItemBean) obj;
        return Intrinsics.areEqual(this.title, aRItemBean.title) && Intrinsics.areEqual(this.tagName, aRItemBean.tagName) && Intrinsics.areEqual(this.imageUrl, aRItemBean.imageUrl) && Intrinsics.areEqual(this.jumpUrl, aRItemBean.jumpUrl) && Intrinsics.areEqual(this.modName, aRItemBean.modName);
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getModName() {
        return this.modName;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tagName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imageUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.jumpUrl;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.modName;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setModName(@Nullable String str) {
        this.modName = str;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.tagName;
        String str3 = this.imageUrl;
        String str4 = this.jumpUrl;
        String str5 = this.modName;
        StringBuilder sbA = b.a("ARItemBean(title=", str, ", tagName=", str2, ", imageUrl=");
        B.a(str3, ", jumpUrl=", str4, ", modName=", sbA);
        return C8770a.a(sbA, str5, ")");
    }
}
