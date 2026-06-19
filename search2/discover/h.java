package com.bilibili.search2.discover;

import K7.M;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.NegativeFeedback;
import com.bilibili.search2.api.SearchReferral;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<SearchReferral.Guess> f86435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final NegativeFeedback f86437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f86438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f86439e;

    public h() {
        throw null;
    }

    public h(List list, String str, NegativeFeedback negativeFeedback) {
        this.f86435a = list;
        this.f86436b = str;
        this.f86437c = negativeFeedback;
        this.f86438d = 0L;
        this.f86439e = 0L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f86435a, hVar.f86435a) && Intrinsics.areEqual(this.f86436b, hVar.f86436b) && Intrinsics.areEqual(this.f86437c, hVar.f86437c) && this.f86438d == hVar.f86438d && this.f86439e == hVar.f86439e;
    }

    public final int hashCode() {
        List<SearchReferral.Guess> list = this.f86435a;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.f86436b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        NegativeFeedback negativeFeedback = this.f86437c;
        if (negativeFeedback != null) {
            iHashCode = negativeFeedback.hashCode();
        }
        return Long.hashCode(this.f86439e) + C3554n0.a(((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.f86438d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("GuessModel(list=", ", title=", this.f86435a);
        sbA.append(this.f86436b);
        sbA.append(", negativeFeedback=");
        sbA.append(this.f86437c);
        sbA.append(", boardCloseTimeMs=");
        sbA.append(this.f86438d);
        sbA.append(", boardExpandTimeMs=");
        return android.support.v4.media.session.a.a(sbA, this.f86439e, ")");
    }
}
