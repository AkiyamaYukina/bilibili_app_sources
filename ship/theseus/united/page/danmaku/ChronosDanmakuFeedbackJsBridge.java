package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosDanmakuFeedbackJsBridge.class */
@StabilityInferred(parameters = 0)
public final class ChronosDanmakuFeedbackJsBridge implements com.bilibili.ogv.infra.jsb.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public D f99364a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosDanmakuFeedbackJsBridge$onDanmakuReport$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosDanmakuFeedbackJsBridge$onDanmakuReport$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final ChronosDanmakuFeedbackJsBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChronosDanmakuFeedbackJsBridge chronosDanmakuFeedbackJsBridge, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = chronosDanmakuFeedbackJsBridge;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onDanmakuReport(null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onDanmakuReport(@javax.inject.Named("res") @org.jetbrains.annotations.Nullable java.lang.Long r13, @javax.inject.Named("block_action") @org.jetbrains.annotations.Nullable com.alibaba.fastjson.JSONObject r14, @javax.inject.Named(com.alipay.alipaysecuritysdk.common.config.Constant.IN_KEY_REASON) @org.jetbrains.annotations.Nullable com.alibaba.fastjson.JSONObject r15, @javax.inject.Named("dmid") @org.jetbrains.annotations.Nullable java.lang.String r16, @javax.inject.Named("dmcontent") @org.jetbrains.annotations.Nullable java.lang.String r17, @javax.inject.Named("cid") @org.jetbrains.annotations.Nullable java.lang.String r18, @javax.inject.Named("from_spmid") @org.jetbrains.annotations.Nullable java.lang.String r19, @javax.inject.Named("report_cfg") @org.jetbrains.annotations.Nullable com.alibaba.fastjson.JSONObject r20, @javax.inject.Named("response") @org.jetbrains.annotations.NotNull com.alibaba.fastjson.JSONObject r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r22) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.ChronosDanmakuFeedbackJsBridge.onDanmakuReport(java.lang.Long, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setReportListener(@NotNull D d7) {
        this.f99364a = d7;
    }
}
