package com.bilibili.pegasus.promo.setting;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/VideoModeConfigItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class VideoModeConfigItem {
    public static final int $stable = 8;

    @JSONField(name = "subTitle")
    @Nullable
    private String subTitle;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "type")
    private int type;

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isValid() {
        /*
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.title
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2e
            r0 = r7
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L16
            goto L2e
        L16:
            r0 = r3
            int r0 = r0.type
            r4 = r0
            r0 = 1
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 2
            if (r0 == r1) goto L30
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L2e
            r0 = r6
            r5 = r0
            goto L30
        L2e:
            r0 = 0
            r5 = r0
        L30:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.promo.setting.VideoModeConfigItem.isValid():boolean");
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
