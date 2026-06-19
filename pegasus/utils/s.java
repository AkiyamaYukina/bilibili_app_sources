package com.bilibili.pegasus.utils;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.bilibili.homepage.AesEncryptService;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.FutureTask;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/s.class */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f78886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static FutureTask<String> f78887b;

    static {
        ArrayList arrayList = new ArrayList();
        f78886a = arrayList;
        arrayList.add("com.bilibili.app.blue");
        arrayList.add("tv.danmaku.bili");
    }

    public static String a(byte[] bArr) throws Exception {
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(((AesEncryptService) BLRouter.INSTANCE.get(AesEncryptService.class, "AesEncryptService")).getKey().getBytes(), "AES"));
        } catch (Exception e7) {
            BLog.e("InstalledAppListUtil", e7);
            cipher = null;
        }
        return cipher == null ? "" : Base64.encodeToString(cipher.doFinal(bArr), 2);
    }

    public static void b(boolean z6, long j7, @Nullable Exception exc) {
        HashMap map = new HashMap();
        if (!z6 && exc != null) {
            map.put("exception", exc.toString());
            map.put("message", exc.getMessage());
        } else if (z6) {
            map.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j7));
        }
        Neurons.trackCustom("pegasus.get.app.list.status", !z6 ? 1 : 0, 0, 0, 0, 0, (String) null, map, new EA.a(9));
    }
}
