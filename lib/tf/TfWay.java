package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfWay.class */
public enum TfWay implements Internal.EnumLite {
    NA_WAY(0),
    IP(1),
    UNICOM_CDN(2),
    UNRECOGNIZED(-1);

    public static final int IP_VALUE = 1;
    public static final int NA_WAY_VALUE = 0;
    public static final int UNICOM_CDN_VALUE = 2;
    private static final Internal.EnumLiteMap<TfWay> internalValueMap = new Internal.EnumLiteMap<TfWay>() { // from class: com.bilibili.lib.tf.TfWay.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfWay m6845findValueByNumber(int i7) {
            return TfWay.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfWay$TfWayVerifier.class */
    public static final class TfWayVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfWayVerifier();

        private TfWayVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfWay.forNumber(i7) != null;
        }
    }

    TfWay(int i7) {
        this.value = i7;
    }

    public static TfWay forNumber(int i7) {
        if (i7 == 0) {
            return NA_WAY;
        }
        if (i7 == 1) {
            return IP;
        }
        if (i7 != 2) {
            return null;
        }
        return UNICOM_CDN;
    }

    public static Internal.EnumLiteMap<TfWay> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfWayVerifier.INSTANCE;
    }

    @Deprecated
    public static TfWay valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
