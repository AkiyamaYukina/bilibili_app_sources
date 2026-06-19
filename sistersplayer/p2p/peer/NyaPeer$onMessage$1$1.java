package com.bilibili.sistersplayer.p2p.peer;

import androidx.core.app.NotificationCompat;
import com.bilibili.sistersplayer.p2p.P2PDataCollection;
import com.bilibili.sistersplayer.p2p.WastedDataType;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$onMessage$1$1.class */
public final class NyaPeer$onMessage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MsgQuery $msg;
    int label;
    final NyaPeer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NyaPeer$onMessage$1$1(MsgQuery msgQuery, NyaPeer nyaPeer, Continuation<? super NyaPeer$onMessage$1$1> continuation) {
        super(2, continuation);
        this.$msg = msgQuery;
        this.this$0 = nyaPeer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NyaPeer$onMessage$1$1(this.$msg, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String string = this.$msg.get("type").getString();
        Integer num = this.$msg.get("requestId").getInt();
        int iIntValue = num != null ? num.intValue() : -1;
        if (StringsKt.x(string, "response") && iIntValue > 0) {
            CancellableContinuation cancellableContinuation = (CancellableContinuation) this.this$0.pendingRequests.get(Boxing.boxInt(iIntValue));
            if (cancellableContinuation != null) {
                this.this$0.pendingRequests.remove(Boxing.boxInt(iIntValue));
                if (cancellableContinuation.isActive()) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.constructor-impl(this.$msg));
                } else {
                    P2PLogger.logI$default(this.this$0.logger, NyaPeer.TAG, com.bilibili.app.comm.bh.x5.a.a("!!! requestId contaions, but state: isCompleted - ", ", isCancelled - ", cancellableContinuation.isCompleted(), cancellableContinuation.isCancelled()), null, 4, null);
                }
            } else if (StringsKt.x(this.$msg.get(NotificationCompat.CATEGORY_STATUS).getString(), "ok")) {
                byte[] byteArray = this.$msg.get("data").getByteArray();
                if ((byteArray != null ? byteArray.length : 0) > 0) {
                    P2PDataCollection p2pDataCollection = this.this$0.p2pContext.getP2pDataCollection();
                    byte[] byteArray2 = this.$msg.get("data").getByteArray();
                    int length = 0;
                    if (byteArray2 != null) {
                        length = byteArray2.length;
                    }
                    P2PDataCollection.addWastedDataSize$default(p2pDataCollection, length, WastedDataType.P2P_LATE, null, null, 12, null);
                }
            }
        } else if (!StringsKt.x(string, "request") || iIntValue <= 0) {
            P2PLogger p2PLogger = this.this$0.logger;
            String peerId = this.this$0.getExtUserData().getPeerId();
            StringBuilder sbA = androidx.constraintlayout.widget.e.a(iIntValue, "[LiveP2PProblem][p2p_error=peer_message] can't handle message: type = ", string, ", requestId= ", ", peerid= ");
            sbA.append(peerId);
            P2PLogger.logE$default(p2PLogger, NyaPeer.TAG, sbA.toString(), null, 4, null);
        } else {
            try {
                Boxing.boxBoolean(this.this$0.msgHandler.handlePeerMessage(this.this$0, this.$msg));
            } catch (Exception e7) {
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
