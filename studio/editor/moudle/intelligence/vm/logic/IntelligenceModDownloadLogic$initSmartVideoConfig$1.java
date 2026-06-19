package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic;
import com.bilibili.studio.videoeditor.common.mod.Mod;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/IntelligenceModDownloadLogic$initSmartVideoConfig$1.class */
final class IntelligenceModDownloadLogic$initSmartVideoConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IntelligenceModDownloadLogic.a $callback;
    final String $picVideoId;
    final long $startTime;
    int label;
    final IntelligenceModDownloadLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntelligenceModDownloadLogic$initSmartVideoConfig$1(IntelligenceModDownloadLogic intelligenceModDownloadLogic, long j7, String str, IntelligenceModDownloadLogic.a aVar, Continuation<? super IntelligenceModDownloadLogic$initSmartVideoConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = intelligenceModDownloadLogic;
        this.$startTime = j7;
        this.$picVideoId = str;
        this.$callback = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IntelligenceModDownloadLogic$initSmartVideoConfig$1(this.this$0, this.$startTime, this.$picVideoId, this.$callback, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            IntelligenceModDownloadLogic intelligenceModDownloadLogic = this.this$0;
            Mod mod = IntelligenceModDownloadLogic.f107711b;
            this.label = 1;
            intelligenceModDownloadLogic.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            SB0.b.f22776a.d(new Mod[]{mod}, new D(cancellableContinuationImpl));
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Y0.c.c("initSmartVideoConfig ok=", "ModDownloadLogic", zBooleanValue);
        if (zBooleanValue) {
            return Unit.INSTANCE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.$startTime;
        IntelligenceModDownloadLogic intelligenceModDownloadLogic2 = this.this$0;
        String str = this.$picVideoId;
        Mod mod2 = IntelligenceModDownloadLogic.f107711b;
        intelligenceModDownloadLogic2.getClass();
        IntelligenceModDownloadLogic.e(jCurrentTimeMillis, str, "smart_video_mod_download", "mod download error", false);
        this.$callback.a(jCurrentTimeMillis, "smart video mod error");
        return Unit.INSTANCE;
    }
}
