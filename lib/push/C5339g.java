package com.bilibili.lib.push;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Map;

/* JADX INFO: renamed from: com.bilibili.lib.push.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/g.class */
public final class C5339g {
    public static void a(@NonNull Context context, @NonNull Map map, boolean z6) {
        IPushParams pushParams = C5334b.c().getPushParams();
        map.put("app", pushParams.getPushAppId());
        map.put("buvid", pushParams.getBuvid());
        map.put("mobi_app", pushParams.getMobiApp());
        map.put("build", String.valueOf(pushParams.getVersionCode()));
        if (TextUtils.equals((String) map.get("type"), String.valueOf(3))) {
            map.put(EditCustomizeSticker.TAG_MID, "0");
        } else {
            String userAccessKey = pushParams.getUserAccessKey(context);
            if (!TextUtils.isEmpty(userAccessKey)) {
                map.put(Tm0.a.f24206c, userAccessKey);
            }
            String userId = pushParams.getUserId(context);
            if (!TextUtils.isEmpty(userId)) {
                map.put(EditCustomizeSticker.TAG_MID, userId);
            }
        }
        if (z6) {
            map.put("ts", String.valueOf(System.currentTimeMillis() / 1000));
            map.put(DictionaryKeys.V2_APPKEY, pushParams.getAppKey());
        }
    }
}
