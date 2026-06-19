package com.bilibili.pegasus.components.interest.ui.udf.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/model/InterestChooseMixedItemUi.class */
@StabilityInferred(parameters = 0)
@Keep
public final class InterestChooseMixedItemUi {
    public static final int $stable = 8;

    @Nullable
    private final InterestChooseItemUi item;

    @Nullable
    private final InterestChooseSubItemUi subItem;
    private final int type;

    public InterestChooseMixedItemUi() {
        this(0, null, null, 7, null);
    }

    public InterestChooseMixedItemUi(int i7, @Nullable InterestChooseItemUi interestChooseItemUi, @Nullable InterestChooseSubItemUi interestChooseSubItemUi) {
        this.type = i7;
        this.item = interestChooseItemUi;
        this.subItem = interestChooseSubItemUi;
    }

    public /* synthetic */ InterestChooseMixedItemUi(int i7, InterestChooseItemUi interestChooseItemUi, InterestChooseSubItemUi interestChooseSubItemUi, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : interestChooseItemUi, (i8 & 4) != 0 ? null : interestChooseSubItemUi);
    }

    public static /* synthetic */ InterestChooseMixedItemUi copy$default(InterestChooseMixedItemUi interestChooseMixedItemUi, int i7, InterestChooseItemUi interestChooseItemUi, InterestChooseSubItemUi interestChooseSubItemUi, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = interestChooseMixedItemUi.type;
        }
        if ((i8 & 2) != 0) {
            interestChooseItemUi = interestChooseMixedItemUi.item;
        }
        if ((i8 & 4) != 0) {
            interestChooseSubItemUi = interestChooseMixedItemUi.subItem;
        }
        return interestChooseMixedItemUi.copy(i7, interestChooseItemUi, interestChooseSubItemUi);
    }

    public final int component1() {
        return this.type;
    }

    @Nullable
    public final InterestChooseItemUi component2() {
        return this.item;
    }

    @Nullable
    public final InterestChooseSubItemUi component3() {
        return this.subItem;
    }

    @NotNull
    public final InterestChooseMixedItemUi copy(int i7, @Nullable InterestChooseItemUi interestChooseItemUi, @Nullable InterestChooseSubItemUi interestChooseSubItemUi) {
        return new InterestChooseMixedItemUi(i7, interestChooseItemUi, interestChooseSubItemUi);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseMixedItemUi)) {
            return false;
        }
        InterestChooseMixedItemUi interestChooseMixedItemUi = (InterestChooseMixedItemUi) obj;
        return this.type == interestChooseMixedItemUi.type && Intrinsics.areEqual(this.item, interestChooseMixedItemUi.item) && Intrinsics.areEqual(this.subItem, interestChooseMixedItemUi.subItem);
    }

    @Nullable
    public final InterestChooseItemUi getItem() {
        return this.item;
    }

    @Nullable
    public final InterestChooseSubItemUi getSubItem() {
        return this.subItem;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type);
        InterestChooseItemUi interestChooseItemUi = this.item;
        int iHashCode2 = 0;
        int iHashCode3 = interestChooseItemUi == null ? 0 : interestChooseItemUi.hashCode();
        InterestChooseSubItemUi interestChooseSubItemUi = this.subItem;
        if (interestChooseSubItemUi != null) {
            iHashCode2 = interestChooseSubItemUi.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public String toString() {
        return "InterestChooseMixedItemUi(type=" + this.type + ", item=" + this.item + ", subItem=" + this.subItem + ")";
    }
}
