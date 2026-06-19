package com.bilibili.search2.api.oversea;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/oversea/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TranslationBusiness f86366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f86367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f86368c = "title";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f86369d = "search.search-result.0.0";

    public c(TranslationBusiness translationBusiness, String str) {
        this.f86366a = translationBusiness;
        this.f86367b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f86366a == cVar.f86366a && Intrinsics.areEqual(this.f86367b, cVar.f86367b) && Intrinsics.areEqual(this.f86368c, cVar.f86368c) && Intrinsics.areEqual(this.f86369d, cVar.f86369d);
    }

    public final int hashCode() {
        return this.f86369d.hashCode() + E.a(E.a(this.f86366a.hashCode() * 31, 31, this.f86367b), 31, this.f86368c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslateRequestParams(bizType=");
        sb.append(this.f86366a);
        sb.append(", businessId=");
        sb.append(this.f86367b);
        sb.append(", field=");
        sb.append(this.f86368c);
        sb.append(", spmid=");
        return C8770a.a(sb, this.f86369d, ")");
    }
}
