package com.bilibili.playerbizcommon.gesture;

import Aq0.w;
import Aq0.z;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import androidx.core.view.GestureDetectorCompat;
import com.bilibili.bilipay.web.hybrid.BilipayBaseWebActivity;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/c.class */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f80061o = ViewConfiguration.getDoubleTapTimeout() + 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f80062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MotionEvent f80063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MotionEvent f80064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MotionEvent f80065d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80068g;

    @Nullable
    public w h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public d f80069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final z f80070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ScaleGestureDetector f80071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public GestureDetectorCompat f80072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public RotateGestureDetector f80073m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Handler f80066e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f80074n = true;

    /* JADX WARN: Type inference failed for: r1v6, types: [Aq0.z] */
    public c(@NotNull PlayerContainer playerContainer) {
        this.f80062a = playerContainer;
        this.f80067f = ViewConfiguration.get(playerContainer.getContext()).getScaledDoubleTapSlop();
        final int i7 = 0;
        this.f80070j = new Runnable(this, i7) { // from class: Aq0.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f561b;

            {
                this.f560a = i7;
                this.f561b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f560a) {
                    case 0:
                        com.bilibili.playerbizcommon.gesture.c cVar = (com.bilibili.playerbizcommon.gesture.c) this.f561b;
                        PlayerLog.d("BiliPlayerV2", "handle time out msg");
                        cVar.b();
                        break;
                    default:
                        BilipayBaseWebActivity bilipayBaseWebActivity = (BilipayBaseWebActivity) this.f561b;
                        WebView webView = bilipayBaseWebActivity.F;
                        String title = webView != null ? webView.getTitle() : "";
                        if (!TextUtils.isEmpty(bilipayBaseWebActivity.H)) {
                            title = bilipayBaseWebActivity.H;
                        }
                        bilipayBaseWebActivity.R6(title);
                        break;
                }
            }
        };
    }

    public final boolean a(@NotNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (!this.f80074n) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        Handler handler = this.f80066e;
        z zVar = this.f80070j;
        if (actionMasked == 0) {
            handler.removeCallbacks(zVar);
            if (this.f80064c == null) {
                this.f80064c = MotionEvent.obtain(motionEvent);
                PlayerLog.d("BiliPlayerV2", "pre down event instance");
                return false;
            }
            this.f80063b = MotionEvent.obtain(motionEvent);
            PlayerLog.d("BiliPlayerV2", "curr down event instance");
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                handler.removeCallbacks(zVar);
                b();
                return false;
            }
            if (actionMasked != 5) {
                return false;
            }
            if (motionEvent.getPointerCount() != 2) {
                b();
                PlayerLog.d("BiliPlayerV2", "reset when not two finger");
                return false;
            }
            int i7 = this.f80068g + 1;
            this.f80068g = i7;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            PlayerLog.d("BiliPlayerV2", String.format("click count (%d)", Arrays.copyOf(new Object[]{Integer.valueOf(i7)}, 1)));
            return false;
        }
        MotionEvent motionEvent3 = this.f80065d;
        int i8 = f80061o;
        if (motionEvent3 == null && this.f80064c != null) {
            this.f80065d = MotionEvent.obtain(motionEvent);
            PlayerLog.d("BiliPlayerV2", "action up when double click");
            handler.removeCallbacks(zVar);
            handler.postDelayed(zVar, i8 + 50);
            return false;
        }
        if (this.f80064c != null && motionEvent3 != null && (motionEvent2 = this.f80063b) != null && this.f80068g == 2) {
            long eventTime = motionEvent2.getEventTime() - this.f80065d.getEventTime();
            if (eventTime <= i8 && eventTime >= 50) {
                int x6 = (int) this.f80064c.getX();
                int x7 = (int) this.f80063b.getX();
                int y6 = (int) this.f80064c.getY();
                int y7 = (int) this.f80063b.getY();
                int iAbs = Math.abs(x6 - x7);
                int i9 = this.f80067f;
                if (iAbs < i9 && Math.abs(y6 - y7) < i9) {
                    w wVar = this.h;
                    if (wVar != null) {
                        wVar.a(this.f80064c, this.f80063b);
                    }
                    b();
                    return true;
                }
            }
        }
        b();
        return false;
    }

    public final void b() {
        this.f80064c = null;
        this.f80065d = null;
        this.f80063b = null;
        this.f80068g = 0;
        this.f80066e.removeCallbacks(this.f80070j);
    }
}
