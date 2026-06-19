package com.bilibili.pegasus.components.interest.ui.udf.model;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.room.B;
import bf.a;
import cf.k;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/model/InterestChooseItemUi.class */
@StabilityInferred(parameters = 0)
@Keep
public final class InterestChooseItemUi {
    public static final int $stable = 8;

    @Nullable
    private final String desc;
    private final boolean hasReported;

    @Nullable
    private final String icon;
    private final long id;
    private final boolean isDefaultSelected;
    private final boolean isSelected;
    private final boolean isSubItemsExpanded;
    private final int listPosition;
    private final int maxSubitemsShowCount;

    @Nullable
    private final String name;

    @NotNull
    private final List<InterestChooseSubItemUi> subItems;
    private final int subType;

    @Nullable
    private final String tip;

    public InterestChooseItemUi() {
        this(0L, null, null, null, null, 0, null, false, false, 0, false, 0, false, 8191, null);
    }

    public InterestChooseItemUi(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @NotNull List<InterestChooseSubItemUi> list, boolean z6, boolean z7, int i8, boolean z8, int i9, boolean z9) {
        this.id = j7;
        this.name = str;
        this.tip = str2;
        this.desc = str3;
        this.icon = str4;
        this.subType = i7;
        this.subItems = list;
        this.isSelected = z6;
        this.isDefaultSelected = z7;
        this.listPosition = i8;
        this.hasReported = z8;
        this.maxSubitemsShowCount = i9;
        this.isSubItemsExpanded = z9;
    }

    public /* synthetic */ InterestChooseItemUi(long j7, String str, String str2, String str3, String str4, int i7, List list, boolean z6, boolean z7, int i8, boolean z8, int i9, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? 0 : i7, (i10 & 64) != 0 ? CollectionsKt.emptyList() : list, (i10 & 128) != 0 ? false : z6, (i10 & 256) != 0 ? false : z7, (i10 & 512) != 0 ? 0 : i8, (i10 & 1024) != 0 ? false : z8, (i10 & 2048) != 0 ? 0 : i9, (i10 & 4096) != 0 ? false : z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestChooseItemUi copy$default(InterestChooseItemUi interestChooseItemUi, long j7, String str, String str2, String str3, String str4, int i7, List list, boolean z6, boolean z7, int i8, boolean z8, int i9, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j7 = interestChooseItemUi.id;
        }
        if ((i10 & 2) != 0) {
            str = interestChooseItemUi.name;
        }
        if ((i10 & 4) != 0) {
            str2 = interestChooseItemUi.tip;
        }
        if ((i10 & 8) != 0) {
            str3 = interestChooseItemUi.desc;
        }
        if ((i10 & 16) != 0) {
            str4 = interestChooseItemUi.icon;
        }
        if ((i10 & 32) != 0) {
            i7 = interestChooseItemUi.subType;
        }
        if ((i10 & 64) != 0) {
            list = interestChooseItemUi.subItems;
        }
        if ((i10 & 128) != 0) {
            z6 = interestChooseItemUi.isSelected;
        }
        if ((i10 & 256) != 0) {
            z7 = interestChooseItemUi.isDefaultSelected;
        }
        if ((i10 & 512) != 0) {
            i8 = interestChooseItemUi.listPosition;
        }
        if ((i10 & 1024) != 0) {
            z8 = interestChooseItemUi.hasReported;
        }
        if ((i10 & 2048) != 0) {
            i9 = interestChooseItemUi.maxSubitemsShowCount;
        }
        if ((i10 & 4096) != 0) {
            z9 = interestChooseItemUi.isSubItemsExpanded;
        }
        return interestChooseItemUi.copy(j7, str, str2, str3, str4, i7, list, z6, z7, i8, z8, i9, z9);
    }

    public final long component1() {
        return this.id;
    }

    public final int component10() {
        return this.listPosition;
    }

    public final boolean component11() {
        return this.hasReported;
    }

    public final int component12() {
        return this.maxSubitemsShowCount;
    }

    public final boolean component13() {
        return this.isSubItemsExpanded;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.tip;
    }

    @Nullable
    public final String component4() {
        return this.desc;
    }

    @Nullable
    public final String component5() {
        return this.icon;
    }

    public final int component6() {
        return this.subType;
    }

    @NotNull
    public final List<InterestChooseSubItemUi> component7() {
        return this.subItems;
    }

    public final boolean component8() {
        return this.isSelected;
    }

    public final boolean component9() {
        return this.isDefaultSelected;
    }

    @NotNull
    public final InterestChooseItemUi copy(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @NotNull List<InterestChooseSubItemUi> list, boolean z6, boolean z7, int i8, boolean z8, int i9, boolean z9) {
        return new InterestChooseItemUi(j7, str, str2, str3, str4, i7, list, z6, z7, i8, z8, i9, z9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseItemUi)) {
            return false;
        }
        InterestChooseItemUi interestChooseItemUi = (InterestChooseItemUi) obj;
        return this.id == interestChooseItemUi.id && Intrinsics.areEqual(this.name, interestChooseItemUi.name) && Intrinsics.areEqual(this.tip, interestChooseItemUi.tip) && Intrinsics.areEqual(this.desc, interestChooseItemUi.desc) && Intrinsics.areEqual(this.icon, interestChooseItemUi.icon) && this.subType == interestChooseItemUi.subType && Intrinsics.areEqual(this.subItems, interestChooseItemUi.subItems) && this.isSelected == interestChooseItemUi.isSelected && this.isDefaultSelected == interestChooseItemUi.isDefaultSelected && this.listPosition == interestChooseItemUi.listPosition && this.hasReported == interestChooseItemUi.hasReported && this.maxSubitemsShowCount == interestChooseItemUi.maxSubitemsShowCount && this.isSubItemsExpanded == interestChooseItemUi.isSubItemsExpanded;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final boolean getHasReported() {
        return this.hasReported;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final int getListPosition() {
        return this.listPosition;
    }

    public final int getMaxSubitemsShowCount() {
        return this.maxSubitemsShowCount;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<InterestChooseSubItemUi> getSubItems() {
        return this.subItems;
    }

    public final int getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.name;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tip;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.desc;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.icon;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return Boolean.hashCode(this.isSubItemsExpanded) + I.a(this.maxSubitemsShowCount, z.a(I.a(this.listPosition, z.a(z.a(e0.a(I.a(this.subType, ((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31, 31), 31, this.subItems), 31, this.isSelected), 31, this.isDefaultSelected), 31), 31, this.hasReported), 31);
    }

    public final boolean isDefaultSelected() {
        return this.isDefaultSelected;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isSubItemsExpanded() {
        return this.isSubItemsExpanded;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.name;
        String str2 = this.tip;
        String str3 = this.desc;
        String str4 = this.icon;
        int i7 = this.subType;
        List<InterestChooseSubItemUi> list = this.subItems;
        boolean z6 = this.isSelected;
        boolean z7 = this.isDefaultSelected;
        int i8 = this.listPosition;
        boolean z8 = this.hasReported;
        int i9 = this.maxSubitemsShowCount;
        boolean z9 = this.isSubItemsExpanded;
        StringBuilder sbA = n.a(j7, "InterestChooseItemUi(id=", ", name=", str);
        B.a(", tip=", str2, ", desc=", str3, sbA);
        a.a(i7, ", icon=", str4, ", subType=", sbA);
        sbA.append(", subItems=");
        sbA.append(list);
        sbA.append(", isSelected=");
        sbA.append(z6);
        k.a(", isDefaultSelected=", ", listPosition=", i8, z7, sbA);
        k.a(", hasReported=", ", maxSubitemsShowCount=", i9, z8, sbA);
        sbA.append(", isSubItemsExpanded=");
        sbA.append(z9);
        sbA.append(")");
        return sbA.toString();
    }
}
