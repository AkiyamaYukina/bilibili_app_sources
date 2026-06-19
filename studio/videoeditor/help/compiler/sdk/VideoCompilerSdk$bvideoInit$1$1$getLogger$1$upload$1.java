package com.bilibili.studio.videoeditor.help.compiler.sdk;

import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.common.bili.laser.api.LaserClient;
import com.common.bili.laser.api.TriggerRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/VideoCompilerSdk$bvideoInit$1$1$getLogger$1$upload$1.class */
public final class VideoCompilerSdk$bvideoInit$1$1$getLogger$1$upload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public VideoCompilerSdk$bvideoInit$1$1$getLogger$1$upload$1(Continuation<? super VideoCompilerSdk$bvideoInit$1$1$getLogger$1$upload$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoCompilerSdk$bvideoInit$1$1$getLogger$1$upload$1(continuation);
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
        if (Intrinsics.areEqual(ConfigManager.Companion.ab().get("upper.enable_upload_all_logs", Boxing.boxBoolean(false)), Boxing.boxBoolean(true))) {
            LaserClient.triggerBLogContentUpload(new TriggerRequest.Builder().setAccesskey(BiliAccounts.get(BiliContext.application()).getAccessKey()).setBuvid(BuvidHelper.getBuvid()).setMid(BiliAccounts.get(BiliContext.application()).mid()).setTaskType("BCutVideoCompile").build());
        }
        return Unit.INSTANCE;
    }
}
