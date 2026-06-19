package com.bilibili.lib.projection.internal.engine;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/IEngineDeviceChange.class */
public interface IEngineDeviceChange {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/IEngineDeviceChange$EngineType.class */
    public static final class EngineType {
        private static final EnumEntries $ENTRIES;
        private static final EngineType[] $VALUES;
        private final int value;
        public static final EngineType Nirvana = new EngineType("Nirvana", 0, 1);
        public static final EngineType Cloud = new EngineType("Cloud", 1, 2);
        public static final EngineType Unknown = new EngineType("Unknown", 2, -1);

        private static final /* synthetic */ EngineType[] $values() {
            return new EngineType[]{Nirvana, Cloud, Unknown};
        }

        static {
            EngineType[] engineTypeArr$values = $values();
            $VALUES = engineTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(engineTypeArr$values);
        }

        private EngineType(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<EngineType> getEntries() {
            return $ENTRIES;
        }

        public static EngineType valueOf(String str) {
            return (EngineType) Enum.valueOf(EngineType.class, str);
        }

        public static EngineType[] values() {
            return (EngineType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    void O8(boolean z6);
}
