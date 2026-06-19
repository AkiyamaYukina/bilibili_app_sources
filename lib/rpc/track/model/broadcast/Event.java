package com.bilibili.lib.rpc.track.model.broadcast;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/broadcast/Event.class */
public enum Event implements Internal.EnumLite {
    START(0),
    STOP(1),
    RETRY(2),
    NETWORK_CHANGED(3),
    AUTH_CHANGED(4),
    RESTART(5),
    VALID(6),
    AUTH_FAILED(7),
    INVALID(8),
    REG(9),
    REG_SUCCESS(10),
    REG_FAILED(11),
    UNREG(12),
    UNREG_SUCCESS(13),
    UNREG_FAILED(14),
    NEXT_RESP(15),
    ERROR_RESP(16),
    ACK(17),
    HEARTBEAT_REQ(18),
    HEARTBEAT_RESP(19),
    HEARTBEAT_LOST(20),
    APP_VISIBLE(21),
    APP_INVISIBLE(22),
    STATS(23),
    ENABLED(24),
    BIZ_ENABLED(25),
    UPSTREAM_ACK(26),
    UNHEALTHY(27),
    UNRECOGNIZED(-1);

    public static final int ACK_VALUE = 17;
    public static final int APP_INVISIBLE_VALUE = 22;
    public static final int APP_VISIBLE_VALUE = 21;
    public static final int AUTH_CHANGED_VALUE = 4;
    public static final int AUTH_FAILED_VALUE = 7;
    public static final int BIZ_ENABLED_VALUE = 25;
    public static final int ENABLED_VALUE = 24;
    public static final int ERROR_RESP_VALUE = 16;
    public static final int HEARTBEAT_LOST_VALUE = 20;
    public static final int HEARTBEAT_REQ_VALUE = 18;
    public static final int HEARTBEAT_RESP_VALUE = 19;
    public static final int INVALID_VALUE = 8;
    public static final int NETWORK_CHANGED_VALUE = 3;
    public static final int NEXT_RESP_VALUE = 15;
    public static final int REG_FAILED_VALUE = 11;
    public static final int REG_SUCCESS_VALUE = 10;
    public static final int REG_VALUE = 9;
    public static final int RESTART_VALUE = 5;
    public static final int RETRY_VALUE = 2;
    public static final int START_VALUE = 0;
    public static final int STATS_VALUE = 23;
    public static final int STOP_VALUE = 1;
    public static final int UNHEALTHY_VALUE = 27;
    public static final int UNREG_FAILED_VALUE = 14;
    public static final int UNREG_SUCCESS_VALUE = 13;
    public static final int UNREG_VALUE = 12;
    public static final int UPSTREAM_ACK_VALUE = 26;
    public static final int VALID_VALUE = 6;
    private static final Internal.EnumLiteMap<Event> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/broadcast/Event$a.class */
    public final class a implements Internal.EnumLiteMap<Event> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return Event.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/broadcast/Event$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64382a = new Object();

        public final boolean isInRange(int i7) {
            return Event.forNumber(i7) != null;
        }
    }

    Event(int i7) {
        this.value = i7;
    }

    public static Event forNumber(int i7) {
        switch (i7) {
            case 0:
                return START;
            case 1:
                return STOP;
            case 2:
                return RETRY;
            case 3:
                return NETWORK_CHANGED;
            case 4:
                return AUTH_CHANGED;
            case 5:
                return RESTART;
            case 6:
                return VALID;
            case 7:
                return AUTH_FAILED;
            case 8:
                return INVALID;
            case 9:
                return REG;
            case 10:
                return REG_SUCCESS;
            case 11:
                return REG_FAILED;
            case 12:
                return UNREG;
            case 13:
                return UNREG_SUCCESS;
            case 14:
                return UNREG_FAILED;
            case 15:
                return NEXT_RESP;
            case 16:
                return ERROR_RESP;
            case 17:
                return ACK;
            case 18:
                return HEARTBEAT_REQ;
            case 19:
                return HEARTBEAT_RESP;
            case 20:
                return HEARTBEAT_LOST;
            case 21:
                return APP_VISIBLE;
            case 22:
                return APP_INVISIBLE;
            case 23:
                return STATS;
            case 24:
                return ENABLED;
            case 25:
                return BIZ_ENABLED;
            case 26:
                return UPSTREAM_ACK;
            case 27:
                return UNHEALTHY;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Event> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f64382a;
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
