package com.bilibili.ship.theseus.cheese.player.castscreen;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import ev0.InterfaceC7008a;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseEpCastScreenService$collectCastScreenToNext$1.class */
final class CheeseEpCastScreenService$collectCastScreenToNext$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final com.bilibili.ship.theseus.cheese.player.castscreen.a this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/CheeseEpCastScreenService$collectCastScreenToNext$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.cheese.player.castscreen.a f90569a;

        public a(com.bilibili.ship.theseus.cheese.player.castscreen.a aVar) {
            this.f90569a = aVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Unit unit;
            ProjectionItemData projectionItemData = ((BusinessCastScreenService.a) obj).f99102a;
            long j7 = projectionItemData.f63477d;
            com.bilibili.ship.theseus.cheese.player.castscreen.a aVar = this.f90569a;
            if (j7 == aVar.f90574e.f117511f) {
                StringBuilder sbA = z.a(projectionItemData.f63475b, "cast screen item change but current ep is same as change item! avid:", ", cid:");
                sbA.append(j7);
                defpackage.a.b("[theseus-cheese-CheeseEpCastScreenService$collectCastScreenToNext$1$1-emit] ", sbA.toString(), "CheeseEpCastScreenService$collectCastScreenToNext$1$1-emit");
                unit = Unit.INSTANCE;
            } else {
                StringBuilder sbA2 = z.a(projectionItemData.f63475b, "cast screen auto play next, next avid: ", ", next cid: ");
                sbA2.append(j7);
                defpackage.a.b("[theseus-cheese-CheeseEpCastScreenService$collectCastScreenToNext$1$1-emit] ", sbA2.toString(), "CheeseEpCastScreenService$collectCastScreenToNext$1$1-emit");
                long j8 = projectionItemData.f63475b;
                if (j8 != aVar.f90574e.f117510e) {
                    InterfaceC7008a.e(aVar.f90571b, j8, projectionItemData.f63477d, null, aVar.f90575f.a().f123881c, null, 0, null, aVar.f90576g.a(projectionItemData.f63475b, projectionItemData.f63477d), 234);
                } else {
                    CheesePlayRepository.e(aVar.f90572c, j8, projectionItemData.f63477d, 0, 28);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseEpCastScreenService$collectCastScreenToNext$1(com.bilibili.ship.theseus.cheese.player.castscreen.a aVar, Continuation<? super CheeseEpCastScreenService$collectCastScreenToNext$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseEpCastScreenService$collectCastScreenToNext$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.cheese.player.castscreen.a aVar = this.this$0;
            SharedFlow<BusinessCastScreenService.a> sharedFlow = aVar.f90573d.f99098o;
            a aVar2 = new a(aVar);
            this.label = 1;
            if (sharedFlow.collect(aVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
