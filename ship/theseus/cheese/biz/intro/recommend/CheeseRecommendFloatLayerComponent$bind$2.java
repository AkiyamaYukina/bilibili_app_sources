package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFloatLayerComponent$bind$2;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.e;
import fu0.C7199v;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFloatLayerComponent$bind$2.class */
final class CheeseRecommendFloatLayerComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C7199v $binding;
    int label;
    final e this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFloatLayerComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFloatLayerComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<w, Integer, Continuation<? super Pair<? extends w, ? extends Integer>>, Object> {
        int I$0;
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        public final Object invoke(w wVar, int i7, Continuation<? super Pair<w, Integer>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = wVar;
            anonymousClass1.I$0 = i7;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((w) obj, ((Number) obj2).intValue(), (Continuation<? super Pair<w, Integer>>) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Pair((w) this.L$0, Boxing.boxInt(this.I$0));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFloatLayerComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFloatLayerComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends w, ? extends Integer>, Continuation<? super Unit>, Object> {
        final C7199v $binding;
        Object L$0;
        int label;
        final e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C7199v c7199v, e eVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c7199v;
            this.this$0 = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(C7199v c7199v, View view) {
            z.a(c7199v.f119619f);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$binding, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(Pair<w, Integer> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            w wVar = (w) pair.getFirst();
            int iIntValue = ((Number) pair.getSecond()).intValue();
            Context context = this.$binding.f119619f.getContext();
            e.a aVar = new e.a(this.this$0, wVar, iIntValue);
            this.$binding.f119618e.setLayoutManager(new LinearLayoutManager(context));
            this.$binding.f119618e.setAdapter(aVar);
            this.$binding.f119620g.setText(wVar.f90013a.f89998a.f117589a);
            final C7199v c7199v = this.$binding;
            c7199v.f119616c.setOnClickListener(new View.OnClickListener(c7199v) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C7199v f89962a;

                {
                    this.f89962a = c7199v;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheeseRecommendFloatLayerComponent$bind$2.AnonymousClass2.invokeSuspend$lambda$0(this.f89962a, view);
                }
            });
            RelativeLayout relativeLayout = this.$binding.h;
            relativeLayout.setPaddingRelative(DimenUtilsKt.dpToPx(iIntValue), relativeLayout.getPaddingTop(), DimenUtilsKt.dpToPx(iIntValue), relativeLayout.getPaddingBottom());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseRecommendFloatLayerComponent$bind$2(e eVar, C7199v c7199v, Continuation<? super CheeseRecommendFloatLayerComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$binding = c7199v;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseRecommendFloatLayerComponent$bind$2(this.this$0, this.$binding, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            e.d dVar = this.this$0.f89950a;
            Flow flowCombine = FlowKt.combine(dVar.f89958a, dVar.f89959b, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$binding, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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
