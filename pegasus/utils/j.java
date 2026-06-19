package com.bilibili.pegasus.utils;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.map.geolocation.TencentLocation;
import java.util.Map;
import okhttp3.Request;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/j.class */
@StabilityInferred(parameters = 0)
public final class j extends com.bilibili.app.comm.list.common.api.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f78873b = com.bilibili.app.comm.list.common.api.d.a;

    public void addCommonParam(@Nullable Map<String, String> map) {
        super.addCommonParam(map);
        String strC = com.bilibili.pegasus.api.C.c();
        String str = Build.MODEL;
        if (map != null) {
            map.put("privacy_disagree_mode", "1");
            map.put("column", "2");
            map.put(TencentLocation.NETWORK_PROVIDER, strC);
            map.put("device_name", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addHeader(@Nullable Request.Builder builder) {
        super/*com.bilibili.okretro.interceptor.DefaultRequestInterceptor*/.addHeader(builder);
    }
}
