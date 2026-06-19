package com.bilibili.studio.editor.moudle.danmaku.setting.ui;

import Bx0.f;
import Bx0.g;
import Ea.F;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.c;
import com.bilibili.ad.comm.widget.button.AdDownloadButton;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuItem;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuItemList;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.danmaku.BiliEditorDanmakuListFragmentV3;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.mall.data.page.cart.bean.MallCartActivityInfo;
import com.mall.ui.page.cart.dialog.MallCartAtyRulesDlgFragment;
import eR0.G;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vx0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/setting/ui/BiliEditorDanmakuListFragment.class */
public class BiliEditorDanmakuListFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f106078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f106079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f106080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f106081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f106082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f106083g;

    @Nullable
    public HashMap<Integer, DanmakuItemList> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<? extends DanmakuItem> f106084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public g f106085j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f106087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public a f106088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Ax0.a f106089n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f106086k = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f106090o = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/setting/ui/BiliEditorDanmakuListFragment$a.class */
    public interface a {
        void a(int i7, long j7, @Nullable String str, @Nullable String str2);

        void b(int i7, @Nullable String str, @Nullable DanmakuItem danmakuItem);

        void c();
    }

    @NotNull
    public final View jf() {
        View view = this.f106083g;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mConfirmView");
        return null;
    }

    public void kf() {
    }

    public final void lf() {
        List<? extends T> list;
        g gVar = this.f106085j;
        if (gVar != null && (list = gVar.f54261a) != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((DanmakuItem) it.next()).setSelected(false);
            }
        }
        Ax0.a aVar = this.f106089n;
        if (aVar != null) {
            aVar.f605a = null;
        }
    }

    public void mf() {
        Ax0.a aVar = this.f106089n;
        if (aVar != null) {
            if (aVar.f605a != null) {
                jf().setAlpha(1.0f);
                jf().setEnabled(true);
                return;
            }
        }
        jf().setAlpha(0.6f);
        jf().setEnabled(false);
    }

    public final void nf(boolean z6) {
        Collection collection;
        DanmakuItemList danmakuItemList;
        Boolean bool;
        if (this.f106078b != null) {
            if (z6) {
                int i7 = this.f106086k;
                if (i7 == 1) {
                    TextView textView = this.f106082f;
                    TextView textView2 = textView;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBottomTitleView");
                        textView2 = null;
                    }
                    textView2.setText(2131841838);
                } else if (i7 == 2) {
                    TextView textView3 = this.f106082f;
                    TextView textView4 = textView3;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBottomTitleView");
                        textView4 = null;
                    }
                    textView4.setText(2131841955);
                } else if (i7 == 3) {
                    TextView textView5 = this.f106082f;
                    TextView textView6 = textView5;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBottomTitleView");
                        textView6 = null;
                    }
                    textView6.setText(2131842122);
                    View view = this.f106081e;
                    View view2 = view;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCreateBottonView");
                        view2 = null;
                    }
                    view2.setVisibility(8);
                    View view3 = this.f106078b;
                    View view4 = view3;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                        view4 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null && !(this instanceof BiliEditorDanmakuListFragmentV3)) {
                        layoutParams2.height = DensityUtil.dp2px(222.0f);
                        View view5 = this.f106078b;
                        View view6 = view5;
                        if (view5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                            view6 = null;
                        }
                        view6.setLayoutParams(layoutParams2);
                    }
                }
                HashMap<Integer, DanmakuItemList> map = this.h;
                if (!((map == null || (danmakuItemList = map.get(Integer.valueOf(this.f106086k))) == null || (bool = danmakuItemList.canCreate) == null) ? false : bool.booleanValue()) || this.f106090o >= 0) {
                    View view7 = this.f106081e;
                    View view8 = view7;
                    if (view7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCreateBottonView");
                        view8 = null;
                    }
                    view8.setAlpha(0.2f);
                    View view9 = this.f106081e;
                    View view10 = view9;
                    if (view9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCreateBottonView");
                        view10 = null;
                    }
                    view10.setEnabled(false);
                } else {
                    View view11 = this.f106081e;
                    View view12 = view11;
                    if (view11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCreateBottonView");
                        view12 = null;
                    }
                    view12.setAlpha(1.0f);
                    View view13 = this.f106081e;
                    View view14 = view13;
                    if (view13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCreateBottonView");
                        view14 = null;
                    }
                    view14.setEnabled(true);
                }
                g gVar = this.f106085j;
                if (gVar == null || (collection = gVar.f54261a) == null || !(!collection.isEmpty())) {
                    View view15 = this.f106080d;
                    View view16 = view15;
                    if (view15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mListEmptyView");
                        view16 = null;
                    }
                    view16.setVisibility(0);
                    RecyclerView recyclerView = this.f106079c;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mListRv");
                        recyclerView = null;
                    }
                    recyclerView.setVisibility(8);
                } else {
                    View view17 = this.f106080d;
                    View view18 = view17;
                    if (view17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mListEmptyView");
                        view18 = null;
                    }
                    view18.setVisibility(8);
                    RecyclerView recyclerView2 = this.f106079c;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mListRv");
                        recyclerView2 = null;
                    }
                    recyclerView2.setVisibility(0);
                }
            }
            mf();
        }
    }

    public final void of(boolean z6) {
        HashMap<Integer, DanmakuItemList> map = this.h;
        if (map != null) {
            DanmakuItemList danmakuItemList = map.get(Integer.valueOf(this.f106086k));
            this.f106084i = danmakuItemList != null ? danmakuItemList.bindList : null;
        } else if (z6) {
            d dVarB = d.b();
            f fVar = new f(this);
            HashMap map2 = dVarB.b;
            if (map2 == null || map2.size() == 0) {
                dVarB.a(fVar);
            } else {
                fVar.a(dVarB.b);
            }
        }
        g gVar = this.f106085j;
        if (gVar != null) {
            gVar.f54261a = this.f106084i;
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494055, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Ax0.a aVar = this.f106089n;
        if (aVar != null) {
            aVar.f605a = null;
        }
        this.f106089n = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Bx0.g, androidx.recyclerview.widget.RecyclerView$Adapter, ax0.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Ax0.a, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f106090o = (arguments != null ? Long.valueOf(arguments.getLong("select_id")) : null).longValue();
        }
        this.f106089n = new Object();
        final ?? cVar = new c();
        cVar.setHasStableIds(true);
        cVar.f54261a = this.f106084i;
        cVar.f54262b = 2131495064;
        cVar.f54263c = new Function3(this) { // from class: Bx0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorDanmakuListFragment f1020a;

            {
                this.f1020a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 302
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: Bx0.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        cVar.f54264d = new Function2(cVar, this) { // from class: Bx0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f1021a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorDanmakuListFragment f1022b;

            {
                this.f1021a = cVar;
                this.f1022b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                DanmakuItem danmakuItem = (DanmakuItem) obj2;
                Iterable<DanmakuItem> iterable = this.f1021a.f54261a;
                BiliEditorDanmakuListFragment biliEditorDanmakuListFragment = this.f1022b;
                if (iterable != null) {
                    int i7 = 0;
                    for (DanmakuItem danmakuItem2 : iterable) {
                        danmakuItem2.setSelected(Intrinsics.areEqual(danmakuItem2, danmakuItem));
                        if (danmakuItem2.isSelected()) {
                            biliEditorDanmakuListFragment.getClass();
                            Xz0.d.f28458a.getClass();
                            Xz0.d.j(2, danmakuItem2, i7);
                            Ax0.a aVar = biliEditorDanmakuListFragment.f106089n;
                            if (aVar != null) {
                                aVar.f605a = danmakuItem2;
                            }
                            biliEditorDanmakuListFragment.nf(false);
                        }
                        i7++;
                    }
                }
                g gVar = biliEditorDanmakuListFragment.f106085j;
                if (gVar != null) {
                    gVar.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            }
        };
        this.f106085j = cVar;
        this.f106078b = view;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view2 = null;
        }
        view2.findViewById(2131302459).setOnClickListener(new Bx0.a(this, 0));
        View view3 = this.f106078b;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view4 = null;
        }
        this.f106083g = view4.findViewById(2131302460);
        final int i7 = 0;
        jf().setOnClickListener(new View.OnClickListener(this, i7) { // from class: Bx0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1017b;

            {
                this.f1016a = i7;
                this.f1017b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                Context context;
                MallCartActivityInfo mallCartActivityInfo;
                switch (this.f1016a) {
                    case 0:
                        BiliEditorDanmakuListFragment biliEditorDanmakuListFragment = (BiliEditorDanmakuListFragment) this.f1017b;
                        Ax0.a aVar = biliEditorDanmakuListFragment.f106089n;
                        if (aVar != null) {
                            DanmakuItem danmakuItem = aVar.f605a;
                            if (danmakuItem != null) {
                                BiliEditorDanmakuListFragment.a aVar2 = biliEditorDanmakuListFragment.f106088m;
                                if (aVar2 != null) {
                                    int i8 = biliEditorDanmakuListFragment.f106086k;
                                    String str = biliEditorDanmakuListFragment.f106087l;
                                    if (aVar == null) {
                                        danmakuItem = null;
                                    }
                                    aVar2.b(i8, str, danmakuItem);
                                }
                                biliEditorDanmakuListFragment.lf();
                            }
                        }
                        biliEditorDanmakuListFragment.lf();
                        biliEditorDanmakuListFragment.kf();
                        break;
                    case 1:
                        F f7 = (F) this.f1017b;
                        if (!((Boolean) f7.f.invoke()).booleanValue() && (context = f7.e) != null) {
                            AdDownloadButton.handleClick$default(f7.d, context, false, false, 6, (Object) null);
                            break;
                        }
                        break;
                    default:
                        G g7 = (G) this.f1017b;
                        FragmentManager childFragmentManager = g7.b.getChildFragmentManager();
                        if (childFragmentManager != null && (mallCartActivityInfo = g7.i) != null) {
                            List listMutableListOf = CollectionsKt.mutableListOf(new MallCartActivityInfo[]{mallCartActivityInfo});
                            long j7 = g7.b.q;
                            MallCartAtyRulesDlgFragment mallCartAtyRulesDlgFragment = new MallCartAtyRulesDlgFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("bundle_key_activity_rules_dialog_type", 1);
                            bundle2.putLong("bundle_key_activity_rules_dialog_timestamp", j7);
                            bundle2.putString("bundle_key_activity_rules_dialog_title", "活动规则");
                            bundle2.putInt("bundle_key_activity_rules_dialog_defaultTab", 0);
                            ArrayList<? extends Parcelable> arrayList = listMutableListOf instanceof ArrayList ? (ArrayList) listMutableListOf : null;
                            if (arrayList != null) {
                                bundle2.putParcelableArrayList("bundle_key_activity_rules_dialog_infos", arrayList);
                                mallCartAtyRulesDlgFragment.setArguments(bundle2);
                            }
                            mallCartAtyRulesDlgFragment.show(childFragmentManager, "MallCartAtyRulesDlgFragment");
                            break;
                        }
                        break;
                }
            }
        });
        View view5 = this.f106078b;
        View view6 = view5;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view6 = null;
        }
        RecyclerView recyclerView = (RecyclerView) view6.findViewById(2131310629);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.f106085j);
        this.f106079c = recyclerView;
        View view7 = this.f106078b;
        View view8 = view7;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view8 = null;
        }
        this.f106080d = view8.findViewById(2131305533);
        View view9 = this.f106078b;
        View view10 = view9;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view10 = null;
        }
        View viewFindViewById = view10.findViewById(2131305532);
        this.f106081e = viewFindViewById;
        View view11 = viewFindViewById;
        if (viewFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCreateBottonView");
            view11 = null;
        }
        view11.setEnabled(true);
        View view12 = this.f106081e;
        View view13 = view12;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCreateBottonView");
            view13 = null;
        }
        view13.setOnClickListener(new Bx0.c(this, 0));
        View view14 = this.f106078b;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view14 = null;
        }
        this.f106082f = (TextView) view14.findViewById(2131309694);
        nf(true);
        d dVarB = d.b();
        f fVar = new f(this);
        HashMap map = dVarB.b;
        if (map == null || map.size() == 0) {
            dVarB.a(fVar);
        } else {
            fVar.a(dVarB.b);
        }
    }
}
