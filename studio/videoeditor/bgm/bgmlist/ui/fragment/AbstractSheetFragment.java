package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import X60.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/AbstractSheetFragment.class */
public abstract class AbstractSheetFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BgmListActivity f108989b;

    public abstract View hf();

    /* JADX INFO: renamed from: if */
    public abstract boolean mo10409if();

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f108989b = (BgmListActivity) p3();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131498232, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(2131302554).setOnClickListener(new a(this));
        ((FrameLayout) view.findViewById(2131298661)).addView(hf());
    }
}
