package com.bilibili.ship.theseus.ogv.intro.download.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/VideoReserveDownloadDialogFragment.class */
public class VideoReserveDownloadDialogFragment extends BaseAlertDialogFragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C6183w f92514f;

    @Override // com.bilibili.ship.theseus.ogv.intro.download.ui.BaseAlertDialogFragment
    public final void hf(int i7) {
        C6183w c6183w;
        if (i7 == -2) {
            C6183w c6183w2 = this.f92514f;
            if (c6183w2 != null) {
                c6183w2.f92641a.dismiss();
                return;
            }
            return;
        }
        if (i7 == -1 && (c6183w = this.f92514f) != null) {
            VideoReserveDownloadDialogFragment videoReserveDownloadDialogFragment = c6183w.f92641a;
            c6183w.f92642b.e(videoReserveDownloadDialogFragment.requireContext(), CollectionsKt.arrayListOf(new OgvEpisode[]{c6183w.f92643c}), c6183w.f92644d, c6183w.f92645e);
            videoReserveDownloadDialogFragment.dismiss();
        }
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.ui.BaseAlertDialogFragment
    @NonNull
    /* JADX INFO: renamed from: if */
    public final View mo8989if(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(2131500497, viewGroup, false);
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.ui.BaseAlertDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(2131298661);
        this.f92417b.setText(2131854816);
        this.f92420e.setText(2131851597);
        textView.setText(2131848900);
    }
}
