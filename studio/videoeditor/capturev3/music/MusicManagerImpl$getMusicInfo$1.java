package com.bilibili.studio.videoeditor.capturev3.music;

import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/MusicManagerImpl$getMusicInfo$1.class */
final class MusicManagerImpl$getMusicInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MusicInfo $musicInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicManagerImpl$getMusicInfo$1(MusicInfo musicInfo, Continuation<? super MusicManagerImpl$getMusicInfo$1> continuation) {
        super(2, continuation);
        this.$musicInfo = musicInfo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicManagerImpl$getMusicInfo$1(this.$musicInfo, continuation);
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
                long id = this.$musicInfo.getId();
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                IB0.c.a(id, BiliAccounts.get(BiliContext.application()).getAccessKey(), new com.bilibili.studio.editor.moudle.intelligence.logic.f(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bgm bgm = new Bgm();
            bgm.transformationBgm((BgmMissionInfo) obj);
            this.$musicInfo.setBgm(bgm);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
