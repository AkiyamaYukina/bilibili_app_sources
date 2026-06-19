package com.bilibili.studio.editor.timeline;

import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.storagechecker.StorageChecker;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/UpperEditorUtil$startScanSDCards$1.class */
public final class UpperEditorUtil$startScanSDCards$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public UpperEditorUtil$startScanSDCards$1(Continuation<? super UpperEditorUtil$startScanSDCards$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperEditorUtil$startScanSDCards$1(continuation);
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
        Lazy lazy = zw0.b.f130950a;
        if (DeviceDecision.INSTANCE.getBoolean("uper.editor_video_compile_storage_opt", true)) {
            try {
                StorageChecker.scanSDCards(FoundationAlias.getFapp().getApplicationContext());
                BLog.e("UpperEditorUtil", "startScanSDCards success");
            } catch (Throwable th) {
                th.printStackTrace();
                BLog.e("UpperEditorUtil", "startScanSDCards fail: " + th);
            }
        }
        return Unit.INSTANCE;
    }
}
