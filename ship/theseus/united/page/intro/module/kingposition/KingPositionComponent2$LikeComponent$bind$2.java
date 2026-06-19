package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.alipay.sdk.app.PayTask;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.playerbizcommon.view.TextSwitcherWithOptionAnimation;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.studio.module.tuwen.util.BcutVideoClipCropUtil;
import com.opensource.svgaplayer.SVGAParser;
import dv0.V;
import fq0.C7140b;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2.class */
public final class KingPositionComponent2$LikeComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final V $binding;
    final Context $context;
    final TintImageView $likeIcon;
    final LinearLayout $likeLayout;
    final TextSwitcherWithOptionAnimation $likeSwitch;
    final LinearLayout $root;
    private Object L$0;
    int label;
    final KingPositionComponent2.LikeComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LinearLayout $likeLayout;
        int label;
        final KingPositionComponent2.LikeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionComponent2.LikeComponent f100279a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LinearLayout f100280b;

            public a(KingPositionComponent2.LikeComponent likeComponent, LinearLayout linearLayout) {
                this.f100279a = likeComponent;
                this.f100280b = linearLayout;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f100279a.f100274b.emit(new KingPositionComponent2.c.C1004c(this.f100280b), continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LinearLayout linearLayout, KingPositionComponent2.LikeComponent likeComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$likeLayout = linearLayout;
            this.this$0 = likeComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$likeLayout, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$likeLayout);
                a aVar = new a(this.this$0, this.$likeLayout);
                this.label = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LinearLayout $likeLayout;
        int label;
        final KingPositionComponent2.LikeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<KingPositionService.a, Continuation<? super Unit>, Object> {
            final LinearLayout $likeLayout;
            Object L$0;
            int label;
            final KingPositionComponent2.LikeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(KingPositionComponent2.LikeComponent likeComponent, LinearLayout linearLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = likeComponent;
                this.$likeLayout = linearLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$likeLayout, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(KingPositionService.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((KingPositionService.a) this.L$0).f100405b) {
                        MutableSharedFlow<KingPositionComponent2.c> mutableSharedFlow = this.this$0.f100274b;
                        KingPositionComponent2.c.g gVar = new KingPositionComponent2.c.g(this.$likeLayout);
                        this.label = 1;
                        if (mutableSharedFlow.emit(gVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(KingPositionComponent2.LikeComponent likeComponent, LinearLayout linearLayout, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = likeComponent;
            this.$likeLayout = linearLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$likeLayout, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                KingPositionComponent2.LikeComponent likeComponent = this.this$0;
                StateFlow<KingPositionService.a> stateFlow = likeComponent.f100275c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(likeComponent, this.$likeLayout, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LinearLayout $likeLayout;
        int label;
        final KingPositionComponent2.LikeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<KingPositionService.a, Continuation<? super Unit>, Object> {
            final LinearLayout $likeLayout;
            Object L$0;
            int label;
            final KingPositionComponent2.LikeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(KingPositionComponent2.LikeComponent likeComponent, LinearLayout linearLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = likeComponent;
                this.$likeLayout = linearLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$likeLayout, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(KingPositionService.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((KingPositionService.a) this.L$0).f100404a) {
                        MutableSharedFlow<KingPositionComponent2.c> mutableSharedFlow = this.this$0.f100274b;
                        KingPositionComponent2.c.d dVar = new KingPositionComponent2.c.d(this.$likeLayout);
                        this.label = 1;
                        if (mutableSharedFlow.emit(dVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(KingPositionComponent2.LikeComponent likeComponent, LinearLayout linearLayout, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = likeComponent;
            this.$likeLayout = linearLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$likeLayout, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                KingPositionComponent2.LikeComponent likeComponent = this.this$0;
                StateFlow<KingPositionService.a> stateFlow = likeComponent.f100275c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(likeComponent, this.$likeLayout, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent$bind$2$a.class */
    public static final class a implements InterfaceC6298l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KingPositionComponent2.LikeComponent f100281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TintImageView f100282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextSwitcherWithOptionAnimation f100283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f100284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LinearLayout f100285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LinearLayout f100286f;

        public a(KingPositionComponent2.LikeComponent likeComponent, TintImageView tintImageView, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, Context context, LinearLayout linearLayout, LinearLayout linearLayout2) {
            this.f100281a = likeComponent;
            this.f100282b = tintImageView;
            this.f100283c = textSwitcherWithOptionAnimation;
            this.f100284d = context;
            this.f100285e = linearLayout;
            this.f100286f = linearLayout2;
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void a() {
            KingPositionComponent2.LikeComponent.c(this.f100281a, this.f100282b, this.f100283c, this.f100284d, this.f100285e);
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void b() {
            TintImageView tintImageView = this.f100282b;
            if (tintImageView == null) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tintImageView, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 1.2f, 0.9f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tintImageView, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 1.2f, 0.9f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(500L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.start();
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void c() {
            C7140b.a(this.f100282b);
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void d(long j7, String str) {
            this.f100281a.f100273a.h.f100382m.d(new I(new WeakReference(this.f100285e), j7, str));
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void e(String str, String str2, String str3) {
            wh1.f fVar = new wh1.f(this.f100284d);
            this.f100281a.f100277e = fVar;
            LinearLayout linearLayout = this.f100285e;
            TextView textView = fVar.d;
            if (textView != null) {
                textView.setVisibility(4);
            }
            TextView textView2 = fVar.d;
            if (textView2 != null) {
                textView2.setText(str3);
            }
            fVar.e = str2;
            fVar.f = str;
            int iB = sh1.c.b(100);
            int iB2 = sh1.c.b(105);
            int width = (linearLayout.getWidth() - iB) / 2;
            int height = linearLayout.getHeight();
            int[] iArr = new int[2];
            linearLayout.getLocationOnScreen(iArr);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(((linearLayout.getContext().getResources().getDisplayMetrics().widthPixels - (iArr[0] + width)) - sh1.c.b(100)) - sh1.c.b(2), 0);
            TextView textView3 = fVar.d;
            if (textView3 != null) {
                textView3.setMaxWidth(iCoerceAtLeast);
            }
            fVar.showAsDropDown(linearLayout, width, -(height + iB2));
            BiliImageView biliImageView = fVar.b;
            if (biliImageView != null) {
                ImageRequestBuilder.enableAutoPlayAnimation$default(BiliImageLoader.INSTANCE.with(fVar.a).url(fVar.f).actualImageScaleType(ScaleType.CENTER).enableAnimate(true, Boolean.TRUE).animationPlayEndlessLoop(true), true, false, 2, (Object) null).into(biliImageView);
                String str4 = fVar.f;
                if (str4 != null && StringsKt.w(str4, ".gif")) {
                    float f7 = wh1.f.h;
                    biliImageView.setPivotX(f7 / 2.0f);
                    biliImageView.setPivotY(f7);
                    Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
                    Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.2f, 1.0f);
                    keyframeOfFloat2.setInterpolator(wh1.f.a());
                    Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(biliImageView, PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3));
                    objectAnimatorOfPropertyValuesHolder.setDuration(1500L);
                    objectAnimatorOfPropertyValuesHolder.start();
                    return;
                }
                float f8 = wh1.f.h;
                biliImageView.setPivotX(f8 / 2.0f);
                biliImageView.setPivotY(f8);
                Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.0f, 0.0f);
                Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.1f, 1.0f);
                Keyframe keyframeOfFloat6 = Keyframe.ofFloat(0.94f, 1.0f);
                Keyframe keyframeOfFloat7 = Keyframe.ofFloat(1.0f, 0.0f);
                keyframeOfFloat5.setInterpolator(wh1.f.a());
                keyframeOfFloat7.setInterpolator(wh1.f.a());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(biliImageView, PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6, keyframeOfFloat7), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6, keyframeOfFloat7), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, -4.0f, 4.0f, -4.0f, 4.0f, 4.0f, -4.0f, 4.0f, -4.0f, 4.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, 4.0f, -4.0f, 4.0f, -4.0f, 4.0f, -4.0f, 4.0f, -4.0f, 4.0f, 0.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(1500L);
                objectAnimatorOfPropertyValuesHolder2.start();
            }
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void f() {
            KingPositionComponent2.LikeComponent likeComponent = this.f100281a;
            wh1.f fVar = likeComponent.f100277e;
            if (fVar != null) {
                BiliImageView biliImageView = fVar.b;
                if (biliImageView != null) {
                    biliImageView.setVisibility(8);
                }
                BiliImageView biliImageView2 = fVar.c;
                if (biliImageView2 != null) {
                    ImageRequestBuilder.enableAutoPlayAnimation$default(BiliImageLoader.INSTANCE.with(fVar.a).url(fVar.e).actualImageScaleType(ScaleType.FIT_CENTER).enableAnimate(true, Boolean.TRUE).animationPlayEndlessLoop(true), true, false, 2, (Object) null).into(biliImageView2);
                    String str = fVar.e;
                    if (str == null || !StringsKt.w(str, ".gif")) {
                        float f7 = wh1.f.h;
                        biliImageView2.setPivotX(f7 / 2.0f);
                        biliImageView2.setPivotY(f7);
                        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
                        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.06f, 1.0f);
                        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
                        keyframeOfFloat2.setInterpolator(wh1.f.a());
                        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3);
                        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3);
                        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.0f, 1.0f);
                        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.96f, 1.0f);
                        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 0.0f);
                        keyframeOfFloat6.setInterpolator(wh1.f.a());
                        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(biliImageView2, propertyValuesHolderOfKeyframe, propertyValuesHolderOfKeyframe2, PropertyValuesHolder.ofKeyframe(View.ALPHA, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
                        objectAnimatorOfPropertyValuesHolder.setDuration(2500L);
                        objectAnimatorOfPropertyValuesHolder.start();
                        biliImageView2.postDelayed(new ES0.L(fVar, 3), 10L);
                    } else {
                        Keyframe keyframeOfFloat7 = Keyframe.ofFloat(0.0f, 1.0f);
                        Keyframe keyframeOfFloat8 = Keyframe.ofFloat(0.96f, 1.0f);
                        Keyframe keyframeOfFloat9 = Keyframe.ofFloat(1.0f, 0.0f);
                        keyframeOfFloat9.setInterpolator(wh1.f.a());
                        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(biliImageView2, PropertyValuesHolder.ofKeyframe(View.ALPHA, keyframeOfFloat7, keyframeOfFloat8, keyframeOfFloat9));
                        objectAnimatorOfPropertyValuesHolder2.setDuration(2500L);
                        objectAnimatorOfPropertyValuesHolder2.start();
                    }
                    biliImageView2.postDelayed(new com.mall.ui.page.course.player.j(fVar, 2), 500L);
                }
            }
            HandlerThreads.postDelayed(0, likeComponent.f100278f, PayTask.f60018j);
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void g() {
            int i7 = KingPositionComponent2.LikeComponent.f100272g;
            this.f100281a.e();
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6298l
        public final void h(boolean z6) {
            KingPositionComponent2.LikeComponent likeComponent = this.f100281a;
            if (!z6) {
                xh1.a aVar = likeComponent.f100276d;
                if (aVar != null) {
                    aVar.dismiss();
                    return;
                }
                return;
            }
            Rect rect = new Rect();
            this.f100286f.getLocalVisibleRect(rect);
            if (rect.bottom < this.f100286f.getHeight() || rect.top > 0 || rect.right < this.f100286f.getWidth()) {
                return;
            }
            if (likeComponent.f100276d == null) {
                likeComponent.f100276d = new xh1.a(this.f100284d);
            }
            xh1.a aVar2 = likeComponent.f100276d;
            if (aVar2 != null) {
                HandlerThreads.postDelayed(0, aVar2.a, 5000L);
                new SVGAParser(aVar2.c).parse(MultipleThemeUtils.isNightTheme(aVar2.c) ? "bili_player_guide_tip_dark.svga" : "bili_player_guide_tip_normal.svga", new xh1.b(aVar2));
                int i7 = -xh1.a.a(aVar2.c, 39.0f);
                TintImageView tintImageView = this.f100282b;
                aVar2.showAsDropDown(tintImageView, i7, (-tintImageView.getMeasuredHeight()) - xh1.a.a(aVar2.c, 99.0f));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionComponent2$LikeComponent$bind$2(LinearLayout linearLayout, KingPositionComponent2.LikeComponent likeComponent, V v7, TintImageView tintImageView, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, Context context, LinearLayout linearLayout2, Continuation<? super KingPositionComponent2$LikeComponent$bind$2> continuation) {
        super(2, continuation);
        this.$likeLayout = linearLayout;
        this.this$0 = likeComponent;
        this.$binding = v7;
        this.$likeIcon = tintImageView;
        this.$likeSwitch = textSwitcherWithOptionAnimation;
        this.$context = context;
        this.$root = linearLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean invokeSuspend$lambda$0(com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.LikeComponent r5, android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2.invokeSuspend$lambda$0(com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent, android.view.View):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(KingPositionComponent2.LikeComponent likeComponent, View view, MotionEvent motionEvent) {
        KingPositionService.d dVar = likeComponent.f100273a;
        dVar.getClass();
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        KingPositionService kingPositionService = dVar.h;
        if (kingPositionService.f100359I) {
            Ref.ObjectRef<InterfaceC6294h> objectRef = dVar.f100415c;
            InterfaceC6294h interfaceC6294h = (InterfaceC6294h) objectRef.element;
            if (interfaceC6294h != null && interfaceC6294h.f()) {
                InterfaceC6294h interfaceC6294h2 = (InterfaceC6294h) objectRef.element;
                if (interfaceC6294h2 != null) {
                    interfaceC6294h2.d();
                }
                InterfaceC6297k interfaceC6297k = (InterfaceC6297k) dVar.f100416d.element;
                if (interfaceC6297k != null) {
                    interfaceC6297k.d();
                }
                kingPositionService.f100379j.f100342t.tryEmit(Unit.INSTANCE);
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("action_type", "2");
                PageReportService.g(kingPositionService.f100389t, "united.player-video-detail.user-action.highlyrec.click", MapsKt.build(mapCreateMapBuilder), 4);
                InterfaceC6298l interfaceC6298l = (InterfaceC6298l) dVar.f100414b.element;
                if (interfaceC6298l != null) {
                    interfaceC6298l.g();
                }
            }
        }
        kingPositionService.f100359I = false;
        return false;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KingPositionComponent2$LikeComponent$bind$2 kingPositionComponent2$LikeComponent$bind$2 = new KingPositionComponent2$LikeComponent$bind$2(this.$likeLayout, this.this$0, this.$binding, this.$likeIcon, this.$likeSwitch, this.$context, this.$root, continuation);
        kingPositionComponent2$LikeComponent$bind$2.L$0 = obj;
        return kingPositionComponent2$LikeComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xh1.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$likeLayout, this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$likeLayout, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$likeLayout, null), 3, (Object) null);
                KingPositionComponent2.LikeComponent.c(this.this$0, this.$likeIcon, this.$likeSwitch, this.$context, this.$likeLayout);
                LinearLayout linearLayout = this.$likeLayout;
                final KingPositionComponent2.LikeComponent likeComponent = this.this$0;
                linearLayout.setOnLongClickListener(new View.OnLongClickListener(likeComponent) { // from class: com.bilibili.ship.theseus.united.page.intro.module.kingposition.n

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final KingPositionComponent2.LikeComponent f100468a;

                    {
                        this.f100468a = likeComponent;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return KingPositionComponent2$LikeComponent$bind$2.invokeSuspend$lambda$0(this.f100468a, view);
                    }
                });
                LinearLayout linearLayout2 = this.$likeLayout;
                final KingPositionComponent2.LikeComponent likeComponent2 = this.this$0;
                linearLayout2.setOnTouchListener(new View.OnTouchListener(likeComponent2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.kingposition.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final KingPositionComponent2.LikeComponent f100469a;

                    {
                        this.f100469a = likeComponent2;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return KingPositionComponent2$LikeComponent$bind$2.invokeSuspend$lambda$1(this.f100469a, view, motionEvent);
                    }
                });
                KingPositionComponent2.LikeComponent likeComponent3 = this.this$0;
                likeComponent3.f100273a.f100414b.element = new a(likeComponent3, this.$likeIcon, this.$likeSwitch, this.$context, this.$likeLayout, this.$root);
                V v7 = this.$binding;
                likeComponent3.getClass();
                TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation = v7.f116860d;
                Integer numE = likeComponent3.f100273a.h.f100388s.e();
                textSwitcherWithOptionAnimation.setTextColor(numE != null ? numE.intValue() : ContextCompat.getColor(v7.f116857a.getContext(), R$color.Ga5));
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            KingPositionComponent2.LikeComponent likeComponent4 = this.this$0;
            xh1.a aVar2 = likeComponent4.f100276d;
            if (aVar2 != null && aVar2.isShowing() && (aVar = likeComponent4.f100276d) != null) {
                aVar.dismiss();
            }
            likeComponent4.f100276d = null;
            likeComponent4.e();
            HandlerThreads.remove(0, likeComponent4.f100278f);
            this.this$0.f100273a.h.f100382m.a();
            this.this$0.f100273a.f100414b.element = null;
            throw th;
        }
    }
}
