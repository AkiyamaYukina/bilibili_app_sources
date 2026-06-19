package com.bilibili.music.podcast.legacy.fragment;

import ZS0.I1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bilibili.lib.ui.BaseFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/ContributionErrorFragment.class */
public final class ContributionErrorFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f66823b = LazyKt.lazy(new I1(this, 8));

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499512, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        TextView textView;
        super.onViewCreated(view, bundle);
        requireActivity().setTitle(2131831686);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("key_err_message")) == null || (textView = (TextView) this.f66823b.getValue()) == null) {
            return;
        }
        textView.setText(string);
    }
}
