package com.bilibili.playerbizcommon.timer;

import Yi0.ViewOnClickListenerC3138g;
import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.utils.TimeFormater;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/timer/UgcTimePickerTextView.class */
public final class UgcTimePickerTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public CharSequence f80253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewOnClickListenerC3138g.c f80257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ViewOnClickListenerC3138g.b f80258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f80259g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/timer/UgcTimePickerTextView$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcTimePickerTextView f80260a;

        public a(UgcTimePickerTextView ugcTimePickerTextView) {
            this.f80260a = ugcTimePickerTextView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ShutOffTimingService service;
            UgcTimePickerTextView ugcTimePickerTextView = this.f80260a;
            if (ugcTimePickerTextView.f80254b) {
                ViewOnClickListenerC3138g.c cVar = ugcTimePickerTextView.f80257e;
                long leftTime = (cVar == null || (service = cVar.f28817a.f28813j.getService()) == null) ? 0L : service.getLeftTime();
                UgcTimePickerTextView ugcTimePickerTextView2 = this.f80260a;
                if (!ugcTimePickerTextView2.f80255c || leftTime <= 0) {
                    ugcTimePickerTextView2.f80255c = false;
                    ugcTimePickerTextView2.setText(ugcTimePickerTextView2.f80253a);
                } else {
                    ugcTimePickerTextView2.setText(TimeFormater.INSTANCE.formatTime(leftTime, true, true));
                    this.f80260a.postDelayed(this, 1000L);
                }
            }
        }
    }

    public UgcTimePickerTextView(@Nullable Context context) {
        super(context);
        this.f80253a = getContext().getString(2131847161);
        this.f80259g = new a(this);
    }

    public UgcTimePickerTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80253a = getContext().getString(2131847161);
        this.f80259g = new a(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.magicasakura.widgets.TintTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() throws NoWhenBranchMatchedException {
        ViewOnClickListenerC3138g.c cVar;
        ShutOffTimingService service;
        super.onAttachedToWindow();
        this.f80254b = true;
        if (this.f80255c) {
            if (!this.f80256d) {
                ViewOnClickListenerC3138g.b bVar = this.f80258f;
                if (bVar != null && (cVar = this.f80257e) != null && (service = cVar.f28817a.f28813j.getService()) != null) {
                    service.registerTimingCallback(bVar);
                }
                this.f80256d = true;
            }
            post(this.f80259g);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ViewOnClickListenerC3138g.c cVar;
        ShutOffTimingService service;
        ViewOnClickListenerC3138g.b bVar = this.f80258f;
        if (bVar != null && (cVar = this.f80257e) != null && (service = cVar.f28817a.f28813j.getService()) != null) {
            service.unregisterTimingCallback(bVar);
        }
        this.f80256d = false;
        removeCallbacks(this.f80259g);
        this.f80254b = false;
        super.onDetachedFromWindow();
    }
}
