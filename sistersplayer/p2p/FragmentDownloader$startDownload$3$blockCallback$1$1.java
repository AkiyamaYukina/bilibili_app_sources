package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.p2p.fragment.DataRoleType;
import com.bilibili.sistersplayer.p2p.fragment.DataSourceType;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.peer.PeerRole;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$startDownload$3$blockCallback$1$1.class */
public final class FragmentDownloader$startDownload$3$blockCallback$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $blockNum;
    final byte[] $data;
    final LiveFragment $fragment;
    int label;
    final FragmentDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentDownloader$startDownload$3$blockCallback$1$1(int i7, LiveFragment liveFragment, byte[] bArr, FragmentDownloader fragmentDownloader, Continuation<? super FragmentDownloader$startDownload$3$blockCallback$1$1> continuation) {
        super(2, continuation);
        this.$blockNum = i7;
        this.$fragment = liveFragment;
        this.$data = bArr;
        this.this$0 = fragmentDownloader;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FragmentDownloader$startDownload$3$blockCallback$1$1(this.$blockNum, this.$fragment, this.$data, this.this$0, continuation);
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
        int i7 = this.$blockNum;
        if (i7 < 0 || i7 >= this.$fragment.getBlockCount()) {
            P2PDataCollection.addWastedDataSize$default(this.this$0.p2pContext.getP2pDataCollection(), this.$data.length, WastedDataType.CDN_REPEAT, null, null, 12, null);
        } else {
            if (!LiveFragment.setBlockData$default(this.$fragment, this.$blockNum, this.$data, DataSourceType.SERVER, this.this$0.p2pContext.getPeerRole() == PeerRole.PEER ? DataRoleType.SEED : DataRoleType.LACKED, null, 16, null)) {
                P2PDataCollection.addWastedDataSize$default(this.this$0.p2pContext.getP2pDataCollection(), this.$data.length, WastedDataType.CDN_REPEAT, null, null, 12, null);
            }
        }
        return Unit.INSTANCE;
    }
}
