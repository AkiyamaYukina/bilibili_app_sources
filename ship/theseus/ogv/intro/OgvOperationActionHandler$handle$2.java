package com.bilibili.ship.theseus.ogv.intro;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvOperationActionHandler$handle$2.class */
final class OgvOperationActionHandler$handle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $appSubId;
    final Map<String, String> $orderReportParams;
    final String $sourceEventId;
    int label;
    final D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvOperationActionHandler$handle$2(D d7, String str, String str2, Map<String, String> map, Continuation<OgvOperationActionHandler$handle$2> continuation) {
        super(2, continuation);
        this.this$0 = d7;
        this.$sourceEventId = str;
        this.$appSubId = str2;
        this.$orderReportParams = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvOperationActionHandler$handle$2(this.this$0, this.$sourceEventId, this.$appSubId, this.$orderReportParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            D d7 = this.this$0;
            com.bilibili.ship.theseus.ogv.vip.a aVar = d7.f92202e;
            Q q7 = d7.f92203f;
            q7.getClass();
            Uri uri = Uri.parse("bilibili://vip/cashier");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder builderBuildUpon = uri.buildUpon();
            long j7 = q7.f92272f.f94449a;
            if (!queryParameterNames.contains("season_id")) {
                builderBuildUpon.appendQueryParameter("season_id", String.valueOf(j7));
            }
            if (!queryParameterNames.contains("scene")) {
                builderBuildUpon.appendQueryParameter("scene", "play_page");
            }
            if (!queryParameterNames.contains("appId")) {
                builderBuildUpon.appendQueryParameter("appId", "1");
            }
            String string = builderBuildUpon.build().toString();
            String str = this.$sourceEventId;
            String str2 = this.$appSubId;
            Map<String, String> map = this.$orderReportParams;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            String strA = aVar.a(string, str, str2, mapEmptyMap);
            Q q8 = this.this$0.f92203f;
            this.label = 1;
            if (q8.c(strA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
