package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.sharewrapper.Bshare.GShare;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static GShare.Neurons f64412a;

    @JvmStatic
    public static final void a(boolean z6, @NotNull String str, @NotNull Map<String, String> map) {
        map.put("action_id", PVActionManager.INSTANCE.getActionId());
        GShare.Neurons neurons = f64412a;
        if (neurons != null) {
            neurons.reportClick(z6, str, map);
        }
    }

    @JvmStatic
    public static final void b(boolean z6, @NotNull String str, @NotNull Map<String, String> map) {
        ((HashMap) map).put("action_id", PVActionManager.INSTANCE.getActionId());
        GShare.Neurons neurons = f64412a;
        if (neurons != null) {
            neurons.reportExposure(z6, str, map);
        }
    }
}
