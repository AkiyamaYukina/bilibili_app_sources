package com.bilibili.ship.theseus.united.page.intro.module.relate.cheese;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6306c;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.Y;
import com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import com.bilibili.ship.theseus.united.utils.g;
import dv0.C6858c0;
import e8.h;
import java.util.List;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2.class */
final class RelatedCheeseComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final VectorTextView $author;
    final C6858c0 $binding;
    final TextView $cardType;
    final Context $context;
    final BiliImageView $cover;
    final VectorTextView $danmkus;
    final TextView $duration;
    final TintImageView $ivUpIcon;
    final TintImageView $more;
    final TintTextView $reason;
    final ForegroundConstraintLayout $root;
    final TintFixedLineSpacingTextView $title;
    final VectorTextView $views;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.RelatedCheeseComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TintImageView $more;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.RelatedCheeseComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2$1$1.class */
        public static final class C10421 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final TintImageView $more;
            int label;
            final a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10421(a aVar, TintImageView tintImageView, Continuation<? super C10421> continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$more = tintImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10421(this.this$0, this.$more, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f101150c.tryEmit(new a.c.C1044a(Y.a(this.$more)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TintImageView tintImageView, a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$more = tintImageView;
            this.this$0 = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$more, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$more);
                C10421 c10421 = new C10421(this.this$0, this.$more, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c10421, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.RelatedCheeseComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TintImageView $more;
        final ForegroundConstraintLayout $root;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.RelatedCheeseComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final TintImageView $more;
            int label;
            final a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(a aVar, TintImageView tintImageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$more = tintImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$more, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f101150c.tryEmit(new a.c.C1045c(Y.a(this.$more)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ForegroundConstraintLayout foregroundConstraintLayout, a aVar, TintImageView tintImageView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$root = foregroundConstraintLayout;
            this.this$0 = aVar;
            this.$more = tintImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$root, this.this$0, this.$more, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowB = UIComponentExtKt.b(this.$root);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$more, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowB, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.RelatedCheeseComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ForegroundConstraintLayout $root;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ForegroundConstraintLayout foregroundConstraintLayout, a aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$root = foregroundConstraintLayout;
            this.this$0 = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$root, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$root, this.this$0.f101148a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.RelatedCheeseComponent$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final VectorTextView $author;
        final Context $context;
        final VectorTextView $danmkus;
        final TintImageView $more;
        final ForegroundConstraintLayout $root;
        final TintFixedLineSpacingTextView $title;
        final VectorTextView $views;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.RelatedCheeseComponent$bind$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/RelatedCheeseComponent$bind$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final VectorTextView $author;
            final Context $context;
            final VectorTextView $danmkus;
            final TintImageView $more;
            final TintFixedLineSpacingTextView $title;
            final VectorTextView $views;
            int label;
            final a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(a aVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Context context, VectorTextView vectorTextView, VectorTextView vectorTextView2, VectorTextView vectorTextView3, TintImageView tintImageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$title = tintFixedLineSpacingTextView;
                this.$context = context;
                this.$views = vectorTextView;
                this.$danmkus = vectorTextView2;
                this.$author = vectorTextView3;
                this.$more = tintImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$title, this.$context, this.$views, this.$danmkus, this.$author, this.$more, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TintFixedLineSpacingTextView tintFixedLineSpacingTextView = this.$title;
                Context context = this.$context;
                VectorTextView vectorTextView = this.$views;
                VectorTextView vectorTextView2 = this.$danmkus;
                VectorTextView vectorTextView3 = this.$author;
                TintImageView tintImageView = this.$more;
                a.C1043a c1043a = this.this$0.f101149b;
                a.c(tintFixedLineSpacingTextView, context, vectorTextView, vectorTextView2, vectorTextView3, tintImageView, c1043a.f101161k, true, c1043a.f101156e.a());
                this.this$0.f101150c.tryEmit(a.c.b.f101171a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ForegroundConstraintLayout foregroundConstraintLayout, a aVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Context context, VectorTextView vectorTextView, VectorTextView vectorTextView2, VectorTextView vectorTextView3, TintImageView tintImageView, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$root = foregroundConstraintLayout;
            this.this$0 = aVar;
            this.$title = tintFixedLineSpacingTextView;
            this.$context = context;
            this.$views = vectorTextView;
            this.$danmkus = vectorTextView2;
            this.$author = vectorTextView3;
            this.$more = tintImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$root, this.this$0, this.$title, this.$context, this.$views, this.$danmkus, this.$author, this.$more, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$root);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$title, this.$context, this.$views, this.$danmkus, this.$author, this.$more, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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
    public RelatedCheeseComponent$bind$2(BiliImageView biliImageView, a aVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, VectorTextView vectorTextView, VectorTextView vectorTextView2, TextView textView, TextView textView2, TintImageView tintImageView, TintTextView tintTextView, TintImageView tintImageView2, VectorTextView vectorTextView3, Context context, C6858c0 c6858c0, ForegroundConstraintLayout foregroundConstraintLayout, Continuation<? super RelatedCheeseComponent$bind$2> continuation) {
        super(2, continuation);
        this.$cover = biliImageView;
        this.this$0 = aVar;
        this.$title = tintFixedLineSpacingTextView;
        this.$author = vectorTextView;
        this.$danmkus = vectorTextView2;
        this.$duration = textView;
        this.$cardType = textView2;
        this.$ivUpIcon = tintImageView;
        this.$reason = tintTextView;
        this.$more = tintImageView2;
        this.$views = vectorTextView3;
        this.$context = context;
        this.$binding = c6858c0;
        this.$root = foregroundConstraintLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RelatedCheeseComponent$bind$2 relatedCheeseComponent$bind$2 = new RelatedCheeseComponent$bind$2(this.$cover, this.this$0, this.$title, this.$author, this.$danmkus, this.$duration, this.$cardType, this.$ivUpIcon, this.$reason, this.$more, this.$views, this.$context, this.$binding, this.$root, continuation);
        relatedCheeseComponent$bind$2.L$0 = obj;
        return relatedCheeseComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int iA;
        int iA2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$more, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$root, this.this$0, this.$more, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$root, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$root, this.this$0, this.$title, this.$context, this.$views, this.$danmkus, this.$author, this.$more, null), 3, (Object) null);
        InterfaceC6308d.a aVar = InterfaceC6308d.f101173a;
        BiliImageView biliImageView = this.$cover;
        C6306c c6306c = this.this$0.f101149b.f101165o;
        aVar.getClass();
        InterfaceC6308d.a.d(biliImageView, c6306c);
        BiliImageView biliImageView2 = this.$cover;
        a.C1043a c1043a = this.this$0.f101149b;
        ImageExtentionKt.displayImageWithGif$default(biliImageView2, c1043a.f101152a, c1043a.f101153b, (Function0) null, (Function0) null, 0, 0, (ImageLoadingListener) null, (ImageLoadingListener) null, false, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR, (Object) null);
        this.$title.setText(this.this$0.f101149b.f101154c);
        this.$author.setText(this.this$0.f101149b.f101155d);
        this.$danmkus.setText(this.this$0.f101149b.f101157f);
        a.C1043a c1043a2 = this.this$0.f101149b;
        boolean z6 = false;
        if (c1043a2.f101163m == 1) {
            if (StringsKt.isBlank(c1043a2.f101164n) && StringsKt.isBlank(this.this$0.f101149b.f101158g)) {
                this.$duration.setVisibility(8);
            } else if (StringsKt.isBlank(this.this$0.f101149b.f101164n)) {
                this.$duration.setText(this.this$0.f101149b.f101158g);
            } else {
                this.$duration.setText(this.this$0.f101149b.f101164n);
            }
            this.$cardType.setVisibility(8);
            C6302a c6302a = this.this$0.f101149b.f101159i;
            if (c6302a == null || !c6302a.a()) {
                this.$ivUpIcon.setVisibility(this.this$0.f101149b.f101166p ? 0 : 8);
                ((ConstraintLayout.LayoutParams) this.$author.getLayoutParams()).leftToRight = this.$ivUpIcon.getId();
            } else {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.$reason.getLayoutParams())).leftMargin = 0;
            }
        } else {
            this.$duration.setText(c1043a2.f101158g);
        }
        this.$more.setVisibility(this.this$0.f101149b.f101162l ? 0 : 8);
        StatInfoData statInfoData = this.this$0.f101149b.f101156e;
        this.$views.setText(statInfoData.a() ? statInfoData.f104028b : NumberFormat_androidKt.format$default(Boxing.boxLong(statInfoData.f104027a), (String) null, 0, 3, (Object) null));
        boolean zA = Cj0.a.a(this.$context);
        C6302a c6302a2 = this.this$0.f101149b.f101159i;
        if (c6302a2 == null || !c6302a2.a()) {
            this.$reason.setVisibility(8);
        } else {
            this.$reason.setVisibility(0);
            this.$reason.setText(c6302a2.f101087a);
            this.$reason.setTextColor(g.a(0, zA ? c6302a2.f101089c : c6302a2.f101088b));
            int i7 = c6302a2.h;
            if (i7 == 1 || i7 == 3) {
                iA = g.a(0, zA ? c6302a2.f101091e : c6302a2.f101090d);
            } else {
                iA = 0;
            }
            if (i7 == 2 || i7 == 3) {
                iA2 = g.a(0, zA ? c6302a2.f101093g : c6302a2.f101092f);
            } else {
                iA2 = 0;
            }
            if (iA != 0 || iA2 != 0) {
                TintTextView tintTextView = this.$reason;
                GradientDrawable gradientDrawableA = h.a(0);
                gradientDrawableA.setCornerRadius(NewPlayerUtilsKt.toFloatPx(2.0f));
                gradientDrawableA.setColor(iA);
                gradientDrawableA.setStroke(NewPlayerUtilsKt.toPx(0.5f), iA2);
                tintTextView.setBackground(gradientDrawableA);
            }
            VectorTextView vectorTextView = this.$author;
            this.this$0.f101149b.getClass();
            vectorTextView.setVisibility(0);
        }
        C6302a c6302a3 = this.this$0.f101149b.h;
        if (c6302a3 != null && c6302a3.a()) {
            this.$cardType.setText(c6302a3.f101087a);
            this.$cardType.setTextColor(g.a(0, zA ? c6302a3.f101089c : c6302a3.f101088b));
        }
        TintFixedLineSpacingTextView tintFixedLineSpacingTextView = this.$title;
        Context context = this.$context;
        VectorTextView vectorTextView2 = this.$views;
        VectorTextView vectorTextView3 = this.$danmkus;
        VectorTextView vectorTextView4 = this.$author;
        TintImageView tintImageView = this.$more;
        a.C1043a c1043a3 = this.this$0.f101149b;
        a.c(tintFixedLineSpacingTextView, context, vectorTextView2, vectorTextView3, vectorTextView4, tintImageView, c1043a3.f101161k, c1043a3.f101160j, c1043a3.f101156e.a());
        ForegroundConstraintLayout foregroundConstraintLayout = this.$binding.f116923a;
        int iDpToPx = DimenUtilsKt.dpToPx(this.this$0.f101149b.f101165o.f101145b);
        List listListOf = CollectionsKt.listOf(Boxing.boxInt(this.$binding.f116932k.getId()));
        List listListOf2 = CollectionsKt.listOf(new Integer[]{Boxing.boxInt(this.$binding.f116925c.getId()), Boxing.boxInt(this.$binding.h.getId()), Boxing.boxInt(this.$binding.f116931j.getId()), Boxing.boxInt(this.$binding.f116924b.getId())});
        if (foregroundConstraintLayout != null) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(iDpToPx, InterfaceC6308d.a.f101175b);
            InterfaceC6308d.a aVar2 = InterfaceC6308d.a.f101174a;
            boolean zB = InterfaceC6308d.a.b(foregroundConstraintLayout, listListOf);
            boolean zB2 = InterfaceC6308d.a.b(foregroundConstraintLayout, listListOf2);
            if (iCoerceAtLeast < InterfaceC6308d.a.f101177d && zB && zB2) {
                InterfaceC6308d.a.c(foregroundConstraintLayout, listListOf);
            } else {
                z6 = zB;
            }
            if (iCoerceAtLeast < InterfaceC6308d.a.f101176c) {
                if (z6) {
                    InterfaceC6308d.a.c(foregroundConstraintLayout, listListOf);
                }
                if (zB2) {
                    InterfaceC6308d.a.c(foregroundConstraintLayout, listListOf2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
