package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameAttentionVideo.class */
@Keep
public class BiligameAttentionVideo {
    public static final int TYPE_PICK_GROUP = 1;
    public static final int TYPE_RECOMMEND_GROUP = 2;
    public static final int TYPE_RECOMMEND_VIDEO = 3;

    @JSONField(name = "nice_collection_info")
    public BiligamePickGroup niceCollectionInfo;

    @JSONField(name = "recommend_collection_info")
    public BiligameRecommendGroup recommendCollectionInfo;

    @JSONField(name = "recommend_video_info")
    public BiligameRecommendVideo recommendVideoInfo;

    @JSONField(name = "type")
    public int type;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r7 = r0
            r0 = r3
            r1 = r4
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = r4
            if (r0 == 0) goto Lbe
            r0 = r4
            boolean r0 = r0 instanceof com.bilibili.biligame.api.BiligameAttentionVideo
            if (r0 == 0) goto Lbe
            r0 = r4
            com.bilibili.biligame.api.BiligameAttentionVideo r0 = (com.bilibili.biligame.api.BiligameAttentionVideo) r0
            r4 = r0
            r0 = r3
            int r0 = r0.type
            r5 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.type
            if (r0 != r1) goto Lba
            r0 = r5
            r1 = 1
            if (r0 != r1) goto L55
            r0 = r3
            com.bilibili.biligame.api.BiligamePickGroup r0 = r0.niceCollectionInfo
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L55
            r0 = r8
            java.lang.String r0 = r0.collectionId
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L55
            r0 = r7
            r6 = r0
            r0 = r8
            r1 = r4
            com.bilibili.biligame.api.BiligamePickGroup r1 = r1.niceCollectionInfo
            java.lang.String r1 = r1.collectionId
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbc
        L55:
            r0 = r3
            int r0 = r0.type
            r1 = 2
            if (r0 != r1) goto L86
            r0 = r3
            com.bilibili.biligame.api.BiligameRecommendGroup r0 = r0.recommendCollectionInfo
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L86
            r0 = r8
            java.lang.String r0 = r0.collectionId
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L86
            r0 = r7
            r6 = r0
            r0 = r8
            r1 = r4
            com.bilibili.biligame.api.BiligameRecommendGroup r1 = r1.recommendCollectionInfo
            java.lang.String r1 = r1.collectionId
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbc
        L86:
            r0 = r3
            int r0 = r0.type
            r1 = 3
            if (r0 != r1) goto Lba
            r0 = r3
            com.bilibili.biligame.api.BiligameRecommendVideo r0 = r0.recommendVideoInfo
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lba
            r0 = r8
            java.lang.String r0 = r0.aid
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lba
            r0 = r8
            r1 = r4
            com.bilibili.biligame.api.BiligameRecommendVideo r1 = r1.recommendVideoInfo
            java.lang.String r1 = r1.aid
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lba
            r0 = r7
            r6 = r0
            goto Lbc
        Lba:
            r0 = 0
            r6 = r0
        Lbc:
            r0 = r6
            return r0
        Lbe:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.BiligameAttentionVideo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        BiligameRecommendVideo biligameRecommendVideo;
        String str;
        BiligameRecommendGroup biligameRecommendGroup;
        String str2;
        BiligamePickGroup biligamePickGroup;
        String str3;
        int i7 = this.type;
        return (i7 != 1 || (biligamePickGroup = this.niceCollectionInfo) == null || (str3 = biligamePickGroup.collectionId) == null) ? (i7 != 2 || (biligameRecommendGroup = this.recommendCollectionInfo) == null || (str2 = biligameRecommendGroup.collectionId) == null) ? (i7 != 3 || (biligameRecommendVideo = this.recommendVideoInfo) == null || (str = biligameRecommendVideo.aid) == null) ? super.hashCode() : str.hashCode() : str2.hashCode() : str3.hashCode();
    }
}
