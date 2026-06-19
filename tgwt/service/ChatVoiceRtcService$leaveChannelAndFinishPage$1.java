package com.bilibili.tgwt.service;

import Pb.F;
import Pb.G;
import android.app.Activity;
import android.content.Context;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatVoiceRtcService$leaveChannelAndFinishPage$1.class */
final class ChatVoiceRtcService$leaveChannelAndFinishPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    int label;
    final ChatVoiceRtcService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceRtcService$leaveChannelAndFinishPage$1(ChatVoiceRtcService chatVoiceRtcService, Context context, Continuation<? super ChatVoiceRtcService$leaveChannelAndFinishPage$1> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceRtcService;
        this.$context = context;
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    private static void __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookActivityFinish(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Activity) obj).finish();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatVoiceRtcService$leaveChannelAndFinishPage$1(this.this$0, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[PHI: r8
  0x00c0: PHI (r8v7 com.bilibili.tgwt.service.u) = (r8v6 com.bilibili.tgwt.service.u), (r8v8 com.bilibili.tgwt.service.u) binds: [B:28:0x00f6, B:22:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.ChatVoiceRtcService$leaveChannelAndFinishPage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
