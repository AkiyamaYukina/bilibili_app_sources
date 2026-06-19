package com.bilibili.lib.projection.internal.search.searchv2;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.bilibili.lib.projection.internal.search.ProjectionSearchFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/g.class */
public final class g implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionSearchFragment f63801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SearchPanelContainer f63802b;

    public g(ProjectionSearchFragment projectionSearchFragment, SearchPanelContainer searchPanelContainer) {
        this.f63801a = projectionSearchFragment;
        this.f63802b = searchPanelContainer;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        Window window;
        View decorView;
        view.removeOnLayoutChangeListener(this);
        Dialog dialog = this.f63801a.getDialog();
        boolean z6 = false;
        int height = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getHeight();
        int i15 = this.f63802b.getContext().getResources().getDisplayMetrics().heightPixels;
        SearchPanelContainer searchPanelContainer = this.f63802b;
        if (height >= (i15 * 4) / 5) {
            z6 = true;
        }
        searchPanelContainer.setSearchPageFullscreen(z6);
    }
}
