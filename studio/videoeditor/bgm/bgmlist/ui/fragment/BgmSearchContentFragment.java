package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import Ye1.e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.videoeditor.editor.common.ui.EditBgmQueryLinearLayoutManager;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.S;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.module.honour.utils.a;
import eB0.n;
import eB0.o;
import eB0.p;
import eB0.q;
import hB0.c;
import hB0.d;
import hB0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BgmSearchContentFragment.class */
public class BgmSearchContentFragment extends BaseBgmListFragment {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f109033t = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f109034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f109035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f109036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f109037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f109038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f109039s;

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final String hf() {
        return S.a(this.f108993e, 2131851041);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f109038r = cB0.d.a().f58768j;
        this.f108991c.h = new o(this, context);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131498230, viewGroup, false);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        this.f109036p = (LinearLayout) view.findViewById(2131305489);
        ((ImageView) view.findViewById(2131304472)).setBackgroundResource(2131235613);
        ((TextView) view.findViewById(2131314496)).setOnClickListener(new e(1, this, context));
        this.f109034n = (LinearLayout) view.findViewById(2131305715);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310668);
        recyclerView.setNestedScrollingEnabled(false);
        d dVar = this.f109038r;
        n nVar = new n(this);
        RecyclerView.Adapter adapter = new RecyclerView.Adapter();
        ((c) adapter).a = context;
        ((c) adapter).b = nVar;
        ((c) adapter).c = dVar;
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, (DensityUtil.getDevicesWidthPixels(this.f108993e) - (V.a(2131165802, this.f108993e) * 2)) / V.a(2131165898, this.f108993e));
        gridLayoutManager.setSpanSizeLookup(new q(this));
        recyclerView.setLayoutManager(gridLayoutManager);
        this.f109035o = (LinearLayout) view.findViewById(2131305490);
        EditBgmQueryLinearLayoutManager editBgmQueryLinearLayoutManager = new EditBgmQueryLinearLayoutManager(context);
        this.f108990b.setLayoutManager(editBgmQueryLinearLayoutManager);
        this.f108990b.addOnScrollListener(new p(this, editBgmQueryLinearLayoutManager));
    }
}
