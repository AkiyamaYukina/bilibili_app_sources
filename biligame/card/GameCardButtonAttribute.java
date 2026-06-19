package com.bilibili.biligame.card;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.animation.z;
import androidx.core.content.ContextCompat;
import com.bilibili.biligame.utils.GameUtilExtensionsKt;
import com.bilibili.magicasakura.utils.ThemeUtils;
import e4.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/GameCardButtonAttribute.class */
public final class GameCardButtonAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f62806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f62807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f62808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f62809g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Integer f62810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f62811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Integer f62812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f62813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Integer f62814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Integer f62815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Integer f62816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f62817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Integer f62818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Integer f62819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Integer f62820s;

    public GameCardButtonAttribute() {
        this(0, 0, 0, 0, 0, false, 0, 0.0f, null, 0, null, 0, null, 8191, null);
    }

    public GameCardButtonAttribute(int i7, int i8, @ColorRes int i9, int i10, int i11, boolean z6, @ColorRes int i12, float f7, @ColorRes @Nullable Integer num, @ColorRes int i13, @ColorRes @Nullable Integer num2, @ColorRes int i14, @ColorRes @Nullable Integer num3) {
        this.f62803a = i7;
        this.f62804b = i8;
        this.f62805c = i9;
        this.f62806d = i10;
        this.f62807e = i11;
        this.f62808f = z6;
        this.f62809g = i12;
        this.h = f7;
        this.f62810i = num;
        this.f62811j = i13;
        this.f62812k = num2;
        this.f62813l = i14;
        this.f62814m = num3;
    }

    public /* synthetic */ GameCardButtonAttribute(int i7, int i8, int i9, int i10, int i11, boolean z6, int i12, float f7, Integer num, int i13, Integer num2, int i14, Integer num3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? GameUtilExtensionsKt.toPx(66) : i7, (i15 & 2) != 0 ? GameUtilExtensionsKt.toPx(24) : i8, (i15 & 4) != 0 ? 2131103284 : i9, (i15 & 8) != 0 ? GameUtilExtensionsKt.toPx(2) : i10, (i15 & 16) != 0 ? GameUtilExtensionsKt.toPx(1) : i11, (i15 & 32) != 0 ? false : z6, (i15 & 64) != 0 ? 2131103284 : i12, (i15 & 128) != 0 ? 13.0f : f7, (i15 & 256) != 0 ? null : num, (i15 & 512) != 0 ? 2131100742 : i13, (i15 & 1024) != 0 ? null : num2, (i15 & 2048) != 0 ? 2131100742 : i14, (i15 & 4096) != 0 ? null : num3);
    }

    public static /* synthetic */ GameCardButtonAttribute copy$default(GameCardButtonAttribute gameCardButtonAttribute, int i7, int i8, int i9, int i10, int i11, boolean z6, int i12, float f7, Integer num, int i13, Integer num2, int i14, Integer num3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i7 = gameCardButtonAttribute.f62803a;
        }
        if ((i15 & 2) != 0) {
            i8 = gameCardButtonAttribute.f62804b;
        }
        if ((i15 & 4) != 0) {
            i9 = gameCardButtonAttribute.f62805c;
        }
        if ((i15 & 8) != 0) {
            i10 = gameCardButtonAttribute.f62806d;
        }
        if ((i15 & 16) != 0) {
            i11 = gameCardButtonAttribute.f62807e;
        }
        if ((i15 & 32) != 0) {
            z6 = gameCardButtonAttribute.f62808f;
        }
        if ((i15 & 64) != 0) {
            i12 = gameCardButtonAttribute.f62809g;
        }
        if ((i15 & 128) != 0) {
            f7 = gameCardButtonAttribute.h;
        }
        if ((i15 & 256) != 0) {
            num = gameCardButtonAttribute.f62810i;
        }
        if ((i15 & 512) != 0) {
            i13 = gameCardButtonAttribute.f62811j;
        }
        if ((i15 & 1024) != 0) {
            num2 = gameCardButtonAttribute.f62812k;
        }
        if ((i15 & 2048) != 0) {
            i14 = gameCardButtonAttribute.f62813l;
        }
        if ((i15 & 4096) != 0) {
            num3 = gameCardButtonAttribute.f62814m;
        }
        return gameCardButtonAttribute.copy(i7, i8, i9, i10, i11, z6, i12, f7, num, i13, num2, i14, num3);
    }

    public final int component1() {
        return this.f62803a;
    }

    public final int component10() {
        return this.f62811j;
    }

    @Nullable
    public final Integer component11() {
        return this.f62812k;
    }

    public final int component12() {
        return this.f62813l;
    }

    @Nullable
    public final Integer component13() {
        return this.f62814m;
    }

    public final int component2() {
        return this.f62804b;
    }

    public final int component3() {
        return this.f62805c;
    }

    public final int component4() {
        return this.f62806d;
    }

    public final int component5() {
        return this.f62807e;
    }

    public final boolean component6() {
        return this.f62808f;
    }

    public final int component7() {
        return this.f62809g;
    }

    public final float component8() {
        return this.h;
    }

    @Nullable
    public final Integer component9() {
        return this.f62810i;
    }

    @NotNull
    public final GameCardButtonAttribute copy(int i7, int i8, @ColorRes int i9, int i10, int i11, boolean z6, @ColorRes int i12, float f7, @ColorRes @Nullable Integer num, @ColorRes int i13, @ColorRes @Nullable Integer num2, @ColorRes int i14, @ColorRes @Nullable Integer num3) {
        return new GameCardButtonAttribute(i7, i8, i9, i10, i11, z6, i12, f7, num, i13, num2, i14, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCardButtonAttribute)) {
            return false;
        }
        GameCardButtonAttribute gameCardButtonAttribute = (GameCardButtonAttribute) obj;
        return this.f62803a == gameCardButtonAttribute.f62803a && this.f62804b == gameCardButtonAttribute.f62804b && this.f62805c == gameCardButtonAttribute.f62805c && this.f62806d == gameCardButtonAttribute.f62806d && this.f62807e == gameCardButtonAttribute.f62807e && this.f62808f == gameCardButtonAttribute.f62808f && this.f62809g == gameCardButtonAttribute.f62809g && Float.compare(this.h, gameCardButtonAttribute.h) == 0 && Intrinsics.areEqual(this.f62810i, gameCardButtonAttribute.f62810i) && this.f62811j == gameCardButtonAttribute.f62811j && Intrinsics.areEqual(this.f62812k, gameCardButtonAttribute.f62812k) && this.f62813l == gameCardButtonAttribute.f62813l && Intrinsics.areEqual(this.f62814m, gameCardButtonAttribute.f62814m);
    }

    public final int getBorderWidth() {
        return this.f62807e;
    }

    public final int getCornerRadius() {
        return this.f62806d;
    }

    public final int getDownLoadBorderColor(@NotNull Context context) {
        Integer num = this.f62812k;
        return num != null ? ContextCompat.getColor(context, num.intValue()) : getThemeColorValue(context);
    }

    public final int getDownLoadTextColor(@NotNull Context context) {
        Integer num = this.f62814m;
        return num != null ? ContextCompat.getColor(context, num.intValue()) : getThemeColorValue(context);
    }

    public final int getDownLoadTextValueHe(@NotNull Context context) {
        Integer num = this.f62819r;
        return num != null ? num.intValue() : getDownLoadTextColor(context);
    }

    public final int getDownloadBackground() {
        return this.f62813l;
    }

    @Nullable
    public final Integer getDownloadBackgroundValue() {
        return this.f62820s;
    }

    @Nullable
    public final Integer getDownloadBackgroundValue(@NotNull Context context) {
        Integer num = this.f62820s;
        return num != null ? num : Integer.valueOf(ContextCompat.getColor(context, this.f62813l));
    }

    @Nullable
    public final Integer getDownloadBorderColor() {
        return this.f62812k;
    }

    @Nullable
    public final Integer getDownloadTextColor() {
        return this.f62814m;
    }

    @Nullable
    public final Integer getDownloadTextColorValue() {
        return this.f62819r;
    }

    public final int getHeight() {
        return this.f62804b;
    }

    public final int getProgressBackground() {
        return this.f62811j;
    }

    @Nullable
    public final Integer getProgressColor() {
        return this.f62810i;
    }

    @Nullable
    public final Integer getProgressColorValue() {
        return this.f62818q;
    }

    @Nullable
    public final Integer getProgressColorValueHe(@NotNull Context context) {
        Integer num = this.f62818q;
        if (num != null) {
            return num;
        }
        Integer num2 = this.f62810i;
        if (num2 != null) {
            return Integer.valueOf(ContextCompat.getColor(context, num2.intValue()));
        }
        return null;
    }

    public final boolean getShowProgressText() {
        return this.f62817p;
    }

    public final int getTextColor() {
        return this.f62809g;
    }

    @Nullable
    public final Integer getTextColorValue() {
        return this.f62816o;
    }

    public final float getTextSize() {
        return this.h;
    }

    public final int getThemeColor() {
        return this.f62805c;
    }

    public final int getThemeColorValue(@NotNull Context context) {
        Integer num = this.f62815n;
        return num != null ? num.intValue() : ThemeUtils.getColorById(context, this.f62805c);
    }

    @Nullable
    public final Integer getThemeColorValue() {
        return this.f62815n;
    }

    public final int getWidth() {
        return this.f62803a;
    }

    public int hashCode() {
        int iA = n.a(this.h, I.a(this.f62809g, z.a(I.a(this.f62807e, I.a(this.f62806d, I.a(this.f62805c, I.a(this.f62804b, Integer.hashCode(this.f62803a) * 31, 31), 31), 31), 31), 31, this.f62808f), 31), 31);
        Integer num = this.f62810i;
        int iA2 = I.a(this.f62811j, (iA + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f62812k;
        int iA3 = I.a(this.f62813l, (iA2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Integer num3 = this.f62814m;
        return iA3 + (num3 == null ? 0 : num3.hashCode());
    }

    public final boolean isFill() {
        return this.f62808f;
    }

    public final void setDownloadBackgroundValue(@Nullable Integer num) {
        this.f62820s = num;
    }

    public final void setDownloadTextColorValue(@Nullable Integer num) {
        this.f62819r = num;
    }

    public final void setProgressColorValue(@Nullable Integer num) {
        this.f62818q = num;
    }

    public final void setShowProgressText(boolean z6) {
        this.f62817p = z6;
    }

    public final void setTextColorValue(@Nullable Integer num) {
        this.f62816o = num;
    }

    public final void setThemeColorValue(@Nullable Integer num) {
        this.f62815n = num;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GameCardButtonAttribute(width=");
        sb.append(this.f62803a);
        sb.append(", height=");
        sb.append(this.f62804b);
        sb.append(", themeColor=");
        sb.append(this.f62805c);
        sb.append(", cornerRadius=");
        sb.append(this.f62806d);
        sb.append(", borderWidth=");
        sb.append(this.f62807e);
        sb.append(", isFill=");
        sb.append(this.f62808f);
        sb.append(", textColor=");
        sb.append(this.f62809g);
        sb.append(", textSize=");
        sb.append(this.h);
        sb.append(", progressColor=");
        sb.append(this.f62810i);
        sb.append(", progressBackground=");
        sb.append(this.f62811j);
        sb.append(", downloadBorderColor=");
        sb.append(this.f62812k);
        sb.append(", downloadBackground=");
        sb.append(this.f62813l);
        sb.append(", downloadTextColor=");
        return c.a(sb, this.f62814m, ")");
    }
}
