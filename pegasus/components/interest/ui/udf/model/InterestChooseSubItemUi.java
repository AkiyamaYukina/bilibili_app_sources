package com.bilibili.pegasus.components.interest.ui.udf.model;

import I1.C2157f0;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import cf.n;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/model/InterestChooseSubItemUi.class */
@StabilityInferred(parameters = 1)
@Keep
public final class InterestChooseSubItemUi {
    public static final int $stable = 0;

    @Nullable
    private final String desc;
    private final long fid;

    @Nullable
    private final String icon;
    private final int id;
    private final boolean isDefaultSelected;
    private final boolean isSelected;

    @Nullable
    private final String name;

    public InterestChooseSubItemUi() {
        this(0, 0L, null, null, null, false, false, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public InterestChooseSubItemUi(int i7, long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z6, boolean z7) {
        this.id = i7;
        this.fid = j7;
        this.icon = str;
        this.name = str2;
        this.desc = str3;
        this.isSelected = z6;
        this.isDefaultSelected = z7;
    }

    public /* synthetic */ InterestChooseSubItemUi(int i7, long j7, String str, String str2, String str3, boolean z6, boolean z7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? 0L : j7, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? false : z6, (i8 & 64) != 0 ? false : z7);
    }

    public static /* synthetic */ InterestChooseSubItemUi copy$default(InterestChooseSubItemUi interestChooseSubItemUi, int i7, long j7, String str, String str2, String str3, boolean z6, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = interestChooseSubItemUi.id;
        }
        if ((i8 & 2) != 0) {
            j7 = interestChooseSubItemUi.fid;
        }
        if ((i8 & 4) != 0) {
            str = interestChooseSubItemUi.icon;
        }
        if ((i8 & 8) != 0) {
            str2 = interestChooseSubItemUi.name;
        }
        if ((i8 & 16) != 0) {
            str3 = interestChooseSubItemUi.desc;
        }
        if ((i8 & 32) != 0) {
            z6 = interestChooseSubItemUi.isSelected;
        }
        if ((i8 & 64) != 0) {
            z7 = interestChooseSubItemUi.isDefaultSelected;
        }
        return interestChooseSubItemUi.copy(i7, j7, str, str2, str3, z6, z7);
    }

    public final int component1() {
        return this.id;
    }

    public final long component2() {
        return this.fid;
    }

    @Nullable
    public final String component3() {
        return this.icon;
    }

    @Nullable
    public final String component4() {
        return this.name;
    }

    @Nullable
    public final String component5() {
        return this.desc;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final boolean component7() {
        return this.isDefaultSelected;
    }

    @NotNull
    public final InterestChooseSubItemUi copy(int i7, long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z6, boolean z7) {
        return new InterestChooseSubItemUi(i7, j7, str, str2, str3, z6, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseSubItemUi)) {
            return false;
        }
        InterestChooseSubItemUi interestChooseSubItemUi = (InterestChooseSubItemUi) obj;
        return this.id == interestChooseSubItemUi.id && this.fid == interestChooseSubItemUi.fid && Intrinsics.areEqual(this.icon, interestChooseSubItemUi.icon) && Intrinsics.areEqual(this.name, interestChooseSubItemUi.name) && Intrinsics.areEqual(this.desc, interestChooseSubItemUi.desc) && this.isSelected == interestChooseSubItemUi.isSelected && this.isDefaultSelected == interestChooseSubItemUi.isDefaultSelected;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final long getFid() {
        return this.fid;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iA = C3554n0.a(Integer.hashCode(this.id) * 31, 31, this.fid);
        String str = this.icon;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.desc;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return Boolean.hashCode(this.isDefaultSelected) + z.a((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.isSelected);
    }

    public final boolean isDefaultSelected() {
        return this.isDefaultSelected;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        int i7 = this.id;
        long j7 = this.fid;
        String str = this.icon;
        String str2 = this.name;
        String str3 = this.desc;
        boolean z6 = this.isSelected;
        boolean z7 = this.isDefaultSelected;
        StringBuilder sbA = C2157f0.a(i7, j7, "InterestChooseSubItemUi(id=", ", fid=");
        B.a(", icon=", str, ", name=", str2, sbA);
        n.a(", desc=", str3, ", isSelected=", sbA, z6);
        sbA.append(", isDefaultSelected=");
        sbA.append(z7);
        sbA.append(")");
        return sbA.toString();
    }
}
