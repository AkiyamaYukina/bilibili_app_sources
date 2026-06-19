package com.bilibili.playerbizcommonv2.web.coinguess;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/coinguess/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f82217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f82220d;

    public e(@NotNull String str, int i7, int i8, @Nullable String str2) {
        this.f82217a = str;
        this.f82218b = i7;
        this.f82219c = i8;
        this.f82220d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f82217a, eVar.f82217a) && this.f82218b == eVar.f82218b && this.f82219c == eVar.f82219c && Intrinsics.areEqual(this.f82220d, eVar.f82220d);
    }

    public final int hashCode() {
        int iA = I.a(this.f82219c, I.a(this.f82218b, this.f82217a.hashCode() * 31, 31), 31);
        String str = this.f82220d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CoinGuessSubmitInput(quizId=");
        sb.append(this.f82217a);
        sb.append(", myOption=");
        sb.append(this.f82218b);
        sb.append(", coinCount=");
        sb.append(this.f82219c);
        sb.append(", dm=");
        return C8770a.a(sb, this.f82220d, ")");
    }
}
