package com.bilibili.live.streaming.push;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliPushProtocolType.class */
public final class BiliPushProtocolType {
    private static final EnumEntries $ENTRIES;
    private static final BiliPushProtocolType[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final BiliPushProtocolType UN_DEFINE = new BiliPushProtocolType("UN_DEFINE", 0);
    public static final BiliPushProtocolType RTMP = new BiliPushProtocolType("RTMP", 1);
    public static final BiliPushProtocolType RTMP_SRT = new BiliPushProtocolType("RTMP_SRT", 2);
    public static final BiliPushProtocolType USB = new BiliPushProtocolType("USB", 3);
    public static final BiliPushProtocolType OSI = new BiliPushProtocolType("OSI", 4);
    public static final BiliPushProtocolType BMT = new BiliPushProtocolType("BMT", 5);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliPushProtocolType$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.live.streaming.push.BiliPushProtocolType fromOrdinal(@org.jetbrains.annotations.Nullable java.lang.String r4) {
            /*
                r3 = this;
                r0 = r4
                if (r0 == 0) goto L9e
                r0 = r4
                int r0 = r0.hashCode()
                switch(r0) {
                    case 97673: goto L8b;
                    case 110341: goto L78;
                    case 116100: goto L65;
                    case 3511141: goto L52;
                    case 1521300592: goto L3f;
                    default: goto L3c;
                }
            L3c:
                goto L9e
            L3f:
                r0 = r4
                java.lang.String r1 = "rtmpsrt"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L4b
                goto L9e
            L4b:
                com.bilibili.live.streaming.push.BiliPushProtocolType r0 = com.bilibili.live.streaming.push.BiliPushProtocolType.RTMP_SRT
                r4 = r0
                goto La2
            L52:
                r0 = r4
                java.lang.String r1 = "rtmp"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L5e
                goto L9e
            L5e:
                com.bilibili.live.streaming.push.BiliPushProtocolType r0 = com.bilibili.live.streaming.push.BiliPushProtocolType.RTMP
                r4 = r0
                goto La2
            L65:
                r0 = r4
                java.lang.String r1 = "usb"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L71
                goto L9e
            L71:
                com.bilibili.live.streaming.push.BiliPushProtocolType r0 = com.bilibili.live.streaming.push.BiliPushProtocolType.USB
                r4 = r0
                goto La2
            L78:
                r0 = r4
                java.lang.String r1 = "osi"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L84
                goto L9e
            L84:
                com.bilibili.live.streaming.push.BiliPushProtocolType r0 = com.bilibili.live.streaming.push.BiliPushProtocolType.OSI
                r4 = r0
                goto La2
            L8b:
                r0 = r4
                java.lang.String r1 = "bmt"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L97
                goto L9e
            L97:
                com.bilibili.live.streaming.push.BiliPushProtocolType r0 = com.bilibili.live.streaming.push.BiliPushProtocolType.BMT
                r4 = r0
                goto La2
            L9e:
                com.bilibili.live.streaming.push.BiliPushProtocolType r0 = com.bilibili.live.streaming.push.BiliPushProtocolType.UN_DEFINE
                r4 = r0
            La2:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.push.BiliPushProtocolType.Companion.fromOrdinal(java.lang.String):com.bilibili.live.streaming.push.BiliPushProtocolType");
        }
    }

    private static final /* synthetic */ BiliPushProtocolType[] $values() {
        return new BiliPushProtocolType[]{UN_DEFINE, RTMP, RTMP_SRT, USB, OSI, BMT};
    }

    static {
        BiliPushProtocolType[] biliPushProtocolTypeArr$values = $values();
        $VALUES = biliPushProtocolTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliPushProtocolTypeArr$values);
        Companion = new Companion(null);
    }

    private BiliPushProtocolType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliPushProtocolType> getEntries() {
        return $ENTRIES;
    }

    public static BiliPushProtocolType valueOf(String str) {
        return (BiliPushProtocolType) Enum.valueOf(BiliPushProtocolType.class, str);
    }

    public static BiliPushProtocolType[] values() {
        return (BiliPushProtocolType[]) $VALUES.clone();
    }
}
