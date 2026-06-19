package com.bilibili.ship.theseus.united.player.mediaplay.network;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/q.class */
@StabilityInferred(parameters = 1)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104599c;

    public q(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f104597a = str;
        this.f104598b = str2;
        this.f104599c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f104597a, qVar.f104597a) && Intrinsics.areEqual(this.f104598b, qVar.f104598b) && Intrinsics.areEqual(this.f104599c, qVar.f104599c);
    }

    public final int hashCode() {
        return this.f104599c.hashCode() + E.a(this.f104597a.hashCode() * 31, 31, this.f104598b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TFCustomPanel(btnText=");
        sb.append(this.f104597a);
        sb.append(", btnLink=");
        sb.append(this.f104598b);
        sb.append(", tipText=");
        return C8770a.a(sb, this.f104599c, ")");
    }
}
