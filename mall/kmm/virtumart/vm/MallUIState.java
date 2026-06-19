package com.bilibili.mall.kmm.virtumart.vm;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kntr.kotlin.native.ObjCExportAll;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/vm/MallUIState.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.PROPERTY)
public final class MallUIState<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MallDataUIStatus f65688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f65689b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/vm/MallUIState$MallDataUIStatus.class */
    public static final class MallDataUIStatus {
        private static final EnumEntries $ENTRIES;
        private static final MallDataUIStatus[] $VALUES;
        public static final MallDataUIStatus EMPTY = new MallDataUIStatus("EMPTY", 0);
        public static final MallDataUIStatus LOADING = new MallDataUIStatus("LOADING", 1);
        public static final MallDataUIStatus SUCCESS = new MallDataUIStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 2);
        public static final MallDataUIStatus FAILED_LOAD = new MallDataUIStatus("FAILED_LOAD", 3);
        public static final MallDataUIStatus FAILED_FORBIDDEN = new MallDataUIStatus("FAILED_FORBIDDEN", 4);

        private static final /* synthetic */ MallDataUIStatus[] $values() {
            return new MallDataUIStatus[]{EMPTY, LOADING, SUCCESS, FAILED_LOAD, FAILED_FORBIDDEN};
        }

        static {
            MallDataUIStatus[] mallDataUIStatusArr$values = $values();
            $VALUES = mallDataUIStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(mallDataUIStatusArr$values);
        }

        private MallDataUIStatus(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<MallDataUIStatus> getEntries() {
            return $ENTRIES;
        }

        public static MallDataUIStatus valueOf(String str) {
            return (MallDataUIStatus) Enum.valueOf(MallDataUIStatus.class, str);
        }

        public static MallDataUIStatus[] values() {
            return (MallDataUIStatus[]) $VALUES.clone();
        }
    }

    public MallUIState() {
        this((MallDataUIStatus) null, 3);
    }

    public /* synthetic */ MallUIState(MallDataUIStatus mallDataUIStatus, int i7) {
        this((i7 & 1) != 0 ? MallDataUIStatus.EMPTY : mallDataUIStatus, (Object) null);
    }

    public MallUIState(@NotNull MallDataUIStatus mallDataUIStatus, @Nullable T t7) {
        this.f65688a = mallDataUIStatus;
        this.f65689b = t7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallUIState)) {
            return false;
        }
        MallUIState mallUIState = (MallUIState) obj;
        return this.f65688a == mallUIState.f65688a && Intrinsics.areEqual(this.f65689b, mallUIState.f65689b);
    }

    public final int hashCode() {
        int iHashCode = this.f65688a.hashCode();
        T t7 = this.f65689b;
        return (iHashCode * 31) + (t7 == null ? 0 : t7.hashCode());
    }

    @NotNull
    public final String toString() {
        return "MallUIState(pageStatus=" + this.f65688a + ", holdData=" + this.f65689b + ")";
    }
}
