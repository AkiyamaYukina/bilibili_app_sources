package com.bilibili.ogvcommon.play.vo.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/ImageVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ImageVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f73342a;

    public ImageVo(@NotNull String str) {
        this.f73342a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageVo) && Intrinsics.areEqual(this.f73342a, ((ImageVo) obj).f73342a);
    }

    public final int hashCode() {
        return this.f73342a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("ImageVo(url="), this.f73342a, ")");
    }
}
