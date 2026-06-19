package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTypeExt.class */
public enum TfTypeExt implements Internal.EnumLite {
    NA_TYPE_EXT(0),
    U_CARD(1),
    U_PKG(2),
    C_CARD(3),
    C_PKG(4),
    T_CARD(5),
    T_PKG(6),
    UNRECOGNIZED(-1);

    public static final int C_CARD_VALUE = 3;
    public static final int C_PKG_VALUE = 4;
    public static final int NA_TYPE_EXT_VALUE = 0;
    public static final int T_CARD_VALUE = 5;
    public static final int T_PKG_VALUE = 6;
    public static final int U_CARD_VALUE = 1;
    public static final int U_PKG_VALUE = 2;
    private static final Internal.EnumLiteMap<TfTypeExt> internalValueMap = new Internal.EnumLiteMap<TfTypeExt>() { // from class: com.bilibili.lib.tf.TfTypeExt.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfTypeExt m6839findValueByNumber(int i7) {
            return TfTypeExt.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTypeExt$TfTypeExtVerifier.class */
    public static final class TfTypeExtVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfTypeExtVerifier();

        private TfTypeExtVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfTypeExt.forNumber(i7) != null;
        }
    }

    TfTypeExt(int i7) {
        this.value = i7;
    }

    public static TfTypeExt forNumber(int i7) {
        switch (i7) {
            case 0:
                return NA_TYPE_EXT;
            case 1:
                return U_CARD;
            case 2:
                return U_PKG;
            case 3:
                return C_CARD;
            case 4:
                return C_PKG;
            case 5:
                return T_CARD;
            case 6:
                return T_PKG;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<TfTypeExt> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfTypeExtVerifier.INSTANCE;
    }

    @Deprecated
    public static TfTypeExt valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
