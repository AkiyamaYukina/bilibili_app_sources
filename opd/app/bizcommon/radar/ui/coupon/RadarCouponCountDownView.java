package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import com.bilibili.magicasakura.widgets.TintTextView;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/RadarCouponCountDownView.class */
@StabilityInferred(parameters = 0)
public final class RadarCouponCountDownView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TintTextView f74245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TintTextView f74246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TintTextView f74247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TintTextView f74248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TintTextView f74249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final TintTextView f74250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Group f74251g;

    @Nullable
    public Disposable h;

    @JvmOverloads
    public RadarCouponCountDownView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public RadarCouponCountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public RadarCouponCountDownView(Context context, AttributeSet attributeSet, int i7) {
        View viewInflate;
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        Object systemService = getContext().getSystemService("layout_inflater");
        LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
        if (layoutInflater == null || (viewInflate = layoutInflater.inflate(2131499188, (ViewGroup) this, true)) == null) {
            return;
        }
        this.f74245a = (TintTextView) viewInflate.findViewById(2131303378);
        this.f74246b = (TintTextView) viewInflate.findViewById(2131303380);
        this.f74247c = (TintTextView) viewInflate.findViewById(2131303382);
        this.f74248d = (TintTextView) viewInflate.findViewById(2131303384);
        this.f74249e = (TintTextView) viewInflate.findViewById(2131303392);
        this.f74250f = (TintTextView) viewInflate.findViewById(2131303379);
        this.f74251g = (Group) viewInflate.findViewById(2131299498);
    }
}
