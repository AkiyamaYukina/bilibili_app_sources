package com.bilibili.ship.theseus.playlist.uicomponent;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/t.class */
@Stable
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f96091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f96095f;

    public t() {
        this(false, false, 0, 15);
    }

    public t(boolean z6, boolean z7, int i7, int i8) {
        z6 = (i8 & 1) != 0 ? true : z6;
        z7 = (i8 & 4) != 0 ? false : z7;
        i7 = (i8 & 8) != 0 ? 1 : i7;
        this.f96090a = z6;
        this.f96091b = true;
        this.f96092c = z7;
        this.f96093d = i7;
        this.f96094e = true;
        this.f96095f = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f96090a == tVar.f96090a && this.f96091b == tVar.f96091b && this.f96092c == tVar.f96092c && this.f96093d == tVar.f96093d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96093d) + androidx.compose.animation.z.a(androidx.compose.animation.z.a(Boolean.hashCode(this.f96090a) * 31, 31, this.f96091b), 31, this.f96092c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistMorePopupUiState(favorEnable=");
        sb.append(this.f96090a);
        sb.append(", detailEnable=");
        sb.append(this.f96091b);
        sb.append(", translateEnable=");
        sb.append(this.f96092c);
        sb.append(", translateState=");
        return C4277b.a(this.f96093d, ")", sb);
    }
}
