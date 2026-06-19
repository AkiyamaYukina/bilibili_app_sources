package com.bilibili.playerbizcommon.features.subtitle;

import Jb.g;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.annotation.FloatRange;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import kq0.C7783a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/f.class */
public final class f extends ComponentDialog {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79966f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.subtitle.a f79967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f79968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f79969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C7783a f79970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f79971e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/f$a.class */
    public static final class a implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f79972a;

        public a(f fVar) {
            this.f79972a = fVar;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            f fVar = this.f79972a;
            fVar.getClass();
            BLog.i("SubtitleSingleSelectDialog2", "video item start");
            fVar.dismiss();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/f$b.class */
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f79973a;

        public b(f fVar) {
            this.f79973a = fVar;
        }

        public final void onSlide(View view, float f7) {
            float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
            f fVar = this.f79973a;
            Window window = fVar.getWindow();
            if (window != null) {
                window.setDimAmount(f8 * fVar.f79968b);
            }
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f79973a.dismiss();
            }
        }
    }

    public /* synthetic */ f(ComponentActivity componentActivity, com.bilibili.playerbizcommon.features.subtitle.a aVar) {
        this(componentActivity, aVar, 0.5f);
    }

    public f(@NotNull ComponentActivity componentActivity, @NotNull com.bilibili.playerbizcommon.features.subtitle.a aVar, @FloatRange(from = 0.0d, to = 1.0d) float f7) {
        super(componentActivity, 2131886161);
        this.f79967a = aVar;
        this.f79968b = f7;
        this.f79971e = new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
        }
        C7783a c7783aInflate = C7783a.inflate(getLayoutInflater());
        this.f79970d = c7783aInflate;
        C7783a c7783a = c7783aInflate;
        if (c7783aInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            c7783a = null;
        }
        setContentView(c7783a.f122944a);
        C7783a c7783a2 = this.f79970d;
        C7783a c7783a3 = c7783a2;
        if (c7783a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            c7783a3 = null;
        }
        c7783a3.f122946c.setOnClickListener(new g(this, 3));
        C7783a c7783a4 = this.f79970d;
        C7783a c7783a5 = c7783a4;
        if (c7783a4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            c7783a5 = null;
        }
        FrameLayout frameLayout = c7783a5.f122945b;
        frameLayout.setOnClickListener(new Object());
        TextView textView = (TextView) findViewById(2131317547);
        this.f79969c = textView;
        if (textView != null) {
            textView.setOnClickListener(new ER.b(this, 2));
        }
        if (frameLayout.getParent() instanceof CoordinatorLayout) {
            BottomSheetBehavior.from(frameLayout).addBottomSheetCallback(new b(this));
        } else {
            ((ImageView) findViewById(2131317046)).setVisibility(4);
            ImageView imageView = (ImageView) findViewById(2131298371);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(DimenUtilsKt.dpToPx(18));
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(d.a(getContext().getResources().getColor(R$color.Graph_icon, null)));
            imageView.setBackground(gradientDrawable);
        }
        BLog.i("SubtitleSingleSelectDialog2", "config select view");
        boolean zBooleanValue = ((Boolean) this.f79967a.c("danmaku-subtitle-large")).booleanValue();
        TextView textView2 = this.f79969c;
        if (textView2 != null) {
            textView2.setSelected(zBooleanValue);
        }
        this.f79967a.addVideoDirectorObserver(this.f79971e);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setDimAmount(this.f79968b);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f79967a.removeVideoDirectorObserver(this.f79971e);
    }
}
