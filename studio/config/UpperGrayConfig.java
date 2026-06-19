package com.bilibili.studio.config;

import I3.E2;
import I3.G2;
import android.app.Application;
import androidx.annotation.Keep;
import bolts.Task;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.neuron.api.Neurons;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Unit;
import lh.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/UpperGrayConfig.class */
@Keep
public final class UpperGrayConfig implements Serializable {

    @NotNull
    public static final UpperGrayConfig INSTANCE;

    @NotNull
    public static final String SP_UPPER_GRAY_DATA = "upper_gray_data";

    @Nullable
    private static volatile String upperCenterVersion;

    static {
        UpperGrayConfig upperGrayConfig = new UpperGrayConfig();
        INSTANCE = upperGrayConfig;
        upperGrayConfig.getFromLocal();
    }

    private UpperGrayConfig() {
    }

    private final void reportGrayCacheTrack(String str, long j7, String str2) {
        LinkedHashMap linkedHashMapA = c.a("step", str);
        linkedHashMapA.put("time", String.valueOf(j7));
        linkedHashMapA.put("data", str2);
        Neurons.trackT(false, "creation.upper.cache.gray.track", linkedHashMapA, 1, new E2(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean reportGrayCacheTrack$lambda$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean reportGrayUseTrack$lambda$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveInLocal$lambda$0() {
        Application application = BiliContext.application();
        if (application == null) {
            return Unit.INSTANCE;
        }
        UpperGrayConfig upperGrayConfig = INSTANCE;
        String jSONString = JSON.toJSONString(upperGrayConfig);
        long jCurrentTimeMillis = System.currentTimeMillis();
        BiliGlobalPreferenceHelper.getInstance(application).setString(SP_UPPER_GRAY_DATA, jSONString);
        upperGrayConfig.reportGrayCacheTrack("set_cache", System.currentTimeMillis() - jCurrentTimeMillis, jSONString);
        return Unit.INSTANCE;
    }

    public final void copy(@NotNull UpperGrayConfig upperGrayConfig) {
    }

    public final void getFromLocal() {
        String strOptString;
        Application application = BiliContext.application();
        if (application == null || (strOptString = BiliGlobalPreferenceHelper.getInstance(application).optString(SP_UPPER_GRAY_DATA, "")) == null || strOptString.length() == 0) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            copy((UpperGrayConfig) JSON.parseObject(strOptString, UpperGrayConfig.class));
            reportGrayCacheTrack("get_cache", System.currentTimeMillis() - jCurrentTimeMillis, strOptString);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    @Nullable
    public final String getUpperCenterVersion() {
        return upperCenterVersion;
    }

    public final void reportGrayUseTrack(@NotNull String str, boolean z6, boolean z7) {
        LinkedHashMap linkedHashMapA = c.a("type", str);
        linkedHashMapA.put("value", String.valueOf(z6));
        linkedHashMapA.put("need_gray", String.valueOf(z7));
        Neurons.trackT(false, "creation.upper.gray.value.track", linkedHashMapA, 1, new G2(10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.Callable] */
    public final void saveInLocal() {
        Task.callInBackground(new Object());
    }

    public final void setUpperCenterVersion(@Nullable String str) {
        upperCenterVersion = str;
    }
}
