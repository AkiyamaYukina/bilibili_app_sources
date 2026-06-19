package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.opd.app.bizcommon.radar.component.ReportClickData;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/w.class */
@StabilityInferred(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f74395a = new Object();

    @NotNull
    public static x a(@NotNull RadarTriggerContent radarTriggerContent) {
        Object obj;
        List listEmptyList;
        List listEmptyList2;
        String extra = radarTriggerContent.getExtra();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(JSON.parseObject(extra));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        JSONObject jSONObject = (JSONObject) obj2;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("bubbleData");
        JSONObject jSONObject4 = jSONObject3;
        if (jSONObject3 == null) {
            jSONObject4 = new JSONObject();
        }
        JSONObject jSONObject5 = jSONObject2.getJSONObject("couponAmountInfo");
        JSONObject jSONObject6 = jSONObject5;
        if (jSONObject5 == null) {
            jSONObject6 = new JSONObject();
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("couponInfoList");
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (true) {
                listEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                JSONObject jSONObject7 = next instanceof JSONObject ? (JSONObject) next : null;
                j jVar = jSONObject7 != null ? new j(GO0.h.i(jSONObject7, new String[]{"couponBackgroundImageUrl"}), GO0.h.i(jSONObject7, new String[]{"amountPrefixText"}), GO0.h.i(jSONObject7, new String[]{"amountValueText"}), GO0.h.i(jSONObject7, new String[]{"amountSuffixText"}), GO0.h.i(jSONObject7, new String[]{"amountDescText"}), GO0.h.i(jSONObject7, new String[]{"titleText"}), GO0.h.i(jSONObject7, new String[]{"validTimeText"}), GO0.h.i(jSONObject7, new String[]{"descText"})) : null;
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        String strI = GO0.h.i(jSONObject2, new String[]{"actionType"});
        String jumpUrl = radarTriggerContent.getJumpUrl();
        if (jumpUrl == null) {
            jumpUrl = "";
        }
        String jumpAction = radarTriggerContent.getJumpAction();
        if (jumpAction == null) {
            jumpAction = "";
        }
        String strI2 = GO0.h.i(jSONObject2, new String[]{"titleImageUrl"});
        String strI3 = GO0.h.i(jSONObject2, new String[]{"backgroundImageUrl"});
        String strI4 = GO0.h.i(jSONObject2, new String[]{"actionImageUrl"});
        JSONArray jSONArray2 = jSONObject2.getJSONArray(new String[]{"couponIds"}[0]);
        if (jSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Object> it2 = jSONArray2.iterator();
            while (true) {
                listEmptyList2 = arrayList2;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                String string = next2 instanceof String ? (String) next2 : next2 instanceof Number ? ((Number) next2).toString() : null;
                if (string != null) {
                    arrayList2.add(string);
                }
            }
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        if (listEmptyList2.isEmpty()) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return new x(strI, jumpUrl, jumpAction, strI2, strI3, strI4, listEmptyList2, GO0.h.i(jSONObject2, new String[]{"amountColor"}), new a(GO0.h.i(jSONObject6, new String[]{"amountPrefixText"}), GO0.h.i(jSONObject6, new String[]{"amountValueText"}), GO0.h.i(jSONObject6, new String[]{"amountSuffixText"}), GO0.h.i(jSONObject6, new String[]{"amountDescText"})), listEmptyList, new b(jSONObject4.getLongValue("leftTime"), GO0.h.i(jSONObject4, new String[]{"frontText"}), GO0.h.i(jSONObject4, new String[]{"highlightText"}), GO0.h.i(jSONObject4, new String[]{"backText"}), GO0.h.i(jSONObject4, new String[]{"btnBgUrl"})));
    }

    public static void c(@NotNull RadarTriggerContent radarTriggerContent, @NotNull String str) {
        RadarTriggerContent.appendEventNameReportParam$default(radarTriggerContent, null, 1, null);
        cn0.d dVar = (cn0.d) com.bilibili.ad.adview.story.c.a(BLRouter.INSTANCE, cn0.d.class, (String) null, 1, (Object) null);
        if (dVar != null) {
            dVar.k(new ReportClickData(str, radarTriggerContent.getId(), radarTriggerContent.getJumpUrl(), "", radarTriggerContent.getGroup(), radarTriggerContent.getJumpAction(), radarTriggerContent.getConvertReportMap(), radarTriggerContent.getAttachInfo(), 0, ""), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.w.b(com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
