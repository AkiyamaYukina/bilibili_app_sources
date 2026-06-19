package com.bilibili.pegasus.components.interest.ui.v32.page;

import bF0.A1;
import bF0.C4949D;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseItemUi;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumChooseContainerFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.PartitionTagActivity;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagFragment;
import com.bilibili.upper.widget.statelayout.StateLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vI0.AbstractC8790a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/n.class */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76691b;

    public /* synthetic */ n(Object obj, int i7) {
        this.f76690a = i7;
        this.f76691b = obj;
    }

    public final Object invoke(Object obj) {
        PartitionFragment partitionFragment;
        Object obj2 = this.f76691b;
        switch (this.f76690a) {
            case 0:
                InterestChooseItemUi interestChooseItemUi = (InterestChooseItemUi) obj;
                InterestChooseV32PageViewModel interestChooseV32PageViewModelHf = ((InterestChooseV32ThirdTab) obj2).hf();
                if (interestChooseV32PageViewModelHf != null) {
                    interestChooseV32PageViewModelHf.I0(new Actions.a.e(interestChooseItemUi));
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                AlbumChooseContainerFragment albumChooseContainerFragment = (AlbumChooseContainerFragment) obj2;
                if (!albumChooseContainerFragment.isDetached() && albumChooseContainerFragment.isAdded() && bool != null) {
                    albumChooseContainerFragment.tf(bool.booleanValue());
                }
                Unit unit = Unit.INSTANCE;
                break;
            case 2:
                ((com.mall.logic.page.history.f) obj2).n.setValue(Boolean.FALSE);
                break;
            default:
                AbstractC8790a abstractC8790a = (AbstractC8790a) obj;
                int i7 = PartitionTagActivity.f113714Q;
                boolean zAreEqual = Intrinsics.areEqual(abstractC8790a, AbstractC8790a.d.f128170b);
                PartitionTagActivity partitionTagActivity = (PartitionTagActivity) obj2;
                if (zAreEqual) {
                    PartitionTagFragment partitionTagFragment = partitionTagActivity.f113717M;
                    if (partitionTagFragment != null) {
                        A1 a12 = partitionTagFragment.f113787d;
                        StateLayout stateLayout = a12 != null ? a12.f54599c : null;
                        if (stateLayout != null) {
                            stateLayout.c();
                            PartitionTagFragment partitionTagFragment2 = partitionTagActivity.f113717M;
                            if (partitionTagFragment2 != null) {
                                partitionTagFragment2.lf(stateLayout.getLoadingView());
                            }
                        }
                    }
                } else if (Intrinsics.areEqual(abstractC8790a, AbstractC8790a.C1365a.f128167b)) {
                    C4949D c4949d = partitionTagActivity.f113715K;
                    if (c4949d != null) {
                        c4949d.f54682f.setCurrentItem(1, true);
                    }
                    C4949D c4949d2 = partitionTagActivity.f113715K;
                    if (c4949d2 != null) {
                        c4949d2.f54681e.setVisibility(4);
                    }
                    C4949D c4949d3 = partitionTagActivity.f113715K;
                    if (c4949d3 != null) {
                        c4949d3.f54679c.setVisibility(8);
                    }
                    C4949D c4949d4 = partitionTagActivity.f113715K;
                    if (c4949d4 != null) {
                        c4949d4.f54680d.setVisibility(8);
                    }
                    PartitionFragment partitionFragment2 = partitionTagActivity.f113718N;
                    if (partitionFragment2 != null && partitionFragment2.isAdded() && (partitionFragment = partitionTagActivity.f113718N) != null) {
                        partitionFragment.jf(partitionTagActivity.U6().f246m.getChildTypeId());
                    }
                } else if (Intrinsics.areEqual(abstractC8790a, AbstractC8790a.b.f128168b)) {
                    partitionTagActivity.V6();
                } else if (Intrinsics.areEqual(abstractC8790a, AbstractC8790a.c.f128169b)) {
                    partitionTagActivity.V6();
                    partitionTagActivity.U6().O0(partitionTagActivity, false);
                    partitionTagActivity.U6().K0();
                    PartitionTagFragment partitionTagFragment3 = partitionTagActivity.f113717M;
                    if (partitionTagFragment3 != null) {
                        partitionTagFragment3.nf();
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
