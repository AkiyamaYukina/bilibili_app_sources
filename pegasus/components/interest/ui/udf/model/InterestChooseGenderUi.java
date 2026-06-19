package com.bilibili.pegasus.components.interest.ui.udf.model;

import Fo0.c;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/model/InterestChooseGenderUi.class */
@StabilityInferred(parameters = 1)
@Keep
public final class InterestChooseGenderUi implements c {
    public static final int $stable = 0;

    @Nullable
    private final String icon;
    private final long id;
    private final boolean isDefaultSelected;
    private final boolean isSelected;

    @Nullable
    private final String title;

    public InterestChooseGenderUi() {
        this(0L, null, null, false, false, 31, null);
    }

    public InterestChooseGenderUi(long j7, @Nullable String str, @Nullable String str2, boolean z6, boolean z7) {
        this.id = j7;
        this.title = str;
        this.icon = str2;
        this.isSelected = z6;
        this.isDefaultSelected = z7;
    }

    public /* synthetic */ InterestChooseGenderUi(long j7, String str, String str2, boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? false : z6, (i7 & 16) != 0 ? false : z7);
    }

    public static /* synthetic */ InterestChooseGenderUi copy$default(InterestChooseGenderUi interestChooseGenderUi, long j7, String str, String str2, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = interestChooseGenderUi.id;
        }
        if ((i7 & 2) != 0) {
            str = interestChooseGenderUi.title;
        }
        if ((i7 & 4) != 0) {
            str2 = interestChooseGenderUi.icon;
        }
        if ((i7 & 8) != 0) {
            z6 = interestChooseGenderUi.isSelected;
        }
        if ((i7 & 16) != 0) {
            z7 = interestChooseGenderUi.isDefaultSelected;
        }
        return interestChooseGenderUi.copy(j7, str, str2, z6, z7);
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.icon;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final boolean component5() {
        return this.isDefaultSelected;
    }

    @NotNull
    public final InterestChooseGenderUi copy(long j7, @Nullable String str, @Nullable String str2, boolean z6, boolean z7) {
        return new InterestChooseGenderUi(j7, str, str2, z6, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseGenderUi)) {
            return false;
        }
        InterestChooseGenderUi interestChooseGenderUi = (InterestChooseGenderUi) obj;
        return this.id == interestChooseGenderUi.id && Intrinsics.areEqual(this.title, interestChooseGenderUi.title) && Intrinsics.areEqual(this.icon, interestChooseGenderUi.icon) && this.isSelected == interestChooseGenderUi.isSelected && this.isDefaultSelected == interestChooseGenderUi.isDefaultSelected;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Override // Fo0.c
    @NotNull
    public Long getId() {
        return Long.valueOf(this.id);
    }

    @Override // Fo0.c
    @Nullable
    public String getName() {
        return this.title;
    }

    @Override // Fo0.c
    public boolean getReportable() {
        return true;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.title;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.icon;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return Boolean.hashCode(this.isDefaultSelected) + z.a(((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31, 31, this.isSelected);
    }

    public final boolean isDefaultSelected() {
        return this.isDefaultSelected;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public final InterestChooseGender toOrigin() {
        return new InterestChooseGender(getId().longValue(), this.isSelected, 184, this.title, this.icon);
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.title;
        String str2 = this.icon;
        boolean z6 = this.isSelected;
        boolean z7 = this.isDefaultSelected;
        StringBuilder sbA = n.a(j7, "InterestChooseGenderUi(id=", ", title=", str);
        cf.n.a(", icon=", str2, ", isSelected=", sbA, z6);
        sbA.append(", isDefaultSelected=");
        sbA.append(z7);
        sbA.append(")");
        return sbA.toString();
    }
}
