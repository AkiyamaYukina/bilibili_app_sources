package com.bilibili.ship.theseus.united.page.playviewextra;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/FoldDataVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FoldDataVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fold_style")
    @NotNull
    private final FoldStyle f102376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("count_down")
    @Nullable
    private final CountdownItemVo f102377b;

    public FoldDataVo(@NotNull FoldStyle foldStyle, @Nullable CountdownItemVo countdownItemVo) {
        this.f102376a = foldStyle;
        this.f102377b = countdownItemVo;
    }

    @Nullable
    public final CountdownItemVo a() {
        return this.f102377b;
    }

    @NotNull
    public final FoldStyle b() {
        return this.f102376a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoldDataVo)) {
            return false;
        }
        FoldDataVo foldDataVo = (FoldDataVo) obj;
        return this.f102376a == foldDataVo.f102376a && Intrinsics.areEqual(this.f102377b, foldDataVo.f102377b);
    }

    public final int hashCode() {
        int iHashCode = this.f102376a.hashCode();
        CountdownItemVo countdownItemVo = this.f102377b;
        return (iHashCode * 31) + (countdownItemVo == null ? 0 : countdownItemVo.hashCode());
    }

    @NotNull
    public final String toString() {
        return "FoldDataVo(style=" + this.f102376a + ", countdownItem=" + this.f102377b + ")";
    }
}
