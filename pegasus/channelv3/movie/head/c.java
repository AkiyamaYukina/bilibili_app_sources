package com.bilibili.pegasus.channelv3.movie.head;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bapis.bilibili.app.interfaces.v1.ButType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f75400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f75402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f75403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public ButType f75405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75406g;

    public c() {
        this(0);
    }

    public c(int i7) {
        ButType butType = ButType.BUT_INVALID;
        this.f75400a = "";
        this.f75401b = "";
        this.f75402c = "";
        this.f75403d = "";
        this.f75404e = -1;
        this.f75405f = butType;
        this.f75406g = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f75400a, cVar.f75400a) && Intrinsics.areEqual(this.f75401b, cVar.f75401b) && Intrinsics.areEqual(this.f75402c, cVar.f75402c) && Intrinsics.areEqual(this.f75403d, cVar.f75403d) && this.f75404e == cVar.f75404e && this.f75405f == cVar.f75405f && this.f75406g == cVar.f75406g;
    }

    public final int hashCode() {
        int iA = I.a(this.f75404e, E.a(E.a(E.a(this.f75400a.hashCode() * 31, 31, this.f75401b), 31, this.f75402c), 31, this.f75403d), 31);
        return Boolean.hashCode(this.f75406g) + ((this.f75405f.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f75400a;
        String str2 = this.f75401b;
        String str3 = this.f75402c;
        String str4 = this.f75403d;
        int i7 = this.f75404e;
        ButType butType = this.f75405f;
        boolean z6 = this.f75406g;
        StringBuilder sbA = G0.b.a("ChannelMovieFirstButton(title=", str, ", followedTitle=", str2, ", link=");
        B.a(str3, ", id=", str4, ", icon=", sbA);
        sbA.append(i7);
        sbA.append(", butType=");
        sbA.append(butType);
        sbA.append(", followState=");
        return androidx.appcompat.app.i.a(sbA, z6, ")");
    }
}
