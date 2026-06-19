package com.bilibili.playset;

import com.bilibili.droid.ToastHelper;
import com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$subscribeDataObservers$1.class */
final class MultiTypeListDetailActivityV2$subscribeDataObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MultiTypeListDetailActivityV2 this$0;

    /* JADX INFO: renamed from: com.bilibili.playset.MultiTypeListDetailActivityV2$subscribeDataObservers$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$subscribeDataObservers$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final MultiTypeListDetailActivityV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = multiTypeListDetailActivityV2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.this$0;
                int i7 = MultiTypeListDetailActivityV2.f83940l1;
                multiTypeListDetailActivityV2.getClass();
                ToastHelper.showToastShort(multiTypeListDetailActivityV2, 2131842507);
            } else {
                MultiTypeListDetailActivityV2 multiTypeListDetailActivityV22 = this.this$0;
                int i8 = MultiTypeListDetailActivityV2.f83940l1;
                multiTypeListDetailActivityV22.getClass();
                ToastHelper.showToastShort(multiTypeListDetailActivityV22, 2131842476);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailActivityV2$subscribeDataObservers$1(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2, Continuation<? super MultiTypeListDetailActivityV2$subscribeDataObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailActivityV2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailActivityV2$subscribeDataObservers$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
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
            MutableSharedFlow<Boolean> mutableSharedFlow = playlistViewModelV22.f85556r;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
