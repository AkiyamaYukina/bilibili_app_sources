package com.bilibili.search2.result.all;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.crashreport.CrashReporter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/f.class */
@StabilityInferred(parameters = 0)
public final class C6052f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f87279c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f87280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PopupWindow f87281b;

    public C6052f(@NotNull Context context) {
        this.f87280a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.search2.result.all.C6052f r7, android.view.View r8, int r9, kotlin.jvm.functions.Function0 r10, kotlin.coroutines.jvm.internal.SuspendLambda r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.C6052f.a(com.bilibili.search2.result.all.f, android.view.View, int, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.SuspendLambda):java.lang.Object");
    }

    public final boolean b(String str) {
        try {
            PopupWindow popupWindow = new PopupWindow(this.f87280a);
            View viewInflate = LayoutInflater.from(this.f87280a).inflate(2131494373, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(2131302502);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            if (!Intrinsics.areEqual(textView.getText(), str)) {
                textView.setText(str);
            }
            popupWindow.setInputMethodMode(1);
            popupWindow.setFocusable(false);
            popupWindow.setTouchable(false);
            popupWindow.setOutsideTouchable(false);
            popupWindow.setContentView(viewInflate);
            this.f87281b = popupWindow;
            return true;
        } catch (Exception e7) {
            CrashReporter.INSTANCE.postCaughtException(e7);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.bilibili.lib.ui.BaseFragment r10, @org.jetbrains.annotations.NotNull android.view.View r11, @org.jetbrains.annotations.NotNull com.bilibili.search2.result.all.o r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.C6052f.c(com.bilibili.lib.ui.BaseFragment, android.view.View, com.bilibili.search2.result.all.o, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
