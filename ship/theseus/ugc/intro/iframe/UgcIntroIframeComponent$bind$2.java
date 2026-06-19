package com.bilibili.ship.theseus.ugc.intro.iframe;

import Vu0.z;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommon.utils.n;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.ugc.intro.iframe.b;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeComponent$bind$2.class */
final class UgcIntroIframeComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final z $binding;
    final Context $context;
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$bind$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeComponent$bind$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final z $binding;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$bind$2$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeComponent$bind$2$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<b.c, Continuation<? super Unit>, Object> {
            final z $binding;
            final FrameLayout $container;
            final int $originHeight;
            final double $originRatio;
            Object L$0;
            int label;
            final b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(double d7, z zVar, b bVar, FrameLayout frameLayout, int i7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$originRatio = d7;
                this.$binding = zVar;
                this.this$0 = bVar;
                this.$container = frameLayout;
                this.$originHeight = i7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$originRatio, this.$binding, this.this$0, this.$container, this.$originHeight, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(b.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                b.c cVar = (b.c) this.L$0;
                AnimationDrawable animationDrawable = null;
                if (Intrinsics.areEqual(cVar, b.c.C0835b.f97034a)) {
                    FrameLayout frameLayout = this.$container;
                    double d7 = this.$originRatio;
                    AnonymousClass6.invokeSuspend$setWebViewHeight(frameLayout, d7, this.$originHeight, d7);
                    BiliWebView biliWebView = this.$binding.h;
                    Lazy lazy = p.f81943a;
                    biliWebView.setVisibility(4);
                    p.h(this.$binding.f25999f);
                    this.$binding.f25996c.setVisibility(0);
                    Drawable drawable = this.$binding.f25995b.getDrawable();
                    AnimationDrawable animationDrawable2 = null;
                    if (drawable instanceof AnimationDrawable) {
                        animationDrawable2 = (AnimationDrawable) drawable;
                    }
                    if (animationDrawable2 != null) {
                        animationDrawable2.start();
                    }
                } else if (Intrinsics.areEqual(cVar, b.c.C0836c.f97035a)) {
                    AnonymousClass6.invokeSuspend$setWebViewHeight(this.$container, this.$originRatio, this.$originHeight, this.this$0.f97021a.f97027b);
                    BiliWebView biliWebView2 = this.$binding.h;
                    Lazy lazy2 = p.f81943a;
                    biliWebView2.setVisibility(0);
                    p.h(this.$binding.f25999f);
                    p.h(this.$binding.f25996c);
                    Drawable drawable2 = this.$binding.f25995b.getDrawable();
                    AnimationDrawable animationDrawable3 = null;
                    if (drawable2 instanceof AnimationDrawable) {
                        animationDrawable3 = (AnimationDrawable) drawable2;
                    }
                    if (animationDrawable3 != null) {
                        animationDrawable3.stop();
                    }
                } else {
                    if (!Intrinsics.areEqual(cVar, b.c.a.f97033a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FrameLayout frameLayout2 = this.$container;
                    double d8 = this.$originRatio;
                    AnonymousClass6.invokeSuspend$setWebViewHeight(frameLayout2, d8, this.$originHeight, d8);
                    BiliWebView biliWebView3 = this.$binding.h;
                    Lazy lazy3 = p.f81943a;
                    biliWebView3.setVisibility(4);
                    this.$binding.f25999f.setVisibility(0);
                    p.h(this.$binding.f25996c);
                    Drawable drawable3 = this.$binding.f25995b.getDrawable();
                    if (drawable3 instanceof AnimationDrawable) {
                        animationDrawable = (AnimationDrawable) drawable3;
                    }
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(z zVar, b bVar, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$binding = zVar;
            this.this$0 = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$setWebViewHeight(FrameLayout frameLayout, double d7, int i7, double d8) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (d8 == d7) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = i7;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                layoutParams2.dimensionRatio = "w," + d8 + ":1";
            }
            frameLayout.setLayoutParams(layoutParams2);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = this.$binding.f26001i;
                int iDpToPx = DimenUtilsKt.dpToPx(200.0f);
                b bVar = this.this$0;
                MutableStateFlow<b.c> mutableStateFlow = bVar.f97025e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(0.0d, this.$binding, bVar, frameLayout, iDpToPx, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroIframeComponent$bind$2(b bVar, z zVar, Context context, Continuation<? super UgcIntroIframeComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$binding = zVar;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(b bVar, z zVar, View view) {
        bVar.f97025e.tryEmit(b.c.C0835b.f97034a);
        zVar.h.loadUrl(bVar.f97021a.f97026a);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcIntroIframeComponent$bind$2 ugcIntroIframeComponent$bind$2 = new UgcIntroIframeComponent$bind$2(this.this$0, this.$binding, this.$context, continuation);
        ugcIntroIframeComponent$bind$2.L$0 = obj;
        return ugcIntroIframeComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Integer num = this.this$0.f97021a.f97028c;
            if (num != null) {
                z zVar = this.$binding;
                int iIntValue = num.intValue();
                zVar.f25996c.setBackgroundColor(iIntValue);
                zVar.f25999f.setBackgroundColor(iIntValue);
            }
            Integer num2 = this.this$0.f97021a.f97029d;
            if (num2 != null) {
                z zVar2 = this.$binding;
                int iIntValue2 = num2.intValue();
                zVar2.f26000g.setTextColor(iIntValue2);
                zVar2.f25997d.setTextColor(iIntValue2);
            }
            Integer num3 = this.this$0.f97021a.f97030e;
            if (num3 != null) {
                z zVar3 = this.$binding;
                zVar3.f25998e.setTextColor(num3.intValue());
            }
            Integer num4 = this.this$0.f97021a.f97031f;
            if (num4 != null) {
                Context context = this.$context;
                z zVar4 = this.$binding;
                int iIntValue3 = num4.intValue();
                Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), 2131241668, null);
                if (drawable != null) {
                    zVar4.f25998e.setBackground(n.a(iIntValue3, drawable));
                }
            }
            final z zVar5 = this.$binding;
            TextView textView = zVar5.f25998e;
            final b bVar = this.this$0;
            textView.setOnClickListener(new View.OnClickListener(bVar, zVar5) { // from class: com.bilibili.ship.theseus.ugc.intro.iframe.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f97038a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final z f97039b;

                {
                    this.f97038a = bVar;
                    this.f97039b = zVar5;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UgcIntroIframeComponent$bind$2.invokeSuspend$lambda$4(this.f97038a, this.f97039b, view);
                }
            });
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.$binding, this.this$0, null), 3, (Object) null);
            b bVar2 = this.this$0;
            if (!bVar2.f97022b) {
                z zVar6 = this.$binding;
                this.label = 1;
                if (b.c(bVar2, zVar6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
