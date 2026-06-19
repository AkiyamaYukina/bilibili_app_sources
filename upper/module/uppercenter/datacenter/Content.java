package com.bilibili.upper.module.uppercenter.datacenter;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import bilibili.live.app.service.resolver.a;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/Content.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Content {
    public static final int $stable = 8;

    @JSONField(name = "day_icon")
    @Nullable
    private String dayIcon;

    @JSONField(name = "night_icon")
    @Nullable
    private String nightIcon;

    @JSONField(name = "show_type")
    private int showType;

    @JSONField(name = "title")
    @Nullable
    private String title;

    public Content() {
        this(0, null, null, null, 15, null);
    }

    public Content(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.showType = i7;
        this.title = str;
        this.dayIcon = str2;
        this.nightIcon = str3;
    }

    public /* synthetic */ Content(int i7, String str, String str2, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 1 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ Content copy$default(Content content, int i7, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = content.showType;
        }
        if ((i8 & 2) != 0) {
            str = content.title;
        }
        if ((i8 & 4) != 0) {
            str2 = content.dayIcon;
        }
        if ((i8 & 8) != 0) {
            str3 = content.nightIcon;
        }
        return content.copy(i7, str, str2, str3);
    }

    public final int component1() {
        return this.showType;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.dayIcon;
    }

    @Nullable
    public final String component4() {
        return this.nightIcon;
    }

    @NotNull
    public final Content copy(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new Content(i7, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return this.showType == content.showType && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.dayIcon, content.dayIcon) && Intrinsics.areEqual(this.nightIcon, content.nightIcon);
    }

    @Nullable
    public final String getDayIcon() {
        return this.dayIcon;
    }

    @Nullable
    public final String getNightIcon() {
        return this.nightIcon;
    }

    public final int getShowType() {
        return this.showType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.showType);
        String str = this.title;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.dayIcon;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nightIcon;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final void setDayIcon(@Nullable String str) {
        this.dayIcon = str;
    }

    public final void setNightIcon(@Nullable String str) {
        this.nightIcon = str;
    }

    public final void setShowType(int i7) {
        this.showType = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.dayIcon, ", nightIcon=", this.nightIcon, ")", a.b(this.showType, "Content(showType=", ", title=", this.title, ", dayIcon="));
    }
}
