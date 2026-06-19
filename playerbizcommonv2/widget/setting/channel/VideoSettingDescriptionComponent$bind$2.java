package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
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
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.widget.setting.channel.h;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDescriptionComponent$bind$2.class */
final class VideoSettingDescriptionComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Dr0.n $binding;
    private Object L$0;
    int label;
    final h this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDescriptionComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDescriptionComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final AppCompatImageView $icon;
        int label;
        final h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppCompatImageView appCompatImageView, h hVar, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$icon = appCompatImageView;
            this.this$0 = hVar;
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
                String str = this.this$0.f83238a.f83240b;
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
            this.$icon.setImageDrawable(com.bilibili.playerbizcommon.utils.n.a(ContextCompat.getColor(this.$context, this.this$0.f83238a.f83249l), drawable));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDescriptionComponent$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDescriptionComponent$bind$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AppCompatTextView $description;
        int label;
        final h this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDescriptionComponent$bind$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDescriptionComponent$bind$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            final AppCompatTextView $description;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AppCompatTextView appCompatTextView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$description = appCompatTextView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$description, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$description.setText((String) this.L$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(h hVar, AppCompatTextView appCompatTextView, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = hVar;
            this.$description = appCompatTextView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$description, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<String> stateFlow = this.this$0.f83238a.f83243e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$description, null);
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDescriptionComponent$bind$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDescriptionComponent$bind$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final AppCompatImageView $endIcon;
        int label;
        final h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AppCompatImageView appCompatImageView, h hVar, Context context, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$endIcon = appCompatImageView;
            this.this$0 = hVar;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$endIcon, this.this$0, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AppCompatImageView appCompatImageView = this.$endIcon;
                String str = this.this$0.f83238a.f83244f;
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
            this.$endIcon.setImageDrawable(com.bilibili.playerbizcommon.utils.n.a(ContextCompat.getColor(this.$context, this.this$0.f83238a.f83250m), drawable));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDescriptionComponent$bind$2$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDescriptionComponent$bind$2$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final h this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDescriptionComponent$bind$2$7$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDescriptionComponent$bind$2$7$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$root, continuation);
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
                boolean z6 = this.Z$0;
                ConstraintLayout constraintLayout = this.$root;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = z6 ? DimenUtilsKt.dpToPx(52.0f) : 0;
                constraintLayout.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(h hVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = hVar;
            this.$root = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlow = this.this$0.f83238a.f83242d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$root, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingDescriptionComponent$bind$2(Dr0.n nVar, h hVar, Continuation<? super VideoSettingDescriptionComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = nVar;
        this.this$0 = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(h hVar, View view) {
        hVar.f83238a.f83246i.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$lambda$1(h hVar, Composer composer, int i7) {
        if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898021795, i7, -1, "com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDescriptionComponent.bind.<anonymous>.<anonymous> (VideoSettingDescriptionComponent.kt:77)");
            }
            Jr0.e.a(hVar.f83238a.f83248k, 12, 6, 3, 0, false, composer, 3504, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(h hVar, View view) {
        Function0<Unit> function0 = hVar.f83238a.f83247j;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSettingDescriptionComponent$bind$2 videoSettingDescriptionComponent$bind$2 = new VideoSettingDescriptionComponent$bind$2(this.$binding, this.this$0, continuation);
        videoSettingDescriptionComponent$bind$2.L$0 = obj;
        return videoSettingDescriptionComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        ConstraintLayout constraintLayout = this.$binding.f3112a;
        Context context = constraintLayout.getContext();
        Dr0.n nVar = this.$binding;
        AppCompatTextView appCompatTextView = nVar.f3118g;
        AppCompatImageView appCompatImageView = nVar.f3117f;
        AppCompatTextView appCompatTextView2 = nVar.f3114c;
        AppCompatImageView appCompatImageView2 = nVar.f3116e;
        AppCompatImageView appCompatImageView3 = nVar.h;
        View view = nVar.f3115d;
        ComposeView composeView = nVar.f3113b;
        if (this.this$0.f83238a.f83240b.length() > 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(appCompatImageView, this.this$0, context, null), 3, (Object) null);
        } else {
            h.a aVar = this.this$0.f83238a;
            appCompatImageView.setImageDrawable(IconFont.getIconDrawable(aVar.f83241c, ContextCompat.getColor(context, aVar.f83249l)));
        }
        appCompatTextView.setText(this.this$0.f83238a.f83239a);
        appCompatTextView.setTextColor(ContextCompat.getColor(context, this.this$0.f83238a.f83249l));
        VideoSettingType videoSettingType = this.this$0.f83238a.f83253p;
        if (videoSettingType == VideoSettingType.BOTTOM || videoSettingType == VideoSettingType.TOP_BOTTOM) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setAlpha(0.7f);
            view.setBackgroundResource(this.this$0.f83238a.f83252o);
        }
        h.a aVar2 = this.this$0.f83238a;
        constraintLayout.setBackground(n.a(ContextCompat.getColor(context, aVar2.f83251n), aVar2.f83253p));
        final h hVar = this.this$0;
        constraintLayout.setOnClickListener(new View.OnClickListener(hVar) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f83255a;

            {
                this.f83255a = hVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoSettingDescriptionComponent$bind$2.invokeSuspend$lambda$0(this.f83255a, view2);
            }
        });
        Jr0.f fVar = this.this$0.f83238a.f83248k;
        if (fVar == null || !fVar.a()) {
            composeView.setVisibility(8);
        } else {
            composeView.setVisibility(0);
            final h hVar2 = this.this$0;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1898021795, true, new Function2(hVar2) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final h f83256a;

                {
                    this.f83256a = hVar2;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return VideoSettingDescriptionComponent$bind$2.invokeSuspend$lambda$1(this.f83256a, (Composer) obj2, iIntValue);
                }
            }));
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, appCompatTextView2, null), 3, (Object) null);
        appCompatTextView2.setTextColor(ContextCompat.getColor(context, this.this$0.f83238a.f83250m));
        String str = this.this$0.f83238a.h;
        if (str == null || str.length() == 0) {
            appCompatImageView3.setOnClickListener(null);
            appCompatImageView3.setVisibility(8);
        } else {
            appCompatImageView3.setVisibility(0);
            appCompatImageView3.setImageDrawable(IconFont.getIconDrawable(this.this$0.f83238a.h, ContextCompat.getColor(context, R$color.Graph_medium)));
            final h hVar3 = this.this$0;
            appCompatImageView3.setOnClickListener(new View.OnClickListener(hVar3) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final h f83257a;

                {
                    this.f83257a = hVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VideoSettingDescriptionComponent$bind$2.invokeSuspend$lambda$2(this.f83257a, view2);
                }
            });
        }
        if (this.this$0.f83238a.f83244f.length() > 0) {
            appCompatImageView2.setVisibility(0);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(appCompatImageView2, this.this$0, context, null), 3, (Object) null);
        } else if (this.this$0.f83238a.f83245g.length() > 0) {
            appCompatImageView2.setVisibility(0);
            h.a aVar3 = this.this$0.f83238a;
            appCompatImageView2.setImageDrawable(IconFont.getIconDrawable(aVar3.f83245g, ContextCompat.getColor(context, aVar3.f83250m)));
        } else {
            appCompatImageView2.setVisibility(8);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.this$0, constraintLayout, null), 3, (Object) null);
        SingleExposeEntry singleExposeEntry = this.this$0.f83238a.f83254q;
        if (singleExposeEntry != null) {
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout, singleExposeEntry);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit;
    }
}
