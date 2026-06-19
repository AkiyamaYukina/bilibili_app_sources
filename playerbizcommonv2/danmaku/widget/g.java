package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.bilibili.droid.ScreenUtil;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/g.class */
public final class g implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f81656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f81657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f81658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81659d;

    public g(Context context, e eVar, ViewGroup viewGroup, int i7) {
        this.f81656a = context;
        this.f81657b = eVar;
        this.f81658c = viewGroup;
        this.f81659d = i7;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        int screenHeight = ScreenUtil.getScreenHeight(this.f81656a);
        int statusHeight = ScreenUtil.getStatusHeight(this.f81656a);
        e eVar = this.f81657b;
        eVar.getClass();
        bilibili.live.app.service.resolver.c.a(insets.bottom, "im inset bottom: ", "PlayerDanmakuKeywordsBlockFunctionWidget");
        int i7 = insets.bottom;
        if (statusHeight + i7 < screenHeight) {
            this.f81658c.setPadding(0, 0, 0, this.f81659d + i7);
            return WindowInsetsCompat.CONSUMED;
        }
        eVar.getClass();
        BLog.i("PlayerDanmakuKeywordsBlockFunctionWidget", "keyboard height beyond screen height, ignore.");
        return windowInsetsCompat;
    }
}
