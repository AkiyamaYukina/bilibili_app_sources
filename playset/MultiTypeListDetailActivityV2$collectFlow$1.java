package com.bilibili.playset;

import com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$collectFlow$1.class */
final class MultiTypeListDetailActivityV2$collectFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MultiTypeListDetailActivityV2 this$0;

    /* JADX INFO: renamed from: com.bilibili.playset.MultiTypeListDetailActivityV2$collectFlow$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$collectFlow$1$1.class */
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiTypeListDetailActivityV2 f83990a;

        public AnonymousClass1(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2) {
            this.f83990a = multiTypeListDetailActivityV2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(vs0.InterfaceC8858b r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 694
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.MultiTypeListDetailActivityV2$collectFlow$1.AnonymousClass1.emit(vs0.b, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailActivityV2$collectFlow$1(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2, Continuation<? super MultiTypeListDetailActivityV2$collectFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailActivityV2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailActivityV2$collectFlow$1(this.this$0, continuation);
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
            PlaylistViewModelV2 playlistViewModelV2 = this.this$0.f83970c0;
            PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
            if (playlistViewModelV2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                playlistViewModelV22 = null;
            }
            SharedFlow sharedFlow = (SharedFlow) playlistViewModelV22.f85560v.getValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (sharedFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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
