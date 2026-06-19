package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/UnitedPlaylistActivity$prepareFallbackOnBackPressed$1$invokeSuspend$$inlined$awaitCancel$1.class */
public final class UnitedPlaylistActivity$prepareFallbackOnBackPressed$1$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UnitedPlaylistActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedPlaylistActivity$prepareFallbackOnBackPressed$1$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, UnitedPlaylistActivity unitedPlaylistActivity) {
        super(2, continuation);
        this.this$0 = unitedPlaylistActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedPlaylistActivity$prepareFallbackOnBackPressed$1$invokeSuspend$$inlined$awaitCancel$1(continuation, this.this$0);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            a.S0 s02 = this.this$0.f95178F;
            a.S0 s03 = s02;
            if (s02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                s03 = null;
            }
            ((BackActionRepository) s03.L0.get()).f99048c = null;
            throw th;
        }
    }
}
