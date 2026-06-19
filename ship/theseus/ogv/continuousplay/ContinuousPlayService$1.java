package com.bilibili.ship.theseus.ogv.continuousplay;

import com.bilibili.ship.theseus.ogv.ep.ContinuingType;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/continuousplay/ContinuousPlayService$1.class */
final class ContinuousPlayService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final com.bilibili.ship.theseus.ogv.continuousplay.a this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/continuousplay/ContinuousPlayService$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.ogv.continuousplay.a f91798a;

        public a(com.bilibili.ship.theseus.ogv.continuousplay.a aVar) {
            this.f91798a = aVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            OgvEpisode ogvEpisode = (OgvEpisode) obj;
            com.bilibili.ship.theseus.ogv.continuousplay.a aVar = this.f91798a;
            if (ogvEpisode != null && aVar.f91801c.f92121x == ContinuingType.NotContinuing) {
                aVar.f91802d.f91811a = 0;
            }
            if (ogvEpisode != null) {
                Gu0.a aVar2 = aVar.f91805g;
                long j7 = ogvEpisode.f93555a;
                boolean zN = aVar2.n(j7);
                d dVar = aVar.f91802d;
                if (zN) {
                    dVar.f91813c.add(Long.valueOf(j7));
                    dVar.f91814d = j7;
                } else {
                    dVar.f91812b.add(Integer.valueOf(ogvEpisode.f93557c));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuousPlayService$1(com.bilibili.ship.theseus.ogv.continuousplay.a aVar, Continuation<? super ContinuousPlayService$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContinuousPlayService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.continuousplay.a aVar = this.this$0;
            OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = aVar.f91801c.f92119v;
            a aVar2 = new a(aVar);
            this.label = 1;
            if (ogvCurrentEpisodeRepository$special$$inlined$map$1.collect(aVar2, this) == coroutine_suspended) {
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
