package com.bilibili.lib.rpc.track.model;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CallType.class */
public enum CallType implements Internal.EnumLite {
    API(0),
    IMAGE(1),
    UNRECOGNIZED(-1);

    public static final int API_VALUE = 0;
    public static final int IMAGE_VALUE = 1;
    private static final Internal.EnumLiteMap<CallType> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CallType$a.class */
    public final class a implements Internal.EnumLiteMap<CallType> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return CallType.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CallType$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64361a = new Object();

        public final boolean isInRange(int i7) {
            return CallType.forNumber(i7) != null;
        }
    }

    CallType(int i7) {
        this.value = i7;
    }

    public static CallType forNumber(int i7) {
        if (i7 == 0) {
            return API;
        }
        if (i7 != 1) {
            return null;
        }
        return IMAGE;
    }

    public static Internal.EnumLiteMap<CallType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f64361a;
    }

    @Deprecated
    public static CallType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
