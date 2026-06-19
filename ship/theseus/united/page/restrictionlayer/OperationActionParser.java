package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ChargingPlusOperationAction;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/OperationActionParser.class */
@StabilityInferred(parameters = 1)
public final class OperationActionParser implements com.google.gson.e<s> {
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(JsonElement jsonElement, Type type, com.google.gson.d dVar) {
        Object p7;
        s rVar;
        try {
            if (jsonElement instanceof JsonObject) {
                JsonElement jsonElement2 = ((JsonObject) jsonElement).get("action_type");
                Integer numValueOf = jsonElement2 != null ? Integer.valueOf(jsonElement2.getAsInt()) : null;
                if (numValueOf != null && numValueOf.intValue() == 17) {
                    rVar = (s) dVar.a(jsonElement, DeliveryOperationAction.class);
                } else if ((numValueOf != null && numValueOf.intValue() == 4) || ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == -1) || ((numValueOf != null && numValueOf.intValue() == 0) || numValueOf == null)))) {
                    LinkOperationAction linkOperationAction = (LinkOperationAction) dVar.a(jsonElement, LinkOperationAction.class);
                    p7 = null;
                    if (linkOperationAction != null) {
                        int length = linkOperationAction.f102572a.length();
                        rVar = linkOperationAction;
                        if (length == 0) {
                            p7 = null;
                        }
                    }
                } else if (numValueOf.intValue() == 12) {
                    ChargingPlusOperationAction chargingPlusOperationAction = (ChargingPlusOperationAction) dVar.a(jsonElement, ChargingPlusOperationAction.class);
                    p7 = null;
                    if (chargingPlusOperationAction != null) {
                        rVar = chargingPlusOperationAction;
                        if (chargingPlusOperationAction.f102516a.length() == 0) {
                            p7 = null;
                        }
                    }
                } else if (numValueOf.intValue() == 5) {
                    p7 = C6380e.f102731a;
                } else if (numValueOf.intValue() == 13) {
                    p7 = C6376a.f102726a;
                } else if (numValueOf.intValue() == 15) {
                    p7 = C6390o.f102753a;
                } else if (numValueOf.intValue() == 19) {
                    p7 = D.f102520a;
                } else if (numValueOf.intValue() == 20) {
                    ChargingPlusOperationAction chargingPlusOperationAction2 = (ChargingPlusOperationAction) dVar.a(jsonElement, ChargingPlusOperationAction.class);
                    p7 = null;
                    if (chargingPlusOperationAction2 != null) {
                        p7 = ChargingPlusOperationAction.a(chargingPlusOperationAction2, null, ChargingPlusOperationAction.TYPE.CHARGING_PLUS_AD, 3);
                    }
                } else if (numValueOf.intValue() == 11) {
                    rVar = (s) dVar.a(jsonElement, TaskOperationAction.class);
                } else if (numValueOf.intValue() == 10) {
                    rVar = (s) dVar.a(jsonElement, VipFreeOperationAction.class);
                } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 2) {
                    JsonPrimitive jsonPrimitive = ((JsonObject) jsonElement).get("link");
                    String asString = jsonPrimitive instanceof JsonPrimitive ? jsonPrimitive.getAsString() : null;
                    if (numValueOf.intValue() == 1 && (asString == null || asString.length() == 0)) {
                        rVar = new r(false);
                    } else {
                        JsonObject jsonObject = ((JsonObject) jsonElement).get("report");
                        JsonObject jsonObject2 = jsonObject instanceof JsonObject ? jsonObject : null;
                        JsonElement jsonElement3 = jsonObject2 != null ? jsonObject2.get("click_event_id") : null;
                        String asString2 = jsonElement3 instanceof JsonPrimitive ? ((JsonPrimitive) jsonElement3).getAsString() : null;
                        String str = asString2;
                        if (asString2 == null) {
                            str = "";
                        }
                        JsonElement jsonElement4 = ((JsonObject) jsonElement).get("order_report_params");
                        p7 = new P(asString, 24, str, jsonElement4 != null ? (Map) JsonUtilKt.parseJson(jsonElement4, new w().getType()) : null, false, null);
                    }
                } else {
                    p7 = null;
                    if (numValueOf.intValue() == 18) {
                        rVar = (s) dVar.a(jsonElement, DeviceManagementAction.class);
                    }
                }
                p7 = rVar == true ? 1 : 0;
            } else {
                p7 = null;
            }
        } catch (Exception e7) {
            BLog.w("OperationActionParser-deserialize", "[theseus-united-OperationActionParser-deserialize] OperationAction parsing failed!", e7);
            p7 = null;
        }
        return p7;
    }
}
