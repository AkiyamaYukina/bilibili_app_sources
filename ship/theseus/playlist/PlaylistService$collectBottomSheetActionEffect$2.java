package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.E;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectBottomSheetActionEffect$2.class */
final class PlaylistService$collectBottomSheetActionEffect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
    int label;
    final E this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectBottomSheetActionEffect$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f95169a;

        public a(E e7) {
            this.f95169a = e7;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            D.d dVar = (D.d) obj;
            if (!(dVar instanceof D.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            E e7 = this.f95169a;
            MutableStateFlow<E.b> mutableStateFlow = e7.f94953v;
            D.d.a aVar = (D.d.a) dVar;
            mutableStateFlow.setValue(aVar.f95952a);
            if (Intrinsics.areEqual(aVar.f95952a, E.b.C0762b.f94961a) && aVar.f95953b) {
                PageReportService.g(e7.f94943l, "united.player-video-detail.playlist-top.packup.click", null, 6);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectBottomSheetActionEffect$2(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super PlaylistService$collectBottomSheetActionEffect$2> continuation) {
        super(2, continuation);
        this.$component = d7;
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistService$collectBottomSheetActionEffect$2(this.$component, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<D.d> sharedFlow = this.$component.f95936l;
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
