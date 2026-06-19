package com.bilibili.mini.player.common.manager;

import Aj.f;
import F3.C1870y2;
import F3.C1877z2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.base.MainThread;
import com.bilibili.mini.player.common.AppState;
import com.bilibili.ogv.operation2.inlinevideo.v;
import com.bilibili.playerbizcommon.gesture.OnDoubleTapListener;
import com.bilibili.playerbizcommon.gesture.OnSingleTapListener;
import com.bilibili.teenagersmode.TeenagersMode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import uh0.C8732a;
import uh0.C8734c;
import vh0.AbstractC8809a;
import xh0.C8978d;
import xh0.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/e.class */
public final class e extends BiliContext.AppActivityLifecycleListener implements CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e f66066b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f66067c = LazyKt.lazy(new C1870y2(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f66068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Application f66069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy f66070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final vh0.c f66071g;

    @NotNull
    public static final c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f66072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final d f66073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b f66074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static WeakReference<Activity> f66075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static C8734c f66076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static Job f66077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static Job f66078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static BiliCardPlayerScene.CardPlayTask.Token f66079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f66080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f66081r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f66082a = o.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/e$a.class */
    public static final class a implements OnDoubleTapListener {
        @Override // com.bilibili.playerbizcommon.gesture.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            AbstractC8809a abstractC8809a;
            C8734c c8734c = e.f66076m;
            if (c8734c != null && (abstractC8809a = c8734c.f127873g) != null) {
                abstractC8809a.f();
            }
            e.f66066b.getClass();
            h hVarC = e.c();
            C8978d c8978dH = hVarC.h();
            if (c8978dH == null) {
                return true;
            }
            com.bilibili.mini.player.common.manager.c cVar = com.bilibili.mini.player.common.manager.c.f66064b;
            BiliGlobalPreferenceHelper.getInstance(cVar.b()).edit().putInt("float_window_size", (BiliGlobalPreferenceHelper.getInstance(cVar.b()).optInteger("float_window_size", 1) + 1) % hVarC.f129248g.size()).apply();
            hVarC.q(c8978dH.getWidth());
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/e$b.class */
    public static final class b implements TeenagersMode.OnTeenagersModeChangeListener {
        @Override // com.bilibili.teenagersmode.TeenagersMode.OnTeenagersModeChangeListener
        public final void onStateChange(final boolean z6, boolean z7) {
            MainThread.runOnMainThread(new Function0(z6) { // from class: com.bilibili.mini.player.common.manager.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f66083a;

                {
                    this.f66083a = z6;
                }

                public final Object invoke() {
                    if (this.f66083a) {
                        BLog.e("MiniPlayerManager", "teenagers mode changed, close mini player");
                        e.f66066b.getClass();
                        e.d();
                    }
                    return Unit.INSTANCE;
                }
            });
        }

        @Override // com.bilibili.teenagersmode.TeenagersMode.OnTeenagersModeChangeListener
        public final void onTeenagerModePageShow(boolean z6) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/e$c.class */
    public static final class c implements OnSingleTapListener {
        @Override // com.bilibili.playerbizcommon.gesture.OnSingleTapListener
        public final boolean onTap(MotionEvent motionEvent) {
            AbstractC8809a abstractC8809a;
            AbstractC8809a abstractC8809a2;
            C8734c c8734c = e.f66076m;
            if (c8734c != null && (abstractC8809a2 = c8734c.f127873g) != null) {
                abstractC8809a2.f();
            }
            C8734c c8734c2 = e.f66076m;
            if (c8734c2 == null || (abstractC8809a = c8734c2.f127873g) == null) {
                return true;
            }
            abstractC8809a.p(v.f70979a);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.mini.player.common.manager.e$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.mini.player.common.manager.e$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.bilibili.mini.player.common.manager.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.mini.player.common.manager.e$b, java.lang.Object] */
    static {
        Application application = BiliContext.application();
        if (application == null) {
            throw new IllegalArgumentException("BiliContext Application is null");
        }
        f66069e = application;
        f66070f = LazyKt.lazy(new C1877z2(8));
        f66071g = new vh0.c();
        h = new Object();
        f66072i = new Object();
        f66073j = new Object();
        f66074k = new Object();
    }

    public static void a(boolean z6) {
        C8734c c8734c = f66076m;
        if (c8734c != null) {
            AbstractC8809a abstractC8809a = c8734c.f127873g;
            if (abstractC8809a != null) {
                abstractC8809a.k();
            }
            AbstractC8809a abstractC8809a2 = c8734c.f127873g;
            if (abstractC8809a2 != null) {
                abstractC8809a2.f128251b = null;
            }
            if (z6) {
                if (abstractC8809a2 != null) {
                    abstractC8809a2.j();
                }
                f66066b.getClass();
                C8978d c8978dH = c().h();
                if (c8978dH != null) {
                    AbstractC8809a abstractC8809a3 = c8734c.f127873g;
                    c8978dH.removeView(abstractC8809a3 != null ? abstractC8809a3.e() : null);
                }
            }
            c8734c.f127869c = null;
            c8734c.f127870d = null;
            c8734c.f127873g = null;
            f66076m = null;
        }
        BiliCardPlayerScene.CardPlayTask.Token token = f66079p;
        if (token != null) {
            token.removerDoubleTapListener(f66072i);
        }
        BiliCardPlayerScene.CardPlayTask.Token token2 = f66079p;
        if (token2 != null) {
            token2.removerSingleTapListener(h);
        }
        f66079p = null;
    }

    @NotNull
    public static h c() {
        return (h) f66067c.getValue();
    }

    public static void d() {
        ArrayList<Animator> childAnimations;
        BiliCardPlayerScene.CardPlayTask cardPlayTask;
        f66068d = false;
        Job job = f66077n;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = f66078o;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        f66077n = null;
        f66078o = null;
        C8734c c8734c = f66076m;
        int sharedRecordId = (c8734c == null || (cardPlayTask = c8734c.f127867a) == null) ? -1 : cardPlayTask.getSharedRecordId();
        a(true);
        h hVarC = c();
        hVarC.getClass();
        BLog.i("MiniPlayerManager", "release mini player float view manager");
        if (hVarC.f129253m && hVarC.f129254n) {
            hVarC.n();
            hVarC.f129247f = new Pair<>(Integer.valueOf(hVarC.f129244c.x), Integer.valueOf(hVarC.f129244c.y));
        }
        hVarC.f129254n = false;
        hVarC.f129245d = false;
        WeakReference<WindowManager> weakReference = hVarC.f129252l;
        if (weakReference != null) {
            weakReference.clear();
        }
        hVarC.f129252l = null;
        AnimatorSet animatorSet = hVarC.f129259s;
        if (animatorSet != null && (childAnimations = animatorSet.getChildAnimations()) != null) {
            for (Animator animator : childAnimations) {
                ValueAnimator valueAnimator = animator instanceof ValueAnimator ? (ValueAnimator) animator : null;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                }
                animator.removeAllListeners();
                animator.cancel();
            }
        }
        AnimatorSet animatorSet2 = hVarC.f129259s;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        C8978d c8978dH = hVarC.h();
        if (c8978dH != null) {
            c8978dH.f129231a.clear();
        }
        try {
            C8978d c8978dH2 = hVarC.h();
            if (c8978dH2 != null) {
                c8978dH2.removeAllViews();
            }
        } catch (Exception e7) {
            BLog.e("MiniPlayerManager", "removeAllViews failed during release", e7);
        }
        hVarC.f129243b = null;
        Lazy lazy = f66070f;
        BiliCardPlayerScene.stop$default(((C8732a) lazy.getValue()).f127866a, false, 1, (Object) null);
        ((C8732a) lazy.getValue()).release();
        if (sharedRecordId != -1) {
            IPlayerContainer.Companion.forceDestroyShareRecord(sharedRecordId);
        }
        Lazy lazy2 = Aj.f.p;
        f.a.a().h("MiniPlayer");
    }

    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f66082a.getCoroutineContext();
    }

    public final void onActivityPaused(@NotNull Activity activity) {
        Function2<? super Activity, ? super Lifecycle.Event, Unit> function2;
        super/*com.bilibili.base.BiliContext.ActivityStateCallback*/.onActivityPaused(activity);
        WeakReference<Activity> weakReference = f66075l;
        if ((weakReference != null ? weakReference.get() : null) == activity) {
            h hVarC = c();
            hVarC.getClass();
            if (Rf0.f.b()) {
                hVarC.f129252l = new WeakReference<>(hVarC.f129251k);
                hVarC.f129251k = null;
            } else {
                BLog.i("MiniPlayerManager", "start remove from " + activity + " window");
                WindowManager windowManager = activity.getWindowManager();
                WindowManager windowManager2 = hVarC.f129251k;
                if (windowManager == windowManager2 && hVarC.f129253m && hVarC.f129254n) {
                    BLog.i("MiniPlayerManager", "remove player view from " + activity + " window: " + windowManager2);
                    hVarC.n();
                    hVarC.f129245d = true;
                    f66066b.getClass();
                    C8734c c8734c = f66076m;
                    if (c8734c != null && (function2 = c8734c.f127869c) != null) {
                        function2.invoke(activity, Lifecycle.Event.ON_PAUSE);
                    }
                }
                hVarC.f129252l = new WeakReference<>(hVarC.f129251k);
                hVarC.f129251k = null;
            }
            f66075l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResumed(@org.jetbrains.annotations.NotNull android.app.Activity r9) {
        /*
            Method dump skipped, instruction units count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.common.manager.e.onActivityResumed(android.app.Activity):void");
    }

    public final void onActivityStopped(@NotNull Activity activity) {
        super/*com.bilibili.base.BiliContext.ActivityStateCallback*/.onActivityStopped(activity);
        WeakReference<Activity> weakReference = f66075l;
        if ((weakReference != null ? weakReference.get() : null) == activity) {
            f66075l = null;
        }
    }

    public final void onFirstActivityVisible() {
        AbstractC8809a abstractC8809a;
        Function1<? super AppState, Unit> function1;
        super.onFirstActivityVisible();
        C8734c c8734c = f66076m;
        if (c8734c != null && (function1 = c8734c.f127870d) != null) {
            function1.invoke(AppState.Foreground);
        }
        C8734c c8734c2 = f66076m;
        if (c8734c2 != null && (abstractC8809a = c8734c2.f127873g) != null) {
            abstractC8809a.o();
        }
        if (f66080q) {
            f66080q = false;
            BiliCardPlayerScene.CardPlayTask.Token token = f66079p;
            if (token != null) {
                token.resume();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLastActivityInvisible() {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.common.manager.e.onLastActivityInvisible():void");
    }
}
