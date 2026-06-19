package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/SearchUiBean.class */
@Keep
public final class SearchUiBean {

    @JSONField(name = "full_screen")
    @Nullable
    private Integer fullScreen;

    @Nullable
    public final Integer getFullScreen() {
        return this.fullScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isShowFullscreen() {
        /*
            r3 = this;
            r0 = r3
            java.lang.Integer r0 = r0.fullScreen
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lc
            goto L1b
        Lc:
            r0 = r6
            int r0 = r0.intValue()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r0 = 0
            r5 = r0
        L1d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.api.model.SearchUiBean.isShowFullscreen():boolean");
    }

    public final void setFullScreen(@Nullable Integer num) {
        this.fullScreen = num;
    }
}
