package com.bilibili.upper.module.draft.fragment;

import WH0.o;
import WQ.J2;
import XH0.d;
import Xz0.g;
import Xz0.j;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.biligame.router.k;
import com.bilibili.bplus.followingcard.widget.SpecialPagerSlidingTabStrip;
import com.bilibili.bplus.followinglist.detail.DynamicDetailFragment;
import com.bilibili.bplus.followinglist.detail.repost.h;
import com.bilibili.bus.Violet;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.upper.module.draft.bean.DraftItemBean;
import com.bilibili.upper.module.draft.fragment.DraftsFragmentV3;
import com.bilibili.upper.module.draft.vm.DraftViewModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tw0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/fragment/DraftsFragmentV3.class */
public class DraftsFragmentV3 extends DraftBaseFragment implements IPvTracker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f113117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public DraftViewModel f113118g;
    public final Bundle h = new Bundle();

    public static DraftsFragmentV3 lf(int i7, int i8, boolean z6) {
        Bundle bundleA = k.a(i7, i8, "jump_from", "show_type");
        bundleA.putBoolean("RELATION_FROM", z6);
        DraftsFragmentV3 draftsFragmentV3 = new DraftsFragmentV3();
        draftsFragmentV3.setArguments(bundleA);
        return draftsFragmentV3;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "creation.drafts.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        return this.h;
    }

    public final void mf() {
        o oVar = this.f113117f;
        if (oVar != null) {
            oVar.f26554g = false;
        }
        DraftViewModel draftViewModel = this.f113118g;
        if (draftViewModel != null) {
            draftViewModel.J0(true);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f113108c = arguments.getInt("jump_from");
            this.f113109d = arguments.getInt("show_type");
            this.f113110e = arguments.getBoolean("RELATION_FROM");
        }
        this.h.putString("first_entrance", j.a("first_entrance"));
        this.h.putString("matter_num", "0");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DraftViewModel draftViewModel = this.f113118g;
        if (draftViewModel != null) {
            draftViewModel.N0();
        }
    }

    @Override // com.bilibili.lib.ui.BaseRecyclerViewFragment
    public final void onViewCreated(RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.onViewCreated(recyclerView, bundle);
        this.f113117f = new o(this);
        int iKf = kf();
        this.f113107b = iKf;
        if (1 == iKf) {
            recyclerView.setBackgroundColor(-15987700);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        o oVar = this.f113117f;
        oVar.f26550c = this.f113107b;
        recyclerView.setAdapter(oVar);
        o oVar2 = this.f113117f;
        oVar2.f26551d = new d(this);
        oVar2.f26552e = new d(this);
        DraftViewModel draftViewModel = new DraftViewModel();
        this.f113118g = draftViewModel;
        draftViewModel.K0(p3());
        final int i7 = 0;
        this.f113118g.f113119b.observe(getViewLifecycleOwner(), new Observer(this, i7) { // from class: XH0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BaseFragment f28142b;

            {
                this.f28141a = i7;
                this.f28142b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (this.f28141a) {
                    case 0:
                        List<DraftItemBean> list = (List) obj;
                        DraftsFragmentV3 draftsFragmentV3 = (DraftsFragmentV3) this.f28142b;
                        if (list != null) {
                            draftsFragmentV3.getClass();
                            if (list.size() != 0) {
                                draftsFragmentV3.hideErrorTips();
                                o oVar3 = draftsFragmentV3.f113117f;
                                oVar3.f26548a = list;
                                oVar3.notifyDataSetChanged();
                                draftsFragmentV3.jf(list);
                            }
                        }
                        o oVar4 = draftsFragmentV3.f113117f;
                        oVar4.f26548a = null;
                        oVar4.notifyDataSetChanged();
                        draftsFragmentV3.showEmptyTips(2131851195, 2131235613);
                        break;
                    default:
                        DynamicDetailFragment dynamicDetailFragment = this.f28142b;
                        com.bilibili.bplus.followinglist.detail.repost.b bVar = dynamicDetailFragment.d;
                        if (bVar != null) {
                            Violet.INSTANCE.sendMsg(new h(dynamicDetailFragment.pf().c, dynamicDetailFragment.pf().e, dynamicDetailFragment.pf().d));
                            bVar.b++;
                            J2 j2Q0 = dynamicDetailFragment.pf().Q0();
                            if (j2Q0 != null) {
                                j2Q0.j = bVar.b;
                            }
                            SpecialPagerSlidingTabStrip specialPagerSlidingTabStripOf = dynamicDetailFragment.of();
                            if (specialPagerSlidingTabStripOf != null) {
                                specialPagerSlidingTabStripOf.d();
                            }
                            dynamicDetailFragment.Cf();
                        }
                        com.bilibili.bplus.followinglist.interaction.a aVar = dynamicDetailFragment.g;
                        if (aVar != null) {
                            aVar.b++;
                            J2 j2Q02 = dynamicDetailFragment.pf().Q0();
                            if (j2Q02 != null) {
                                j2Q02.j = aVar.b;
                            }
                            SpecialPagerSlidingTabStrip specialPagerSlidingTabStripOf2 = dynamicDetailFragment.of();
                            if (specialPagerSlidingTabStripOf2 != null) {
                                specialPagerSlidingTabStripOf2.d();
                            }
                            dynamicDetailFragment.Cf();
                        }
                        break;
                }
            }
        });
        this.f113118g.f113124g.observe(getViewLifecycleOwner(), new Observer(this) { // from class: XH0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DraftsFragmentV3 f28143a;

            {
                this.f28143a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Integer num = (Integer) obj;
                DraftsFragmentV3 draftsFragmentV3 = this.f28143a;
                draftsFragmentV3.f113117f.f26554g = true;
                draftsFragmentV3.h.putString("matter_num", String.valueOf(num));
                int iIntValue = num == null ? 0 : num.intValue();
                j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                j.c("router_topic_id", g.f28463b);
                Map mapB = j.b(Xz0.k.f28474a);
                ((HashMap) mapB).put("draft_num", String.valueOf(iIntValue));
                f.e("creation.drafts.0.0.show", mapB);
            }
        });
        mf();
    }
}
