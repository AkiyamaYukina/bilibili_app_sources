package com.bilibili.spmid;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/spmid/SPMID.class */
public final class SPMID {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Segment f105051b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/spmid/SPMID$Segment.class */
    public static final class Segment {
        private static final EnumEntries $ENTRIES;
        private static final Segment[] $VALUES;
        public static final Segment First = new Segment("First", 0);
        public static final Segment Second = new Segment("Second", 1);
        public static final Segment Third = new Segment("Third", 2);
        public static final Segment Fourth = new Segment("Fourth", 3);

        private static final /* synthetic */ Segment[] $values() {
            return new Segment[]{First, Second, Third, Fourth};
        }

        static {
            Segment[] segmentArr$values = $values();
            $VALUES = segmentArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(segmentArr$values);
        }

        private Segment(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Segment> getEntries() {
            return $ENTRIES;
        }

        public static Segment valueOf(String str) {
            return (Segment) Enum.valueOf(Segment.class, str);
        }

        public static Segment[] values() {
            return (Segment[]) $VALUES.clone();
        }
    }

    public SPMID(@NotNull String str, @NotNull Segment segment) {
        this.f105050a = str;
        this.f105051b = segment;
    }

    @NotNull
    public final String getId() {
        return this.f105050a;
    }

    @NotNull
    public final Segment getSegment() {
        return this.f105051b;
    }
}
