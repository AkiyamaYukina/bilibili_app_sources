package com.bilibili.mall.kmm.detailVideo;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kntr.kotlin.native.ObjCExportAll;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/MallDetailVideoState.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.PROPERTY)
public final class MallDetailVideoState<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MallDetailVideoDataStatus f65596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f65597b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/MallDetailVideoState$MallDetailVideoDataStatus.class */
    public static final class MallDetailVideoDataStatus {
        private static final EnumEntries $ENTRIES;
        private static final MallDetailVideoDataStatus[] $VALUES;
        public static final MallDetailVideoDataStatus NONE = new MallDetailVideoDataStatus("NONE", 0);
        public static final MallDetailVideoDataStatus EMPTY = new MallDetailVideoDataStatus("EMPTY", 1);
        public static final MallDetailVideoDataStatus LOADING = new MallDetailVideoDataStatus("LOADING", 2);
        public static final MallDetailVideoDataStatus SUCCESS = new MallDetailVideoDataStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 3);
        public static final MallDetailVideoDataStatus ERROR = new MallDetailVideoDataStatus("ERROR", 4);

        private static final /* synthetic */ MallDetailVideoDataStatus[] $values() {
            return new MallDetailVideoDataStatus[]{NONE, EMPTY, LOADING, SUCCESS, ERROR};
        }

        static {
            MallDetailVideoDataStatus[] mallDetailVideoDataStatusArr$values = $values();
            $VALUES = mallDetailVideoDataStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(mallDetailVideoDataStatusArr$values);
        }

        private MallDetailVideoDataStatus(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<MallDetailVideoDataStatus> getEntries() {
            return $ENTRIES;
        }

        public static MallDetailVideoDataStatus valueOf(String str) {
            return (MallDetailVideoDataStatus) Enum.valueOf(MallDetailVideoDataStatus.class, str);
        }

        public static MallDetailVideoDataStatus[] values() {
            return (MallDetailVideoDataStatus[]) $VALUES.clone();
        }
    }

    public MallDetailVideoState() {
        this(null);
    }

    public MallDetailVideoState(Object obj) {
        this.f65596a = MallDetailVideoDataStatus.NONE;
        this.f65597b = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallDetailVideoState)) {
            return false;
        }
        MallDetailVideoState mallDetailVideoState = (MallDetailVideoState) obj;
        return this.f65596a == mallDetailVideoState.f65596a && Intrinsics.areEqual(this.f65597b, mallDetailVideoState.f65597b);
    }

    public final int hashCode() {
        int iHashCode = this.f65596a.hashCode();
        T t7 = this.f65597b;
        return (iHashCode * 31) + (t7 == null ? 0 : t7.hashCode());
    }

    @NotNull
    public final String toString() {
        return "MallDetailVideoState(pageStatus=" + this.f65596a + ", holdData=" + this.f65597b + ")";
    }
}
