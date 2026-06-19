package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComicShowUiStatus f74042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f74043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f74045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f74046e;

    public c(@NotNull ComicShowUiStatus comicShowUiStatus, float f7, int i7, int i8, @NotNull String str) {
        this.f74042a = comicShowUiStatus;
        this.f74043b = f7;
        this.f74044c = i7;
        this.f74045d = i8;
        this.f74046e = str;
    }

    public /* synthetic */ c(ComicShowUiStatus comicShowUiStatus, float f7, int i7, int i8, String str, int i9) {
        this(comicShowUiStatus, f7, (i9 & 4) != 0 ? 0 : i7, (i9 & 8) != 0 ? 0 : i8, (i9 & 16) != 0 ? "" : str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f74042a == cVar.f74042a && Float.compare(this.f74043b, cVar.f74043b) == 0 && this.f74044c == cVar.f74044c && this.f74045d == cVar.f74045d && Intrinsics.areEqual(this.f74046e, cVar.f74046e);
    }

    public final int hashCode() {
        return this.f74046e.hashCode() + I.a(this.f74045d, I.a(this.f74044c, n.a(this.f74043b, this.f74042a.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaySDKUiState(uiStatus=");
        sb.append(this.f74042a);
        sb.append(", consumeValue=");
        sb.append(this.f74043b);
        sb.append(", bulkSum=");
        sb.append(this.f74044c);
        sb.append(", showBulkNum=");
        sb.append(this.f74045d);
        sb.append(", forceRefreshId=");
        return C8770a.a(sb, this.f74046e, ")");
    }
}
