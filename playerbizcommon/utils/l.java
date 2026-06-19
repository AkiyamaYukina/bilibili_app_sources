package com.bilibili.playerbizcommon.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.ui.util.StatusBarCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/l.class */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f80297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80303g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public View f80305j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final a f80307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f80308m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f80306k = AppBuildConfig.Companion.isHDApp();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final QI0.d f80309n = new QI0.d(this, 3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final k f80310o = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.bilibili.playerbizcommon.utils.k

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f80296a;

        {
            this.f80296a = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = this.f80296a;
            HandlerThreads.remove(0, lVar.f80309n);
            HandlerThreads.post(0, lVar.f80309n);
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/l$a.class */
    public interface a {
        void keyBoardHide();

        void keyBoardShow(int i7);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.playerbizcommon.utils.k] */
    public l(@NotNull Activity activity, @NotNull a aVar, boolean z6) {
        this.f80297a = activity;
        this.f80298b = z6;
        this.f80299c = StatusBarCompat.getNavigationBarHeight(activity);
        this.f80307l = aVar;
    }

    public final void a(boolean z6) {
        if (this.f80303g && this.h != z6) {
            this.h = z6;
            this.f80308m = ScreenUtil.getScreenHeight(this.f80297a);
        }
    }

    public final void b(@NotNull Window window) {
        if (this.f80303g) {
            return;
        }
        this.f80303g = true;
        this.f80304i = false;
        View decorView = window.getDecorView();
        this.f80305j = decorView;
        if (decorView == null) {
            return;
        }
        Activity activity = this.f80297a;
        this.f80308m = ScreenUtil.getScreenHeight(activity);
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        this.f80300d = rect.height();
        this.f80301e = rect.top;
        this.f80302f = 0;
        this.f80299c = StatusBarCompat.getNavigationBarHeight(activity);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        k kVar = this.f80310o;
        viewTreeObserver.removeOnGlobalLayoutListener(kVar);
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(kVar);
    }

    public final void c() {
        this.f80303g = false;
        HandlerThreads.remove(0, this.f80309n);
        View view = this.f80305j;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f80310o);
    }
}
