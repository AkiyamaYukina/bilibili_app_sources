package com.bilibili.moduleservice.ad;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/ad/AdUIReportService.class */
public interface AdUIReportService {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void uiReport$default(AdUIReportService adUIReportService, String str, Map map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uiReport");
        }
        if ((i7 & 2) != 0) {
            map = null;
        }
        adUIReportService.uiReport(str, map);
    }

    void uiReport(@NotNull String str, @Nullable Map<String, ? extends Object> map);
}
