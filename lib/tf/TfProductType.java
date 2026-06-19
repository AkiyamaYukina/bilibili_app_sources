package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfProductType.class */
public enum TfProductType implements Internal.EnumLite {
    NA_PRODUCT_TYPE(0),
    CARD_22(1),
    CARD_33(2),
    CARD_YST(3),
    PACKAGE_GENERAL(4),
    PACKAGE_S10(5),
    UNRECOGNIZED(-1);

    public static final int CARD_22_VALUE = 1;
    public static final int CARD_33_VALUE = 2;
    public static final int CARD_YST_VALUE = 3;
    public static final int NA_PRODUCT_TYPE_VALUE = 0;
    public static final int PACKAGE_GENERAL_VALUE = 4;
    public static final int PACKAGE_S10_VALUE = 5;
    private static final Internal.EnumLiteMap<TfProductType> internalValueMap = new Internal.EnumLiteMap<TfProductType>() { // from class: com.bilibili.lib.tf.TfProductType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfProductType m6813findValueByNumber(int i7) {
            return TfProductType.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfProductType$TfProductTypeVerifier.class */
    public static final class TfProductTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfProductTypeVerifier();

        private TfProductTypeVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfProductType.forNumber(i7) != null;
        }
    }

    TfProductType(int i7) {
        this.value = i7;
    }

    public static TfProductType forNumber(int i7) {
        if (i7 == 0) {
            return NA_PRODUCT_TYPE;
        }
        if (i7 == 1) {
            return CARD_22;
        }
        if (i7 == 2) {
            return CARD_33;
        }
        if (i7 == 3) {
            return CARD_YST;
        }
        if (i7 == 4) {
            return PACKAGE_GENERAL;
        }
        if (i7 != 5) {
            return null;
        }
        return PACKAGE_S10;
    }

    public static Internal.EnumLiteMap<TfProductType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfProductTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static TfProductType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
