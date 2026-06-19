package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ChargingPlusOperationAction.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ChargingPlusOperationAction implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f102517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TYPE f102518c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ChargingPlusOperationAction$TYPE.class */
    public static final class TYPE {
        private static final EnumEntries $ENTRIES;
        private static final TYPE[] $VALUES;
        public static final TYPE CHARGING_PLUS_NORMAL = new TYPE("CHARGING_PLUS_NORMAL", 0);
        public static final TYPE CHARGING_PLUS_QA = new TYPE("CHARGING_PLUS_QA", 1);
        public static final TYPE CHARGING_PLUS_AD = new TYPE("CHARGING_PLUS_AD", 2);

        private static final /* synthetic */ TYPE[] $values() {
            return new TYPE[]{CHARGING_PLUS_NORMAL, CHARGING_PLUS_QA, CHARGING_PLUS_AD};
        }

        static {
            TYPE[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        private TYPE(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<TYPE> getEntries() {
            return $ENTRIES;
        }

        public static TYPE valueOf(String str) {
            return (TYPE) Enum.valueOf(TYPE.class, str);
        }

        public static TYPE[] values() {
            return (TYPE[]) $VALUES.clone();
        }
    }

    public ChargingPlusOperationAction(@NotNull String str, @NotNull String str2, @NotNull TYPE type) {
        this.f102516a = str;
        this.f102517b = str2;
        this.f102518c = type;
    }

    public /* synthetic */ ChargingPlusOperationAction(String str, String str2, TYPE type, int i7) {
        this(str, (i7 & 2) != 0 ? "manual" : str2, (i7 & 4) != 0 ? TYPE.CHARGING_PLUS_NORMAL : type);
    }

    public static ChargingPlusOperationAction a(ChargingPlusOperationAction chargingPlusOperationAction, String str, TYPE type, int i7) {
        String str2 = chargingPlusOperationAction.f102516a;
        if ((i7 & 2) != 0) {
            str = chargingPlusOperationAction.f102517b;
        }
        if ((i7 & 4) != 0) {
            type = chargingPlusOperationAction.f102518c;
        }
        chargingPlusOperationAction.getClass();
        return new ChargingPlusOperationAction(str2, str, type);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargingPlusOperationAction)) {
            return false;
        }
        ChargingPlusOperationAction chargingPlusOperationAction = (ChargingPlusOperationAction) obj;
        return Intrinsics.areEqual(this.f102516a, chargingPlusOperationAction.f102516a) && Intrinsics.areEqual(this.f102517b, chargingPlusOperationAction.f102517b) && this.f102518c == chargingPlusOperationAction.f102518c;
    }

    public final int hashCode() {
        return this.f102518c.hashCode() + I.E.a(this.f102516a.hashCode() * 31, 31, this.f102517b);
    }

    @NotNull
    public final String toString() {
        return "ChargingPlusOperationAction(link=" + this.f102516a + ", showRes=" + this.f102517b + ", type=" + this.f102518c + ")";
    }
}
