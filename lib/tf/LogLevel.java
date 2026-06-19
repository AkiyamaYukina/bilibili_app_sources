package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/LogLevel.class */
public enum LogLevel implements Internal.EnumLite {
    VERBOSE(0),
    DEBUG(1),
    INFO(2),
    WARNING(3),
    ERROR(4),
    UNRECOGNIZED(-1);

    public static final int DEBUG_VALUE = 1;
    public static final int ERROR_VALUE = 4;
    public static final int INFO_VALUE = 2;
    public static final int VERBOSE_VALUE = 0;
    public static final int WARNING_VALUE = 3;
    private static final Internal.EnumLiteMap<LogLevel> internalValueMap = new Internal.EnumLiteMap<LogLevel>() { // from class: com.bilibili.lib.tf.LogLevel.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public LogLevel m6798findValueByNumber(int i7) {
            return LogLevel.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/LogLevel$LogLevelVerifier.class */
    public static final class LogLevelVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new LogLevelVerifier();

        private LogLevelVerifier() {
        }

        public boolean isInRange(int i7) {
            return LogLevel.forNumber(i7) != null;
        }
    }

    LogLevel(int i7) {
        this.value = i7;
    }

    public static LogLevel forNumber(int i7) {
        if (i7 == 0) {
            return VERBOSE;
        }
        if (i7 == 1) {
            return DEBUG;
        }
        if (i7 == 2) {
            return INFO;
        }
        if (i7 == 3) {
            return WARNING;
        }
        if (i7 != 4) {
            return null;
        }
        return ERROR;
    }

    public static Internal.EnumLiteMap<LogLevel> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return LogLevelVerifier.INSTANCE;
    }

    @Deprecated
    public static LogLevel valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
