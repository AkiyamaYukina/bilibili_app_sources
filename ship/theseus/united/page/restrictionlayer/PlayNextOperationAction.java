package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/PlayNextOperationAction.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PlayNextOperationAction implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f102626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102627d;

    public /* synthetic */ PlayNextOperationAction(int i7, int i8, long j7, long j8, String str) {
        this((i8 & 8) != 0 ? 99 : i7, j7, j8, (i8 & 4) != 0 ? "" : str);
    }

    public PlayNextOperationAction(int i7, long j7, long j8, String str) {
        this.f102624a = j7;
        this.f102625b = j8;
        this.f102626c = str;
        this.f102627d = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayNextOperationAction)) {
            return false;
        }
        PlayNextOperationAction playNextOperationAction = (PlayNextOperationAction) obj;
        return this.f102624a == playNextOperationAction.f102624a && this.f102625b == playNextOperationAction.f102625b && Intrinsics.areEqual(this.f102626c, playNextOperationAction.f102626c) && this.f102627d == playNextOperationAction.f102627d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f102627d) + I.E.a(C3554n0.a(Long.hashCode(this.f102624a) * 31, 31, this.f102625b), 31, this.f102626c);
    }

    @NotNull
    public final String toString() {
        String strA = com.bilibili.ship.theseus.united.report.b.a(this.f102627d);
        StringBuilder sb = new StringBuilder("PlayNextOperationAction(aid=");
        sb.append(this.f102624a);
        sb.append(", cid=");
        sb.append(this.f102625b);
        sb.append(", fromSpmid=");
        return androidx.fragment.app.A.a(this.f102626c, ", trigger=", strA, ")", sb);
    }
}
