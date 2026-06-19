package com.bilibili.ship.theseus.ogv.vip.rights;

import Cj0.f;
import android.app.Application;
import android.content.SharedPreferences;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.w;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KProperty<Object>[] f94900a = {new MutablePropertyReference0Impl(b.class, "vipToastLastDisplayTime", "getVipToastLastDisplayTime()J", 1), new MutablePropertyReference0Impl(b.class, "vipQualityToastLastDisplayTime", "getVipQualityToastLastDisplayTime()J", 1), new MutablePropertyReference0Impl(b.class, "vipQualityToggleToastLastDisplayTime", "getVipQualityToggleToastLastDisplayTime()J", 1)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Cj0.d f94901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Cj0.d f94902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Cj0.d f94903d;

    static {
        SharedPreferences sharedPreferences = w.f94906a;
        Application application = Aj0.a.f317a;
        f94901b = f.d(sharedPreferences, BiliAccounts.get(application).mid() + "_vipToastLastDisplayTime");
        f94902c = f.d(sharedPreferences, BiliAccounts.get(application).mid() + "_vipQualityToastLastDisplayTime");
        f94903d = f.d(sharedPreferences, BiliAccounts.get(application).mid() + "_vipQualityToastWithToggleLastDisplayTime");
    }
}
