package com.bilibili.upper.module.cover_v2.ui;

import OS0.t0;
import android.net.Uri;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/i.class */
public final class i implements MultiCoverOperateView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverActivity f112963a;

    public i(MultiCoverActivity multiCoverActivity) {
        this.f112963a = multiCoverActivity;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView.a
    public final void a(String str) {
        Neurons.reportClick(false, "creation.publish.cover-service.5.click", new LinkedHashMap());
        int i7 = MultiCoverActivity.f112864K;
        MultiCoverActivity multiCoverActivity = this.f112963a;
        multiCoverActivity.P6(str);
        long currentSeekTime = multiCoverActivity.X6().f112885i.getCurrentSeekTime();
        KH0.i iVar = multiCoverActivity.f112865A;
        if (iVar != null) {
            iVar.j(currentSeekTime);
        }
        multiCoverActivity.Q6();
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView.a
    public final void b() {
        Neurons.reportClick(false, "creation.publish.cover-service.3.click", new LinkedHashMap());
        int i7 = MultiCoverActivity.f112864K;
        MultiCoverActivity multiCoverActivity = this.f112963a;
        multiCoverActivity.getClass();
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/edit_cover/")).extras(new t0(1)).requestCode(multiCoverActivity.f112875x).build(), multiCoverActivity);
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView.a
    public final void c(String str) {
        int i7 = MultiCoverActivity.f112864K;
        MultiCoverActivity multiCoverActivity = this.f112963a;
        multiCoverActivity.P6(str);
        multiCoverActivity.Q6();
    }
}
