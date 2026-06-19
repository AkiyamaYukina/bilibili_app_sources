package com.bilibili.ship.theseus.united.utils;

import android.content.Context;
import androidx.annotation.StringRes;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/q.class */
public final class q {
    public static final void a(@StringRes int i7) {
        Context applicationContext = BiliContext.topActivity();
        if (applicationContext == null) {
            applicationContext = FoundationAlias.getFapp().getApplicationContext();
        }
        String string = applicationContext.getString(i7);
        if (string == null || StringsKt.isBlank(string)) {
            return;
        }
        ToastHelper.showToast(FoundationAlias.getFapp(), string, 0, 81);
    }

    public static final void b(@StringRes int i7) {
        Context applicationContext = BiliContext.topActivity();
        if (applicationContext == null) {
            applicationContext = FoundationAlias.getFapp().getApplicationContext();
        }
        c(applicationContext.getString(i7));
    }

    public static final void c(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        ToastHelper.showToast(FoundationAlias.getFapp(), str, 0, 17);
    }
}
