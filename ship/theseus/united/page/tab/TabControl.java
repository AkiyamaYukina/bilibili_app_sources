package com.bilibili.ship.theseus.united.page.tab;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.Q;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TabControl.class */
@StabilityInferred(parameters = 1)
@Bson
public final class TabControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("limit")
    private final boolean f103126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("disable")
    private final boolean f103127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("disable_click_tip")
    @NotNull
    private final String f103128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("disable_alpha")
    private final float f103129d;

    public TabControl(float f7, int i7, String str, boolean z6, boolean z7) {
        f7 = (i7 & 8) != 0 ? 0.4f : f7;
        this.f103126a = z6;
        this.f103127b = z7;
        this.f103128c = str;
        this.f103129d = f7;
    }

    public final boolean a() {
        float f7 = this.f103129d;
        return f7 > 0.0f && f7 <= 1.0f;
    }

    public final boolean b() {
        return this.f103127b;
    }

    public final float c() {
        return this.f103129d;
    }

    @NotNull
    public final String d() {
        return this.f103128c;
    }

    public final boolean e() {
        return this.f103126a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabControl)) {
            return false;
        }
        TabControl tabControl = (TabControl) obj;
        return this.f103126a == tabControl.f103126a && this.f103127b == tabControl.f103127b && Intrinsics.areEqual(this.f103128c, tabControl.f103128c) && Float.compare(this.f103129d, tabControl.f103129d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f103129d) + E.a(z.a(Boolean.hashCode(this.f103126a) * 31, 31, this.f103127b), 31, this.f103128c);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f103126a;
        boolean z7 = this.f103127b;
        String str = this.f103128c;
        float f7 = this.f103129d;
        StringBuilder sbA = Q.a("TabControl(limit=", ", disable=", ", disableClickTip=", z6, z7);
        sbA.append(str);
        sbA.append(", disableAlpha=");
        sbA.append(f7);
        sbA.append(")");
        return sbA.toString();
    }
}
