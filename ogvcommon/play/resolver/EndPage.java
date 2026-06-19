package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/EndPage.class */
@StabilityInferred(parameters = 0)
@Bson
public final class EndPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dialog")
    @NotNull
    private final LimitDialogVo f73202a;

    public EndPage() {
        this(null, 1);
    }

    public EndPage(@NotNull LimitDialogVo limitDialogVo) {
        this.f73202a = limitDialogVo;
    }

    public /* synthetic */ EndPage(LimitDialogVo limitDialogVo, int i7) {
        this((i7 & 1) != 0 ? new LimitDialogVo(LimitDialogVo.LimitDialogType.NONE, null, null, null, null, null, null, null, null, null, null, 2046) : limitDialogVo);
    }

    @NotNull
    public final LimitDialogVo a() {
        return this.f73202a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EndPage) && Intrinsics.areEqual(this.f73202a, ((EndPage) obj).f73202a);
    }

    public final int hashCode() {
        return this.f73202a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "EndPage(limitDialogVo=" + this.f73202a + ")";
    }
}
