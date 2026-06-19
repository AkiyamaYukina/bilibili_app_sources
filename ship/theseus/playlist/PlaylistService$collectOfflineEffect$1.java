package com.bilibili.ship.theseus.playlist;

import android.widget.FrameLayout;
import com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectOfflineEffect$1.class */
final class PlaylistService$collectOfflineEffect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
    int label;
    final E this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectOfflineEffect$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f95177a;

        public a(E e7) {
            this.f95177a = e7;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            D.f fVar = (D.f) obj;
            if (!(fVar instanceof D.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            PlaylistRepository playlistRepository = this.f95177a.f94937e;
            FrameLayout frameLayout = ((D.f.a) fVar).f95956a;
            playlistRepository.getClass();
            playlistRepository.f95112t.setValue(new OfflineDanmakuInputService.a(frameLayout));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectOfflineEffect$1(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super PlaylistService$collectOfflineEffect$1> continuation) {
        super(2, continuation);
        this.$component = d7;
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistService$collectOfflineEffect$1(this.$component, this.this$0, continuation);
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
            SharedFlow<D.f> sharedFlow = this.$component.f95938n;
            a aVar = new a(this.this$0);
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
