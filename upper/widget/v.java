package com.bilibili.upper.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.TypedValue;
import androidx.compose.foundation.text.U1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.airbnb.lottie.LottieAnimationView;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.coroutineextension.CoroutineExtensionKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/v.class */
@StabilityInferred(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f114656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f114657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<WeakReference<InterfaceC6694i>> f114658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<WeakReference<LottieAnimationView>> f114659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f114660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f114661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f114662g;

    @Nullable
    public Job h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f114663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public AnimatorSet f114664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final QS0.n f114665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public AnimatorSet f114666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final XO.E f114667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final p f114668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final q f114669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final r f114670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final s f114671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final t f114672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final u f114673s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/v$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Paint f114674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public Paint f114675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public Paint f114676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f114677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f114678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f114679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f114680g;

        public final void a(@NotNull Context context) {
            int color = context.getResources().getColor(2131101220);
            this.f114680g = color;
            this.f114674a.setColor(color);
            this.f114675b.setColor(this.f114680g);
            this.f114676c.setColor(this.f114680g);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/v$b.class */
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f114681a;

        public b(v vVar) {
            this.f114681a = vVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f114681a.b();
            this.f114681a.c();
            Job job = this.f114681a.h;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            v vVar = this.f114681a;
            vVar.f114657b.getClass();
            vVar.h = CoroutineExtensionKt.c(PayTask.f60018j, new Ea.b(this.f114681a, 3));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/v$c.class */
    public static final class c implements LifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f114682a;

        public c(v vVar) {
            this.f114682a = vVar;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            v vVar = this.f114682a;
            AnimatorSet animatorSet = vVar.f114664j;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            AnimatorSet animatorSet2 = vVar.f114666l;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            vVar.f();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            this.f114682a.f();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            this.f114682a.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.upper.widget.v$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [com.bilibili.upper.widget.p] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.bilibili.upper.widget.q] */
    /* JADX WARN: Type inference failed for: r1v35, types: [com.bilibili.upper.widget.r] */
    /* JADX WARN: Type inference failed for: r1v36, types: [com.bilibili.upper.widget.s] */
    /* JADX WARN: Type inference failed for: r1v37, types: [com.bilibili.upper.widget.t] */
    /* JADX WARN: Type inference failed for: r1v38, types: [com.bilibili.upper.widget.u] */
    public v(@NotNull Context context) {
        this.f114656a = context;
        ?? obj = new Object();
        obj.f114674a = new Paint();
        obj.f114675b = new Paint();
        obj.f114676c = new Paint();
        this.f114657b = obj;
        obj.a(context);
        obj.f114679f = (int) TypedValue.applyDimension(1, 17.0f, Resources.getSystem().getDisplayMetrics());
        obj.f114674a.setStrokeWidth(1.3f);
        obj.f114674a.setAlpha(255);
        obj.f114674a.setAntiAlias(true);
        Paint paint = obj.f114674a;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        obj.f114675b.setStrokeWidth(1.3f);
        obj.f114675b.setAlpha(255);
        obj.f114675b.setAntiAlias(true);
        obj.f114675b.setStyle(style);
        obj.f114676c.setStrokeWidth(1.3f);
        obj.f114676c.setAlpha(obj.f114674a.getAlpha());
        obj.f114676c.setAntiAlias(obj.f114674a.isAntiAlias());
        obj.f114676c.setStyle(obj.f114674a.getStyle());
        this.f114658c = new ArrayList();
        this.f114659d = new ArrayList();
        this.f114663i = new b(this);
        this.f114665k = new QS0.n(this, 5);
        this.f114667m = new XO.E(this, 3);
        this.f114668n = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.upper.widget.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f114563a;

            {
                this.f114563a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v vVar = this.f114563a;
                vVar.f114657b.f114678e = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                vVar.a();
            }
        };
        this.f114669o = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.upper.widget.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f114564a;

            {
                this.f114564a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v vVar = this.f114564a;
                vVar.f114657b.f114677d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                vVar.a();
            }
        };
        this.f114670p = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.upper.widget.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f114565a;

            {
                this.f114565a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114565a.f114657b.f114674a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        this.f114671q = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.upper.widget.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f114586a;

            {
                this.f114586a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114586a.f114657b.f114675b.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        this.f114672r = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.upper.widget.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f114597a;

            {
                this.f114597a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114597a.f114657b.f114674a.setStrokeWidth(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
        this.f114673s = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.upper.widget.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f114655a;

            {
                this.f114655a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114655a.f114657b.f114674a.setStrokeWidth(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        };
    }

    public final void a() {
        Iterator it = ((ArrayList) this.f114658c).iterator();
        while (it.hasNext()) {
            InterfaceC6694i interfaceC6694i = (InterfaceC6694i) ((WeakReference) it.next()).get();
            if (interfaceC6694i != null) {
                interfaceC6694i.a(this.f114657b);
            }
        }
        if (((ArrayList) this.f114659d).size() > 0) {
            int frame = 0;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((WeakReference) ((ArrayList) this.f114659d).get(0)).get();
            if (lottieAnimationView != null) {
                frame = lottieAnimationView.getFrame();
            }
            Iterator it2 = ((ArrayList) this.f114659d).iterator();
            while (it2.hasNext()) {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((WeakReference) it2.next()).get();
                if (lottieAnimationView2 != null && !lottieAnimationView2.isAnimating()) {
                    lottieAnimationView2.setFrame(frame);
                    lottieAnimationView2.resumeAnimation();
                }
            }
        }
    }

    public final void b() {
        a aVar = this.f114657b;
        aVar.f114678e = 0;
        aVar.f114674a.setAlpha(255);
        aVar.f114674a.setColor(aVar.f114680g);
        aVar.f114674a.setStrokeWidth(1.3f);
        a();
    }

    public final void c() {
        a aVar = this.f114657b;
        aVar.f114677d = 0;
        aVar.f114675b.setAlpha(255);
        aVar.f114675b.setColor(aVar.f114680g);
        aVar.f114675b.setStrokeWidth(1.3f);
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r5 = this;
            r0 = r5
            r0.e()
            r0 = r5
            android.content.Context r0 = r0.f114656a
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof android.content.ContextWrapper
            r6 = r0
            r0 = 0
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L1d
            r0 = r7
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            r7 = r0
            goto L1f
        L1d:
            r0 = 0
            r7 = r0
        L1f:
            r0 = r9
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L4e
            r0 = r7
            boolean r0 = r0 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L3a
            r0 = r7
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r8 = r0
            goto L4e
        L3a:
            r0 = r7
            android.content.Context r0 = r0.getBaseContext()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L1d
            r0 = r7
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            r7 = r0
            goto L1f
        L4e:
            r0 = r8
            if (r0 == 0) goto L5e
            r0 = r8
            com.bilibili.upper.widget.v$c r1 = new com.bilibili.upper.widget.v$c
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.addObserver(r1)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.v.d():void");
    }

    public final void e() {
        if (this.f114660e) {
            return;
        }
        Job job = this.f114661f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f114662g;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f114657b.getClass();
        this.f114661f = CoroutineExtensionKt.c(500L, new com.bilibili.bplus.followinglist.home.u(this, 2));
        this.f114662g = CoroutineExtensionKt.c(1000L, new U1(this, 4));
        Iterator it = ((ArrayList) this.f114659d).iterator();
        while (it.hasNext()) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((WeakReference) it.next()).get();
            if (lottieAnimationView != null) {
                lottieAnimationView.loop(true);
            }
            if (lottieAnimationView == null) {
                it.remove();
            } else {
                lottieAnimationView.playAnimation();
            }
        }
        this.f114660e = true;
    }

    public final void f() {
        if (this.f114660e) {
            Job job = this.f114661f;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            Job job2 = this.f114662g;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            Job job3 = this.h;
            if (job3 != null) {
                Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
            }
            AnimatorSet animatorSet = this.f114664j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f114666l;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Iterator it = ((ArrayList) this.f114659d).iterator();
            while (it.hasNext()) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ((WeakReference) it.next()).get();
                if (lottieAnimationView == null) {
                    it.remove();
                } else {
                    lottieAnimationView.setFrame(0);
                    lottieAnimationView.cancelAnimation();
                }
            }
            this.f114660e = false;
        }
    }
}
