package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.i;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.s;
import fu0.K;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendMulComponent$bind$2.class */
final class CheeseRecommendMulComponent$bind$2 extends SuspendLambda implements Function2<w, Continuation<? super Unit>, Object> {
    final K $binding;
    Object L$0;
    int label;
    final i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseRecommendMulComponent$bind$2(K k7, i iVar, Continuation<? super CheeseRecommendMulComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = k7;
        this.this$0 = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(w wVar, View view) {
        wVar.f90015c.invoke(s.b.f89994a);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseRecommendMulComponent$bind$2 cheeseRecommendMulComponent$bind$2 = new CheeseRecommendMulComponent$bind$2(this.$binding, this.this$0, continuation);
        cheeseRecommendMulComponent$bind$2.L$0 = obj;
        return cheeseRecommendMulComponent$bind$2;
    }

    public final Object invoke(w wVar, Continuation<? super Unit> continuation) {
        return create(wVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final w wVar = (w) this.L$0;
        this.$binding.f119460c.setText(wVar.f90013a.f89998a.f117589a);
        this.$binding.f119459b.setText(wVar.f90013a.f89998a.f117590b);
        K k7 = this.$binding;
        k7.f119461d.setLayoutManager(new LinearLayoutManager(k7.f119458a.getContext(), 0, false));
        this.$binding.f119461d.setAdapter(new i.a(this.this$0, wVar));
        this.$binding.f119462e.setOnClickListener(new View.OnClickListener(wVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final w f89971a;

            {
                this.f89971a = wVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheeseRecommendMulComponent$bind$2.invokeSuspend$lambda$0(this.f89971a, view);
            }
        });
        return Unit.INSTANCE;
    }
}
