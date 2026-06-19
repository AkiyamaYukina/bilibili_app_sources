package com.bilibili.lib.rpc.track.model.flowcontrol;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/flowcontrol/Event.class */
public enum Event implements Internal.EnumLite {
    BLOCK(0),
    UNBLOCK(1),
    BLOCKED(2),
    UNRECOGNIZED(-1);

    public static final int BLOCKED_VALUE = 2;
    public static final int BLOCK_VALUE = 0;
    public static final int UNBLOCK_VALUE = 1;
    private static final Internal.EnumLiteMap<Event> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/flowcontrol/Event$a.class */
    public final class a implements Internal.EnumLiteMap<Event> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return Event.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/flowcontrol/Event$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64386a = new Object();

        public final boolean isInRange(int i7) {
            return Event.forNumber(i7) != null;
        }
    }

    Event(int i7) {
        this.value = i7;
    }

    public static Event forNumber(int i7) {
        if (i7 == 0) {
            return BLOCK;
        }
        if (i7 == 1) {
            return UNBLOCK;
        }
        if (i7 != 2) {
            return null;
        }
        return BLOCKED;
    }

    public static Internal.EnumLiteMap<Event> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f64386a;
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
