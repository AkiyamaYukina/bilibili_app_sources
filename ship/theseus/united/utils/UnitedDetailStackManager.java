package com.bilibili.ship.theseus.united.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.collections.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/UnitedDetailStackManager.class */
@StabilityInferred(parameters = 0)
public final class UnitedDetailStackManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayDeque<Integer> f104843a = new ArrayDeque<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/UnitedDetailStackManager$StackElementType.class */
    public static final class StackElementType {
        private static final EnumEntries $ENTRIES;
        private static final StackElementType[] $VALUES;
        public static final StackElementType UNITED_VIDEO = new StackElementType("UNITED_VIDEO", 0);

        private static final /* synthetic */ StackElementType[] $values() {
            return new StackElementType[]{UNITED_VIDEO};
        }

        static {
            StackElementType[] stackElementTypeArr$values = $values();
            $VALUES = stackElementTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stackElementTypeArr$values);
        }

        private StackElementType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<StackElementType> getEntries() {
            return $ENTRIES;
        }

        public static StackElementType valueOf(String str) {
            return (StackElementType) Enum.valueOf(StackElementType.class, str);
        }

        public static StackElementType[] values() {
            return (StackElementType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/UnitedDetailStackManager$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104844a;

        static {
            int[] iArr = new int[StackElementType.values().length];
            try {
                iArr[StackElementType.UNITED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f104844a = iArr;
        }
    }
}
