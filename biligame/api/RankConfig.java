package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/RankConfig.class */
@Keep
public class RankConfig {
    public static final int TYPE_BOOK = 2;
    public static final int TYPE_CONTENT = 4;
    public static final int TYPE_DISCOVER_BETA_GAME = 8;
    public static final int TYPE_DISCOVER_CLOUD_GAME = 6;
    public static final int TYPE_DISCOVER_COLLECTION = 5;
    public static final int TYPE_DISCOVER_HOT_ACTIVITY = 7;
    public static final int TYPE_DISCOVER_HOT_COMMENT = 2;
    public static final int TYPE_DISCOVER_PLAYER = 3;
    public static final int TYPE_DISCOVER_PLAYING_GAME = 4;
    public static final int TYPE_DISCOVER_TOPIC = 0;
    public static final int TYPE_DISCOVER_TOPIC_AGO = 1;
    public static final int TYPE_HOT_COMMENT = 5;
    public static final int TYPE_HOT_GAME = 0;
    public static final int TYPE_HOT_STRATEGY = 1;
    public static final int TYPE_NEW_GAME = 3;
    public static final int TYPE_SMALL_GAME = 7;
    public static final int TYPE_START_TEST = 8;
    public static final int TYPE_TOPIC = 6;

    @JSONField(name = "info")
    public String info;

    @JSONField(name = "sub_title")
    public String subTitle;

    @JSONField(name = "type")
    public int type;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof com.bilibili.biligame.api.RankConfig
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L4c
            r0 = r4
            com.bilibili.biligame.api.RankConfig r0 = (com.bilibili.biligame.api.RankConfig) r0
            r8 = r0
            r0 = r4
            r1 = r3
            if (r0 == r1) goto L4a
            r0 = r6
            r5 = r0
            r0 = r8
            int r0 = r0.type
            r1 = r3
            int r1 = r1.type
            if (r0 != r1) goto L4c
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.info
            r1 = r8
            java.lang.String r1 = r1.info
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L4c
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.subTitle
            r1 = r8
            java.lang.String r1 = r1.subTitle
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L4c
        L4a:
            r0 = 1
            r5 = r0
        L4c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.RankConfig.equals(java.lang.Object):boolean");
    }
}
