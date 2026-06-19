package com.bilibili.pegasus.page;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.feed.PegasusExposeConfig;
import dp0.C6828a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/q.class */
@StabilityInferred(parameters = 0)
public final class C5728q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecyclerView f78432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rect f78433b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public bY.c<RecyclerView> f78434c;

    public C5728q(@NotNull RecyclerView recyclerView) {
        this.f78432a = recyclerView;
    }

    public final void a(@Nullable C6828a c6828a) {
        bY.c<RecyclerView> cVar = this.f78434c;
        if (cVar != null) {
            cVar.f(c6828a != null ? c6828a.p() : 0.5f);
        }
        bY.c<RecyclerView> cVar2 = this.f78434c;
        if (cVar2 != null) {
            cVar2.g(c6828a != null ? c6828a.q() : 0.8f);
        }
        bY.c<RecyclerView> cVar3 = this.f78434c;
        if (cVar3 != null) {
            float fN = 0.8f;
            if (c6828a != null) {
                fN = c6828a.n();
            }
            cVar3.e(fN);
        }
        bY.c<RecyclerView> cVar4 = this.f78434c;
        if (cVar4 != null) {
            boolean supportReportExposeDuration = PegasusExposeConfig.INSTANCE.getSupportReportExposeDuration();
            j4.t.a("setSupportTimeExpose:", "[Expose]ExposeClient", supportReportExposeDuration);
            cVar4.k = supportReportExposeDuration;
        }
    }
}
