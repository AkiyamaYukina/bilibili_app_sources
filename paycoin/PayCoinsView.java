package com.bilibili.paycoin;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.analytics.C4674p;
import androidx.window.core.layout.WindowSizeClass;
import bolts.Task;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.WindowManagerHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.module.tuwen.util.BcutVideoClipCropUtil;
import com.bilibili.xpref.Xpref;
import java.io.File;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView.class */
public final class PayCoinsView extends ComponentDialog {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f74712M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final GestureDetector f74713A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f74714B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f74715C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public a f74716D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f74717E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f74718F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f74719G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f74720H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public i f74721I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final WH0.a f74722J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final u f74723K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final v f74724L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f74725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f74726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f74727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f74728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f74729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f74730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f74731g;
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f74732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f74733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f74734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f74735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f74736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f74737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f74738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f74739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f74740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f74741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f74742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f74743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f74744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CheckBox f74745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f74746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f74747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f74748y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f74749z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$a.class */
    public interface a {
        default void a() {
        }

        default void b() {
        }

        default void c() {
        }

        void d(int i7, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$b.class */
    public static final class b {
        @Nullable
        public static Object a(@NotNull View view, @NotNull String str, @NotNull SuspendLambda suspendLambda) {
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(suspendLambda));
            BiliImageLoader.INSTANCE.acquire(view).useOrigin().asDrawable().url(str).submit().subscribe(new s(safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(suspendLambda);
            }
            return orThrow;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$c.class */
    public final class c extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayCoinsView f74750a;

        public c(PayCoinsView payCoinsView) {
            this.f74750a = payCoinsView;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onScroll(@org.jetbrains.annotations.Nullable android.view.MotionEvent r7, @org.jetbrains.annotations.NotNull android.view.MotionEvent r8, float r9, float r10) {
            /*
                r6 = this;
                r0 = r6
                com.bilibili.paycoin.PayCoinsView r0 = r0.f74750a
                android.content.Context r0 = r0.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                r11 = r0
                r0 = r9
                float r0 = java.lang.Math.abs(r0)
                r1 = r10
                float r1 = java.lang.Math.abs(r1)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L85
                r0 = r6
                com.bilibili.paycoin.PayCoinsView r0 = r0.f74750a
                r12 = r0
                r0 = r12
                boolean r0 = r0.f74717E
                if (r0 != 0) goto L32
                r0 = r12
                boolean r0 = r0.f74718F
                if (r0 == 0) goto L85
            L32:
                r0 = r9
                r1 = -1054867456(0xffffffffc1200000, float:-10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L5a
                r0 = r12
                boolean r0 = r0.r()
                if (r0 != 0) goto L5a
                r0 = r6
                com.bilibili.paycoin.PayCoinsView r0 = r0.f74750a
                r12 = r0
                r0 = r12
                boolean r0 = r0.f74749z
                if (r0 != 0) goto L5a
                r0 = r12
                r1 = 200(0xc8, float:2.8E-43)
                r0.n(r1)
                goto La2
            L5a:
                r0 = r9
                r1 = r11
                float r1 = (float) r1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto La2
                r0 = r6
                com.bilibili.paycoin.PayCoinsView r0 = r0.f74750a
                boolean r0 = r0.r()
                if (r0 == 0) goto La2
                r0 = r6
                com.bilibili.paycoin.PayCoinsView r0 = r0.f74750a
                r12 = r0
                r0 = r12
                boolean r0 = r0.f74749z
                if (r0 != 0) goto La2
                r0 = r12
                r1 = 200(0xc8, float:2.8E-43)
                r0.o(r1)
                goto La2
            L85:
                r0 = r10
                r1 = r11
                float r1 = (float) r1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto La2
                r0 = r6
                com.bilibili.paycoin.PayCoinsView r0 = r0.f74750a
                r1 = r7
                boolean r0 = com.bilibili.paycoin.PayCoinsView.k(r0, r1)
                if (r0 == 0) goto La2
                r0 = r6
                com.bilibili.paycoin.PayCoinsView r0 = r0.f74750a
                com.bilibili.paycoin.PayCoinsView.l(r0)
                r0 = 1
                return r0
            La2:
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                boolean r0 = super.onScroll(r1, r2, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.paycoin.PayCoinsView.c.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onSingleTapUp(@org.jetbrains.annotations.NotNull android.view.MotionEvent r5) {
            /*
                Method dump skipped, instruction units count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.paycoin.PayCoinsView.c.onSingleTapUp(android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.paycoin.PayCoinsView$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $windowSize;
        int label;
        final PayCoinsView this$0;

        /* JADX INFO: renamed from: com.bilibili.paycoin.PayCoinsView$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinsView$onCreate$1$1.class */
        public static final class C04741 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<WindowSizeClass> $windowSize;
            Object L$0;
            int label;
            final PayCoinsView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04741(Ref.ObjectRef<WindowSizeClass> objectRef, PayCoinsView payCoinsView, Continuation<? super C04741> continuation) {
                super(2, continuation);
                this.$windowSize = objectRef;
                this.this$0 = payCoinsView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04741 c04741 = new C04741(this.$windowSize, this.this$0, continuation);
                c04741.L$0 = obj;
                return c04741;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                if (!Intrinsics.areEqual(this.$windowSize.element, windowSizeClass)) {
                    this.$windowSize.element = windowSizeClass;
                    PayCoinsView payCoinsView = this.this$0;
                    int i7 = PayCoinsView.f74712M;
                    payCoinsView.s(windowSizeClass);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PayCoinsView payCoinsView, Ref.ObjectRef<WindowSizeClass> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = payCoinsView;
            this.$windowSize = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$windowSize, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0.f74725a);
                C04741 c04741 = new C04741(this.$windowSize, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c04741, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.paycoin.i, java.lang.Object] */
    public PayCoinsView(ComponentActivity componentActivity) {
        super(componentActivity, 2131889130);
        this.f74725a = componentActivity;
        this.f74721I = new Object();
        this.f74722J = new WH0.a(this, 2);
        this.f74723K = new u(this);
        this.f74724L = new v(this);
        this.f74713A = new GestureDetector(getContext(), new c(this));
    }

    public static final void j(PayCoinsView payCoinsView) {
        ImageView imageView = payCoinsView.f74729e;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
            imageView2 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView2, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 1.1f);
        ImageView imageView3 = payCoinsView.f74729e;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
            imageView4 = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView4, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 1.1f);
        ImageView imageView5 = payCoinsView.f74729e;
        ImageView imageView6 = imageView5;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
            imageView6 = null;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView6, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.1f, 1.0f);
        ImageView imageView7 = payCoinsView.f74729e;
        if (imageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
            imageView7 = null;
        }
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView7, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.1f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        animatorSet.play(objectAnimatorOfFloat3).after(objectAnimatorOfFloat);
        animatorSet.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean k(com.bilibili.paycoin.PayCoinsView r4, android.view.MotionEvent r5) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.paycoin.PayCoinsView.k(com.bilibili.paycoin.PayCoinsView, android.view.MotionEvent):boolean");
    }

    public static final void l(PayCoinsView payCoinsView) {
        if (payCoinsView.f74749z) {
            return;
        }
        if (payCoinsView.f74747x == 1) {
            if (payCoinsView.f74715C < 1.0f) {
                return;
            }
        } else if (payCoinsView.f74715C < 2.0f) {
            return;
        }
        ImageView imageView = payCoinsView.f74729e;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
            imageView2 = null;
        }
        float f7 = ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).topMargin * 1.5f;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, f7);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(100L);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -f7);
        translateAnimation2.setInterpolator(new AccelerateInterpolator());
        translateAnimation2.setStartOffset(100L);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(payCoinsView.f74724L);
        ImageView imageView3 = payCoinsView.f74729e;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
            imageView4 = null;
        }
        imageView4.startAnimation(animationSet);
        ImageView imageView5 = payCoinsView.f74729e;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPayCoins");
            imageView5 = null;
        }
        imageView5.postDelayed(new On.k(payCoinsView, 2), 100L);
    }

    public static final void m(PayCoinsView payCoinsView, int i7) {
        String str;
        int i8;
        if (i7 == 2) {
            str = payCoinsView.f74721I.f74795g;
            i8 = 2131236297;
        } else if (i7 != 3) {
            str = payCoinsView.f74721I.f74794f;
            i8 = 2131236296;
        } else {
            str = payCoinsView.f74721I.h;
            i8 = 2131236298;
        }
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(payCoinsView.getContext());
        String strC = C5578b.c(str);
        if (strC != null && strC.length() != 0 && fragmentActivityFindFragmentActivityOrNull != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull), (CoroutineContext) null, (CoroutineStart) null, new PayCoinsView$updateThunder$1(payCoinsView, strC, i8, null), 3, (Object) null);
            return;
        }
        View view = payCoinsView.f74741r;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThunder");
            view = null;
        }
        view.setBackgroundResource(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.ViewGroup] */
    public static float[] p(View view, ViewGroup viewGroup) {
        float width = view.getWidth();
        float height = view.getHeight();
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (true) {
            View view2 = view;
            if (view2 == viewGroup) {
                break;
            }
            ViewParent parent = view2.getParent();
            view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (view == null) {
                break;
            }
            float scrollX = view.getScrollX();
            float scrollY = view.getScrollY();
            float pivotX = view2.getPivotX();
            float pivotY = view2.getPivotY();
            float scaleX = view2.getScaleX();
            float scaleY = view2.getScaleY();
            float x6 = view2.getX();
            float y6 = view2.getY();
            float f9 = x6 + pivotX;
            f7 = (((f7 - pivotX) * scaleX) + f9) - scrollX;
            float f10 = y6 + pivotY;
            f8 = (((f8 - pivotY) * scaleY) + f10) - scrollY;
            width = (((width - pivotX) * scaleX) + f9) - scrollX;
            height = (((height - pivotY) * scaleY) + f10) - scrollY;
        }
        return new float[]{f7, f8, width, height};
    }

    public final void n(int i7) {
        View view = this.f74733j;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view2 = null;
        }
        float x6 = view2.getX();
        int i8 = this.f74746w / 2;
        View view3 = this.f74733j;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view4 = null;
        }
        float width = i8 - (view4.getWidth() / 2);
        View view5 = this.f74733j;
        View view6 = view5;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view6 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view6, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 0.7f, 1.0f);
        View view7 = this.f74733j;
        View view8 = view7;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view8 = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view8, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 0.7f, 1.0f);
        View view9 = this.f74733j;
        View view10 = view9;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view10 = null;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view10, "x", x6, width);
        AnimatorSet animatorSet = new AnimatorSet();
        long j7 = i7;
        animatorSet.setDuration(j7);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
        View view11 = this.f74734k;
        View view12 = view11;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view12 = null;
        }
        float x7 = view12.getX();
        int i9 = this.f74746w;
        View view13 = this.f74734k;
        View view14 = view13;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view14 = null;
        }
        float width2 = i9 - view14.getWidth();
        float f7 = this.f74714B;
        View view15 = this.f74734k;
        View view16 = view15;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view16 = null;
        }
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view16, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 0.7f);
        View view17 = this.f74734k;
        View view18 = view17;
        if (view17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view18 = null;
        }
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view18, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 0.7f);
        View view19 = this.f74734k;
        if (view19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view19 = null;
        }
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view19, "x", x7, width2 - f7);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(this.f74723K);
        animatorSet2.setDuration(j7);
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
        animatorSet2.start();
        this.f74747x = 1;
        this.f74748y = 1;
    }

    public final void o(int i7) {
        View view = this.f74733j;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view2 = null;
        }
        float x6 = view2.getX();
        View view3 = this.f74733j;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view4 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view4, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 0.7f);
        View view5 = this.f74733j;
        View view6 = view5;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view6 = null;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view6, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 0.7f);
        View view7 = this.f74733j;
        View view8 = view7;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
            view8 = null;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view8, "x", x6, this.f74714B);
        AnimatorSet animatorSet = new AnimatorSet();
        long j7 = i7;
        animatorSet.setDuration(j7);
        animatorSet.addListener(this.f74723K);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
        View view9 = this.f74734k;
        View view10 = view9;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view10 = null;
        }
        float x7 = view10.getX();
        int i8 = this.f74746w / 2;
        View view11 = this.f74734k;
        View view12 = view11;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view12 = null;
        }
        float width = i8 - (view12.getWidth() / 2);
        View view13 = this.f74734k;
        View view14 = view13;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view14 = null;
        }
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view14, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 0.7f, 1.0f);
        View view15 = this.f74734k;
        View view16 = view15;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view16 = null;
        }
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view16, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 0.7f, 1.0f);
        View view17 = this.f74734k;
        if (view17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
            view17 = null;
        }
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view17, "x", x7, width);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(j7);
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
        animatorSet2.start();
        this.f74747x = 2;
        this.f74748y = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v73, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
            WindowCompat.setDecorFitsSystemWindows(window, false);
            window.setNavigationBarColor(0);
            window.setStatusBarColor(0);
        }
        setContentView(2131494709);
        this.f74714B = TypedValue.applyDimension(1, 46.0f, getContext().getResources().getDisplayMetrics());
        this.f74726b = findViewById(2131318054);
        this.f74730f = (ImageView) findViewById(2131298993);
        this.f74731g = (ImageView) findViewById(2131299000);
        this.f74729e = (ImageView) findViewById(2131308730);
        this.f74740q = (TextView) findViewById(2131297170);
        this.f74732i = (TextView) findViewById(2131309495);
        this.h = (ImageView) findViewById(2131298371);
        this.f74727c = (ImageView) findViewById(2131302998);
        this.f74728d = (ImageView) findViewById(2131306792);
        this.f74744u = (TextView) findViewById(2131298988);
        this.f74733j = findViewById(2131304883);
        this.f74734k = findViewById(2131304926);
        this.f74735l = findViewById(2131297955);
        this.f74736m = findViewById(2131297956);
        this.f74741r = findViewById(2131313254);
        this.f74742s = findViewById(2131307231);
        this.f74743t = findViewById(2131307234);
        this.f74745v = (CheckBox) findViewById(2131298745);
        this.f74737n = findViewById(2131321669);
        this.f74739p = findViewById(2131304800);
        ImageView imageView = this.h;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClose");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this.f74722J);
        ImageView imageView3 = this.f74727c;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLeft");
            imageView4 = null;
        }
        imageView4.setOnClickListener(this.f74722J);
        ImageView imageView5 = this.f74728d;
        ImageView imageView6 = imageView5;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRight");
            imageView6 = null;
        }
        imageView6.setOnClickListener(this.f74722J);
        TextView textView = this.f74744u;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoinHelp");
            textView2 = null;
        }
        textView2.setOnClickListener(this.f74722J);
        CheckBox checkBox = this.f74745v;
        CheckBox checkBox2 = checkBox;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCheckBox");
            checkBox2 = null;
        }
        checkBox2.setOnClickListener(this.f74722J);
        View view = this.f74737n;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCancel");
            view2 = null;
        }
        view2.setOnClickListener(this.f74722J);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131304811);
        this.f74738o = relativeLayout;
        RelativeLayout relativeLayout2 = relativeLayout;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCoin");
            relativeLayout2 = null;
        }
        relativeLayout2.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.bilibili.paycoin.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PayCoinsView f74817a;

            {
                this.f74817a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                this.f74817a.f74713A.onTouchEvent(motionEvent);
                return true;
            }
        });
        findViewById(2131321668).setOnClickListener(this.f74722J);
        TextView textView3 = this.f74732i;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrompt");
            textView4 = null;
        }
        textView4.setOnClickListener(new Object());
        View view3 = this.f74739p;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutBottom");
            view4 = null;
        }
        view4.setOnClickListener(new Object());
        q(BiliAccountInfo.Companion.get().getAccountInfoFromCache());
        Task.callInBackground(new Object()).continueWith(new z(this), Task.UI_THREAD_EXECUTOR);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.f74725a);
        objectRef.element = windowSizeClassWindowSize;
        s(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, objectRef, null), 3, (Object) null);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.getDecorView().addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.bilibili.paycoin.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PayCoinsView f74818a;

                {
                    this.f74818a = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                    String strA;
                    String str;
                    String strC;
                    String strC2;
                    PayCoinsView payCoinsView = this.f74818a;
                    if (i9 != i13) {
                        payCoinsView.f74746w = RangesKt.coerceAtMost(WindowManagerHelper.getDisplayWidth(payCoinsView.getContext()), DimenUtilsKt.dpToPx(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_RESULT_BLUR));
                        String str2 = payCoinsView.f74721I.f74789a;
                        if (str2 != null && (strA = C5578b.a()) != null) {
                            if (str2.length() > 0) {
                                i iVar = payCoinsView.f74721I;
                                String str3 = File.separator;
                                iVar.f74790b = U1.i.a(strA, str3, str2, str3, C5578b.f74751a);
                                payCoinsView.f74721I.f74791c = U1.i.a(strA, str3, str2, str3, C5578b.f74752b);
                                payCoinsView.f74721I.f74792d = U1.i.a(strA, str3, str2, str3, C5578b.f74753c);
                                payCoinsView.f74721I.f74793e = U1.i.a(strA, str3, str2, str3, C5578b.f74754d);
                                payCoinsView.f74721I.f74794f = U1.i.a(strA, str3, str2, str3, C5578b.f74755e);
                                payCoinsView.f74721I.f74795g = U1.i.a(strA, str3, str2, str3, C5578b.f74756f);
                                payCoinsView.f74721I.h = U1.i.a(strA, str3, str2, str3, C5578b.f74757g);
                                payCoinsView.f74721I.f74796i = U1.i.a(strA, str3, str2, str3, C5578b.h);
                                payCoinsView.f74721I.f74797j = U1.i.a(strA, str3, str2, str3, C5578b.f74758i);
                            }
                            i iVar2 = payCoinsView.f74721I;
                            if (iVar2.f74790b == null || iVar2.f74791c == null || iVar2.f74792d == null || (str = iVar2.f74793e) == null || iVar2.f74794f == null || iVar2.f74795g == null || iVar2.h == null || iVar2.f74796i == null || iVar2.f74797j == null) {
                                iVar2.f74790b = null;
                                iVar2.f74791c = null;
                                iVar2.f74792d = null;
                                iVar2.f74793e = null;
                                iVar2.f74794f = null;
                                iVar2.f74795g = null;
                                iVar2.h = null;
                                iVar2.f74796i = null;
                                iVar2.f74797j = null;
                            } else {
                                String strC3 = C5578b.c(str);
                                if (strC3 != null && (strC = C5578b.c(payCoinsView.f74721I.f74796i)) != null && (strC2 = C5578b.c(payCoinsView.f74721I.f74797j)) != null) {
                                    View view2 = payCoinsView.f74733j;
                                    if (view2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
                                        view2 = null;
                                    }
                                    FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(payCoinsView.getContext());
                                    if (fragmentActivityFindFragmentActivityOrNull != null) {
                                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull), (CoroutineContext) null, (CoroutineStart) null, new PayCoinsView$updateIconsFromFile$1(view2, strC3, strC, strC2, payCoinsView, null), 3, (Object) null);
                                    }
                                }
                            }
                        }
                        boolean z6 = payCoinsView.f74717E;
                        payCoinsView.f74747x = z6 ? 2 : 1;
                        int i15 = payCoinsView.f74748y;
                        if (i15 == 1) {
                            payCoinsView.n(0);
                        } else if (i15 == 2) {
                            payCoinsView.o(0);
                        } else if (!payCoinsView.f74718F && z6 && payCoinsView.f74715C >= 2.0f) {
                            payCoinsView.o(0);
                        } else {
                            payCoinsView.n(0);
                        }
                        if (!payCoinsView.f74717E && !payCoinsView.f74718F) {
                            View view3 = payCoinsView.f74734k;
                            View view4 = view3;
                            if (view3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
                                view4 = null;
                            }
                            view4.setVisibility(8);
                            ImageView imageView = payCoinsView.f74727c;
                            ImageView imageView2 = imageView;
                            if (imageView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLeft");
                                imageView2 = null;
                            }
                            imageView2.setVisibility(8);
                            ImageView imageView3 = payCoinsView.f74728d;
                            ImageView imageView4 = imageView3;
                            if (imageView3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mRight");
                                imageView4 = null;
                            }
                            imageView4.setVisibility(8);
                        }
                        if (payCoinsView.f74715C < 2.0f) {
                            View view5 = payCoinsView.f74743t;
                            View view6 = view5;
                            if (view5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMaskTwo");
                                view6 = null;
                            }
                            view6.setVisibility(0);
                            if (payCoinsView.f74715C < 1.0f) {
                                payCoinsView.t(0);
                                View view7 = payCoinsView.f74742s;
                                View view8 = view7;
                                if (view7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mMaskOne");
                                    view8 = null;
                                }
                                view8.setVisibility(0);
                            }
                        }
                        if (!payCoinsView.f74719G) {
                            CheckBox checkBox = payCoinsView.f74745v;
                            if (checkBox == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mCheckBox");
                                checkBox = null;
                            }
                            checkBox.setVisibility(4);
                            return;
                        }
                        CheckBox checkBox2 = payCoinsView.f74745v;
                        CheckBox checkBox3 = checkBox2;
                        if (checkBox2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCheckBox");
                            checkBox3 = null;
                        }
                        checkBox3.setVisibility(0);
                        boolean z7 = payCoinsView.f74720H ? Xpref.getDefaultSharedPreferences(payCoinsView.getContext()).getBoolean("pref_key_paycoin_is_sync_like_column", true) : Xpref.getDefaultSharedPreferences(payCoinsView.getContext()).getBoolean("pref_key_paycoin_is_sync_like", true);
                        CheckBox checkBox4 = payCoinsView.f74745v;
                        if (checkBox4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCheckBox");
                            checkBox4 = null;
                        }
                        checkBox4.setChecked(z7);
                    }
                }
            });
        }
        View view = this.f74726b;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view2 = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(view2, new C4674p(view2));
        if (view2.isAttachedToWindow()) {
            view2.requestApplyInsets();
        }
    }

    public final void q(AccountInfo accountInfo) {
        if (accountInfo == null) {
            return;
        }
        this.f74715C = accountInfo.getCoins();
        TextView textView = this.f74740q;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoinCount");
            textView2 = null;
        }
        textView2.setText(getContext().getResources().getQuantityString(2131689614, (int) accountInfo.getCoins(), String.valueOf(accountInfo.getCoins())));
    }

    public final boolean r() {
        boolean z6 = true;
        if (this.f74747x != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void s(WindowSizeClass windowSizeClass) {
        View view = this.f74739p;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutBottom");
            view2 = null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = KScreenAdjustUtilsKt.isLargePortrait(windowSizeClass) ? DimenUtilsKt.dpToPx(187) : KScreenAdjustUtilsKt.isNormal(windowSizeClass) ? DimenUtilsKt.dpToPx(48) : DimenUtilsKt.dpToPx(65);
        view2.setLayoutParams(marginLayoutParams);
        BLog.i("PayCoinsView", "onCreate: screenSize=" + windowSizeClass);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(int r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.paycoin.PayCoinsView.t(int):void");
    }
}
