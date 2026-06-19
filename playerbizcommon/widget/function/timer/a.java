package com.bilibili.playerbizcommon.widget.function.timer;

import com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/a.class */
public final class a implements PlayerTimePicker.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80791a;

    public a(String str) {
        this.f80791a = str;
    }

    @Override // com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker.d
    public final String format(int i7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), this.f80791a, Arrays.copyOf(new Object[]{Integer.valueOf(i7)}, 1));
    }
}
