package com.bilibili.ogv.infra.legacy.exposure;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import kotlin.Deprecated;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/c.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
@StabilityInferred(parameters = 0)
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f67887a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Rect f67888b = new Rect();

    @Override // com.bilibili.ogv.infra.legacy.exposure.g
    public final void a(@NotNull ViewPager viewPager, int i7) {
        View viewX1;
        Oj0.f fVar = (Oj0.f) viewPager.getAdapter();
        if (fVar == null || (viewX1 = fVar.X1()) == null || !fVar.ve(i7, IExposureReporter.ReporterCheckerType.DefaultChecker)) {
            return;
        }
        Rect rect = f67888b;
        rect.setEmpty();
        if (viewX1.getGlobalVisibleRect(rect)) {
            Pair pairE = d.e(rect);
            int iIntValue = ((Number) pairE.getFirst()).intValue();
            int iIntValue2 = ((Number) pairE.getSecond()).intValue();
            if (viewX1.getMeasuredWidth() <= 0 || viewX1.getMeasuredHeight() <= 0 || iIntValue <= 0 || iIntValue2 <= 0) {
                return;
            }
            if ((iIntValue * iIntValue2) / (viewX1.getMeasuredHeight() * viewX1.getMeasuredWidth()) >= 0.5f) {
                fVar.Xa(i7, IExposureReporter.ReporterCheckerType.DefaultChecker, null);
            }
        }
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.g
    public final void g(@NotNull ViewPager viewPager) {
        g.c(this, viewPager, viewPager.getCurrentItem());
    }
}
