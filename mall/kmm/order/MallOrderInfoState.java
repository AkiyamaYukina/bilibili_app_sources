package com.bilibili.mall.kmm.order;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kntr.kotlin.native.ObjCExportAll;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoState.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.CALLABLE)
public final class MallOrderInfoState<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MallOrderInfoStatus f65629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f65630b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoState$MallOrderInfoStatus.class */
    public static final class MallOrderInfoStatus {
        private static final EnumEntries $ENTRIES;
        private static final MallOrderInfoStatus[] $VALUES;
        public static final MallOrderInfoStatus NONE = new MallOrderInfoStatus("NONE", 0);
        public static final MallOrderInfoStatus LOADING = new MallOrderInfoStatus("LOADING", 1);
        public static final MallOrderInfoStatus SUCCESS = new MallOrderInfoStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 2);
        public static final MallOrderInfoStatus SUBMIT_SUCCESS = new MallOrderInfoStatus("SUBMIT_SUCCESS", 3);
        public static final MallOrderInfoStatus ERROR = new MallOrderInfoStatus("ERROR", 4);

        private static final /* synthetic */ MallOrderInfoStatus[] $values() {
            return new MallOrderInfoStatus[]{NONE, LOADING, SUCCESS, SUBMIT_SUCCESS, ERROR};
        }

        static {
            MallOrderInfoStatus[] mallOrderInfoStatusArr$values = $values();
            $VALUES = mallOrderInfoStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(mallOrderInfoStatusArr$values);
        }

        private MallOrderInfoStatus(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<MallOrderInfoStatus> getEntries() {
            return $ENTRIES;
        }

        public static MallOrderInfoStatus valueOf(String str) {
            return (MallOrderInfoStatus) Enum.valueOf(MallOrderInfoStatus.class, str);
        }

        public static MallOrderInfoStatus[] values() {
            return (MallOrderInfoStatus[]) $VALUES.clone();
        }
    }

    public MallOrderInfoState() {
        this((MallOrderInfoStatus) null, 3);
    }

    public /* synthetic */ MallOrderInfoState(MallOrderInfoStatus mallOrderInfoStatus, int i7) {
        this((i7 & 1) != 0 ? MallOrderInfoStatus.NONE : mallOrderInfoStatus, (Object) null);
    }

    public MallOrderInfoState(@NotNull MallOrderInfoStatus mallOrderInfoStatus, @Nullable T t7) {
        this.f65629a = mallOrderInfoStatus;
        this.f65630b = t7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallOrderInfoState)) {
            return false;
        }
        MallOrderInfoState mallOrderInfoState = (MallOrderInfoState) obj;
        return this.f65629a == mallOrderInfoState.f65629a && Intrinsics.areEqual(this.f65630b, mallOrderInfoState.f65630b);
    }

    public final int hashCode() {
        int iHashCode = this.f65629a.hashCode();
        T t7 = this.f65630b;
        return (iHashCode * 31) + (t7 == null ? 0 : t7.hashCode());
    }

    @NotNull
    public final String toString() {
        return "MallOrderInfoState(pageStatus=" + this.f65629a + ", holdData=" + this.f65630b + ")";
    }
}
