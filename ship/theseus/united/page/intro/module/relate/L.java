package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.adcommon.config.DDConfig;
import com.bilibili.adcommon.utils.GsonKtKt;
import com.bilibili.lib.dd.DeviceDecision;
import com.google.gson.reflect.TypeToken;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/L.class */
public final class L implements Function0<Float> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/L$a.class */
    public static final class a extends TypeToken<Float> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Float invoke() {
        Object obj;
        DDConfig dDConfig = DDConfig.INSTANCE;
        String strDd = DeviceDecision.INSTANCE.dd("dd_abyss_relate_valid_show_min", (String) null);
        defpackage.a.b("dd_abyss_relate_valid_show_min=>", strDd, "[DDConfig]");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(GsonKtKt.getGson().fromJson(strDd, new a().getType()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            BLog.e("[DDConfig]", th2.getMessage());
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        Object obj3 = null;
        if (obj2 != null) {
            ga.b.a(obj2, "relate_valid_show_min is from dd ->value:", "AbyssHelper");
            obj3 = obj2;
        }
        return obj3;
    }
}
