package com.bilibili.search2.result.ogv.aggregate;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.upper.module.contribute.report.UpperPublishReportHome;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.PartitionTagTopicActivity;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionAFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagAFragment;
import com.mall.ui.page.create3.MallOrderCrossStoreDialogFragment;
import java.util.LinkedHashMap;
import kotlin.reflect.KProperty;
import xI0.C8962a;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/l.class */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f88365b;

    public /* synthetic */ l(int i7, LifecycleOwner lifecycleOwner) {
        this.f88364a = i7;
        this.f88365b = lifecycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C8962a c8962aX6;
        switch (this.f88364a) {
            case 0:
                o.B0((o) this.f88365b, false, false, false, 7);
                break;
            case 1:
                PartitionTagAFragment partitionTagAFragment = (PartitionTagAFragment) this.f88365b;
                if (partitionTagAFragment.f113776j != null) {
                    zG0.a.r();
                    a.a aVar = a.a.a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    com.bilibili.studio.comm.manager.v.a(linkedHashMap);
                    tw0.f.f127691a.d(false, "creation.new-publish.zone-tag.choose-zone.click", linkedHashMap);
                    TextView textView = partitionTagAFragment.f113769b;
                    if (textView != null) {
                        String string = textView.getText().toString();
                        if (TextUtils.equals(string, partitionTagAFragment.f113769b.getContext().getString(2131851432))) {
                            TE0.b.f24088a.getClass();
                            TE0.b.R(0L, "");
                        } else {
                            zG0.a.r();
                            a.a aVar2 = a.a.a;
                            UpperPublishReportHome.E(0L, string);
                            TE0.b.f24088a.getClass();
                            TE0.b.R(0L, string);
                        }
                    }
                    PartitionTagTopicActivity partitionTagTopicActivity = partitionTagAFragment.f113776j;
                    if (partitionTagTopicActivity.f113729N != null) {
                        C8962a c8962aX62 = partitionTagTopicActivity.X6();
                        if (!c8962aX62.f129145n) {
                            PageViewTracker.end("creation.partition-lable.0.0.pv", c8962aX62.f129148q, "", null);
                        }
                        partitionTagTopicActivity.f113729N.setCurrentItem(1, true);
                        partitionTagTopicActivity.f113726K.setVisibility(4);
                        partitionTagTopicActivity.f113727L.setVisibility(8);
                        partitionTagTopicActivity.f113728M.setVisibility(8);
                        PartitionAFragment partitionAFragment = partitionTagTopicActivity.f113732Q;
                        if (partitionAFragment != null && partitionAFragment.isAdded() && (c8962aX6 = partitionTagTopicActivity.X6()) != null) {
                            partitionTagTopicActivity.f113732Q.jf(c8962aX6.g().childTypeId);
                            break;
                        }
                    }
                }
                break;
            default:
                MallOrderCrossStoreDialogFragment mallOrderCrossStoreDialogFragment = this.f88365b;
                KProperty[] kPropertyArr = MallOrderCrossStoreDialogFragment.v;
                mallOrderCrossStoreDialogFragment.qf();
                break;
        }
    }
}
