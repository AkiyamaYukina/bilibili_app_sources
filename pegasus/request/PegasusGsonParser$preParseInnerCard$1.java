package com.bilibili.pegasus.request;

import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.google.gson.Gson;
import fp0.u;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/PegasusGsonParser$preParseInnerCard$1.class */
final class PegasusGsonParser$preParseInnerCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final PegasusGsonParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusGsonParser$preParseInnerCard$1(PegasusGsonParser pegasusGsonParser, Continuation<? super PegasusGsonParser$preParseInnerCard$1> continuation) {
        super(2, continuation);
        this.this$0 = pegasusGsonParser;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PegasusGsonParser$preParseInnerCard$1 pegasusGsonParser$preParseInnerCard$1 = new PegasusGsonParser$preParseInnerCard$1(this.this$0, continuation);
        pegasusGsonParser$preParseInnerCard$1.L$0 = obj;
        return pegasusGsonParser$preParseInnerCard$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PegasusGsonParser pegasusGsonParser = this.this$0;
        try {
            Result.Companion companion = Result.Companion;
            long jCurrentTimeMillis = System.currentTimeMillis();
            pegasusGsonParser.f78801e.fromJson("\n        {\"card_type\":\"banner_v8\",\"args\":{},\"banner_item\":[{\"type\":\"static\",\"static_banner\":{}},{\"type\":\"ad\",\"ad_banner\":{\"extra\":{}}}]}\n    ", gp0.c.class);
            boolean zCurrentIsDoubleColumn = PegasusStyleKt.currentIsDoubleColumn(PegasusStyle.INSTANCE);
            Gson gson = pegasusGsonParser.f78801e;
            if (zCurrentIsDoubleColumn) {
                gson.fromJson("\n        {\"card_type\":\"small_cover_v2\",\"args\":{},\"player_args\":{},\"three_point_v2\":[{\"type\":\"\"}],\"desc_button\":{},\"goto_icon\":{}}\n    ", u.class);
            } else {
                gson.fromJson("\n        {\"card_type\":\"large_cover_single_v9\",\"args\":{},\"player_args\":{},\"up_args\":{},\"three_point_meta\":{\"functional_buttons\":[{\"type\":1,\"button_metas\":[]}]},\"avatar\":{},\"like_button\":{},\"share_plane\":{},\"inline_progress_bar\":{},\"multiply_desc\":{}}\n    ", fp0.j.class);
            }
            BLog.i("[Pegasus]GsonParser", "preParseInnerCard, cost = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        PegasusGsonParser pegasusGsonParser2 = this.this$0;
        Throwable th2 = Result.exceptionOrNull-impl(obj2);
        if (th2 != null) {
            pegasusGsonParser2.h();
            BLog.i("[Pegasus]GsonParser", "preParseInnerCard, fail to parse");
            th2.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
