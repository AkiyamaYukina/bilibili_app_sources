package com.bilibili.tensorflow.jsb;

import com.bilibili.app.comm.IJsBridgeContextV2;
import com.bilibili.common.webview.js.JsbDynamicService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/jsb/TfLiteModelService.class */
public final class TfLiteModelService implements JsbDynamicService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IJsBridgeContextV2 f110753a;

    /* JADX INFO: renamed from: com.bilibili.tensorflow.jsb.TfLiteModelService$execute$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/jsb/TfLiteModelService$execute$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final TfLiteModelService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TfLiteModelService tfLiteModelService, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = tfLiteModelService;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.execute(null, null, this);
        }
    }

    public TfLiteModelService(@NotNull IJsBridgeContextV2 iJsBridgeContextV2) {
        this.f110753a = iJsBridgeContextV2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(2:10|(1:12)(2:13|14))(4:15|(4:17|(1:19)|20|(1:22)(2:23|(2:25|(2:27|28))(1:33)))|34|35)|29|38|30|31|32|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0191, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0191 -> B:31:0x0119). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object execute(@org.jetbrains.annotations.Nullable com.alibaba.fastjson.JSONObject r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.jsb.TfLiteModelService.execute(com.alibaba.fastjson.JSONObject, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void release() {
    }
}
