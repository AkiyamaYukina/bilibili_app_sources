package com.bilibili.search2.main;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/F.class */
@StabilityInferred(parameters = 0)
public final class F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f86698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f86699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f86700g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f86701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f86702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Integer f86703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f86704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f86705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Long f86706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Long f86707o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86694a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f86695b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f86696c = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.search2.interceptor.d> f86708p = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v23, types: [com.bilibili.search2.interceptor.e, java.lang.Object] */
    public final void a() {
        ((ArrayList) this.f86708p).clear();
        ((ArrayList) this.f86708p).add(new Object());
        ((ArrayList) this.f86708p).add(new Object());
        ((ArrayList) this.f86708p).add(new Object());
        List<com.bilibili.search2.interceptor.d> list = this.f86708p;
        ?? obj = new Object();
        int i7 = 500;
        obj.f86617a = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE;
        String str = (String) ConfigManager.Companion.config().get("search.short_link_timeout", "500");
        try {
            i7 = Integer.parseInt(str != null ? str : "500");
        } catch (Exception e7) {
        }
        obj.f86617a = i7;
        ((ArrayList) list).add(obj);
    }
}
