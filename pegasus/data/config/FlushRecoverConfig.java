package com.bilibili.pegasus.data.config;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import cf.l;
import com.bilibili.playerbizcommon.features.background.b;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/FlushRecoverConfig.class */
@Keep
public final class FlushRecoverConfig {

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("show_time")
    private final long showTime;

    @SerializedName("style")
    private final int style;

    @SerializedName("text")
    @Nullable
    private final String text;

    public FlushRecoverConfig() {
        this(null, 0L, 0, null, 15, null);
    }

    public FlushRecoverConfig(@Nullable String str, long j7, int i7, @Nullable String str2) {
        this.icon = str;
        this.showTime = j7;
        this.style = i7;
        this.text = str2;
    }

    public /* synthetic */ FlushRecoverConfig(String str, long j7, int i7, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? 0L : j7, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ FlushRecoverConfig copy$default(FlushRecoverConfig flushRecoverConfig, String str, long j7, int i7, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = flushRecoverConfig.icon;
        }
        if ((i8 & 2) != 0) {
            j7 = flushRecoverConfig.showTime;
        }
        if ((i8 & 4) != 0) {
            i7 = flushRecoverConfig.style;
        }
        if ((i8 & 8) != 0) {
            str2 = flushRecoverConfig.text;
        }
        return flushRecoverConfig.copy(str, j7, i7, str2);
    }

    @Nullable
    public final String component1() {
        return this.icon;
    }

    public final long component2() {
        return this.showTime;
    }

    public final int component3() {
        return this.style;
    }

    @Nullable
    public final String component4() {
        return this.text;
    }

    @NotNull
    public final FlushRecoverConfig copy(@Nullable String str, long j7, int i7, @Nullable String str2) {
        return new FlushRecoverConfig(str, j7, i7, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlushRecoverConfig)) {
            return false;
        }
        FlushRecoverConfig flushRecoverConfig = (FlushRecoverConfig) obj;
        return Intrinsics.areEqual(this.icon, flushRecoverConfig.icon) && this.showTime == flushRecoverConfig.showTime && this.style == flushRecoverConfig.style && Intrinsics.areEqual(this.text, flushRecoverConfig.text);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getShowTime() {
        return this.showTime;
    }

    public final long getShowTimeMs() {
        return ((long) 1000) * this.showTime;
    }

    public final int getStyle() {
        return this.style;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.icon;
        int iA = I.a(this.style, C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.showTime), 31);
        String str2 = this.text;
        return iA + (str2 == null ? 0 : str2.hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isValid() {
        /*
            r5 = this;
            r0 = r5
            java.lang.String r0 = r0.text
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L41
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L15
            goto L41
        L15:
            r0 = r5
            int r0 = r0.style
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L26
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L41
        L26:
            r0 = r5
            long r0 = r0.showTime
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L41
            r0 = r5
            java.lang.String r0 = r0.icon
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L41
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L43
        L41:
            r0 = 0
            r7 = r0
        L43:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.data.config.FlushRecoverConfig.isValid():boolean");
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        long j7 = this.showTime;
        int i7 = this.style;
        String str2 = this.text;
        StringBuilder sbA = b.a(j7, "FlushRecoverConfig(icon=", str, ", showTime=");
        l.a(i7, ", style=", ", text=", str2, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
