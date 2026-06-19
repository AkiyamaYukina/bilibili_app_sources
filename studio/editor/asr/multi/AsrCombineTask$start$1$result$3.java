package com.bilibili.studio.editor.asr.multi;

import Y9.n;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.asr.l;
import com.bilibili.studio.editor.asr.multi.a;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$start$1$result$3.class */
public final class AsrCombineTask$start$1$result$3 extends SuspendLambda implements Function3<FlowCollector<? super a.C1186a>, Throwable, Continuation<? super Unit>, Object> {
    final Ref.LongRef $asrSpend;
    final Ref.LongRef $asrStartTime;
    final Ref.LongRef $extractSpend;
    Object L$0;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCombineTask$start$1$result$3(Ref.LongRef longRef, Ref.LongRef longRef2, a aVar, Ref.LongRef longRef3, Continuation<? super AsrCombineTask$start$1$result$3> continuation) {
        super(3, continuation);
        this.$asrSpend = longRef;
        this.$asrStartTime = longRef2;
        this.this$0 = aVar;
        this.$extractSpend = longRef3;
    }

    public final Object invoke(FlowCollector<? super a.C1186a> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        AsrCombineTask$start$1$result$3 asrCombineTask$start$1$result$3 = new AsrCombineTask$start$1$result$3(this.$asrSpend, this.$asrStartTime, this.this$0, this.$extractSpend, continuation);
        asrCombineTask$start$1$result$3.L$0 = th;
        return asrCombineTask$start$1$result$3.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.L$0;
        this.$asrSpend.element = System.currentTimeMillis() - this.$asrStartTime.element;
        if (th instanceof CancellationException) {
            a aVar = this.this$0;
            long j7 = this.$extractSpend.element;
            long j8 = this.$asrSpend.element;
            aVar.getClass();
            defpackage.a.b("handleCancel:", ((CancellationException) th).getMessage(), "BiliEditorMultiAsrManager");
            List<AudioInfo> list = aVar.f105618e;
            g gVar = aVar.f105620g;
            AsrSource asrSource = aVar.f105616c;
            String str = aVar.f105615b;
            long j9 = aVar.f105617d;
            gVar.f105643f = true;
            l lVar = gVar.f105646j;
            lVar.f105593b = true;
            Timer timer = lVar.f105592a;
            if (timer != null) {
                timer.cancel();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j9;
            String str2 = gVar.f105644g ? "interrupt" : "cancel";
            com.bilibili.studio.editor.asr.b.h(str, str2, Intrinsics.areEqual(str2, "interrupt") ? "100097" : "100098", "", jCurrentTimeMillis, gVar.h + j7, j8, gVar.f105645i, com.bilibili.studio.editor.asr.b.a(list), true, asrSource, 384);
            if (asrSource == AsrSource.EDITOR) {
                com.bilibili.studio.editor.asr.b.e(48, jCurrentTimeMillis, "cancel", "", Intrinsics.areEqual(str2, "interrupt") ? "100097" : "100098", null, null, true);
            }
            BLog.d("BiliEditorMultiAsrManager", "handleCancel spend:" + jCurrentTimeMillis);
            BiliContext.getMainHandler().post(new n(gVar, 1));
        }
        return Unit.INSTANCE;
    }
}
