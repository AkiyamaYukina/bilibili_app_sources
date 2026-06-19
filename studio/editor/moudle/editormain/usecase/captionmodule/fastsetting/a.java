package com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting;

import Ex0.n;
import Ky0.h0;
import PH.k;
import Xz0.d;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.app.comment3.utils.r;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackLocationMode;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import j4.t;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/captionmodule/fastsetting/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n f107147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h0 f107148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Sy0.a f107149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MiddleControlUseCase f107150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public k f107151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f107152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f107153g;

    @Inject
    public a(@NotNull n nVar, @NotNull h0 h0Var, @NotNull Sy0.a aVar, @NotNull MiddleControlUseCase middleControlUseCase) {
        this.f107147a = nVar;
        this.f107148b = h0Var;
        this.f107149c = aVar;
        this.f107150d = middleControlUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a aVar) {
        aVar.getClass();
        d.f28458a.getClass();
        Map mapE = d.e();
        ((HashMap) mapE).put("zoom_type", "放大");
        Neurons.reportClick(false, "creation.new-video-editor.words-text-panel.zoom.click", mapE);
        t.a("enterLargeEditMode, ", "EditorCaptionLargeEditUseCase", aVar.f107152f);
        if (aVar.f107152f || !aVar.b()) {
            return;
        }
        aVar.f107152f = true;
        aVar.f107153g = System.currentTimeMillis();
        aVar.f107147a.j();
        k kVar = aVar.f107151e;
        if (kVar != null) {
            kVar.invoke(Boolean.TRUE);
        }
        ez0.b bVar = aVar.f107148b.f13127a;
        bVar.p.setValue(new Ey0.k(true));
        aVar.f107149c.C(EditorTrackLocationMode.LOCATION_BOTTOM_2);
        aVar.f107150d.f107186d.m.setValue(new Gy0.a(true, true, new Ny0.a(aVar, 0)));
    }

    public final boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f107153g;
        StringBuilder sbA = z.a(jCurrentTimeMillis, "checkChangedInterval, ", "-");
        sbA.append(j7);
        r.b(jCurrentTimeMillis - j7, " = ", "EditorCaptionLargeEditUseCase", sbA);
        return jCurrentTimeMillis - this.f107153g >= 200;
    }

    public final boolean c() {
        t.a("exitLargeEditMode, ", "EditorCaptionLargeEditUseCase", this.f107152f);
        if (!this.f107152f || !b()) {
            return false;
        }
        this.f107152f = false;
        this.f107153g = System.currentTimeMillis();
        this.f107147a.j();
        k kVar = this.f107151e;
        if (kVar != null) {
            kVar.invoke(Boolean.FALSE);
        }
        this.f107149c.C(EditorTrackLocationMode.LOCATION_MID_2_HIGH);
        this.f107150d.f107186d.m.setValue(new Gy0.a(true, false, new EditorCaptionLargeEditUseCase$exitLargeEditMode$1(this)));
        return true;
    }
}
