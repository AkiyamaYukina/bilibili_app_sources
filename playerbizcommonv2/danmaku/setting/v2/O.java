package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.theme.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/O.class */
@StabilityInferred(parameters = 1)
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f81387g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f81388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f81389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f81390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f81391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f81392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f81393n;

    public O() {
        this(0);
    }

    public O(int i7) {
        int i8 = R$color.Text_white;
        this.f81381a = 2131104486;
        this.f81382b = i8;
        this.f81383c = 2131104532;
        this.f81384d = i8;
        this.f81385e = i8;
        this.f81386f = 2131104533;
        this.f81387g = 2131104513;
        this.h = 2131103596;
        this.f81388i = 2131100084;
        this.f81389j = 2131104549;
        this.f81390k = i8;
        this.f81391l = true;
        this.f81392m = true;
        this.f81393n = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return this.f81381a == o7.f81381a && this.f81382b == o7.f81382b && this.f81383c == o7.f81383c && this.f81384d == o7.f81384d && this.f81385e == o7.f81385e && this.f81386f == o7.f81386f && this.f81387g == o7.f81387g && this.h == o7.h && this.f81388i == o7.f81388i && this.f81389j == o7.f81389j && this.f81390k == o7.f81390k && this.f81391l == o7.f81391l && this.f81392m == o7.f81392m && this.f81393n == o7.f81393n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81393n) + androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.compose.animation.core.I.a(this.f81390k, androidx.compose.animation.core.I.a(this.f81389j, androidx.compose.animation.core.I.a(this.f81388i, androidx.compose.animation.core.I.a(this.h, androidx.compose.animation.core.I.a(this.f81387g, androidx.compose.animation.core.I.a(this.f81386f, androidx.compose.animation.core.I.a(this.f81385e, androidx.compose.animation.core.I.a(this.f81384d, androidx.compose.animation.core.I.a(this.f81383c, androidx.compose.animation.core.I.a(this.f81382b, Integer.hashCode(this.f81381a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f81391l), 31, this.f81392m);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DanmakuSettingsUIConfig(itemBgColor=");
        sb.append(this.f81381a);
        sb.append(", primaryTextColor=");
        sb.append(this.f81382b);
        sb.append(", secondaryTextColor=");
        sb.append(this.f81383c);
        sb.append(", sliderThumbColor=");
        sb.append(this.f81384d);
        sb.append(", sliderTickColor=");
        sb.append(this.f81385e);
        sb.append(", dividerColor=");
        sb.append(this.f81386f);
        sb.append(", itemInnerBgColor=");
        sb.append(this.f81387g);
        sb.append(", inactiveTrackColor=");
        sb.append(this.h);
        sb.append(", switchOffRectColor=");
        sb.append(this.f81388i);
        sb.append(", alertDialogBgColor=");
        sb.append(this.f81389j);
        sb.append(", alertDialogTitleColor=");
        sb.append(this.f81390k);
        sb.append(", showBlackWordsSetting=");
        sb.append(this.f81391l);
        sb.append(", showDanmakuListEntry=");
        sb.append(this.f81392m);
        sb.append(", showCommandDanmakuListEntry=");
        return androidx.appcompat.app.i.a(sb, this.f81393n, ")");
    }
}
