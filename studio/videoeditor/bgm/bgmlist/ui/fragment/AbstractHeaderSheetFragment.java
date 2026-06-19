package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mall.ui.page.ip.view.X0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/AbstractHeaderSheetFragment.class */
public abstract class AbstractHeaderSheetFragment extends AbstractSheetFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f108987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FrameLayout f108988d;

    public abstract String getTitle();

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment
    public final View hf() {
        return this.f108987c;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public boolean mo10409if() {
        return false;
    }

    public String jf() {
        return getString(2131842180);
    }

    public abstract View kf();

    public abstract void lf();

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        View viewInflate = LayoutInflater.from(context).inflate(2131498231, (ViewGroup) null);
        this.f108987c = viewInflate;
        ((TextView) viewInflate.findViewById(2131308958)).setText(getTitle());
        TextView textView = (TextView) this.f108987c.findViewById(2131298371);
        textView.setText(jf());
        textView.setOnClickListener(new X0(this, 1));
        this.f108988d = (FrameLayout) this.f108987c.findViewById(2131305127);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = this.f108988d;
        if (frameLayout != null) {
            frameLayout.addView(kf());
        }
    }
}
