package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import Vu0.C;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/f.class */
@StabilityInferred(parameters = 0)
public final class f implements UIComponent<n<C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f97431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UgcPartyInfoService.b f97432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97434d = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new com.bilibili.ogv.operation2.b(this, 1));

    public f(@NotNull Context context, @NotNull UgcPartyInfoService.b bVar, @NotNull StateFlow stateFlow) {
        this.f97431a = context;
        this.f97432b = bVar;
        this.f97433c = stateFlow;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        String str;
        int i7;
        Drawable drawableA;
        Drawable drawableA2;
        C c7 = (C) ((n) viewEntry).a;
        LinearLayout linearLayout = c7.f25794a;
        UgcPartyInfoService.b bVar = this.f97432b;
        g gVar = bVar.f97413a;
        String str2 = gVar.f97439e;
        int length = str2.length();
        String strA = gVar.f97435a;
        if (length != 0) {
            strA = B0.a.a(str2, " · ", strA);
        }
        TintTextView tintTextView = c7.f25799f;
        tintTextView.setText(strA);
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(tintTextView, this.f97434d);
        tintTextView.getPaint().setStrokeWidth(0.7f);
        tintTextView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        tintTextView.setIncludeFontPadding(true);
        StatInfoData statInfoData = gVar.f97436b;
        if (statInfoData.a()) {
            i7 = 2131235257;
            str = statInfoData.f104028b;
        } else {
            str = NumberFormat_androidKt.format$default(Boxing.boxLong(statInfoData.f104027a), (String) null, 0, 3, (Object) null);
            i7 = 2131235038;
        }
        Drawable drawableB = com.bilibili.playerbizcommon.utils.n.b(i7, this.f97431a, R$color.Ga5);
        UgcPartyInfoService ugcPartyInfoService = bVar.f97414b;
        if (drawableB != null) {
            Integer numE = ugcPartyInfoService.f97404c.e();
            drawableA = drawableB;
            if (numE != null) {
                drawableA = com.bilibili.playerbizcommon.utils.n.a(numE.intValue(), drawableB);
                if (drawableA == null) {
                    drawableA = drawableB;
                }
            }
        } else {
            drawableA = null;
        }
        TintTextView tintTextView2 = c7.h;
        tintTextView2.setText(str);
        tintTextView2.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable drawableB2 = com.bilibili.playerbizcommon.utils.n.b(2131235033, this.f97431a, R$color.Ga5);
        if (drawableB2 != null) {
            Integer numE2 = ugcPartyInfoService.f97404c.e();
            drawableA2 = drawableB2;
            if (numE2 != null) {
                drawableA2 = com.bilibili.playerbizcommon.utils.n.a(numE2.intValue(), drawableB2);
                if (drawableA2 == null) {
                    drawableA2 = drawableB2;
                }
            }
        } else {
            drawableA2 = null;
        }
        TintTextView tintTextView3 = c7.f25796c;
        tintTextView3.setCompoundDrawablesWithIntrinsicBounds(drawableA2, (Drawable) null, (Drawable) null, (Drawable) null);
        tintTextView3.setText(gVar.f97437c.f104028b);
        String str3 = gVar.f97440f;
        TintTextView tintTextView4 = c7.f25800g;
        tintTextView4.setText(str3);
        final int i8 = 0;
        c7.f25795b.setOnClickListener(new View.OnClickListener(this, i8) { // from class: com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f97429a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f97430b;

            {
                this.f97429a = i8;
                this.f97430b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f97429a) {
                    case 0:
                        UgcPartyInfoService ugcPartyInfoService2 = ((f) this.f97430b).f97432b.f97414b;
                        C6353o c6353oC = ugcPartyInfoService2.f97409i.c();
                        if (c6353oC != null) {
                            UnitedSeasonService.b(ugcPartyInfoService2.f97410j, c6353oC, CollectionsKt.listOf(c6353oC), 4);
                            break;
                        }
                        break;
                    case 1:
                        k9.a aVar = (k9.a) this.f97430b;
                        k9.b bVar2 = aVar.c;
                        if (bVar2 != null) {
                            bVar2.onClick(aVar);
                        }
                        break;
                    default:
                        ((vn.d) this.f97430b).f3867o.dismissPanel();
                        break;
                }
            }
        });
        Integer numA = ugcPartyInfoService.f97404c.a();
        if (numA != null) {
            int iIntValue = numA.intValue();
            float[] fArr = new float[3];
            Color.colorToHSV(iIntValue, fArr);
            float f7 = fArr[2];
            fArr[2] = RangesKt.coerceIn(f7 >= 0.03f ? f7 - 0.03f : f7 + 0.03f, 0.0f, 1.0f);
            int iHSVToColor = Color.HSVToColor(fArr);
            c7.f25797d.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iHSVToColor, numA.intValue()}));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(iHSVToColor);
            gradientDrawable.setCornerRadii(new float[]{DimenUtilsKt.dpToPx(8), DimenUtilsKt.dpToPx(8), DimenUtilsKt.dpToPx(8), DimenUtilsKt.dpToPx(8), 0.0f, 0.0f, 0.0f, 0.0f});
            c7.f25798e.setBackground(gradientDrawable);
        }
        Integer numH = ugcPartyInfoService.f97404c.h();
        tintTextView.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(this.f97431a, R$color.Ga10));
        Integer numE3 = ugcPartyInfoService.f97404c.e();
        int iIntValue2 = numE3 != null ? numE3.intValue() : ContextCompat.getColor(this.f97431a, R$color.Ga5);
        tintTextView2.setTextColor(iIntValue2);
        tintTextView3.setTextColor(iIntValue2);
        tintTextView4.setTextColor(iIntValue2);
        c7.f25795b.setColorFilter(iIntValue2);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcPartyInfoComponent$bindToView$2(this, linearLayout, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(C.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
