package com.bilibili.teenagersmode.osteen;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.restrict.OSTeensTransPageType;
import com.bilibili.app.comm.restrict.g;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.dd.DeviceDecision;
import j4.t;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/d.class */
@StabilityInferred(parameters = 0)
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.app.comm.restrict.f> f110589a = StateFlowKt.MutableStateFlow(new com.bilibili.app.comm.restrict.f(0));

    public static int e(@NotNull Context context) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(new com.bilibili.app.comm.restrict.c(Settings.Secure.getInt(context.getContentResolver(), "minors_mode_age_range")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        com.bilibili.app.comm.restrict.c cVar = (com.bilibili.app.comm.restrict.c) obj2;
        int i7 = cVar != null ? cVar.a : -1;
        defpackage.a.b("getMinorsModeAgeRange: ", C3392f.a(i7, "AgeRange(value=", ")"), "OSTeenagersModeProvider");
        return i7;
    }

    public static boolean f(Context context) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            boolean z6 = true;
            if (Settings.Secure.getInt(context.getContentResolver(), "minors_mode_enabled") != 1) {
                z6 = false;
            }
            obj = Result.constructor-impl(Boolean.valueOf(z6));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        t.a("getMinorsModeState: ", "OSTeenagersModeProvider", zBooleanValue);
        return zBooleanValue;
    }

    @NotNull
    public final MutableStateFlow a() {
        return this.f110589a;
    }

    public final boolean b(@NotNull Context context) {
        Object obj;
        if (!RomUtils.isZTERom() && !RomUtils.isMiuiRom() && !RomUtils.isOppoRom() && !RomUtils.isOnePlusRom() && !RomUtils.isHonorRom() && !RomUtils.isVivoRom() && !DeviceDecision.INSTANCE.getBoolean("dd_os_teens_using_minors_provider", false)) {
            BLog.i("OSTeenagersModeProvider", "not supported rom");
            return false;
        }
        if (DeviceDecision.INSTANCE.getBoolean("dd_os_teens_block_minors_provider", false)) {
            BLog.i("OSTeenagersModeProvider", "banned rom");
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "minors_mode", 0) == 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        t.a("supportMinorsMode: ", "OSTeenagersModeProvider", zBooleanValue);
        if (zBooleanValue) {
            return true;
        }
        BLog.i("OSTeenagersModeProvider", "not support minors mode");
        return false;
    }

    @Nullable
    public final Uri c(@NotNull OSTeensTransPageType oSTeensTransPageType) {
        return Uri.parse("bilibili://teenagers_mode/os/parent/redirect?page_type=" + oSTeensTransPageType.getPageType());
    }

    @Nullable
    public final Unit d(@NotNull Context context) {
        Uri uriFor = Settings.Secure.getUriFor("minors_mode_age_range");
        context.getContentResolver().registerContentObserver(uriFor, false, new a(uriFor, this, context));
        Uri uriFor2 = Settings.Secure.getUriFor("minors_mode_enabled");
        context.getContentResolver().registerContentObserver(uriFor2, false, new b(uriFor2, this, context));
        this.f110589a.setValue(new com.bilibili.app.comm.restrict.f(f(context), com.bilibili.app.comm.restrict.c.a(e(context))));
        BiliContext.registerActivityStateCallback(new c(this, context));
        return Unit.INSTANCE;
    }
}
