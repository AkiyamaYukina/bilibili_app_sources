package com.bilibili.upper.module.cover_v2.ui;

import OS0.D0;
import R50.r;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import com.bilibili.upper.module.cover_v2.widgets.MultiCaptionRectView;
import com.bilibili.upper.module.cover_v2.widgets.MultiCoverCropOverlayView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverEditorView.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverEditorView extends RelativeLayout {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f112890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f112891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MultiCoverConfig f112892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public KH0.i f112893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public LH0.a f112894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RH0.b f112895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public RH0.a f112896g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverEditorView$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final UpperLiveWindowExt f112897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MultiCaptionRectView f112898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final MultiCoverCropOverlayView f112899c;

        public a(@NotNull View view) {
            this.f112897a = (UpperLiveWindowExt) view.findViewById(2131318190);
            this.f112898b = (MultiCaptionRectView) view.findViewById(2131318173);
            this.f112899c = (MultiCoverCropOverlayView) view.findViewById(2131318180);
        }
    }

    public MultiCoverEditorView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(context).inflate(2131501574, this);
        this.f112890a = viewInflate;
        this.f112891b = new a(viewInflate);
    }

    public final void a(@NotNull KH0.i iVar) {
        this.f112893d = iVar;
        this.f112892c = iVar.f12745c;
        LH0.a aVar = iVar.f12746d;
        this.f112894e = aVar;
        getContext();
        this.f112895f = new RH0.b(this.f112893d, aVar);
        this.f112896g = new RH0.a(getContext());
        this.f112891b.f112898b.setRestrictBorderRect(new RectF(aVar.f14537b));
        this.f112891b.f112898b.setOnCaptionTouchListener(this.f112896g);
        this.f112891b.f112898b.setOnCommonTouchListener(this.f112895f);
        LH0.a aVar2 = this.f112894e;
        if (aVar2 != null) {
            this.f112891b.f112899c.setMultiRect(aVar2);
        }
        KH0.i iVar2 = this.f112893d;
        if (iVar2 != null) {
            UpperLiveWindowExt upperLiveWindowExt = this.f112891b.f112897a;
            iVar2.d();
            iVar2.f12751j = upperLiveWindowExt;
            com.bilibili.studio.editor.timeline.i iVar3 = iVar2.f12748f;
            if (iVar3 != null) {
                iVar3.f108301c = upperLiveWindowExt;
                r rVar = iVar3.f108304f;
                if (rVar != null) {
                    rVar.r(iVar3.i(), upperLiveWindowExt);
                }
            }
        }
        KH0.i iVar4 = this.f112893d;
        if (iVar4 != null) {
            iVar4.j(iVar.f12745c.getCurrentSeekTime());
        }
        LH0.a aVar3 = this.f112894e;
        if (aVar3 != null) {
            float fWidth = aVar3.f14536a.width();
            int i7 = SH0.b.f22895a;
            EH0.p.f4125a.getClass();
            setY((-(aVar3.f14536a.height() - (fWidth / (EH0.p.g() ? 1.7772512f : 1.3392857f)))) / 2.0f);
            requestLayout();
            post(new D0(iVar, 2));
        }
    }

    @NotNull
    public final MultiCaptionRectView getCaptionRect() {
        return this.f112891b.f112898b;
    }

    @NotNull
    public final MultiCoverCropOverlayView getCoverOverlay() {
        return this.f112891b.f112899c;
    }

    @NotNull
    public final UpperLiveWindowExt getLiveWindow() {
        return this.f112891b.f112897a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        float size = View.MeasureSpec.getSize(i7);
        MultiCoverConfig multiCoverConfig = this.f112892c;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (size / (multiCoverConfig != null ? multiCoverConfig.getVideoRatio() : 1.3333334f)), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
    }

    public final void setDimmedLayerType(int i7) {
        this.f112891b.f112899c.setUpDownBlackEnable(i7 == 0);
        MultiCoverCropOverlayView multiCoverCropOverlayView = this.f112891b.f112899c;
        boolean z6 = false;
        if (i7 == 1) {
            z6 = true;
        }
        multiCoverCropOverlayView.setLeftRightBlackEnable(z6);
    }
}
