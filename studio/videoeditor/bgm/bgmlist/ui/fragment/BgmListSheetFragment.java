package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.bgm.BgmTab;
import com.bilibili.tgwt.filmselection.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BgmListSheetFragment.class */
public class BgmListSheetFragment extends BaseBgmListFragment {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f109029q = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f109030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public BgmTab f109031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f109032p = true;

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final String hf() {
        BgmTab bgmTab = this.f109031o;
        return bgmTab != null ? bgmTab.name : "";
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    /* JADX INFO: renamed from: if */
    public final boolean mo10410if() {
        return this.f109032p;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final void mf(boolean z6) {
        this.f109032p = z6;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final void of() {
        BgmTab bgmTab;
        super.of();
        TextView textView = this.f109030n;
        if (textView == null || (bgmTab = this.f109031o) == null) {
            return;
        }
        textView.setText(bgmTab.name);
        this.f108991c.f109063k = this.f109031o.name;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131498244, viewGroup, false);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f108990b.setNestedScrollingEnabled(this.f109032p);
        this.f109030n = (TextView) view.findViewById(2131298572);
        ((LinearLayout) view.findViewById(2131305483)).setOnClickListener(new h(this, 1));
        BgmTab bgmTab = this.f109031o;
        kf(bgmTab == null ? null : bgmTab.children);
        of();
    }
}
