package com.bilibili.ship.theseus.playlist.di.page;

import android.net.Uri;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistUgcSeasonPanelItemClickService$1.class */
final class PlaylistUgcSeasonPanelItemClickService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final W this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistUgcSeasonPanelItemClickService$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W f95697a;

        public a(W w7) {
            this.f95697a = w7;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Pair pair = (Pair) obj;
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("bilibili://video/" + ((Number) pair.component1()).longValue() + "/").buildUpon().appendQueryParameter("cid", String.valueOf(((Number) pair.component2()).longValue())).appendQueryParameter("from_spmid", "united.player-video-detail.drama-float.0").build()).requestCode(-1).build(), this.f95697a.f95701b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistUgcSeasonPanelItemClickService$1(W w7, Continuation<? super PlaylistUgcSeasonPanelItemClickService$1> continuation) {
        super(2, continuation);
        this.this$0 = w7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistUgcSeasonPanelItemClickService$1(this.this$0, continuation);
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
            W w7 = this.this$0;
            SharedFlow<Pair<Long, Long>> sharedFlow = w7.f95702c.f101466p;
            a aVar = new a(w7);
            this.label = 1;
            if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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
