package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/Connectivity.class */
public enum Connectivity implements Internal.EnumLite {
    NET_UNKNOWN(0),
    NET_WIFI(1),
    NET_MOBILE(2),
    NET_NO_CONNECTIVITY(3),
    NET_OTHER(4),
    NET_ETHERNET(5),
    UNRECOGNIZED(-1);

    public static final int NET_ETHERNET_VALUE = 5;
    public static final int NET_MOBILE_VALUE = 2;
    public static final int NET_NO_CONNECTIVITY_VALUE = 3;
    public static final int NET_OTHER_VALUE = 4;
    public static final int NET_UNKNOWN_VALUE = 0;
    public static final int NET_WIFI_VALUE = 1;
    private static final Internal.EnumLiteMap<Connectivity> internalValueMap = new Internal.EnumLiteMap<Connectivity>() { // from class: com.bilibili.lib.tf.Connectivity.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public Connectivity m6795findValueByNumber(int i7) {
            return Connectivity.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/Connectivity$ConnectivityVerifier.class */
    public static final class ConnectivityVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ConnectivityVerifier();

        private ConnectivityVerifier() {
        }

        public boolean isInRange(int i7) {
            return Connectivity.forNumber(i7) != null;
        }
    }

    Connectivity(int i7) {
        this.value = i7;
    }

    public static Connectivity forNumber(int i7) {
        if (i7 == 0) {
            return NET_UNKNOWN;
        }
        if (i7 == 1) {
            return NET_WIFI;
        }
        if (i7 == 2) {
            return NET_MOBILE;
        }
        if (i7 == 3) {
            return NET_NO_CONNECTIVITY;
        }
        if (i7 == 4) {
            return NET_OTHER;
        }
        if (i7 != 5) {
            return null;
        }
        return NET_ETHERNET;
    }

    public static Internal.EnumLiteMap<Connectivity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ConnectivityVerifier.INSTANCE;
    }

    @Deprecated
    public static Connectivity valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
