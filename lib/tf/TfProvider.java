package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfProvider.class */
public enum TfProvider implements Internal.EnumLite {
    NA_PROVIDER(0),
    UNICOM(1),
    MOBILE(2),
    TELECOM(3),
    UNRECOGNIZED(-1);

    public static final int MOBILE_VALUE = 2;
    public static final int NA_PROVIDER_VALUE = 0;
    public static final int TELECOM_VALUE = 3;
    public static final int UNICOM_VALUE = 1;
    private static final Internal.EnumLiteMap<TfProvider> internalValueMap = new Internal.EnumLiteMap<TfProvider>() { // from class: com.bilibili.lib.tf.TfProvider.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfProvider m6816findValueByNumber(int i7) {
            return TfProvider.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfProvider$TfProviderVerifier.class */
    public static final class TfProviderVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfProviderVerifier();

        private TfProviderVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfProvider.forNumber(i7) != null;
        }
    }

    TfProvider(int i7) {
        this.value = i7;
    }

    public static TfProvider forNumber(int i7) {
        if (i7 == 0) {
            return NA_PROVIDER;
        }
        if (i7 == 1) {
            return UNICOM;
        }
        if (i7 == 2) {
            return MOBILE;
        }
        if (i7 != 3) {
            return null;
        }
        return TELECOM;
    }

    public static Internal.EnumLiteMap<TfProvider> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfProviderVerifier.INSTANCE;
    }

    @Deprecated
    public static TfProvider valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
