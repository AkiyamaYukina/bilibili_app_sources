package com.bilibili.ogv.infra.legacy.exposure;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/f.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
public interface f extends Oj0.d {
    void b(@NotNull RecyclerView recyclerView, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType);
}
