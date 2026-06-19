package com.bilibili.pegasus.components.recover;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.config.FlushRecoverConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/j.class */
@StabilityInferred(parameters = 0)
public final class j implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FlushRecoverConfig f77159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f77160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77162d;

    public j(@NotNull FlushRecoverConfig flushRecoverConfig, @NotNull List<? extends PegasusHolderData> list, int i7, long j7) {
        this.f77159a = flushRecoverConfig;
        this.f77160b = list;
        this.f77161c = i7;
        this.f77162d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f77159a, jVar.f77159a) && Intrinsics.areEqual(this.f77160b, jVar.f77160b) && this.f77161c == jVar.f77161c && this.f77162d == jVar.f77162d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f77162d) + I.a(this.f77161c, e0.a(this.f77159a.hashCode() * 31, 31, this.f77160b), 31);
    }

    @NotNull
    public final String toString() {
        List<PegasusHolderData> list = this.f77160b;
        StringBuilder sb = new StringBuilder("ShowRecoverTipsAction(recoverConfig=");
        sb.append(this.f77159a);
        sb.append(", cards=");
        sb.append(list);
        sb.append(", flushType=");
        sb.append(this.f77161c);
        sb.append(", uniqueId=");
        return android.support.v4.media.session.a.a(sb, this.f77162d, ")");
    }
}
