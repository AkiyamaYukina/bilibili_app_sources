package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.L;
import tv.danmaku.biliplayerv2.service.U;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$collectPlayerState$2.class */
final class PCSFacadeImpl$collectPlayerState$2 extends SuspendLambda implements Function4<Boolean, Integer, L, Continuation<? super PlayerAvailability>, Object> {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    final PCSFacadeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$collectPlayerState$2(PCSFacadeImpl pCSFacadeImpl, Continuation<? super PCSFacadeImpl$collectPlayerState$2> continuation) {
        super(4, continuation);
        this.this$0 = pCSFacadeImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), (L) obj3, (Continuation<? super PlayerAvailability>) obj4);
    }

    public final Object invoke(boolean z6, int i7, L l7, Continuation<? super PlayerAvailability> continuation) {
        PCSFacadeImpl$collectPlayerState$2 pCSFacadeImpl$collectPlayerState$2 = new PCSFacadeImpl$collectPlayerState$2(this.this$0, continuation);
        pCSFacadeImpl$collectPlayerState$2.Z$0 = z6;
        pCSFacadeImpl$collectPlayerState$2.I$0 = i7;
        pCSFacadeImpl$collectPlayerState$2.L$0 = l7;
        return pCSFacadeImpl$collectPlayerState$2.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        PlayerAvailability playerAvailability;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        int i7 = this.I$0;
        if (((L) this.L$0) instanceof L.d) {
            BLog.i("PCSFacadeImpl$collectPlayerState$2-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$collectPlayerState$2-invokeSuspend] Position unavailable with playableRange, forbidding player.");
            return PlayerAvailability.FORBIDDEN;
        }
        if (z6 && i7 != 6) {
            return PlayerAvailability.LOADING;
        }
        if (i7 != 6) {
            this.this$0.f79400r = false;
        }
        if (i7 == 2 || i7 == 3) {
            playerAvailability = PlayerAvailability.LOADING;
        } else if (i7 == 4 || i7 == 5) {
            playerAvailability = PlayerAvailability.READY;
        } else if (i7 != 6) {
            playerAvailability = i7 != 8 ? PlayerAvailability.LOADING : PlayerAvailability.ERROR;
        } else {
            U u7 = this.this$0.f79391i;
            L lZ = u7 != null ? u7.Z() : null;
            if (lZ instanceof L.d) {
                defpackage.a.b("[tangram-player-core-PCSFacadeImpl$collectPlayerState$2-invokeSuspend] ", "COMPLETED but latest positionAvailability=" + lZ + ", forbidding player.", "PCSFacadeImpl$collectPlayerState$2-invokeSuspend");
                return PlayerAvailability.FORBIDDEN;
            }
            this.this$0.S();
            playerAvailability = this.this$0.f79400r ? PlayerAvailability.READY : PlayerAvailability.COMPLETED;
        }
        return playerAvailability;
    }
}
