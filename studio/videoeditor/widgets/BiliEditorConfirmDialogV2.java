package com.bilibili.studio.videoeditor.widgets;

import TB0.C2881m;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.bilibili.ad.adview.widget.E;
import com.bilibili.app.authorspace.ui.J1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/BiliEditorConfirmDialogV2.class */
public final class BiliEditorConfirmDialogV2 extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C2881m f110274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f110275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f110276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f110277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f110278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f110279g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/BiliEditorConfirmDialogV2$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Integer f110280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f110281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f110282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Function0<Unit> f110283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Function0<Unit> f110284e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.studio.videoeditor.widgets.BiliEditorConfirmDialogV2$a, java.lang.Object] */
    public BiliEditorConfirmDialogV2() {
        this(new Object());
    }

    public BiliEditorConfirmDialogV2(@NotNull a aVar) {
        this.f110275c = aVar.f110280a;
        this.f110276d = aVar.f110281b;
        this.f110277e = aVar.f110282c;
        this.f110278f = aVar.f110283d;
        this.f110279g = aVar.f110284e;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2881m c2881mInflate = C2881m.inflate(getLayoutInflater(), viewGroup, false);
        this.f110274b = c2881mInflate;
        return c2881mInflate != null ? c2881mInflate.f23871a : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParamsA = J1.a(window, ViewCompat.MEASURED_STATE_MASK);
            layoutParamsA.dimAmount = 0.3f;
            window.setAttributes(layoutParamsA);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Integer num = this.f110275c;
        if (num != null) {
            int iIntValue = num.intValue();
            C2881m c2881m = this.f110274b;
            if (c2881m != null) {
                c2881m.f23875e.setText(iIntValue);
            }
        }
        Integer num2 = this.f110276d;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            C2881m c2881m2 = this.f110274b;
            if (c2881m2 != null) {
                c2881m2.f23874d.setText(iIntValue2);
            }
        }
        Integer num3 = this.f110277e;
        if (num3 == null) {
            C2881m c2881m3 = this.f110274b;
            if (c2881m3 != null) {
                c2881m3.f23873c.setVisibility(8);
            }
        } else {
            C2881m c2881m4 = this.f110274b;
            if (c2881m4 != null) {
                c2881m4.f23873c.setText(num3.intValue());
            }
        }
        C2881m c2881m5 = this.f110274b;
        if (c2881m5 != null) {
            c2881m5.f23874d.setOnClickListener(new E(this, 3));
        }
        C2881m c2881m6 = this.f110274b;
        if (c2881m6 != null) {
            c2881m6.f23873c.setOnClickListener(new com.bilibili.bililive.biz.rights.fansprivileges.buttons.a(this, 2));
        }
        C2881m c2881m7 = this.f110274b;
        if (c2881m7 != null) {
            c2881m7.f23872b.setOnClickListener(new JI0.a(this, 3));
        }
    }
}
