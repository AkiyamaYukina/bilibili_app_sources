package com.bilibili.ogv.infra.legacy.exposure;

import android.view.View;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/e.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
public interface e extends Oj0.d {
    void d(@NotNull View view, @Nullable IExposureReporter iExposureReporter, int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType);
}
