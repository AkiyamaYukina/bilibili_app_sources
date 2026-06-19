package com.bilibili.ship.theseus.united.page.performance;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.tencent.map.geolocation.TencentLocation;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/UnitedProfilerReporter$reportPage$1.class */
public final class UnitedProfilerReporter$reportPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final JSONObject $extras;
    final tv.danmaku.bili.videopage.common.performance.b $watchDog;
    int label;
    final UnitedProfilerReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedProfilerReporter$reportPage$1(JSONObject jSONObject, tv.danmaku.bili.videopage.common.performance.b bVar, UnitedProfilerReporter unitedProfilerReporter, Continuation<? super UnitedProfilerReporter$reportPage$1> continuation) {
        super(2, continuation);
        this.$extras = jSONObject;
        this.$watchDog = bVar;
        this.this$0 = unitedProfilerReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(UnitedProfilerReporter unitedProfilerReporter) {
        unitedProfilerReporter.getClass();
        return UnitedProfilerReporter.c();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedProfilerReporter$reportPage$1(this.$extras, this.$watchDog, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String string;
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            string = this.$extras.getString(GameCardButton.extraAvid);
        } catch (Exception e7) {
        }
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException("Losing avid");
        }
        if (!this.$extras.getBoolean("is_auto_play").booleanValue()) {
            HashMap map = new HashMap();
            map.put(GameCardButton.extraAvid, string);
            final UnitedProfilerReporter unitedProfilerReporter = this.this$0;
            Neurons.trackT$default(false, "main.detail.tech.track.nonauto", map, 0, new Function0(unitedProfilerReporter) { // from class: com.bilibili.ship.theseus.united.page.performance.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UnitedProfilerReporter f102238a;

                {
                    this.f102238a = unitedProfilerReporter;
                }

                public final Object invoke() {
                    return Boolean.valueOf(UnitedProfilerReporter$reportPage$1.invokeSuspend$lambda$0(this.f102238a));
                }
            }, 8, (Object) null);
            throw new IllegalStateException("do not report when the action is manual");
        }
        Triple tripleA = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_CREATE);
        Triple tripleA2 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_VIEW_CREATED);
        Triple tripleA3 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_RESUME);
        Triple tripleA4 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_VIEW_TREE_LAYOUT);
        Triple tripleA5 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_DETAIL_VIEW_API_STARTED);
        Triple tripleA6 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_DETAIL_DATA);
        Triple tripleA7 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_DETAIL_DATA_DISPATCHED);
        Triple tripleA8 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_DETAIL_IMAGE_BIND);
        if (tripleA == null || tripleA2 == null || tripleA3 == null || tripleA4 == null || tripleA5 == null || tripleA6 == null || tripleA8 == null || tripleA7 == null) {
            throw new IllegalArgumentException("Losing basic record, data = " + this.$watchDog);
        }
        if (((Number) tripleA4.getThird()).longValue() <= ((Number) tripleA3.getThird()).longValue() || ((Number) tripleA6.getThird()).longValue() <= ((Number) tripleA3.getThird()).longValue()) {
            throw new IllegalStateException("Illegal start time, data = " + this.$watchDog);
        }
        long jMin = Math.min(((Number) tripleA3.getThird()).longValue(), ((Number) tripleA2.getThird()).longValue());
        long jLongValue = ((Number) tripleA4.getThird()).longValue() - jMin;
        if (jLongValue <= 0) {
            throw new IllegalStateException("Illegal layout time, data = " + this.$watchDog);
        }
        long jLongValue2 = ((Number) tripleA5.getThird()).longValue() - jMin;
        if (jLongValue2 <= 0) {
            throw new IllegalStateException("Illegal api start time, data = " + this.$watchDog);
        }
        long jLongValue3 = ((Number) tripleA6.getThird()).longValue() - jMin;
        if (jLongValue3 <= 0) {
            throw new IllegalStateException("Illegal api end time, data = " + this.$watchDog);
        }
        long jLongValue4 = ((Number) tripleA7.getThird()).longValue() - jMin;
        if (jLongValue4 <= 0) {
            throw new IllegalStateException("Illegal detail data unpack time, data = " + this.$watchDog);
        }
        int iLongValue = (int) (((Number) tripleA8.getThird()).longValue() - jMin);
        if (iLongValue <= 0) {
            throw new IllegalStateException("Illegal show time, data = " + this.$watchDog);
        }
        Triple tripleA9 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_START_BUSINESS_SERVICES);
        Triple tripleA10 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_START_RESOLVE_PLAY_URL);
        Triple tripleA11 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_END_RESOLVE_PLAY_URL);
        Triple tripleA12 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_RESOLVE_PLAY_URL_FIRE);
        Triple tripleA13 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_SET_MEDIA_ITEM);
        Object obj3 = this.$extras.get("key_extras_start_position");
        Object obj4 = this.$extras.get("key_extras_resolve_type");
        Object obj5 = this.$extras.get("key_extras_qn");
        int intValue = this.$extras.getIntValue(TencentLocation.NETWORK_PROVIDER);
        String str = this.$extras.getBoolean("is_url_preload").booleanValue() ? "1" : "0";
        int intValue2 = this.$extras.getIntValue("media_item_type");
        Object obj6 = this.$extras.get("schema");
        Object obj7 = obj6;
        if (obj6 == null) {
            obj7 = "";
        }
        Object obj8 = this.$extras.get("host");
        Object obj9 = obj8 != null ? obj8 : "";
        Object obj10 = this.$extras.get("biz_type");
        Object obj11 = obj10;
        if (obj10 == null) {
            obj11 = "none";
        }
        if (UnitedProfilerReporter.f102233b) {
            UnitedProfilerReporter.f102233b = false;
            obj2 = "1";
        } else {
            obj2 = "0";
        }
        String string2 = this.$extras.getString("contentViewType");
        String str2 = string2;
        if (string2 == null) {
            str2 = CaptureSchema.OLD_INVALID_ID_STRING;
        }
        String string3 = this.$extras.getString("from");
        String string4 = this.$extras.getString("from_spmid");
        String string5 = this.$extras.getString("spmid");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", string3);
        jSONObject.put("from_spmid", string4);
        jSONObject.put("spmid", string5);
        jSONObject.put("version_code", Boxing.boxInt(this.this$0.f102234a));
        jSONObject.put("usePreloadUrl", str);
        jSONObject.put("isAppColdBoot", obj2);
        jSONObject.put("LayoutTime", Boxing.boxLong(jLongValue));
        jSONObject.put("ApiStartTime", Boxing.boxLong(jLongValue2));
        jSONObject.put("ApiTime", Boxing.boxLong(jLongValue3));
        jSONObject.put("DetailDataDispatchedTime", Boxing.boxLong(jLongValue4));
        jSONObject.put("ShowTime", Boxing.boxInt(iLongValue));
        jSONObject.put("realWaitPlayTime", Boxing.boxInt(0));
        jSONObject.put("prepareTime", Boxing.boxInt(0));
        jSONObject.put("renderFirstFrameTime", Boxing.boxInt(0));
        jSONObject.put("startPosition", obj3);
        jSONObject.put("resolveType", obj4);
        jSONObject.put("qn", obj5);
        jSONObject.put("schema", obj7);
        jSONObject.put("host", obj9);
        jSONObject.put("uniteType", "2");
        jSONObject.put("contentViewType", str2);
        jSONObject.put("bizType", obj11);
        jSONObject.put("network_type", Boxing.boxInt(intValue));
        jSONObject.put("mediaItemType", Boxing.boxInt(intValue2));
        HashMap map2 = new HashMap(64);
        Object obj12 = this.$extras.get("from");
        map2.put("from", obj12 != null ? obj12.toString() : null);
        map2.put("from_spmid", string4);
        map2.put("spmid", string5);
        map2.put("usePreloadUrl", str);
        map2.put("isAppColdBoot", obj2);
        map2.put("LayoutTime", String.valueOf(jLongValue));
        map2.put("ApiStartTime", String.valueOf(jLongValue2));
        map2.put("ApiTime", String.valueOf(jLongValue3));
        map2.put("DetailDataDispatchedTime", String.valueOf(jLongValue4));
        map2.put("ShowTime", String.valueOf(iLongValue));
        map2.put("realWaitPlayTime", "0");
        map2.put("prepareTime", "0");
        map2.put("renderFirstFrameTime", "0");
        map2.put("startPosition", obj3 != null ? obj3.toString() : null);
        map2.put("resolveType", obj4 != null ? obj4.toString() : null);
        String string6 = null;
        if (obj5 != null) {
            string6 = obj5.toString();
        }
        map2.put("qn", string6);
        map2.put("schema", obj7.toString());
        map2.put("host", obj9.toString());
        map2.put("uniteType", "2");
        map2.put("contentViewType", str2);
        map2.put("bizType", obj11.toString());
        map2.put("network_type", String.valueOf(intValue));
        map2.put("mediaItemType", String.valueOf(intValue2));
        Object obj13 = this.$extras.get("detailType");
        Object obj14 = obj13;
        if (obj13 == null) {
            obj14 = "normal";
        }
        jSONObject.put("detailType", obj14);
        map2.put("detailType", obj14.toString());
        Triple tripleA14 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_EXTRA_BIZ_END);
        if (tripleA14 == null) {
            jSONObject.put("bizTime", Boxing.boxInt(0));
            map2.put("bizTime", "0");
        } else {
            long jLongValue5 = ((Number) tripleA14.getThird()).longValue() - jMin;
            if (jLongValue5 <= 0) {
                throw new IllegalStateException("Illegal biz time, data = " + this.$watchDog);
            }
            jSONObject.put("bizTime", Boxing.boxLong(jLongValue5));
            map2.put("bizTime", String.valueOf(jLongValue5));
        }
        Triple tripleA15 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_PLAYER_PREPARED);
        Triple tripleA16 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_PLAYER_FIRST_FRAME);
        if (tripleA9 != null) {
            long jLongValue6 = ((Number) tripleA9.getThird()).longValue() - jMin;
            jSONObject.put("startUgcServiceTime", Boxing.boxLong(jLongValue6));
            map2.put("startUgcServiceTime", String.valueOf(jLongValue6));
        }
        if (tripleA10 != null) {
            long jLongValue7 = ((Number) tripleA10.getThird()).longValue() - jMin;
            jSONObject.put("startResolvePlayUrlTime", Boxing.boxLong(jLongValue7));
            map2.put("startResolvePlayUrlTime", String.valueOf(jLongValue7));
        }
        if (tripleA11 != null) {
            long jLongValue8 = ((Number) tripleA11.getThird()).longValue() - jMin;
            jSONObject.put("endResolvePlayUrlTime", Boxing.boxLong(jLongValue8));
            map2.put("endResolvePlayUrlTime", String.valueOf(jLongValue8));
        }
        if (tripleA12 != null) {
            long jLongValue9 = ((Number) tripleA12.getThird()).longValue() - jMin;
            jSONObject.put("resolvePlayUrlFireTime", Boxing.boxLong(jLongValue9));
            map2.put("resolvePlayUrlFireTime", String.valueOf(jLongValue9));
        }
        if (tripleA13 != null) {
            long jLongValue10 = ((Number) tripleA13.getThird()).longValue() - jMin;
            jSONObject.put("setMediaItemTime", Boxing.boxLong(jLongValue10));
            map2.put("setMediaItemTime", String.valueOf(jLongValue10));
        }
        if (tripleA15 == null || tripleA16 == null) {
            throw new IllegalStateException("player not ready to rendering first frame，drop the data!");
        }
        long jLongValue11 = ((Number) tripleA15.getThird()).longValue() - jMin;
        long jLongValue12 = ((Number) tripleA16.getThird()).longValue() - jMin;
        if (jLongValue11 <= 0 || jLongValue12 <= 0) {
            throw new IllegalStateException("player not ready to rendering first frame，drop the data!");
        }
        jSONObject.put("prepareTime", Boxing.boxLong(jLongValue11));
        jSONObject.put("renderFirstFrameTime", Boxing.boxLong(jLongValue12));
        map2.put("prepareTime", String.valueOf(jLongValue11));
        map2.put("renderFirstFrameTime", String.valueOf(jLongValue12));
        map2.put("completedTime", String.valueOf(((Number) tripleA16.getThird()).longValue() - ((Number) tripleA.getThird()).longValue()));
        if (tripleA13 != null) {
            map2.put("firstVideoRenderDuration", String.valueOf(((Number) tripleA16.getThird()).longValue() - ((Number) tripleA13.getThird()).longValue()));
        }
        Triple tripleA17 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_COMPONENT_CREATED);
        Triple tripleA18 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_PLAYER_CONTAINER_CREATED);
        Triple tripleA19 = this.$watchDog.a(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_PAGE_ANCHOR_CREATED);
        if (tripleA17 != null && tripleA18 != null && tripleA19 != null) {
            long jLongValue13 = ((Number) tripleA17.getThird()).longValue() - ((Number) tripleA.getThird()).longValue();
            map2.put("page_component_usage_time", String.valueOf(jLongValue13));
            long jLongValue14 = (((Number) tripleA18.getThird()).longValue() - ((Number) tripleA.getThird()).longValue()) - jLongValue13;
            map2.put("page_player_container_usage_time", String.valueOf(jLongValue14));
            map2.put("page_anchor_usage_time", String.valueOf(((((Number) tripleA19.getThird()).longValue() - ((Number) tripleA.getThird()).longValue()) - jLongValue13) - jLongValue14));
        }
        UnitedProfilerReporter.b(this.this$0, map2);
        this.this$0.getClass();
        InfoEyesManager.getInstance().report2(true, "000377", (String[]) Arrays.copyOf(new String[]{"video_detail_show", string, null, null, jSONObject.toJSONString()}, 5));
        return Unit.INSTANCE;
    }
}
