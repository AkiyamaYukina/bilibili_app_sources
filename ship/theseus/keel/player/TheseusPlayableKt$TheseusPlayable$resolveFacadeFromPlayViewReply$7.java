package com.bilibili.ship.theseus.keel.player;

import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7.class */
final class TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7 extends SuspendLambda implements Function3<Integer, InterfaceC5778f, Continuation<? super Unit>, Object> {
    final int $masterIndex;
    final long $masterPieceAvid;
    final long $masterPieceCid;
    final f $runWithVideoPiece;
    final ArrayList<n> $sortedMediaList;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7(ArrayList<n> arrayList, int i7, long j7, long j8, f fVar, Continuation<? super TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7> continuation) {
        super(3, continuation);
        this.$sortedMediaList = arrayList;
        this.$masterIndex = i7;
        this.$masterPieceAvid = j7;
        this.$masterPieceCid = j8;
        this.$runWithVideoPiece = fVar;
    }

    public final Object invoke(int i7, InterfaceC5778f interfaceC5778f, Continuation<? super Unit> continuation) {
        TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7 theseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7 = new TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7(this.$sortedMediaList, this.$masterIndex, this.$masterPieceAvid, this.$masterPieceCid, this.$runWithVideoPiece, continuation);
        theseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7.I$0 = i7;
        theseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7.L$0 = interfaceC5778f;
        return theseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$7.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), (InterfaceC5778f) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            int i8 = this.I$0;
            InterfaceC5778f interfaceC5778f = (InterfaceC5778f) this.L$0;
            n nVar = this.$sortedMediaList.get(i8);
            long j7 = nVar.f91127b;
            int i9 = this.$masterIndex;
            long j8 = this.$masterPieceAvid;
            long j9 = this.$masterPieceCid;
            q qVar = new q(i8, j7, nVar.f91128c, true, interfaceC5778f, nVar.f91129d, nVar.f91130e, i9, j8, j9);
            f fVar = this.$runWithVideoPiece;
            this.label = 1;
            if (fVar.a(qVar, this) == coroutine_suspended) {
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
