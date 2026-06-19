package com.bilibili.ogv.infra.legacy.exposure;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import kotlin.Deprecated;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/a.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
@StabilityInferred(parameters = 0)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f67883a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Rect f67884b = new Rect();

    @Override // com.bilibili.ogv.infra.legacy.exposure.e
    public final void d(@NotNull View view, @Nullable IExposureReporter iExposureReporter, int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType) {
        float measuredHeight;
        if (iExposureReporter == null || iExposureReporter.ve(i7, IExposureReporter.ReporterCheckerType.DefaultChecker)) {
            Rect rect = f67884b;
            rect.setEmpty();
            if (view.getGlobalVisibleRect(rect)) {
                Pair pairE = d.e(rect);
                int iIntValue = ((Number) pairE.getFirst()).intValue();
                int iIntValue2 = ((Number) pairE.getSecond()).intValue();
                measuredHeight = 0.0f;
                if (view.getMeasuredWidth() > 0) {
                    if (view.getMeasuredHeight() <= 0) {
                        measuredHeight = 0.0f;
                    } else {
                        measuredHeight = (iIntValue * iIntValue2) / (view.getMeasuredHeight() * view.getMeasuredWidth());
                    }
                }
            } else {
                measuredHeight = 0.0f;
            }
            if (measuredHeight < 0.5f || iExposureReporter == null) {
                return;
            }
            iExposureReporter.Xa(i7, IExposureReporter.ReporterCheckerType.DefaultChecker, view);
        }
    }
}
