package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfType.class */
public enum TfType implements Internal.EnumLite {
    NA_TYPE(0),
    CARD(1),
    PACKAGE(2),
    UNRECOGNIZED(-1);

    public static final int CARD_VALUE = 1;
    public static final int NA_TYPE_VALUE = 0;
    public static final int PACKAGE_VALUE = 2;
    private static final Internal.EnumLiteMap<TfType> internalValueMap = new Internal.EnumLiteMap<TfType>() { // from class: com.bilibili.lib.tf.TfType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfType m6836findValueByNumber(int i7) {
            return TfType.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfType$TfTypeVerifier.class */
    public static final class TfTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfTypeVerifier();

        private TfTypeVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfType.forNumber(i7) != null;
        }
    }

    TfType(int i7) {
        this.value = i7;
    }

    public static TfType forNumber(int i7) {
        if (i7 == 0) {
            return NA_TYPE;
        }
        if (i7 == 1) {
            return CARD;
        }
        if (i7 != 2) {
            return null;
        }
        return PACKAGE;
    }

    public static Internal.EnumLiteMap<TfType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static TfType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
