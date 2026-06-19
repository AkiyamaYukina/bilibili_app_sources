package com.bilibili.pegasus.recommendlabel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.recommendlabel.data.Label;
import com.bilibili.pegasus.recommendlabel.data.RecommendLabelMoreResponse;
import com.bilibili.pegasus.recommendlabel.data.UinterestDistributionMaterial;
import com.bilibili.pegasus.recommendlabel.data.UinterestMngPageMaterial;
import com.bilibili.pegasus.recommendlabel.data.UinterestPageMaterial;
import h6.C7417v;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/f0.class */
@StabilityInferred(parameters = 0)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<Label> f78705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<Label> f78706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<C5738g> f78707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final UinterestPageMaterial f78708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final UinterestDistributionMaterial f78709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final UinterestMngPageMaterial f78710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RecommendLabelPageStatus f78711g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final RecommendLabelMoreResponse f78712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<C5740i> f78713j;

    public f0() {
        this(0);
    }

    public /* synthetic */ f0(int i7) {
        this(null, null, null, null, null, null, RecommendLabelPageStatus.IDLE, 0, null, null);
    }

    public f0(@Nullable List<Label> list, @Nullable List<Label> list2, @Nullable List<C5738g> list3, @Nullable UinterestPageMaterial uinterestPageMaterial, @Nullable UinterestDistributionMaterial uinterestDistributionMaterial, @Nullable UinterestMngPageMaterial uinterestMngPageMaterial, @NotNull RecommendLabelPageStatus recommendLabelPageStatus, int i7, @Nullable RecommendLabelMoreResponse recommendLabelMoreResponse, @Nullable List<C5740i> list4) {
        this.f78705a = list;
        this.f78706b = list2;
        this.f78707c = list3;
        this.f78708d = uinterestPageMaterial;
        this.f78709e = uinterestDistributionMaterial;
        this.f78710f = uinterestMngPageMaterial;
        this.f78711g = recommendLabelPageStatus;
        this.h = i7;
        this.f78712i = recommendLabelMoreResponse;
        this.f78713j = list4;
    }

    public static f0 a(f0 f0Var, List list, List list2, List list3, UinterestPageMaterial uinterestPageMaterial, UinterestDistributionMaterial uinterestDistributionMaterial, UinterestMngPageMaterial uinterestMngPageMaterial, RecommendLabelPageStatus recommendLabelPageStatus, int i7, RecommendLabelMoreResponse recommendLabelMoreResponse, List list4, int i8) {
        if ((i8 & 1) != 0) {
            list = f0Var.f78705a;
        }
        if ((i8 & 2) != 0) {
            list2 = f0Var.f78706b;
        }
        if ((i8 & 4) != 0) {
            list3 = f0Var.f78707c;
        }
        if ((i8 & 8) != 0) {
            uinterestPageMaterial = f0Var.f78708d;
        }
        if ((i8 & 16) != 0) {
            uinterestDistributionMaterial = f0Var.f78709e;
        }
        if ((i8 & 32) != 0) {
            uinterestMngPageMaterial = f0Var.f78710f;
        }
        if ((i8 & 64) != 0) {
            recommendLabelPageStatus = f0Var.f78711g;
        }
        if ((i8 & 128) != 0) {
            i7 = f0Var.h;
        }
        if ((i8 & 256) != 0) {
            recommendLabelMoreResponse = f0Var.f78712i;
        }
        if ((i8 & 512) != 0) {
            list4 = f0Var.f78713j;
        }
        f0Var.getClass();
        return new f0(list, list2, list3, uinterestPageMaterial, uinterestDistributionMaterial, uinterestMngPageMaterial, recommendLabelPageStatus, i7, recommendLabelMoreResponse, list4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(this.f78705a, f0Var.f78705a) && Intrinsics.areEqual(this.f78706b, f0Var.f78706b) && Intrinsics.areEqual(this.f78707c, f0Var.f78707c) && Intrinsics.areEqual(this.f78708d, f0Var.f78708d) && Intrinsics.areEqual(this.f78709e, f0Var.f78709e) && Intrinsics.areEqual(this.f78710f, f0Var.f78710f) && this.f78711g == f0Var.f78711g && this.h == f0Var.h && Intrinsics.areEqual(this.f78712i, f0Var.f78712i) && Intrinsics.areEqual(this.f78713j, f0Var.f78713j);
    }

    public final int hashCode() {
        List<Label> list = this.f78705a;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<Label> list2 = this.f78706b;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<C5738g> list3 = this.f78707c;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        UinterestPageMaterial uinterestPageMaterial = this.f78708d;
        int iHashCode4 = uinterestPageMaterial == null ? 0 : uinterestPageMaterial.hashCode();
        UinterestDistributionMaterial uinterestDistributionMaterial = this.f78709e;
        int iHashCode5 = uinterestDistributionMaterial == null ? 0 : uinterestDistributionMaterial.hashCode();
        UinterestMngPageMaterial uinterestMngPageMaterial = this.f78710f;
        int iA = androidx.compose.animation.core.I.a(this.h, (this.f78711g.hashCode() + (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (uinterestMngPageMaterial == null ? 0 : uinterestMngPageMaterial.hashCode())) * 31)) * 31, 31);
        RecommendLabelMoreResponse recommendLabelMoreResponse = this.f78712i;
        int iHashCode6 = recommendLabelMoreResponse == null ? 0 : recommendLabelMoreResponse.hashCode();
        List<C5740i> list4 = this.f78713j;
        return ((iA + iHashCode6) * 31) + (list4 == null ? 0 : list4.hashCode());
    }

    @NotNull
    public final String toString() {
        List<Label> list = this.f78705a;
        List<Label> list2 = this.f78706b;
        List<C5738g> list3 = this.f78707c;
        List<C5740i> list4 = this.f78713j;
        StringBuilder sbA = C7417v.a("RecommendLabelState(myPinedFavorites=", ", guessFavorites=", ", favoriteSelection=", list, list2);
        sbA.append(list3);
        sbA.append(", uinterestPageMaterial=");
        sbA.append(this.f78708d);
        sbA.append(", uinterestDistributionMaterial=");
        sbA.append(this.f78709e);
        sbA.append(", uinterestMngPageMaterial=");
        sbA.append(this.f78710f);
        sbA.append(", status=");
        sbA.append(this.f78711g);
        sbA.append(", navigationHeight=");
        sbA.append(this.h);
        sbA.append(", moreResponse=");
        sbA.append(this.f78712i);
        sbA.append(", moreLabels=");
        sbA.append(list4);
        sbA.append(")");
        return sbA.toString();
    }
}
