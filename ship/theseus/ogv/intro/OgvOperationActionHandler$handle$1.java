package com.bilibili.ship.theseus.ogv.intro;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvOperationActionHandler$handle$1.class */
final class OgvOperationActionHandler$handle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $appSubId;
    final String $link;
    final Map<String, String> $orderReportParams;
    final String $sourceEventId;
    int label;
    final D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvOperationActionHandler$handle$1(String str, D d7, String str2, String str3, Map<String, String> map, Continuation<OgvOperationActionHandler$handle$1> continuation) {
        super(2, continuation);
        this.$link = str;
        this.this$0 = d7;
        this.$sourceEventId = str2;
        this.$appSubId = str3;
        this.$orderReportParams = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvOperationActionHandler$handle$1(this.$link, this.this$0, this.$sourceEventId, this.$appSubId, this.$orderReportParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Iu0.a.a(this.$link)) {
                D d7 = this.this$0;
                com.bilibili.ship.theseus.ogv.vip.a aVar = d7.f92202e;
                String strA = d7.f92203f.a(this.$link);
                String str = this.$sourceEventId;
                String str2 = this.$appSubId;
                Map<String, String> map = this.$orderReportParams;
                Map<String, String> mapEmptyMap = map;
                if (map == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                String strA2 = aVar.a(strA, str, str2, mapEmptyMap);
                Q q7 = this.this$0.f92203f;
                this.label = 1;
                if (q7.c(strA2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.bilibili.ship.theseus.ogv.vip.a aVar2 = this.this$0.f92202e;
                String str3 = this.$link;
                String str4 = this.$sourceEventId;
                String str5 = this.$appSubId;
                Map<String, String> map2 = this.$orderReportParams;
                Map<String, String> mapEmptyMap2 = map2;
                if (map2 == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                String strA3 = aVar2.a(str3, str4, str5, mapEmptyMap2);
                com.bilibili.ship.theseus.ogv.web.b bVar = this.this$0.f92201d;
                this.label = 2;
                if (bVar.b(strA3, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
