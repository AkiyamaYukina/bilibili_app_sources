package com.bilibili.studio.videoeditor.util;

import android.media.MediaExtractor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/X.class */
public final class X {
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0386 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(@androidx.annotation.Nullable java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.X.a(java.lang.String, java.lang.String):boolean");
    }

    public static String b(HashMap<String, String> map) {
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        if (!setKeySet.isEmpty()) {
            for (String str : setKeySet) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }
        return jSONObject.toString();
    }

    @RequiresApi(api = 16)
    public static int c(@NonNull MediaExtractor mediaExtractor, @NonNull String str) {
        int i7 = 0;
        while (i7 < mediaExtractor.getTrackCount()) {
            try {
                if (mediaExtractor.getTrackFormat(i7).getString("mime").startsWith(str)) {
                    break;
                }
                i7++;
            } catch (IllegalArgumentException e7) {
                e7.printStackTrace();
                i7 = -1;
            }
        }
        i7 = -1;
        return i7;
    }

    public static void d(String str, String str2, String str3) {
        HashMap mapA = tv.danmaku.bili.ui.main2.W.a("fail_type", str, "tag", str2);
        mapA.put("extend_filed", str3);
        Neurons.trackT(false, "creation.uper.material-check-fail.track", mapA, 1, new AT0.c(8));
    }
}
