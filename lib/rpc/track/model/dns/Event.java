package com.bilibili.lib.rpc.track.model.dns;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/Event.class */
public enum Event implements Internal.EnumLite {
    RESOLVE(0),
    FETCH_ERROR(1),
    UNRECOGNIZED(-1);

    public static final int FETCH_ERROR_VALUE = 1;
    public static final int RESOLVE_VALUE = 0;
    private static final Internal.EnumLiteMap<Event> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/Event$a.class */
    public final class a implements Internal.EnumLiteMap<Event> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return Event.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/Event$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64384a = new Object();

        public final boolean isInRange(int i7) {
            return Event.forNumber(i7) != null;
        }
    }

    Event(int i7) {
        this.value = i7;
    }

    public static Event forNumber(int i7) {
        if (i7 == 0) {
            return RESOLVE;
        }
        if (i7 != 1) {
            return null;
        }
        return FETCH_ERROR;
    }

    public static Internal.EnumLiteMap<Event> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f64384a;
    }

    @Deprecated
    public static Event valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
