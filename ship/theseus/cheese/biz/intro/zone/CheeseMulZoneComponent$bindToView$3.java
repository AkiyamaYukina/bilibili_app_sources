package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.image2.BiliImageLoader;
import fu0.T;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseMulZoneComponent$bindToView$3.class */
final class CheeseMulZoneComponent$bindToView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final T $binding;
    final Context $context;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseMulZoneComponent$bindToView$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseMulZoneComponent$bindToView$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final T $binding;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseMulZoneComponent$bindToView$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseMulZoneComponent$bindToView$3$1$1.class */
        public static final class C06441 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final T $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06441(T t7, Continuation<? super C06441> continuation) {
                super(2, continuation);
                this.$binding = t7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06441 c06441 = new C06441(this.$binding, continuation);
                c06441.I$0 = ((Number) obj).intValue();
                return c06441;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                ConstraintLayout constraintLayout = this.$binding.f119497d;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, T t7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$binding = t7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f90301a.f90307b;
                C06441 c06441 = new C06441(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06441, this) == coroutine_suspended) {
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
    public CheeseMulZoneComponent$bindToView$3(a aVar, T t7, Context context, Continuation<? super CheeseMulZoneComponent$bindToView$3> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$binding = t7;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseMulZoneComponent$bindToView$3 cheeseMulZoneComponent$bindToView$3 = new CheeseMulZoneComponent$bindToView$3(this.this$0, this.$binding, this.$context, continuation);
        cheeseMulZoneComponent$bindToView$3.L$0 = obj;
        return cheeseMulZoneComponent$bindToView$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        Object next2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
        c cVar = this.this$0.f90301a.f90306a;
        Iterator<T> it = cVar.f90315a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((d) next).f90320e == 1) {
                break;
            }
        }
        d dVar = (d) next;
        if (dVar != null) {
            Context context = this.$context;
            T t7 = this.$binding;
            a aVar = this.this$0;
            BiliImageLoader.INSTANCE.with(context).url(dVar.f90316a).into(t7.h);
            t7.f119502j.setText(dVar.f90318c);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseMulZoneComponent$bindToView$3$2$1(t7, aVar, dVar, null), 3, (Object) null);
        }
        Iterator<T> it2 = cVar.f90315a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((d) next2).f90320e == 2) {
                break;
            }
        }
        d dVar2 = (d) next2;
        Job jobLaunch$default = null;
        if (dVar2 != null) {
            Context context2 = this.$context;
            T t8 = this.$binding;
            a aVar2 = this.this$0;
            BiliImageLoader.INSTANCE.with(context2).url(dVar2.f90316a).into(t8.f119500g);
            t8.f119501i.setText(dVar2.f90318c);
            jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseMulZoneComponent$bindToView$3$3$1(t8, aVar2, dVar2, null), 3, (Object) null);
        }
        return jobLaunch$default;
    }
}
