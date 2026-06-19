package com.bilibili.pegasus.channelv3.movie.head;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/o.class */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f75447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b> f75448b;

    public o() {
        this(null);
    }

    public o(Object obj) {
        ArrayList arrayList = new ArrayList();
        this.f75447a = "";
        this.f75448b = arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f75447a, oVar.f75447a) && Intrinsics.areEqual(this.f75448b, oVar.f75448b);
    }

    public final int hashCode() {
        return this.f75448b.hashCode() + (this.f75447a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return C.a("ChannelMovieSecondButton(title=", this.f75447a, ", commentItems=", ")", this.f75448b);
    }
}
