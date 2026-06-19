package com.bilibili.upper.module.honour.ui;

import Jf1.h;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bI0.C5092e;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.upper.module.honour.bean.KingHonourBattleInfoBean;
import com.bilibili.upper.module.honour.bean.KingHonourGameBean;
import com.bilibili.upper.module.honour.bean.KingHonourGameItemBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import com.bilibili.upper.module.honour.net.KingHonourApiService;
import dI0.C6789D;
import dI0.C6791F;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourRecentBattleFragment.class */
@StabilityInferred(parameters = 0)
public final class KingHonourRecentBattleFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f113317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5092e f113318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewStub f113319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113320e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113321f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f113322g = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourRecentBattleFragment$a.class */
    public static final class a extends BiliApiDataCallback<KingHonourResponseBean<KingHonourBattleInfoBean>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KingHonourRecentBattleFragment f113323b;

        public a(KingHonourRecentBattleFragment kingHonourRecentBattleFragment) {
            this.f113323b = kingHonourRecentBattleFragment;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(KingHonourResponseBean<KingHonourBattleInfoBean> kingHonourResponseBean) {
            KingHonourBattleInfoBean kingHonourBattleInfoBean;
            KingHonourResponseBean<KingHonourBattleInfoBean> kingHonourResponseBean2 = kingHonourResponseBean;
            KingHonourRecentBattleFragment kingHonourRecentBattleFragment = this.f113323b;
            C5092e c5092e = kingHonourRecentBattleFragment.f113318c;
            C5092e c5092e2 = c5092e;
            if (c5092e == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                c5092e2 = null;
            }
            List<KingHonourGameItemBean> list = c5092e2.f56438d;
            if (list == null || list.isEmpty()) {
                if (((kingHonourResponseBean2 == null || (kingHonourBattleInfoBean = kingHonourResponseBean2.result) == null) ? null : kingHonourBattleInfoBean.valor) == null) {
                    RecyclerView recyclerView = kingHonourRecentBattleFragment.f113317b;
                    RecyclerView recyclerView2 = recyclerView;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                        recyclerView2 = null;
                    }
                    recyclerView2.setVisibility(8);
                    ViewStub viewStub = kingHonourRecentBattleFragment.f113319d;
                    if (viewStub == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mNoContentSub");
                        viewStub = null;
                    }
                    viewStub.setVisibility(0);
                    return;
                }
                RecyclerView recyclerView3 = kingHonourRecentBattleFragment.f113317b;
                RecyclerView recyclerView4 = recyclerView3;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                    recyclerView4 = null;
                }
                recyclerView4.setVisibility(0);
                ViewStub viewStub2 = kingHonourRecentBattleFragment.f113319d;
                ViewStub viewStub3 = viewStub2;
                if (viewStub2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNoContentSub");
                    viewStub3 = null;
                }
                viewStub3.setVisibility(8);
                C5092e c5092e3 = kingHonourRecentBattleFragment.f113318c;
                if (c5092e3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    c5092e3 = null;
                }
                KingHonourBattleInfoBean kingHonourBattleInfoBean2 = kingHonourResponseBean2.result;
                ArrayList arrayList = new ArrayList();
                if (kingHonourRecentBattleFragment.f113320e == 1) {
                    KingHonourGameItemBean kingHonourGameItemBean = new KingHonourGameItemBean();
                    kingHonourGameItemBean.type = 1;
                    kingHonourGameItemBean.number = kingHonourBattleInfoBean2.todaySurplus;
                    arrayList.add(kingHonourGameItemBean);
                }
                if (kingHonourRecentBattleFragment.f113320e != 1 || kingHonourRecentBattleFragment.jf()) {
                    kingHonourBattleInfoBean2.valor = CollectionsKt.sortedWith(kingHonourBattleInfoBean2.valor, new C6791F(kingHonourRecentBattleFragment));
                }
                Object obj = "";
                Object obj2 = "";
                int i7 = 0;
                boolean z6 = false;
                for (KingHonourGameBean kingHonourGameBean : kingHonourBattleInfoBean2.valor) {
                    if (kingHonourGameBean.topFlag == 1 && kingHonourRecentBattleFragment.f113320e == 1) {
                        if (kingHonourRecentBattleFragment.jf()) {
                            kingHonourGameBean.topFlag = 0;
                        } else {
                            KingHonourGameItemBean kingHonourGameItemBean2 = new KingHonourGameItemBean();
                            kingHonourGameItemBean2.type = 2;
                            kingHonourGameItemBean2.gameData = kingHonourGameBean;
                            arrayList.add(kingHonourGameItemBean2);
                        }
                    }
                    List listR = StringsKt.R((CharSequence) StringsKt.R(kingHonourGameBean.gameTime, new String[]{" "}, 0, 6).get(0), new String[]{"-"}, 0, 6);
                    int i8 = kingHonourGameBean.gameYear;
                    int i9 = i7;
                    if (i8 != i7) {
                        z6 = true;
                        i9 = i8;
                    }
                    Object obj3 = obj;
                    if (!Intrinsics.areEqual(listR.get(0), obj)) {
                        obj3 = listR.get(0);
                        z6 = true;
                    }
                    Object obj4 = obj2;
                    boolean z7 = z6;
                    if (!Intrinsics.areEqual(listR.get(1), obj2)) {
                        obj4 = listR.get(1);
                        z7 = true;
                    }
                    z6 = z7;
                    if (z7) {
                        KingHonourGameItemBean kingHonourGameItemBean3 = new KingHonourGameItemBean();
                        kingHonourGameItemBean3.type = 4;
                        kingHonourGameItemBean3.date = i9 + "年" + obj3 + "月" + obj4 + "日";
                        arrayList.add(kingHonourGameItemBean3);
                        z6 = false;
                    }
                    KingHonourGameItemBean kingHonourGameItemBean4 = new KingHonourGameItemBean();
                    kingHonourGameItemBean4.type = 3;
                    kingHonourGameItemBean4.gameData = kingHonourGameBean;
                    arrayList.add(kingHonourGameItemBean4);
                    obj = obj3;
                    obj2 = obj4;
                    i7 = i9;
                }
                c5092e3.f56438d = arrayList;
                c5092e3.notifyDataSetChanged();
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            KingHonourRecentBattleFragment kingHonourRecentBattleFragment = this.f113323b;
            RecyclerView recyclerView = kingHonourRecentBattleFragment.f113317b;
            RecyclerView recyclerView2 = recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(8);
            ViewStub viewStub = kingHonourRecentBattleFragment.f113319d;
            if (viewStub == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoContentSub");
                viewStub = null;
            }
            viewStub.setVisibility(0);
        }
    }

    public final boolean jf() {
        Bundle arguments = getArguments();
        boolean z6 = true;
        if ((arguments != null ? arguments.getInt("king_honour_battle_container", 1) : 1) != 2) {
            z6 = false;
        }
        return z6;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500646, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourBattleInfoBean>>> kingHonourReportInfo;
        super.onViewCreated(view, bundle);
        this.f113317b = (RecyclerView) view.findViewById(2131315801);
        ViewStub viewStub = (ViewStub) view.findViewById(2131315812);
        this.f113319d = viewStub;
        ViewStub viewStub2 = viewStub;
        if (viewStub == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoContentSub");
            viewStub2 = null;
        }
        viewStub2.inflate();
        if (jf()) {
            view.setBackgroundResource(0);
            RecyclerView recyclerView = this.f113317b;
            RecyclerView recyclerView2 = recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                recyclerView2 = null;
            }
            ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = h.b(20.0f);
                RecyclerView recyclerView3 = this.f113317b;
                RecyclerView recyclerView4 = recyclerView3;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                    recyclerView4 = null;
                }
                recyclerView4.setLayoutParams(marginLayoutParams);
            }
            view.findViewById(2131315811).setBackgroundResource(0);
        }
        ViewGroup.LayoutParams layoutParams2 = ((TextView) view.findViewById(2131315813)).getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = jf() ? (int) DpUtils.dp2px(getContext(), 156.0f) : 0;
        }
        Context context = getContext();
        if (context != null) {
            this.f113318c = new C5092e(context, jf() ? Color.parseColor("#1B1B1B") : ContextCompat.getColor(context, 2131104044), Color.parseColor(jf() ? "#2F2C45" : "#072748"));
            RecyclerView recyclerView5 = this.f113317b;
            RecyclerView recyclerView6 = recyclerView5;
            if (recyclerView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                recyclerView6 = null;
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(1);
            recyclerView6.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView7 = this.f113317b;
        RecyclerView recyclerView8 = recyclerView7;
        if (recyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
            recyclerView8 = null;
        }
        C5092e c5092e = this.f113318c;
        C5092e c5092e2 = c5092e;
        if (c5092e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c5092e2 = null;
        }
        recyclerView8.setAdapter(c5092e2);
        C5092e c5092e3 = this.f113318c;
        C5092e c5092e4 = c5092e3;
        if (c5092e3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c5092e4 = null;
        }
        c5092e4.f56439e = new C6789D(this);
        Bundle arguments = getArguments();
        int i7 = -1;
        if (arguments != null) {
            i7 = arguments.getInt("king_honour_battle_tab_type", -1);
        }
        this.f113320e = i7;
        Bundle arguments2 = getArguments();
        this.f113321f = arguments2 != null && arguments2.getBoolean("king_honour_user_is_grant", true);
        TextView textView = (TextView) view.findViewById(2131315813);
        if (this.f113320e == 2 && textView != null) {
            textView.setText(getString(2131851281));
        }
        if (this.f113321f) {
            int i8 = this.f113320e;
            if (i8 == 1) {
                BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourBattleInfoBean>>> kingHonourBattleInfo = ((KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class)).getKingHonourBattleInfo(BiliAccounts.get(getContext()).getAccessKey());
                if (kingHonourBattleInfo != null) {
                    kingHonourBattleInfo.enqueue(this.f113322g);
                }
            } else if (i8 == 2 && (kingHonourReportInfo = ((KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class)).getKingHonourReportInfo(BiliAccounts.get(getContext()).getAccessKey())) != null) {
                kingHonourReportInfo.enqueue(this.f113322g);
            }
        } else {
            RecyclerView recyclerView9 = this.f113317b;
            RecyclerView recyclerView10 = recyclerView9;
            if (recyclerView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                recyclerView10 = null;
            }
            recyclerView10.setVisibility(8);
            ViewStub viewStub3 = this.f113319d;
            ViewStub viewStub4 = viewStub3;
            if (viewStub3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoContentSub");
                viewStub4 = null;
            }
            viewStub4.setVisibility(0);
            if (textView != null) {
                textView.setText(getString(2131850930));
            }
        }
        if (jf()) {
            RecyclerView recyclerView11 = this.f113317b;
            RecyclerView recyclerView12 = recyclerView11;
            if (recyclerView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                recyclerView12 = null;
            }
            ViewGroup.LayoutParams layoutParams3 = recyclerView12.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.bottomMargin = 0;
                RecyclerView recyclerView13 = this.f113317b;
                if (recyclerView13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mItemListView");
                    recyclerView13 = null;
                }
                recyclerView13.setLayoutParams(marginLayoutParams3);
            }
        }
    }
}
