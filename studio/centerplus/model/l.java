package com.bilibili.studio.centerplus.model;

import android.app.Application;
import bw0.InterfaceC5167a;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/l.class */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f105184a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile PreviewData f105185b;

    @Nullable
    public final PreviewData a() {
        PreviewData previewData;
        GeneralResponse generalResponse;
        PreviewData previewData2;
        Application application = BiliContext.application();
        if (application == null) {
            return null;
        }
        BLog.i("PreviewDataRepository", "getPreviewDataV2");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = jCurrentTimeMillis;
        try {
            String accessKey = BiliAccounts.get(application).getAccessKey();
            Xz0.d.f28458a.getClass();
            Xz0.d.M(0L, "start", "");
            Response<GeneralResponse<PreviewData>> responseExecute = ((InterfaceC5167a) ServiceGenerator.createService(InterfaceC5167a.class)).getPreviewDataV2(accessKey).execute();
            if (!responseExecute.isSuccessful() || (generalResponse = (GeneralResponse) responseExecute.body()) == null || (previewData2 = (PreviewData) generalResponse.data) == null) {
                Xz0.d.M((System.currentTimeMillis() - jCurrentTimeMillis) / ((long) 1000), "fail", "");
                previewData = null;
            } else {
                String jSONString = JSON.toJSONString(previewData2);
                Xz0.d.M((System.currentTimeMillis() - jCurrentTimeMillis) / ((long) 1000), "success", jSONString);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                BiliGlobalPreferenceHelper.getInstance(application).setString("upper_preview_data_v2", jSONString);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("step", "set_cache");
                linkedHashMap.put("time", String.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2));
                linkedHashMap.put("data", jSONString);
                j7 = jCurrentTimeMillis2;
                Neurons.trackT(false, "creation.upper.cache.pre-v2.track", linkedHashMap, 1, new AT0.c(8));
                previewData = previewData2;
            }
        } catch (Exception e7) {
            Xz0.d dVar = Xz0.d.f28458a;
            long jCurrentTimeMillis4 = (System.currentTimeMillis() - j7) / ((long) 1000);
            String message = e7.getMessage();
            String str = message != null ? message : "";
            dVar.getClass();
            Xz0.d.M(jCurrentTimeMillis4, "fail", str);
            e7.printStackTrace();
            previewData = null;
        }
        synchronized (this) {
            BLog.i("PreviewDataRepository", "setPreviewData:" + JSON.toJSONString(previewData));
            if (previewData != null) {
                f105185b = previewData;
            }
        }
        return previewData;
    }
}
