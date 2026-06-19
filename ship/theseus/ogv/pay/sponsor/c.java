package com.bilibili.ship.theseus.ogv.pay.sponsor;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.ShareResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/c.class */
@StabilityInferred(parameters = 0)
public final class c extends ShareHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f94254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f94255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f94256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f94257d;

    public c(@NotNull Context context, @Nullable String str, @NotNull String str2, @Nullable String str3) {
        this.f94254a = context;
        this.f94255b = str;
        this.f94256c = str2;
        this.f94257d = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle getShareContent(@org.jetbrains.annotations.Nullable java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.pay.sponsor.c.getShareContent(java.lang.String):android.os.Bundle");
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.SimpleCallback, com.bilibili.lib.sharewrapper.ShareHelper.Callback
    public final void onShareFail(@Nullable String str, @Nullable ShareResult shareResult) {
        super.onShareFail(str, shareResult);
        ToastHelper.showToastLong(this.f94254a, 2131848270);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.SimpleCallback, com.bilibili.lib.sharewrapper.ShareHelper.Callback
    public final void onShareSuccess(@Nullable String str, @Nullable ShareResult shareResult) {
        super.onShareSuccess(str, shareResult);
        ToastHelper.showToastLong(this.f94254a, 2131848273);
    }
}
