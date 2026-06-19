package com.bilibili.playerbizcommonv2.danmaku.helper;

import G3.C1905b0;
import Vn.A;
import X50.U;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.biligame.utils.B;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.playerbizcommonv2.danmaku.helper.SoftKeyBoardHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import or0.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/helper/SoftKeyBoardHelper.class */
@StabilityInferred(parameters = 0)
public final class SoftKeyBoardHelper {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f80950n = LazyKt.lazy(new C1905b0(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final OnSoftKeyBoardChangeListener f80951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Context f80952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80956f;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80958i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f80961l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public ScreenModeType f80957g = ScreenModeType.THUMB;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f80959j = DeviceDecision.INSTANCE.getBoolean("dd_player_new_soft_keyboard", true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final j f80960k = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: or0.j

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SoftKeyBoardHelper f124928a;

        {
            this.f124928a = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int systemWindowInsetBottom;
            SoftKeyBoardHelper softKeyBoardHelper = this.f124928a;
            View view = softKeyBoardHelper.h;
            if (view == null) {
                return;
            }
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            int iHeight = rect.height();
            int i7 = rect.top;
            if (softKeyBoardHelper.f80957g != ScreenModeType.THUMB) {
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    systemWindowInsetBottom = 0;
                    if (rootWindowInsets != null) {
                        Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.systemBars());
                        systemWindowInsetBottom = 0;
                        if (insets != null) {
                            systemWindowInsetBottom = insets.bottom;
                        }
                    }
                } else {
                    WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
                    systemWindowInsetBottom = 0;
                    if (rootWindowInsets2 != null) {
                        systemWindowInsetBottom = rootWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                softKeyBoardHelper.f80956f = systemWindowInsetBottom;
            }
            int i8 = rect.left;
            int i9 = rect.top;
            int i10 = rect.right;
            int i11 = rect.bottom;
            int iHeight2 = rect.height();
            StringBuilder sbB = A.b(i8, i9, "display frame left:", " top:", " right:");
            C4690e.a(i10, i11, " bottom:", " height:", sbB);
            Z.b(iHeight2, "SoftKeyBoardHelper", sbB);
            bilibili.live.app.service.resolver.c.a(softKeyBoardHelper.f80956f, "bottom inset height:", "SoftKeyBoardHelper");
            if (iHeight == 0) {
                return;
            }
            int i12 = softKeyBoardHelper.f80953c;
            if (i12 == 0) {
                softKeyBoardHelper.f80953c = iHeight;
                return;
            }
            if (i12 == iHeight) {
                return;
            }
            int i13 = softKeyBoardHelper.f80956f;
            int i14 = softKeyBoardHelper.f80954d;
            SoftKeyBoardHelper.OnSoftKeyBoardChangeListener onSoftKeyBoardChangeListener = softKeyBoardHelper.f80951a;
            if (iHeight + i13 == i14 || iHeight > i14) {
                if (onSoftKeyBoardChangeListener != null) {
                    onSoftKeyBoardChangeListener.keyBoardHide();
                }
                int i15 = softKeyBoardHelper.f80953c;
                Z.b(iHeight - i15, "SoftKeyBoardHelper", A.b(iHeight, i15, "key board hide: ", "-", "="));
            } else {
                int i16 = softKeyBoardHelper.f80955e;
                int i17 = i14 - (((iHeight + i7) + i13) - i16);
                StringBuilder sbB2 = A.b(i14, iHeight, "key board show: keyboardHeight = ", " - (", " + ");
                C4690e.a(i7, i13, " + ", " - ", sbB2);
                B.a(i16, ")", "SoftKeyBoardHelper", sbB2);
                if (i17 > 100 && onSoftKeyBoardChangeListener != null) {
                    onSoftKeyBoardChangeListener.keyBoardShow(i17);
                }
            }
            softKeyBoardHelper.f80953c = iHeight;
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final U f80962m = new U(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/helper/SoftKeyBoardHelper$OnSoftKeyBoardChangeListener.class */
    public interface OnSoftKeyBoardChangeListener {
        void keyBoardHide();

        void keyBoardShow(int i7);

        void keyBoardUpdate(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/helper/SoftKeyBoardHelper$a.class */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [or0.j] */
    public SoftKeyBoardHelper(@Nullable OnSoftKeyBoardChangeListener onSoftKeyBoardChangeListener, @Nullable Context context) {
        this.f80951a = onSoftKeyBoardChangeListener;
        this.f80952b = context;
    }

    public static /* synthetic */ void start$default(SoftKeyBoardHelper softKeyBoardHelper, Window window, ScreenModeType screenModeType, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            screenModeType = ScreenModeType.THUMB;
        }
        softKeyBoardHelper.start(window, screenModeType);
    }

    public final void start(@Nullable Window window, @NotNull ScreenModeType screenModeType) {
        this.f80957g = screenModeType;
        View decorView = window != null ? window.getDecorView() : null;
        this.h = decorView;
        if (decorView != null) {
            boolean zIsVisible = false;
            if (Build.VERSION.SDK_INT >= 30 && this.f80959j) {
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
                if (rootWindowInsets != null) {
                    zIsVisible = rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime());
                }
                this.f80958i = zIsVisible;
                ViewCompat.setOnApplyWindowInsetsListener(decorView, this.f80962m);
                return;
            }
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int iHeight = rect.height();
            this.f80954d = iHeight;
            this.f80953c = iHeight;
            this.f80955e = rect.top;
            this.f80956f = 0;
            ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
            j jVar = this.f80960k;
            viewTreeObserver.removeOnGlobalLayoutListener(jVar);
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(jVar);
        }
    }

    public final void stop() {
        View view = this.h;
        if (view != null) {
            if (Build.VERSION.SDK_INT < 30 || !this.f80959j) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f80960k);
            } else {
                ViewCompat.setOnApplyWindowInsetsListener(view, null);
            }
            this.h = null;
        }
    }
}
