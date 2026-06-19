package com.bilibili.ship.theseus.playlist.di.episode;

import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/PlaylistCastScreenService$collectCastScreenToNext$1.class */
final class PlaylistCastScreenService$collectCastScreenToNext$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final com.bilibili.ship.theseus.playlist.di.episode.a this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/PlaylistCastScreenService$collectCastScreenToNext$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.playlist.di.episode.a f95505a;

        public a(com.bilibili.ship.theseus.playlist.di.episode.a aVar) {
            this.f95505a = aVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            ProjectionItemData projectionItemData = ((BusinessCastScreenService.a) obj).f99102a;
            this.f95505a.f95507b.f(projectionItemData.f63475b, projectionItemData.f63477d, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistCastScreenService$collectCastScreenToNext$1(com.bilibili.ship.theseus.playlist.di.episode.a aVar, Continuation<? super PlaylistCastScreenService$collectCastScreenToNext$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistCastScreenService$collectCastScreenToNext$1(this.this$0, continuation);
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
            com.bilibili.ship.theseus.playlist.di.episode.a aVar = this.this$0;
            SharedFlow<BusinessCastScreenService.a> sharedFlow = aVar.f95508c.f99098o;
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
