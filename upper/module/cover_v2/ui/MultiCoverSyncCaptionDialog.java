package com.bilibili.upper.module.cover_v2.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bplus.followingpublish.fragments.A0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverSyncCaptionDialog.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverSyncCaptionDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f112924g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f112925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f112926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public h f112927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f112928f;

    public final int getDialogViewRes() {
        return 2131501575;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initView(@NotNull View view) {
        setCancelableOnTouchOutside(false);
        this.f112925c = (TextView) view.findViewById(2131309705);
        this.f112926d = (TextView) view.findViewById(2131311134);
        TextView textView = (TextView) view.findViewById(2131310619);
        if (textView != null) {
            String str = this.f112928f;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            textView.setText(getString(2131851084, str2));
        }
        TextView textView2 = this.f112926d;
        if (textView2 != null) {
            textView2.setOnClickListener(new A0(this, 1));
        }
        TextView textView3 = this.f112925c;
        if (textView3 != null) {
            textView3.setOnClickListener(new o(this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f112928f = arguments != null ? arguments.getString("coverText") : null;
        initView(view);
    }
}
