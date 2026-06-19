package com.bilibili.netquality;

import android.text.TextUtils;
import androidx.core.view.C4559c;
import com.bilibili.lib.rpc.report.HttpReporter;
import com.bilibili.lib.rpc.track.model.NetworkEvent;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/netquality/e.class */
public final class e implements HttpReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public h f67359a;

    @Override // com.bilibili.lib.rpc.report.HttpReporter
    public final void report(@NotNull NetworkEvent networkEvent) {
        boolean z6;
        boolean zIsEmpty = TextUtils.isEmpty(networkEvent.getNetExceptionMessage());
        h hVar = this.f67359a;
        if (!zIsEmpty || networkEvent.getMetrics().getRespPackageSize() <= 0) {
            networkEvent.getRealUrl();
            z6 = false;
            f fVar = new f(false);
            synchronized (hVar.f67358d) {
                ((LinkedList) hVar.f67358d).add(fVar);
            }
        } else {
            networkEvent.getRealUrl();
            z6 = true;
            f fVar2 = new f(true);
            synchronized (hVar.f67358d) {
                ((LinkedList) hVar.f67358d).add(fVar2);
            }
        }
        String realUrl = networkEvent.getRealUrl();
        String netExceptionName = networkEvent.getNetExceptionName();
        long respCost = networkEvent.getMetrics().getRespCost();
        long respPackageSize = networkEvent.getMetrics().getRespPackageSize();
        StringBuilder sbA = G0.b.a("record: ", realUrl, " ", netExceptionName, " ");
        C4559c.a(respCost, " respCost ", sbA, z6);
        sbA.append(" respPackageSize ");
        sbA.append(respPackageSize);
        BLog.d("QualityAnalyse", sbA.toString());
    }
}
