package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfUrlMethod.class */
public enum TfUrlMethod implements Internal.EnumLite {
    NA_METHOD(0),
    TRA_FREE(1),
    CDN(2),
    TF_RULES(3),
    BVC_CONVERT(4),
    BILICR_TF_MARK(5),
    UNRECOGNIZED(-1);

    public static final int BILICR_TF_MARK_VALUE = 5;
    public static final int BVC_CONVERT_VALUE = 4;
    public static final int CDN_VALUE = 2;
    public static final int NA_METHOD_VALUE = 0;
    public static final int TF_RULES_VALUE = 3;
    public static final int TRA_FREE_VALUE = 1;
    private static final Internal.EnumLiteMap<TfUrlMethod> internalValueMap = new Internal.EnumLiteMap<TfUrlMethod>() { // from class: com.bilibili.lib.tf.TfUrlMethod.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfUrlMethod m6842findValueByNumber(int i7) {
            return TfUrlMethod.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfUrlMethod$TfUrlMethodVerifier.class */
    public static final class TfUrlMethodVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfUrlMethodVerifier();

        private TfUrlMethodVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfUrlMethod.forNumber(i7) != null;
        }
    }

    TfUrlMethod(int i7) {
        this.value = i7;
    }

    public static TfUrlMethod forNumber(int i7) {
        if (i7 == 0) {
            return NA_METHOD;
        }
        if (i7 == 1) {
            return TRA_FREE;
        }
        if (i7 == 2) {
            return CDN;
        }
        if (i7 == 3) {
            return TF_RULES;
        }
        if (i7 == 4) {
            return BVC_CONVERT;
        }
        if (i7 != 5) {
            return null;
        }
        return BILICR_TF_MARK;
    }

    public static Internal.EnumLiteMap<TfUrlMethod> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfUrlMethodVerifier.INSTANCE;
    }

    @Deprecated
    public static TfUrlMethod valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
