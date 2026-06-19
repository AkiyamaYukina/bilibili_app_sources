package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ImageVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ImageVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102563a;

    public ImageVo(@NotNull String str) {
        this.f102563a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageVo) && Intrinsics.areEqual(this.f102563a, ((ImageVo) obj).f102563a);
    }

    public final int hashCode() {
        return this.f102563a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("ImageVo(url="), this.f102563a, ")");
    }
}
