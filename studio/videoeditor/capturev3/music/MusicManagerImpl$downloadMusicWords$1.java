package com.bilibili.studio.videoeditor.capturev3.music;

import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/MusicManagerImpl$downloadMusicWords$1.class */
final class MusicManagerImpl$downloadMusicWords$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MusicInfo $musicInfo;
    int label;
    final n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicManagerImpl$downloadMusicWords$1(n nVar, MusicInfo musicInfo, Continuation<? super MusicManagerImpl$downloadMusicWords$1> continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$musicInfo = musicInfo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicManagerImpl$downloadMusicWords$1(this.this$0, this.$musicInfo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            n nVar = this.this$0;
            String message = e7.getMessage();
            nVar.getClass();
            if (message != null && message.length() != 0) {
                nVar.r().h.postValue(message);
            }
            this.this$0.o(null);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            n nVar2 = this.this$0;
            long id = this.$musicInfo.getId();
            this.label = 1;
            Object objN = n.n(nVar2, id, this);
            obj = objN;
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.o(new File(n.m(this.this$0), this.$musicInfo.getName() + ".lrc"));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        n nVar3 = this.this$0;
        String strM = n.m(nVar3);
        String str2 = this.$musicInfo.getName() + ".lrc";
        this.label = 2;
        if (n.j(nVar3, str, strM, str2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.this$0.o(new File(n.m(this.this$0), this.$musicInfo.getName() + ".lrc"));
        return Unit.INSTANCE;
    }
}
