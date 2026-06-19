package com.bilibili.sistersplayer.p2p.utils;

import android.util.Log;
import androidx.compose.ui.text.font.C4496a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.Logging;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/PLog.class */
public final class PLog {

    @NotNull
    public static final String BASE_TAG = "LIVE_P2P";

    @NotNull
    public static final String LiveP2PProblem = "[LiveP2PProblem]";
    private static volatile boolean isDisableCheckTAG;
    private static volatile boolean isEnableRTCLogger;

    @Nullable
    private static volatile LogFunction logFunction;

    @NotNull
    public static final PLog INSTANCE = new PLog();
    private static final Pattern REGEX_FILENAME = Pattern.compile("(?:index\\.m3u8|[^\\/]+\\.m4s)(?=\\?)");

    @NotNull
    private static final Map<String, Boolean> tags = new LinkedHashMap();

    @NotNull
    private static final Map<String, Boolean> dynamicTags = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/PLog$Level.class */
    public static final class Level {
        private static final EnumEntries $ENTRIES;
        private static final Level[] $VALUES;
        public static final Level VERBOSE = new Level("VERBOSE", 0);
        public static final Level DEBUG = new Level("DEBUG", 1);
        public static final Level INFO = new Level("INFO", 2);
        public static final Level WARN = new Level("WARN", 3);
        public static final Level ERROR = new Level("ERROR", 4);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{VERBOSE, DEBUG, INFO, WARN, ERROR};
        }

        static {
            Level[] levelArr$values = $values();
            $VALUES = levelArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(levelArr$values);
        }

        private Level(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/PLog$LogFunction.class */
    public interface LogFunction {
        void logger(@NotNull Level level, @NotNull String str, @NotNull String str2, @Nullable Throwable th);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/PLog$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Logging.Severity.values().length];
            try {
                iArr[Logging.Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Logging.Severity.LS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Logging.Severity.LS_VERBOSE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Logging.Severity.LS_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Logging.Severity.LS_NONE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Level.values().length];
            try {
                iArr2[Level.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[Level.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[Level.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr2[Level.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError e16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PLog() {
    }

    @JvmStatic
    public static final void disableCheckTAG() {
        isDisableCheckTAG = true;
    }

    @JvmStatic
    public static final void enableAllWebRTCLogger() {
        isEnableRTCLogger = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @JvmStatic
    private static final void log(String str, String str2, Level level, Throwable th) throws NoWhenBranchMatchedException {
        Boolean bool = tags.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2) || Intrinsics.areEqual(dynamicTags.get(str), bool2) || isDisableCheckTAG || (isEnableRTCLogger && StringsKt.n(str, ".c"))) {
            String strA = C4496a.a("LIVE_P2P:", str);
            if (logFunction != null) {
                LogFunction logFunction2 = logFunction;
                if (logFunction2 != null) {
                    logFunction2.logger(level, strA, str2, th);
                    return;
                }
                return;
            }
            int i7 = WhenMappings.$EnumSwitchMapping$1[level.ordinal()];
            if (i7 == 1 || i7 == 2) {
                return;
            }
            if (i7 == 3) {
                Log.i(strA, str2, th);
            } else if (i7 == 4) {
                Log.w(strA, str2, th);
            } else {
                if (i7 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Log.e(strA, str2, th);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ void log$default(String str, String str2, Level level, Throwable th, int i7, Object obj) throws NoWhenBranchMatchedException {
        if ((i7 & 8) != 0) {
            th = null;
        }
        log(str, str2, level, th);
    }

    @JvmStatic
    public static final void logD(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        log(str, str2, Level.DEBUG, th);
    }

    public static /* synthetic */ void logD$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        logD(str, str2, th);
    }

    @JvmStatic
    public static final void logE(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        log(str, str2, Level.ERROR, th);
    }

    public static /* synthetic */ void logE$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        logE(str, str2, th);
    }

    @JvmStatic
    public static final void logI(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        log(str, str2, Level.INFO, th);
    }

    public static /* synthetic */ void logI$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        logI(str, str2, th);
    }

    @JvmStatic
    public static final void logV(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        log(str, str2, Level.VERBOSE, th);
    }

    public static /* synthetic */ void logV$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        logV(str, str2, th);
    }

    @JvmStatic
    public static final void logW(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        log(str, str2, Level.WARN, th);
    }

    public static /* synthetic */ void logW$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        logW(str, str2, th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @JvmStatic
    public static final void onLogMessage(@Nullable Logging.Severity severity, @Nullable String str, @Nullable String str2) throws NoWhenBranchMatchedException {
        Level level;
        if (str2 == null || severity == null || str == null) {
            return;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
        if (i7 == 1) {
            level = Level.ERROR;
        } else if (i7 == 2) {
            level = Level.INFO;
        } else if (i7 == 3) {
            level = Level.VERBOSE;
        } else if (i7 == 4) {
            level = Level.WARN;
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            level = Level.DEBUG;
        }
        log$default(str, str2, level, null, 8, null);
    }

    @JvmStatic
    public static final void setLogFunction(@NotNull LogFunction logFunction2) {
        logFunction = logFunction2;
    }

    @NotNull
    public final Map<String, Boolean> getDynamicTags() {
        return dynamicTags;
    }

    public final Pattern getREGEX_FILENAME() {
        return REGEX_FILENAME;
    }

    @NotNull
    public final Map<String, Boolean> getTags() {
        return tags;
    }
}
