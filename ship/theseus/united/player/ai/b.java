package com.bilibili.ship.theseus.united.player.ai;

import Tf0.ViewOnClickListenerC2895a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.compose.material.M0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bilibili.ad.adview.pegasus.holders.card41.k;
import com.bilibili.biligame.web2.l;
import com.bilibili.biligame.web2.m;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/b.class */
@StabilityInferred(parameters = 0)
public final class b extends ComponentDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104352c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f104353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final M0 f104354b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/b$a.class */
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f104355a;

        public a(b bVar) {
            this.f104355a = bVar;
        }

        public final void onSlide(View view, float f7) {
            float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
            Window window = this.f104355a.getWindow();
            if (window != null) {
                window.setDimAmount(f8 * 0.5f);
            }
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f104355a.dismiss();
            }
        }
    }

    public b(@NotNull Context context, @NotNull f fVar, @NotNull M0 m02) {
        super(context, 2131886161);
        this.f104353a = fVar;
        this.f104354b = m02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        View viewFindViewById;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
        }
        setContentView(2131502309);
        findViewById(2131306968).setOnClickListener(new ViewOnClickListenerC2895a(this, 2));
        findViewById(2131299396).setOnClickListener(new Object());
        TextView textView = (TextView) findViewById(2131308958);
        if (textView != null) {
            textView.setText(this.f104353a.f104372c);
        }
        TextView textView2 = (TextView) findViewById(2131298661);
        if (textView2 != null) {
            textView2.setText(this.f104353a.f104373d);
        }
        TextView textView3 = (TextView) findViewById(2131297884);
        if (textView3 != null) {
            textView3.setText(this.f104353a.f104375f);
            textView3.setOnClickListener(new l(this, 1));
        }
        TextView textView4 = (TextView) findViewById(2131298598);
        if (textView4 != null) {
            textView4.setText(this.f104353a.f104374e);
            textView4.setOnClickListener(new k(this, 3));
        }
        if (MultipleThemeUtils.isNightTheme(getContext()) && (viewFindViewById = findViewById(2131319796)) != null) {
            viewFindViewById.setAlpha(0.94f);
        }
        View viewFindViewById2 = findViewById(2131299417);
        viewFindViewById2.setOnClickListener(new m(this, 2));
        if (viewFindViewById2.getParent() instanceof CoordinatorLayout) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById2);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.addBottomSheetCallback(new a(this));
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.5f);
        }
    }
}
