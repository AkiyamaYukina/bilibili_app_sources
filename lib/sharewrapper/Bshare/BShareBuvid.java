package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.sharewrapper.Bshare.GShare;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/BShareBuvid.class */
public final class BShareBuvid {

    @NotNull
    public static final BShareBuvid INSTANCE = new BShareBuvid();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static GShare.Buvid f64401a;

    @JvmStatic
    @Nullable
    public static final String getBuvid() {
        GShare.Buvid buvid = f64401a;
        return buvid != null ? buvid.getBuvid() : null;
    }

    @JvmStatic
    @Nullable
    public static final String getLocalBuvid() {
        GShare.Buvid buvid = f64401a;
        return buvid != null ? buvid.getLocalBuvid() : null;
    }

    @JvmStatic
    @Nullable
    public static final String getRemoteBuvid() {
        GShare.Buvid buvid = f64401a;
        return buvid != null ? buvid.getRemoteBuvid() : null;
    }

    @Nullable
    public final GShare.Buvid getShareBuvid() {
        return f64401a;
    }

    public final void setBuvidDelegate(@NotNull GShare.Buvid buvid) {
        f64401a = buvid;
    }

    public final void setShareBuvid(@Nullable GShare.Buvid buvid) {
        f64401a = buvid;
    }
}
