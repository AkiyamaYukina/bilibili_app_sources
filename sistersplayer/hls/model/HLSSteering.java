package com.bilibili.sistersplayer.hls.model;

import java.util.HashMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/model/HLSSteering.class */
public final class HLSSteering {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Integer ctrMode;

    @Nullable
    private final String pathwayId;

    @Nullable
    private final String pathwayPriority;

    @Nullable
    private final String serverUri;

    @Nullable
    private final Integer ttl;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/model/HLSSteering$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HLSSteering map2HLSSteering(@Nullable HashMap<String, String> map) {
            String str;
            String str2;
            return new HLSSteering(map != null ? map.get("SERVER-URI") : null, map != null ? map.get("PATHWAY-ID") : null, map != null ? map.get("BILI-PATHWAY-PRIORITY") : null, (map == null || (str2 = map.get("BILI-CTR-MODE")) == null) ? null : Integer.valueOf(Integer.parseInt(str2)), (map == null || (str = map.get("BILI-TTL")) == null) ? null : Integer.valueOf(Integer.parseInt(str)));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/model/HLSSteering$CtrMode.class */
    public static final class CtrMode {
        private static final EnumEntries $ENTRIES;
        private static final CtrMode[] $VALUES;
        private final int value;
        public static final CtrMode QOE = new CtrMode("QOE", 0, 0);
        public static final CtrMode CDN_ORDER = new CtrMode("CDN_ORDER", 1, 1);
        public static final CtrMode FORCE_ORDER = new CtrMode("FORCE_ORDER", 2, 2);

        private static final /* synthetic */ CtrMode[] $values() {
            return new CtrMode[]{QOE, CDN_ORDER, FORCE_ORDER};
        }

        static {
            CtrMode[] ctrModeArr$values = $values();
            $VALUES = ctrModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(ctrModeArr$values);
        }

        private CtrMode(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<CtrMode> getEntries() {
            return $ENTRIES;
        }

        public static CtrMode valueOf(String str) {
            return (CtrMode) Enum.valueOf(CtrMode.class, str);
        }

        public static CtrMode[] values() {
            return (CtrMode[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public HLSSteering(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2) {
        this.serverUri = str;
        this.pathwayId = str2;
        this.pathwayPriority = str3;
        this.ctrMode = num;
        this.ttl = num2;
    }

    @Nullable
    public final Integer getCtrMode() {
        return this.ctrMode;
    }

    @Nullable
    public final String getPathwayId() {
        return this.pathwayId;
    }

    @Nullable
    public final String getPathwayPriority() {
        return this.pathwayPriority;
    }

    @Nullable
    public final String getServerUri() {
        return this.serverUri;
    }

    @Nullable
    public final Integer getTtl() {
        return this.ttl;
    }
}
