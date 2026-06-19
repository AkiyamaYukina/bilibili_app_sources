package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import BI0.f;
import W60.a0;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.mall.kmm.order.model.MallOrderInfoActionType;
import com.bilibili.search2.result.ogv.aggregate.l;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.upper.api.bean.Child;
import com.bilibili.upper.api.bean.TypeMeta;
import com.bilibili.upper.api.bean.archive.UpperRcmdTagBean;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partition.model.UpperPartitionTagParam;
import com.bilibili.upper.module.partitionTag.partition.model.UpperTagBean;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.PartitionTagTopicActivity;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.RecommendTagGroup;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.SelectedTagGroup;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.XLinearLayoutManager;
import com.bilibili.upper.widget.statelayout.StateLayout;
import com.mall.ui.page.create3.MallOrderCrossStoreDialogFragment;
import com.mall.ui.page.create3.module.r;
import fh0.C7057C;
import fh0.C7088h0;
import jJ0.C7653b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.KProperty;
import tv.danmaku.bili.ui.main2.mine.HomeUserCenterFragment;
import xI0.C8962a;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionTagAFragment.class */
public class PartitionTagAFragment extends BaseFragment implements f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f113769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f113770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f113771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SelectedTagGroup f113772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecommendTagGroup f113773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f113774g;
    public uI0.g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f113775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PartitionTagTopicActivity f113776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Typeface f113777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C8962a f113778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public StateLayout f113779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public StateLayout f113780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<UpperPublishTopicBean.Topic> f113781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f113782p = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionTagAFragment$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartitionTagAFragment f113783a;

        public a(PartitionTagAFragment partitionTagAFragment) {
            this.f113783a = partitionTagAFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionTagAFragment$b.class */
    public final class b extends C7653b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PartitionTagAFragment f113784b;

        public b(PartitionTagAFragment partitionTagAFragment) {
            this.f113784b = partitionTagAFragment;
        }

        @Override // jJ0.C7653b
        public final void onLastItemVisible() {
            C8962a c8962a = this.f113784b.f113778l;
            if (c8962a != null) {
                c8962a.i(false);
            }
        }
    }

    @Override // BI0.f.a
    public final void U0(String str) {
        C8962a c8962a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TE0.b.f24088a.getClass();
        TE0.b.I(str);
        if (jf(false) || (c8962a = this.f113778l) == null) {
            return;
        }
        if (c8962a.g().containTag(str)) {
            ToastHelper.showToastShort(getApplicationContext(), 2131851370);
            return;
        }
        List<UpperRcmdTagBean> list = this.f113778l.f129136d;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() > 0) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    String str2 = ((UpperRcmdTagBean) arrayList.get(i7)).tag;
                    if (str.equals(str2)) {
                        this.f113778l.b(0L, 0L, 0, true, str2);
                        kf();
                        this.f113773f.e(str2, true);
                        return;
                    }
                }
            }
        }
        this.f113778l.f129147p.b(str);
    }

    public final boolean jf(boolean z6) {
        boolean z7;
        C8962a c8962a = this.f113778l;
        if (c8962a == null || ((z6 && c8962a.f129135c.topicId != 0) || c8962a.f129135c.getTags().size() < c8962a.f())) {
            z7 = false;
        } else {
            PartitionTagTopicActivity partitionTagTopicActivity = c8962a.f129133a;
            ToastHelper.showToastShort(partitionTagTopicActivity, partitionTagTopicActivity.getResources().getQuantityString(2131689775, c8962a.f(), Integer.valueOf(c8962a.f())));
            z7 = true;
        }
        return z7;
    }

    public final void kf() {
        if (this.f113778l == null || getContext() == null) {
            return;
        }
        List<String> textTags = this.f113778l.g().getTextTags();
        m.h(textTags);
        boolean z6 = this.f113778l.g().topicId != 0;
        boolean zD = this.f113778l.d();
        ArrayList arrayList = new ArrayList();
        if (textTags == null || textTags.size() <= 0) {
            this.f113770c.setVisibility(8);
            this.f113771d.setVisibility(0);
        } else {
            int iF = this.f113778l.f() - textTags.size();
            int i7 = iF;
            if (iF < 0) {
                i7 = 0;
            }
            this.f113770c.setText(getString(2131851454, Integer.valueOf(i7)));
            for (int i8 = 0; i8 < textTags.size(); i8++) {
                if (i8 == 0 && z6) {
                    arrayList.add(new SelectedTagGroup.a(textTags.get(i8), zD));
                } else {
                    arrayList.add(new SelectedTagGroup.a(textTags.get(i8)));
                }
            }
            this.f113770c.setVisibility(0);
            this.f113771d.setVisibility(8);
        }
        this.f113772e.c(arrayList);
    }

    public final String lf(long j7) {
        if (getContext() == null) {
            return null;
        }
        String string = getString(2131851432);
        C8962a c8962a = this.f113778l;
        if (c8962a == null) {
            return string;
        }
        for (TypeMeta typeMeta : c8962a.f129134b) {
            List<Child> list = typeMeta.children;
            if (list != null) {
                for (Child child : list) {
                    if (j7 == child.id) {
                        return typeMeta.name + "-" + child.name;
                    }
                }
            }
        }
        return string;
    }

    public final void mf() {
        int i7;
        C8962a c8962a = this.f113778l;
        if (c8962a != null && c8962a.f129143l && c8962a.f129144m) {
            UpperPartitionTagParam upperPartitionTagParamG = c8962a.g();
            if (upperPartitionTagParamG.needToReplacePartitionRecommendTags()) {
                C8962a c8962a2 = this.f113778l;
                if (c8962a2.f129138f == null) {
                    c8962a2.f129138f = new ArrayList();
                }
                List<UpperTagBean> list = c8962a2.f129138f;
                List<UpperTagBean> tags = upperPartitionTagParamG.getTags(true);
                int size = tags.size();
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.size() + size <= this.f113778l.f()) {
                    upperPartitionTagParamG.setTags(tags);
                    Iterator<UpperTagBean> it = tags.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = 0;
                            break;
                        }
                        UpperTagBean next = it.next();
                        if (next != null && next.isTopicTag) {
                            i7 = 1;
                            break;
                        }
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        UpperTagBean upperTagBean = (UpperTagBean) arrayList.get(size2);
                        if (upperTagBean != null) {
                            C8962a c8962a3 = this.f113778l;
                            UpperTagBean upperTagBeanCopy = upperTagBean.copy();
                            c8962a3.getClass();
                            if (upperTagBeanCopy != null && !TextUtils.isEmpty(upperTagBeanCopy.tagText)) {
                                c8962a3.f129135c.addTag(i7, upperTagBeanCopy);
                            }
                            String str = m.a;
                            String str2 = upperTagBean.tagText;
                            if (str2 != null) {
                                m.a(str2, m.c);
                            }
                        }
                    }
                }
            }
            uI0.g gVar = this.h;
            List<UpperPublishTopicBean.Topic> list2 = this.f113781o;
            if (this.f113782p) {
                ((ArrayList) gVar.h).clear();
                gVar.notifyDataSetChanged();
            } else {
                gVar.getClass();
            }
            if (list2 != null) {
                if (list2.size() > 0) {
                    ((ArrayList) gVar.h).addAll(list2);
                }
                gVar.notifyDataSetChanged();
            }
            this.h.P(upperPartitionTagParamG.topicId);
            this.f113780n.setVisibility(8);
            this.f113781o = null;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) this.f113778l.f129136d;
            if (arrayList3.size() > 0) {
                ArrayList arrayList4 = new ArrayList();
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    UpperRcmdTagBean upperRcmdTagBean = (UpperRcmdTagBean) arrayList3.get(i8);
                    if (upperRcmdTagBean != null) {
                        String str3 = upperRcmdTagBean.tag;
                        C8962a c8962a4 = this.f113778l;
                        arrayList2.add(new RecommendTagGroup.b(str3, c8962a4 == null ? false : c8962a4.g().containTag(str3)));
                        arrayList4.add(upperRcmdTagBean.tag);
                    }
                }
                m.f(arrayList4);
            }
            arrayList2.add(new RecommendTagGroup.b("", false));
            this.f113773f.c(arrayList2);
            ArrayList arrayList5 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int size3 = arrayList2.size();
            for (int i9 = 0; i9 < size3; i9++) {
                RecommendTagGroup.b bVar = (RecommendTagGroup.b) arrayList2.get(i9);
                if (bVar != null) {
                    String str4 = bVar.f113878a;
                    arrayList5.add(str4);
                    sb.append(str4);
                    if (i9 != size3 - 1) {
                        sb.append(",");
                    }
                }
            }
            String string = this.f113769b.getText().toString();
            String str5 = TextUtils.equals(string, this.f113769b.getContext().getString(2131851432)) ? "" : string;
            TE0.b.f24088a.getClass();
            TE0.b.Q(0L, arrayList5, str5);
            zG0.a.r();
            a.a aVar = a.a.a;
            zG0.h.k(0, str5, sb.toString(), String.valueOf(upperPartitionTagParamG.topicId), upperPartitionTagParamG.topicName);
            this.f113779m.a();
            kf();
        }
    }

    public final void nf(boolean z6, String str, boolean z7, List list) {
        StateLayout stateLayout;
        if (!z6) {
            ToastHelper.showToastShort(getApplicationContext(), str);
            if (!z7 || (stateLayout = this.f113780n) == null) {
                return;
            }
            stateLayout.b();
            this.f113780n.setVisibility(0);
            return;
        }
        C8962a c8962a = this.f113778l;
        if (c8962a != null) {
            c8962a.f129144m = true;
            this.f113781o = list;
            this.f113782p = z7;
            mf();
        }
    }

    public final void of(String str, boolean z6) {
        if (!z6) {
            ToastHelper.showToastShort(getApplicationContext(), str);
            this.f113779m.b();
            pf(this.f113779m.getErrorView());
        } else {
            C8962a c8962a = this.f113778l;
            if (c8962a != null) {
                c8962a.f129143l = true;
                mf();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (intent == null || i7 != 1) {
            return;
        }
        String stringExtra = intent.getStringExtra(CaptureSchema.TOPIC_NAME);
        boolean booleanExtra = intent.getBooleanExtra("is_created_topic", false);
        long longExtra = intent.getLongExtra(CaptureSchema.TOPIC_ID, 0L);
        long longExtra2 = intent.getLongExtra(CaptureSchema.MISSION_ID, 0L);
        if (this.f113778l != null && longExtra != 0) {
            if (jf(false)) {
                return;
            }
            this.f113778l.b(longExtra, longExtra2, booleanExtra ? 3 : 2, false, stringExtra);
            kf();
            uI0.g gVar = this.h;
            if (gVar != null) {
                gVar.N();
                this.h.P(this.f113778l.g().topicId);
            }
        }
        String stringExtra2 = intent.getStringExtra("topic_user_tips");
        if (TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        PartitionTagTopicActivity partitionTagTopicActivity = this.f113776j;
        partitionTagTopicActivity.getClass();
        ToastHelper.showToast(partitionTagTopicActivity, stringExtra2, 3000);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        PartitionTagTopicActivity partitionTagTopicActivity = this.f113776j;
        if (partitionTagTopicActivity != null) {
            this.f113777k = Typeface.createFromAsset(partitionTagTopicActivity.getAssets(), "upper_medium.otf");
            this.f113778l = this.f113776j.X6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494238, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        View viewFindViewById = view.findViewById(2131315857);
        TextView textView = (TextView) view.findViewById(2131315910);
        this.f113769b = (TextView) view.findViewById(2131315909);
        this.f113775i = (TextView) view.findViewById(2131315911);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131500669, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f113770c = (TextView) viewInflate.findViewById(2131315474);
        this.f113771d = (TextView) viewInflate.findViewById(2131315475);
        this.f113772e = (SelectedTagGroup) viewInflate.findViewById(2131315902);
        View viewFindViewById2 = viewInflate.findViewById(2131315899);
        C8962a c8962a = this.f113778l;
        if (c8962a != null && c8962a.d()) {
            viewFindViewById2.setVisibility(8);
        }
        viewFindViewById2.setOnClickListener(new XF0.k(this, 1));
        StateLayout stateLayout = (StateLayout) viewInflate.findViewById(2131312083);
        this.f113779m = stateLayout;
        this.f113773f = (RecommendTagGroup) stateLayout.findViewById(2131309895);
        this.f113780n = (StateLayout) view.findViewById(2131310756);
        textView.setTypeface(this.f113777k);
        ((TextView) viewInflate.findViewById(2131315901)).setTypeface(this.f113777k);
        ((TextView) viewInflate.findViewById(2131315900)).setTypeface(this.f113777k);
        viewFindViewById.setOnClickListener(new l(1, this));
        final int i7 = 0;
        this.f113779m.setOnRetryClickListener(new View.OnClickListener(i7, this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f113799a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final androidx_fragment_app_Fragment f113800b;

            {
                this.f113799a = i7;
                this.f113800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (this.f113799a) {
                    case 0:
                        C8962a c8962a2 = ((PartitionTagAFragment) this.f113800b).f113778l;
                        if (c8962a2 != null) {
                            c8962a2.h();
                        }
                        break;
                    case 1:
                        MallOrderCrossStoreDialogFragment mallOrderCrossStoreDialogFragment = this.f113800b;
                        KProperty[] kPropertyArr = MallOrderCrossStoreDialogFragment.v;
                        mallOrderCrossStoreDialogFragment.qf();
                        break;
                    default:
                        HomeUserCenterFragment homeUserCenterFragment = this.f113800b;
                        BLRouter.routeTo(RouteRequestKt.toRouteRequest(homeUserCenterFragment.B1), homeUserCenterFragment);
                        homeUserCenterFragment.B1 = Uri.parse("activity://personinfo/info").buildUpon().appendQueryParameter("from_campus_user", String.valueOf(false)).toString();
                        break;
                }
            }
        });
        this.f113779m.c();
        pf(this.f113779m.getLoadingView());
        final int i8 = 0;
        this.f113780n.setOnRetryClickListener(new View.OnClickListener(i8, this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f113801a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final androidx_fragment_app_Fragment f113802b;

            {
                this.f113801a = i8;
                this.f113802b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (this.f113801a) {
                    case 0:
                        C8962a c8962a2 = ((PartitionTagAFragment) this.f113802b).f113778l;
                        if (c8962a2 != null) {
                            c8962a2.i(true);
                        }
                        break;
                    default:
                        MallOrderCrossStoreDialogFragment mallOrderCrossStoreDialogFragment = this.f113802b;
                        KProperty[] kPropertyArr = MallOrderCrossStoreDialogFragment.v;
                        mallOrderCrossStoreDialogFragment.getClass();
                        Intent intent = new Intent();
                        int i9 = mallOrderCrossStoreDialogFragment.s;
                        if (i9 == MallOrderInfoActionType.ActionFloatSubsidy.ordinal()) {
                            r rVar = mallOrderCrossStoreDialogFragment.t;
                            if (rVar != null) {
                                Object obj = rVar.c;
                                C7088h0 c7088h0 = obj instanceof C7088h0 ? (C7088h0) obj : null;
                                intent.putExtra("extra_subsidy_is_selected", c7088h0 != null ? c7088h0.f118124c : null);
                                intent.putExtra("extra_transfer_model", mallOrderCrossStoreDialogFragment.r);
                            }
                        } else if (i9 == MallOrderInfoActionType.ActionFloatCoupon.ordinal()) {
                            r rVar2 = mallOrderCrossStoreDialogFragment.t;
                            if (rVar2 != null) {
                                Object obj2 = rVar2.c;
                                C7057C c7057c = obj2 instanceof C7057C ? (C7057C) obj2 : null;
                                intent.putExtra("extra_coupon_id_selected", c7057c != null ? c7057c.f117785f : null);
                                intent.putExtra("extra_transfer_model", mallOrderCrossStoreDialogFragment.r);
                            }
                        } else if (i9 == MallOrderInfoActionType.ActionFloatOrderExpenseDiscount.ordinal()) {
                            mallOrderCrossStoreDialogFragment.qf();
                        } else if (i9 == MallOrderInfoActionType.ActionFloatGoodsFold.ordinal()) {
                            mallOrderCrossStoreDialogFragment.qf();
                        }
                        FragmentActivity fragmentActivityP3 = mallOrderCrossStoreDialogFragment.p3();
                        if (fragmentActivityP3 != null) {
                            fragmentActivityP3.setResult(-1, intent);
                        }
                        FragmentActivity fragmentActivityP32 = mallOrderCrossStoreDialogFragment.p3();
                        if (fragmentActivityP32 != null) {
                            fragmentActivityP32.finish();
                        }
                        break;
                }
            }
        });
        this.f113780n.c();
        this.f113780n.setVisibility(0);
        uI0.g gVar = new uI0.g(getContext(), viewInflate);
        this.h = gVar;
        gVar.f127819b = new a(this);
        this.f113774g = (RecyclerView) view.findViewById(2131310623);
        XLinearLayoutManager xLinearLayoutManager = new XLinearLayoutManager(getContext());
        xLinearLayoutManager.setOrientation(1);
        this.f113774g.setLayoutManager(xLinearLayoutManager);
        this.f113774g.setAdapter(this.h);
        RecyclerView.ItemAnimator itemAnimator = this.f113774g.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
            itemAnimator.setChangeDuration(0L);
            itemAnimator.setMoveDuration(0L);
            itemAnimator.setRemoveDuration(0L);
            if (itemAnimator instanceof SimpleItemAnimator) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            }
        }
        this.f113774g.addOnScrollListener(new b(this));
        this.f113772e.setListener(new com.bilibili.biligame.cloudgame.v2.logic.hmy.f(this));
        this.f113773f.setListener(new a0(this));
        C8962a c8962a2 = this.f113778l;
        this.f113769b.setText(lf(c8962a2 != null ? c8962a2.g().childTypeId : -1L));
        m.e();
        kf();
        C8962a c8962a3 = this.f113778l;
        if (c8962a3 != null) {
            if (c8962a3.f129145n && c8962a3.f129146o) {
                viewFindViewById.setVisibility(8);
            }
            uI0.g gVar2 = this.h;
            C8962a c8962a4 = this.f113778l;
            boolean z6 = c8962a4.f129145n;
            boolean z7 = false;
            if (z6) {
                z7 = false;
                if (c8962a4.f129146o) {
                    z7 = false;
                    if (c8962a4.f129135c.archiveState != -2) {
                        z7 = true;
                    }
                }
            }
            boolean zD = c8962a4.d();
            gVar2.f127822e = z6;
            gVar2.f127823f = z7;
            gVar2.f127824g = zD;
            if (getContext() != null) {
                this.f113771d.setText(getContext().getString(2131851301, Integer.valueOf(this.f113778l.f())));
            }
        }
    }

    public final void pf(View view) {
        View viewFindViewById;
        if (view == null || (viewFindViewById = view.findViewById(2131299782)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new Hs.c(this, 2));
    }

    @Override // androidx.fragment.app.Fragment, BI0.f.a
    public final Activity x() {
        PartitionTagTopicActivity partitionTagTopicActivity = this.f113776j;
        partitionTagTopicActivity.getClass();
        return partitionTagTopicActivity;
    }
}
