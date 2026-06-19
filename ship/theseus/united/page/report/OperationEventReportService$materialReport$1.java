package com.bilibili.ship.theseus.united.page.report;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.report.c;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.material.util.UtilsKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/OperationEventReportService$materialReport$1.class */
public final class OperationEventReportService$materialReport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $code;
    final String $eventId;
    final Map<String, String> $finalParams;
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationEventReportService$materialReport$1(d dVar, String str, String str2, Map<String, String> map, Continuation<? super OperationEventReportService$materialReport$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$code = str;
        this.$eventId = str2;
        this.$finalParams = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OperationEventReportService$materialReport$1(this.this$0, this.$code, this.$eventId, this.$finalParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c.f102495a.getClass();
            c cVar = c.a.f102497b;
            MediaType mediaType = MediaType.parse("application/json");
            d dVar = this.this$0;
            String str = this.$code;
            String str2 = this.$eventId;
            Map<String, String> map = this.$finalParams;
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty(EditCustomizeSticker.TAG_MID, String.valueOf(dVar.f102499b.mid()));
            jsonObject2.addProperty("code", str);
            jsonObject2.addProperty("event_id", str2);
            jsonObject2.addProperty("event_type", (String) CollectionsKt.lastOrNull(StringsKt.R(str2, new String[]{UtilsKt.DOT}, 0, 6)));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jsonObject2.addProperty(entry.getKey(), entry.getValue());
            }
            jsonArray.add(jsonObject2);
            Unit unit = Unit.INSTANCE;
            jsonObject.add("private_params", jsonArray);
            RequestBody requestBodyCreate = RequestBody.create(mediaType, JsonUtilKt.toJson(jsonObject));
            this.label = 1;
            if (cVar.materialReport(requestBodyCreate, this) == coroutine_suspended) {
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
