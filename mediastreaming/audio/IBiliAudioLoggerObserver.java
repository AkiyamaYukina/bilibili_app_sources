package com.bilibili.mediastreaming.audio;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/IBiliAudioLoggerObserver.class */
public interface IBiliAudioLoggerObserver {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/IBiliAudioLoggerObserver$Severity.class */
    public static final class Severity {
        private static final EnumEntries $ENTRIES;
        private static final Severity[] $VALUES;
        public static final Severity LS_VERBOSE = new Severity("LS_VERBOSE", 0);
        public static final Severity LS_DEBUG = new Severity("LS_DEBUG", 1);
        public static final Severity LS_INFO = new Severity("LS_INFO", 2);
        public static final Severity LS_WARNING = new Severity("LS_WARNING", 3);
        public static final Severity LS_ERROR = new Severity("LS_ERROR", 4);
        public static final Severity LS_NONE = new Severity("LS_NONE", 5);

        private static final /* synthetic */ Severity[] $values() {
            return new Severity[]{LS_VERBOSE, LS_DEBUG, LS_INFO, LS_WARNING, LS_ERROR, LS_NONE};
        }

        static {
            Severity[] severityArr$values = $values();
            $VALUES = severityArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(severityArr$values);
        }

        private Severity(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Severity> getEntries() {
            return $ENTRIES;
        }

        public static Severity valueOf(String str) {
            return (Severity) Enum.valueOf(Severity.class, str);
        }

        public static Severity[] values() {
            return (Severity[]) $VALUES.clone();
        }
    }

    void onLogMessage(@NotNull Severity severity, @Nullable String str, @Nullable String str2, @Nullable Throwable th);
}
