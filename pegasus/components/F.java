package com.bilibili.pegasus.components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/F.class */
public final class F implements Observer<LifecycleOwner> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliCommonDialog f75769a;

    public F(BiliCommonDialog biliCommonDialog) {
        this.f75769a = biliCommonDialog;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return;
        }
        BiliCommonDialog biliCommonDialog = this.f75769a;
        biliCommonDialog.getViewLifecycleOwnerLiveData().removeObserver(this);
        View view = biliCommonDialog.getView();
        ViewGroup.LayoutParams layoutParams = null;
        View viewFindViewById = view != null ? view.findViewById(2131299246) : null;
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        if (textView != null) {
            textView.setLineSpacing(0.0f, 1.5f);
        }
        View view2 = biliCommonDialog.getView();
        View viewFindViewById2 = view2 != null ? view2.findViewById(2131299241) : null;
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = ListExtentionsKt.toPx(70.0f);
                layoutParams2.width = ListExtentionsKt.toPx(70.0f);
                layoutParams = layoutParams2;
            }
            viewFindViewById2.setLayoutParams(layoutParams);
        }
    }
}
