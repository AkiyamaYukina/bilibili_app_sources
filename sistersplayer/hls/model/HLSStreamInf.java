package com.bilibili.sistersplayer.hls.model;

import androidx.fragment.app.A;
import androidx.media3.common.C4628q;
import cf.c;
import cf.j;
import com.bilibili.sistersplayer.p2p.utils.UrlUtils;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/model/HLSStreamInf.class */
public final class HLSStreamInf {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Long bandwidth;

    @Nullable
    private final String codecs;

    @Nullable
    private final String display;

    @Nullable
    private final Long order;

    @Nullable
    private final String pathwayId;

    @Nullable
    private final Integer qn;

    @Nullable
    private final String resolution;

    @Nullable
    private Long switchStartTime;

    @NotNull
    private String url;

    @NotNull
    private final UrlUtils urlUtils;

    @Nullable
    private Resolution videoSize;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/model/HLSStreamInf$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HLSStreamInf map2StreamInfo(@NotNull String str, @NotNull HashMap<String, String> map, @NotNull UrlUtils urlUtils) {
            String str2 = map.get("BANDWIDTH");
            Long lValueOf = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
            String str3 = map.get("RESOLUTION");
            String str4 = map.get("CODECS");
            String str5 = map.get("PATHWAY-ID");
            String str6 = map.get("BILI-DISPLAY");
            String str7 = map.get("BILI-QN");
            Integer numValueOf = str7 != null ? Integer.valueOf(Integer.parseInt(str7)) : null;
            String str8 = map.get("BILI-ORDER");
            Long lValueOf2 = null;
            if (str8 != null) {
                lValueOf2 = Long.valueOf(Long.parseLong(str8));
            }
            return new HLSStreamInf(lValueOf, str3, str4, str5, str6, numValueOf, lValueOf2, str, urlUtils);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/model/HLSStreamInf$Resolution.class */
    public static final class Resolution {
        private final int height;
        private final int width;

        public Resolution(int i7, int i8) {
            this.width = i7;
            this.height = i8;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        @NotNull
        public String toString() {
            return C4628q.a(this.width, this.height, "x");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HLSStreamInf(@org.jetbrains.annotations.Nullable java.lang.Long r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.Integer r12, @org.jetbrains.annotations.Nullable java.lang.Long r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull com.bilibili.sistersplayer.p2p.utils.UrlUtils r15) {
        /*
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r7
            r0.bandwidth = r1
            r0 = r6
            r1 = r8
            r0.resolution = r1
            r0 = r6
            r1 = r9
            r0.codecs = r1
            r0 = r6
            r1 = r10
            r0.pathwayId = r1
            r0 = r6
            r1 = r11
            r0.display = r1
            r0 = r6
            r1 = r12
            r0.qn = r1
            r0 = r6
            r1 = r13
            r0.order = r1
            r0 = r6
            r1 = r14
            r0.url = r1
            r0 = r6
            r1 = r15
            r0.urlUtils = r1
            r0 = r8
            if (r0 == 0) goto L8c
            r0 = r8
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> Lc4
            r2 = r1
            r3 = 0
            java.lang.String r4 = "x"
            r2[r3] = r4     // Catch: java.lang.Exception -> Lc4
            r2 = 0
            r3 = 6
            java.util.List r0 = kotlin.text.StringsKt.R(r0, r1, r2, r3)     // Catch: java.lang.Exception -> Lc4
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L8c
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Exception -> Lc4
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc4
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r2)     // Catch: java.lang.Exception -> Lc4
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc4
            r0 = r7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lc4
            r9 = r0
        L6a:
            r0 = r8
            r7 = r0
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L8e
            r0 = r8
            r1 = r9
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lc4
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Lc4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lc4
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> Lc4
            goto L6a
        L8c:
            r0 = 0
            r7 = r0
        L8e:
            r0 = r7
            if (r0 == 0) goto Lc3
            r0 = r7
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lc4
            r1 = 2
            if (r0 != r1) goto Lc3
            com.bilibili.sistersplayer.hls.model.HLSStreamInf$Resolution r0 = new com.bilibili.sistersplayer.hls.model.HLSStreamInf$Resolution     // Catch: java.lang.Exception -> Lc4
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Exception -> Lc4
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc4
            r2 = r7
            r3 = 1
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> Lc4
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> Lc4
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> Lc4
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> Lc4
            r0 = r6
            r1 = r8
            r0.videoSize = r1     // Catch: java.lang.Exception -> Lc4
        Lc3:
            return
        Lc4:
            r7 = move-exception
            goto Lc3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.model.HLSStreamInf.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, com.bilibili.sistersplayer.p2p.utils.UrlUtils):void");
    }

    @Nullable
    public final Long getBandwidth() {
        return this.bandwidth;
    }

    @Nullable
    public final String getCodecs() {
        return this.codecs;
    }

    @Nullable
    public final String getDisplay() {
        return this.display;
    }

    @Nullable
    public final Long getOrder() {
        return this.order;
    }

    @Nullable
    public final String getPathwayId() {
        return this.pathwayId;
    }

    public final int getPixelCount() {
        Resolution resolution = this.videoSize;
        if (resolution == null) {
            return 0;
        }
        return resolution.getHeight() * resolution.getWidth();
    }

    @Nullable
    public final Integer getQn() {
        return this.qn;
    }

    @Nullable
    public final Resolution getResolution() {
        return this.videoSize;
    }

    @Nullable
    /* JADX INFO: renamed from: getResolution, reason: collision with other method in class */
    public final String m9729getResolution() {
        return this.resolution;
    }

    @Nullable
    public final Long getSwitchStartTime() {
        return this.switchStartTime;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUrlStreamName() {
        String streamName = this.urlUtils.parseStreamName(this.url);
        String str = streamName;
        if (streamName == null) {
            str = "";
        }
        return str;
    }

    public final boolean isOnyAudio() {
        return StringsKt.n(this.url, "a_index.m3u8");
    }

    public final void setSwitchStartTime(@Nullable Long l7) {
        this.switchStartTime = l7;
    }

    public final void setUrl(@NotNull String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        Long l7 = this.order;
        String str = this.display;
        Integer num = this.qn;
        String str2 = this.codecs;
        Long l8 = this.bandwidth;
        String str3 = this.resolution;
        String str4 = this.pathwayId;
        String urlStreamName = getUrlStreamName();
        StringBuilder sbA = c.a("Inf(", ", ", str, l7, "[");
        y3.c.a(num, "], ", str2, ", ", sbA);
        j.a(sbA, l8, ", ", str3, ", ");
        return A.a(str4, ", name=", urlStreamName, ")\n", sbA);
    }
}
