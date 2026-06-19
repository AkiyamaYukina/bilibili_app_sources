package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.view.PlayerSwitch;
import com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSwitchComponent$bind$2;
import com.bilibili.playerbizcommonv2.widget.setting.channel.x;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSwitchComponent$bind$2.class */
final class VideoSettingSwitchComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Dr0.t $binding;
    private Object L$0;
    int label;
    final x this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSwitchComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSwitchComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final AppCompatImageView $icon;
        int label;
        final x this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppCompatImageView appCompatImageView, x xVar, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$icon = appCompatImageView;
            this.this$0 = xVar;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$icon, this.this$0, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AppCompatImageView appCompatImageView = this.$icon;
                String str = this.this$0.f83316a.f83320b;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                BiliImageLoader.INSTANCE.acquire(appCompatImageView).useOrigin().asDrawable().url(str).submit().subscribe(new ci1.e(cancellableContinuationImpl, 1));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Drawable drawable = (Drawable) obj;
            if (drawable == null) {
                return Unit.INSTANCE;
            }
            this.$icon.setImageDrawable(com.bilibili.playerbizcommon.utils.n.a(ContextCompat.getColor(this.$context, this.this$0.f83316a.f83327j), drawable));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSwitchComponent$bind$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSwitchComponent$bind$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlayerSwitch $switch;
        int label;
        final x this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSwitchComponent$bind$2$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSwitchComponent$bind$2$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final PlayerSwitch $switch;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerSwitch playerSwitch, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$switch = playerSwitch;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$switch, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$switch.setChecked(this.Z$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(x xVar, PlayerSwitch playerSwitch, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = xVar;
            this.$switch = playerSwitch;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$switch, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlow = this.this$0.f83316a.f83322d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$switch, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSwitchComponent$bind$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSwitchComponent$bind$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final View $animationBackground;
        final Context $context;
        int label;
        final x this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSwitchComponent$bind$2$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSwitchComponent$bind$2$6$a.class */
        public static final class a implements Animator.AnimatorListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f83219a;

            public a(View view) {
                this.f83219a = view;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f83219a.setBackground(null);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(x xVar, View view, Context context, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = xVar;
            this.$animationBackground = view;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(View view, ValueAnimator valueAnimator) {
            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, this.$animationBackground, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                x xVar = this.this$0;
                if (!xVar.f83316a.f83326i || xVar.f83317b) {
                    return Unit.INSTANCE;
                }
                xVar.f83317b = true;
                Log.i("VideoSettingSwitchComponent$bind$2$6-invokeSuspend", "[playerbizcommonv2-VideoSettingSwitchComponent$bind$2$6-invokeSuspend] backgroundAnimation");
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$animationBackground.setAlpha(0.0f);
            this.$animationBackground.setBackground(n.a(ContextCompat.getColor(this.$context, R$color.Pi1), this.this$0.f83316a.f83333p));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(2600L);
            final View view = this.$animationBackground;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f83204a;

                {
                    this.f83204a = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VideoSettingSwitchComponent$bind$2.AnonymousClass6.invokeSuspend$lambda$0(this.f83204a, valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new a(this.$animationBackground));
            valueAnimatorOfFloat.start();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingSwitchComponent$bind$2(x xVar, Dr0.t tVar, Continuation<? super VideoSettingSwitchComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$binding = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(x xVar, View view) {
        xVar.f83316a.f83323e.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$lambda$1(x xVar, Composer composer, int i7) {
        if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1989893580, i7, -1, "com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSwitchComponent.bind.<anonymous>.<anonymous> (VideoSettingSwitchComponent.kt:104)");
            }
            Jr0.e.a(xVar.f83316a.f83324f, 12, 6, 3, 8, false, composer, 28080, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(x xVar, View view) {
        Function0<Unit> function0 = xVar.f83316a.h;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSettingSwitchComponent$bind$2 videoSettingSwitchComponent$bind$2 = new VideoSettingSwitchComponent$bind$2(this.this$0, this.$binding, continuation);
        videoSettingSwitchComponent$bind$2.L$0 = obj;
        return videoSettingSwitchComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        this.this$0.f83318c = new WeakReference<>(this.$binding);
        ConstraintLayout constraintLayout = this.$binding.f3144a;
        Context context = constraintLayout.getContext();
        Dr0.t tVar = this.$binding;
        AppCompatTextView appCompatTextView = tVar.f3150g;
        AppCompatImageView appCompatImageView = tVar.f3148e;
        PlayerSwitch playerSwitch = tVar.f3149f;
        View view = tVar.f3147d;
        ComposeView composeView = tVar.f3146c;
        AppCompatImageView appCompatImageView2 = tVar.h;
        View view2 = tVar.f3145b;
        if (this.this$0.f83316a.f83320b.length() > 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(appCompatImageView, this.this$0, context, null), 3, (Object) null);
        } else {
            x.a aVar = this.this$0.f83316a;
            appCompatImageView.setImageDrawable(IconFont.getIconDrawable(aVar.f83321c, ContextCompat.getColor(context, aVar.f83327j)));
        }
        appCompatTextView.setText(this.this$0.f83316a.f83319a);
        appCompatTextView.setTextColor(ContextCompat.getColor(context, this.this$0.f83316a.f83327j));
        VideoSettingType videoSettingType = this.this$0.f83316a.f83333p;
        if (videoSettingType == VideoSettingType.BOTTOM || videoSettingType == VideoSettingType.TOP_BOTTOM) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setAlpha(0.7f);
            view.setBackgroundResource(this.this$0.f83316a.f83329l);
        }
        x.a aVar2 = this.this$0.f83316a;
        constraintLayout.setBackground(n.a(ContextCompat.getColor(context, aVar2.f83328k), aVar2.f83333p));
        playerSwitch.a(ContextCompat.getColor(context, this.this$0.f83316a.f83331n), ContextCompat.getColor(context, this.this$0.f83316a.f83332o), ContextCompat.getColor(context, this.this$0.f83316a.f83330m), ContextCompat.getColor(context, this.this$0.f83316a.f83330m));
        playerSwitch.setContentDescription(this.this$0.f83316a.f83319a);
        final x xVar = this.this$0;
        playerSwitch.setOnClickListener(new View.OnClickListener(xVar) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x f83335a;

            {
                this.f83335a = xVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                VideoSettingSwitchComponent$bind$2.invokeSuspend$lambda$0(this.f83335a, view3);
            }
        });
        Jr0.f fVar = this.this$0.f83316a.f83324f;
        if (fVar == null || !fVar.a()) {
            composeView.setVisibility(8);
        } else {
            composeView.setVisibility(0);
            final x xVar2 = this.this$0;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1989893580, true, new Function2(xVar2) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final x f83336a;

                {
                    this.f83336a = xVar2;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return VideoSettingSwitchComponent$bind$2.invokeSuspend$lambda$1(this.f83336a, (Composer) obj2, iIntValue);
                }
            }));
        }
        String str = this.this$0.f83316a.f83325g;
        if (str == null || str.length() == 0) {
            appCompatImageView2.setVisibility(8);
        } else {
            appCompatImageView2.setVisibility(0);
            appCompatImageView2.setImageDrawable(IconFont.getIconDrawable(this.this$0.f83316a.f83325g, ContextCompat.getColor(context, R$color.Graph_medium)));
            final x xVar3 = this.this$0;
            appCompatImageView2.setOnClickListener(new View.OnClickListener(xVar3) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.A

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final x f83203a;

                {
                    this.f83203a = xVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    VideoSettingSwitchComponent$bind$2.invokeSuspend$lambda$2(this.f83203a, view3);
                }
            });
        }
        Function0<Unit> function0 = this.this$0.f83316a.f83334q;
        if (function0 != null) {
            function0.invoke();
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, playerSwitch, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, view2, context, null), 3, (Object) null);
    }
}
