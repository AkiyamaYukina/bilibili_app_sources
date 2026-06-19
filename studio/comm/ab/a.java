package com.bilibili.studio.comm.ab;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/ab/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String[] f105343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f105344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f105345d;

    public a(@NotNull String str, @NotNull String str2, @NotNull String[] strArr, boolean z6) {
        this.f105342a = str;
        this.f105343b = strArr;
        this.f105344c = str2;
        this.f105345d = z6;
    }

    @NotNull
    public final String a() {
        Lazy lazy = UpperFawkesDeviceDecision.f105475a;
        boolean zBooleanValue = ((Boolean) UpperFawkesDeviceDecision.f105485f.getValue()).booleanValue();
        String str = this.f105342a;
        String str2 = str;
        if (zBooleanValue) {
            str2 = str;
            if (this.f105345d) {
                Application application = BiliContext.application();
                str2 = str + "_" + (application != null ? Long.valueOf(BiliAccounts.get(application).mid()) : null);
            }
        }
        return str2;
    }
}
