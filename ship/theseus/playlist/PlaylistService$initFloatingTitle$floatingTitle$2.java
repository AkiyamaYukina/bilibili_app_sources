package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.E;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$initFloatingTitle$floatingTitle$2.class */
final class PlaylistService$initFloatingTitle$floatingTitle$2 extends SuspendLambda implements Function3<Boolean, E.b, Continuation<? super Boolean>, Object> {
    Object L$0;
    boolean Z$0;
    int label;

    public PlaylistService$initFloatingTitle$floatingTitle$2(Continuation<? super PlaylistService$initFloatingTitle$floatingTitle$2> continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), (E.b) obj2, (Continuation<? super Boolean>) obj3);
    }

    public final Object invoke(boolean z6, E.b bVar, Continuation<? super Boolean> continuation) {
        PlaylistService$initFloatingTitle$floatingTitle$2 playlistService$initFloatingTitle$floatingTitle$2 = new PlaylistService$initFloatingTitle$floatingTitle$2(continuation);
        playlistService$initFloatingTitle$floatingTitle$2.Z$0 = z6;
        playlistService$initFloatingTitle$floatingTitle$2.L$0 = bVar;
        return playlistService$initFloatingTitle$floatingTitle$2.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(!this.Z$0 && Intrinsics.areEqual((E.b) this.L$0, E.b.C0762b.f94961a));
    }
}
