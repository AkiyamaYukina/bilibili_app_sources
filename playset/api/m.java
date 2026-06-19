package com.bilibili.playset.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/m.class */
public final class m {
    public static void a(@NotNull String str, @NotNull BiliApiDataCallback<String> biliApiDataCallback) {
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).deletePlaylist(str).enqueue(biliApiDataCallback);
    }

    public static void b(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6, String str7, BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        JSONObject jSONObject = new JSONObject();
        HashMap map2 = (HashMap) map;
        if (!map2.isEmpty()) {
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
        t.a(new k(str, str2, str3, str4, "", jSONObject, str5, str6, str7), "compilation_favorite", biliApiDataCallback);
    }
}
