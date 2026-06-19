package com.bilibili.pegasus.components.interest.ui.udf.model;

import Fo0.c;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.util.C4638g;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/model/InterestChooseAgeUi.class */
@StabilityInferred(parameters = 1)
@Keep
public final class InterestChooseAgeUi implements c {
    public static final int $stable = 0;
    private final long id;
    private final boolean isDefaultSelected;
    private final boolean isSelected;

    @Nullable
    private final String title;

    public InterestChooseAgeUi() {
        this(0L, null, false, false, 15, null);
    }

    public InterestChooseAgeUi(long j7, @Nullable String str, boolean z6, boolean z7) {
        this.id = j7;
        this.title = str;
        this.isSelected = z6;
        this.isDefaultSelected = z7;
    }

    public /* synthetic */ InterestChooseAgeUi(long j7, String str, boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? false : z6, (i7 & 8) != 0 ? false : z7);
    }

    public static /* synthetic */ InterestChooseAgeUi copy$default(InterestChooseAgeUi interestChooseAgeUi, long j7, String str, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = interestChooseAgeUi.id;
        }
        if ((i7 & 2) != 0) {
            str = interestChooseAgeUi.title;
        }
        if ((i7 & 4) != 0) {
            z6 = interestChooseAgeUi.isSelected;
        }
        if ((i7 & 8) != 0) {
            z7 = interestChooseAgeUi.isDefaultSelected;
        }
        return interestChooseAgeUi.copy(j7, str, z6, z7);
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final boolean component4() {
        return this.isDefaultSelected;
    }

    @NotNull
    public final InterestChooseAgeUi copy(long j7, @Nullable String str, boolean z6, boolean z7) {
        return new InterestChooseAgeUi(j7, str, z6, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseAgeUi)) {
            return false;
        }
        InterestChooseAgeUi interestChooseAgeUi = (InterestChooseAgeUi) obj;
        return this.id == interestChooseAgeUi.id && Intrinsics.areEqual(this.title, interestChooseAgeUi.title) && this.isSelected == interestChooseAgeUi.isSelected && this.isDefaultSelected == interestChooseAgeUi.isDefaultSelected;
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
        return Boolean.hashCode(this.isDefaultSelected) + z.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected);
    }

    public final boolean isDefaultSelected() {
        return this.isDefaultSelected;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public final InterestChooseAge toOrigin() {
        return new InterestChooseAge(getId().longValue(), 44, this.title, this.isSelected);
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.title;
        boolean z6 = this.isSelected;
        boolean z7 = this.isDefaultSelected;
        StringBuilder sbA = n.a(j7, "InterestChooseAgeUi(id=", ", title=", str);
        C4638g.b(", isSelected=", ", isDefaultSelected=", sbA, z6, z7);
        sbA.append(")");
        return sbA.toString();
    }
}
