package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import W60.N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.PartitionTagTopicActivity;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.BottomSheetRecyclerView;
import uI0.C8714c;
import uI0.C8716e;
import xI0.C8962a;
import zG0.a;
import zI0.C9165a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionAFragment.class */
public class PartitionAFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PartitionTagTopicActivity f113751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BottomSheetRecyclerView f113752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BottomSheetRecyclerView f113753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C8962a f113754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113755f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C8714c f113756g;
    public C8716e h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C9165a f113757i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionAFragment$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartitionAFragment f113758a;

        public a(PartitionAFragment partitionAFragment) {
            this.f113758a = partitionAFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PartitionTagTopicActivity partitionTagTopicActivity = this.f113758a.f113751b;
            if (partitionTagTopicActivity != null) {
                partitionTagTopicActivity.V6();
                String strE = this.f113758a.f113754e.e();
                zG0.a.r();
                a.a aVar = a.a.a;
                zG0.h.n(strE);
            }
        }
    }

    public final void jf(long j7) {
        C8714c c8714c;
        if (this.f113757i == null || (c8714c = this.f113756g) == null || this.h == null || this.f113752c == null || this.f113753d == null) {
            return;
        }
        int iO = c8714c.O(r0.a(j7));
        RecyclerView.LayoutManager layoutManager = this.f113752c.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(iO, 0);
        }
        int iO2 = this.h.O(j7);
        RecyclerView.LayoutManager layoutManager2 = this.f113753d.getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager2).scrollToPositionWithOffset(iO2, 0);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        PartitionTagTopicActivity partitionTagTopicActivity = this.f113751b;
        if (partitionTagTopicActivity != null) {
            this.f113754e = partitionTagTopicActivity.X6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494239, viewGroup, false);
        this.f113752c = (BottomSheetRecyclerView) viewInflate.findViewById(2131310041);
        this.f113753d = (BottomSheetRecyclerView) viewInflate.findViewById(2131310047);
        return viewInflate;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        C8962a c8962a = this.f113754e;
        if (c8962a == null) {
            return;
        }
        long j7 = c8962a.g().childTypeId;
        this.f113757i = new C9165a(this.f113754e.f129134b);
        this.f113756g = new C8714c(this.f113754e.f129134b);
        this.f113752c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f113752c.setAdapter(this.f113756g);
        this.f113752c.setNestedScrollingEnabled(true);
        C9165a c9165a = this.f113757i;
        this.h = new C8716e(c9165a.b(c9165a.a(j7)));
        this.f113753d.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f113753d.setAdapter(this.h);
        this.f113753d.setNestedScrollingEnabled(true);
        this.f113756g.f127801c = new N(this);
        this.h.f127809b = new com.bilibili.upper.module.partitionTag.partitionTopic.fragment.a(this);
        view.findViewById(2131315784).setOnClickListener(new a(this));
        jf(j7);
    }
}
