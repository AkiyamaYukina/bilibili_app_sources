package com.bilibili.lib.sharewrapper.report;

import android.os.Bundle;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/report/ShareTrackHelper.class */
public final class ShareTrackHelper {

    @NotNull
    public static final ShareTrackHelper INSTANCE = new ShareTrackHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ShareTrack f64437a;

    @JvmStatic
    @Nullable
    public static final String appendTrackParams(@Nullable String str, @Nullable String str2) {
        ShareTrack shareTrack = f64437a;
        return shareTrack != null ? shareTrack.appendTrackParams(str, str2) : null;
    }

    @JvmStatic
    public static final void appendTrackParams(@Nullable String str, @Nullable Bundle bundle) {
        ShareTrack shareTrack = f64437a;
        if (shareTrack != null) {
            shareTrack.appendTrackParams(str, bundle);
        }
    }

    @JvmStatic
    @Nullable
    public static final ShareTrackParams decodeTrackParamsFrom(@Nullable String str) {
        ShareTrack shareTrack = f64437a;
        return shareTrack != null ? shareTrack.decodeTrackParamsFrom(str) : null;
    }

    @Nullable
    public final ShareTrack getShareTrack() {
        return f64437a;
    }

    public final void setShareTrack(@Nullable ShareTrack shareTrack) {
        f64437a = shareTrack;
    }

    public final void setShareTrackDelegate(@NotNull ShareTrack shareTrack) {
        f64437a = shareTrack;
    }
}
