package com.bilibili.biligame.api.interceptor;

import com.bilibili.biligame.helper.l;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/interceptor/BiligameRiskManagerRequestInterceptor.class */
public final class BiligameRiskManagerRequestInterceptor extends BiligameRequestInterceptor {
    @Override // com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor, com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public void addCommonParam(@Nullable Map<String, String> map) {
        super.addCommonParam(map);
        if (map != null) {
            map.putAll(l.a());
        }
    }
}
