package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.Request;
import com.bilibili.studio.material.Result;
import com.bilibili.studio.material.report.ResultCode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/ProcessorItem.class */
public class ProcessorItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Request f108538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Result f108539b = new Result(false, null, null, 0.0d, null, null, null, false, null, null, 1023, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public xA0.b f108540c;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xA0.b] */
    public ProcessorItem(@NotNull Request request) {
        this.f108538a = request;
        ?? obj = new Object();
        ((xA0.b) obj).a = "";
        ((xA0.b) obj).b = ResultCode.START;
        ((xA0.b) obj).c = "";
        ((xA0.b) obj).d = "";
        ((xA0.b) obj).e = "";
        ((xA0.b) obj).m = "";
        ((xA0.b) obj).n = "";
        ((xA0.b) obj).o = "";
        this.f108540c = obj;
    }

    @NotNull
    public final xA0.b getReportData() {
        return this.f108540c;
    }

    @NotNull
    public final Request getRequest() {
        return this.f108538a;
    }

    @NotNull
    public final Result getResult() {
        return this.f108539b;
    }

    public final void setReportData(@NotNull xA0.b bVar) {
        this.f108540c = bVar;
    }

    public final void setResult(@NotNull Result result) {
        this.f108539b = result;
    }
}
