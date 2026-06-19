package com.bilibili.lib.rpc.track.model.dns;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/Source.class */
public enum Source implements Internal.EnumLite {
    SYSTEM(0),
    HTTPDNS_JAVA(1),
    HTTPDNS_NATIVE(2),
    UNRECOGNIZED(-1);

    public static final int HTTPDNS_JAVA_VALUE = 1;
    public static final int HTTPDNS_NATIVE_VALUE = 2;
    public static final int SYSTEM_VALUE = 0;
    private static final Internal.EnumLiteMap<Source> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/Source$a.class */
    public final class a implements Internal.EnumLiteMap<Source> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return Source.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/Source$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64385a = new Object();

        public final boolean isInRange(int i7) {
            return Source.forNumber(i7) != null;
        }
    }

    Source(int i7) {
        this.value = i7;
    }

    public static Source forNumber(int i7) {
        if (i7 == 0) {
            return SYSTEM;
        }
        if (i7 == 1) {
            return HTTPDNS_JAVA;
        }
        if (i7 != 2) {
            return null;
        }
        return HTTPDNS_NATIVE;
    }

    public static Internal.EnumLiteMap<Source> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f64385a;
    }

    @Deprecated
    public static Source valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
