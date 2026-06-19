package com.bilibili.lib.storage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/StorageEvent.class */
public class StorageEvent {
    private static final EnumEntries $ENTRIES;
    private static final StorageEvent[] $VALUES;

    @NotNull
    public static final a Companion;
    private static final long DEFAULT_CRITICAL_FULL_SIZE = 104857600;
    private static final long DEFAULT_MINOR_FULL_SIZE = 1073741824;
    public static final StorageEvent start = new StorageEvent("start", 0);
    public static final StorageEvent minor = new StorageEvent("minor", 1) { // from class: com.bilibili.lib.storage.StorageEvent.minor
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @Override // com.bilibili.lib.storage.StorageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long thresholdSize() {
            /*
                r3 = this;
                com.bilibili.gripper.container.storagemanager.d$b r0 = com.bilibili.lib.storage.b.f64603i
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L29
                r0 = r6
                com.bilibili.gripper.storagemanager.GStorageManager$a r0 = r0.a
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L1b
                r0 = r6
                java.lang.Long r0 = r0.c()
                r6 = r0
                goto L1d
            L1b:
                r0 = 0
                r6 = r0
            L1d:
                r0 = r6
                if (r0 == 0) goto L29
                r0 = r6
                long r0 = r0.longValue()
                r4 = r0
                goto L2d
            L29:
                r0 = 1073741824(0x40000000, double:5.304989477E-315)
                r4 = r0
            L2d:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.storage.StorageEvent.minor.thresholdSize():long");
        }
    };
    public static final StorageEvent critical = new StorageEvent("critical", 2) { // from class: com.bilibili.lib.storage.StorageEvent.critical
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @Override // com.bilibili.lib.storage.StorageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long thresholdSize() {
            /*
                r3 = this;
                com.bilibili.gripper.container.storagemanager.d$b r0 = com.bilibili.lib.storage.b.f64603i
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L29
                r0 = r6
                com.bilibili.gripper.storagemanager.GStorageManager$a r0 = r0.a
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L1b
                r0 = r6
                java.lang.Long r0 = r0.d()
                r6 = r0
                goto L1d
            L1b:
                r0 = 0
                r6 = r0
            L1d:
                r0 = r6
                if (r0 == 0) goto L29
                r0 = r6
                long r0 = r0.longValue()
                r4 = r0
                goto L2d
            L29:
                r0 = 104857600(0x6400000, double:5.1806538E-316)
                r4 = r0
            L2d:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.storage.StorageEvent.critical.thresholdSize():long");
        }
    };
    public static final StorageEvent none = new StorageEvent("none", 3);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/StorageEvent$a.class */
    public static final class a {
    }

    private static final /* synthetic */ StorageEvent[] $values() {
        return new StorageEvent[]{start, minor, critical, none};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.lib.storage.StorageEvent$a, java.lang.Object] */
    static {
        StorageEvent[] storageEventArr$values = $values();
        $VALUES = storageEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(storageEventArr$values);
        Companion = new Object();
    }

    private StorageEvent(String str, int i7) {
    }

    public /* synthetic */ StorageEvent(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i7);
    }

    @NotNull
    public static EnumEntries<StorageEvent> getEntries() {
        return $ENTRIES;
    }

    public static StorageEvent valueOf(String str) {
        return (StorageEvent) Enum.valueOf(StorageEvent.class, str);
    }

    public static StorageEvent[] values() {
        return (StorageEvent[]) $VALUES.clone();
    }

    public long thresholdSize() {
        return -1L;
    }
}
