package com.bilibili.pegasus.components.interest.ui.udf.model;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.e;
import c6.N;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/model/InterestChooseMixedSectionUi.class */
@StabilityInferred(parameters = 0)
@Keep
public final class InterestChooseMixedSectionUi {
    public static final int $stable = 8;

    @NotNull
    private final List<InterestChooseMixedItemUi> mixedItems;
    private final int style;

    @Nullable
    private final String title;

    public InterestChooseMixedSectionUi() {
        this(null, 0, null, 7, null);
    }

    public InterestChooseMixedSectionUi(@Nullable String str, int i7, @NotNull List<InterestChooseMixedItemUi> list) {
        this.title = str;
        this.style = i7;
        this.mixedItems = list;
    }

    public /* synthetic */ InterestChooseMixedSectionUi(String str, int i7, List list, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? 0 : i7, (i8 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestChooseMixedSectionUi copy$default(InterestChooseMixedSectionUi interestChooseMixedSectionUi, String str, int i7, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = interestChooseMixedSectionUi.title;
        }
        if ((i8 & 2) != 0) {
            i7 = interestChooseMixedSectionUi.style;
        }
        if ((i8 & 4) != 0) {
            list = interestChooseMixedSectionUi.mixedItems;
        }
        return interestChooseMixedSectionUi.copy(str, i7, list);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.style;
    }

    @NotNull
    public final List<InterestChooseMixedItemUi> component3() {
        return this.mixedItems;
    }

    @NotNull
    public final InterestChooseMixedSectionUi copy(@Nullable String str, int i7, @NotNull List<InterestChooseMixedItemUi> list) {
        return new InterestChooseMixedSectionUi(str, i7, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseMixedSectionUi)) {
            return false;
        }
        InterestChooseMixedSectionUi interestChooseMixedSectionUi = (InterestChooseMixedSectionUi) obj;
        return Intrinsics.areEqual(this.title, interestChooseMixedSectionUi.title) && this.style == interestChooseMixedSectionUi.style && Intrinsics.areEqual(this.mixedItems, interestChooseMixedSectionUi.mixedItems);
    }

    @NotNull
    public final List<InterestChooseMixedItemUi> getMixedItems() {
        return this.mixedItems;
    }

    public final int getStyle() {
        return this.style;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.mixedItems.hashCode() + I.a(this.style, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i7 = this.style;
        return N.a(e.a(i7, "InterestChooseMixedSectionUi(title=", str, ", style=", ", mixedItems="), ")", this.mixedItems);
    }
}
