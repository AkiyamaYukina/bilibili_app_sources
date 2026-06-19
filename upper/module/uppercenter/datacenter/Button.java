package com.bilibili.upper.module.uppercenter.datacenter;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/Button.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Button {
    public static final int $stable = 8;

    @JSONField(name = "day_color")
    @Nullable
    private String dayColor;

    @JSONField(name = "night_color")
    @Nullable
    private String nightColor;

    @JSONField(name = "screen")
    private int screen;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "url")
    @Nullable
    private String url;

    public Button() {
        this(null, null, null, null, 0, 31, null);
    }

    public Button(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7) {
        this.title = str;
        this.dayColor = str2;
        this.nightColor = str3;
        this.url = str4;
        this.screen = i7;
    }

    public /* synthetic */ Button(String str, String str2, String str3, String str4, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? 1 : i7);
    }

    public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, String str4, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = button.title;
        }
        if ((i8 & 2) != 0) {
            str2 = button.dayColor;
        }
        if ((i8 & 4) != 0) {
            str3 = button.nightColor;
        }
        if ((i8 & 8) != 0) {
            str4 = button.url;
        }
        if ((i8 & 16) != 0) {
            i7 = button.screen;
        }
        return button.copy(str, str2, str3, str4, i7);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.dayColor;
    }

    @Nullable
    public final String component3() {
        return this.nightColor;
    }

    @Nullable
    public final String component4() {
        return this.url;
    }

    public final int component5() {
        return this.screen;
    }

    @NotNull
    public final Button copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7) {
        return new Button(str, str2, str3, str4, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.areEqual(this.title, button.title) && Intrinsics.areEqual(this.dayColor, button.dayColor) && Intrinsics.areEqual(this.nightColor, button.nightColor) && Intrinsics.areEqual(this.url, button.url) && this.screen == button.screen;
    }

    @Nullable
    public final String getDayColor() {
        return this.dayColor;
    }

    @Nullable
    public final String getNightColor() {
        return this.nightColor;
    }

    public final int getScreen() {
        return this.screen;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.dayColor;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nightColor;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.url;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return Integer.hashCode(this.screen) + (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31);
    }

    public final void setDayColor(@Nullable String str) {
        this.dayColor = str;
    }

    public final void setNightColor(@Nullable String str) {
        this.nightColor = str;
    }

    public final void setScreen(int i7) {
        this.screen = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.dayColor;
        String str3 = this.nightColor;
        String str4 = this.url;
        int i7 = this.screen;
        StringBuilder sbA = b.a("Button(title=", str, ", dayColor=", str2, ", nightColor=");
        B.a(str3, ", url=", str4, ", screen=", sbA);
        return C4277b.a(i7, ")", sbA);
    }
}
