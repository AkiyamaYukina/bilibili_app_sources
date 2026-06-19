package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/ViewInfoClips.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ViewInfoClips {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ViewInfoClipInfo f73234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ViewInfoClipInfo f73235b;

    public ViewInfoClips(@Nullable ViewInfoClipInfo viewInfoClipInfo, @Nullable ViewInfoClipInfo viewInfoClipInfo2) {
        this.f73234a = viewInfoClipInfo;
        this.f73235b = viewInfoClipInfo2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfoClips)) {
            return false;
        }
        ViewInfoClips viewInfoClips = (ViewInfoClips) obj;
        return Intrinsics.areEqual(this.f73234a, viewInfoClips.f73234a) && Intrinsics.areEqual(this.f73235b, viewInfoClips.f73235b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        ViewInfoClipInfo viewInfoClipInfo = this.f73234a;
        int iHashCode2 = viewInfoClipInfo == null ? 0 : viewInfoClipInfo.hashCode();
        ViewInfoClipInfo viewInfoClipInfo2 = this.f73235b;
        if (viewInfoClipInfo2 != null) {
            iHashCode = viewInfoClipInfo2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "ViewInfoClips(startClipInfo=" + this.f73234a + ", endClipInfo=" + this.f73235b + ")";
    }
}
