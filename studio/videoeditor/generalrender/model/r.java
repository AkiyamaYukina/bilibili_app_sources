package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import androidx.appcompat.widget.C3259x;
import androidx.room.B;
import com.bilibili.lib.okdownloader.DownloadListener;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import com.bilibili.studio.videoeditor.generalrender.model.p;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/r.class */
public final class r implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GRResourceInfo f109647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f109648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f109650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2297a f109651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ref.ObjectRef<String> f109652f;

    public r(GRResourceInfo gRResourceInfo, CancellableContinuationImpl cancellableContinuationImpl, String str, p pVar, InterfaceC2297a interfaceC2297a, Ref.ObjectRef objectRef) {
        this.f109647a = gRResourceInfo;
        this.f109648b = cancellableContinuationImpl;
        this.f109649c = str;
        this.f109650d = pVar;
        this.f109651e = interfaceC2297a;
        this.f109652f = objectRef;
    }

    public final void onCancel(String str) {
        super.onCancel(str);
        Thread threadCurrentThread = Thread.currentThread();
        GRResourceInfo gRResourceInfo = this.f109647a;
        String source = gRResourceInfo.getSource();
        CancellableContinuationImpl cancellableContinuationImpl = this.f109648b;
        int iHashCode = cancellableContinuationImpl.hashCode();
        StringBuilder sb = new StringBuilder("onCancel:");
        sb.append(str);
        sb.append("  ");
        sb.append(threadCurrentThread);
        sb.append(" url:");
        H0.e.b(iHashCode, source, " it:", " dir:", sb);
        sb.append(this.f109649c);
        BLog.i("GRUrlDownloadManager", sb.toString());
        p.a aVar = new p.a(-1, "download cancel");
        this.f109650d.getClass();
        p.b(cancellableContinuationImpl, aVar, gRResourceInfo, this.f109651e);
    }

    public final void onError(String str, List<Integer> list, long j7, long j8) {
        super.onError(str, list, j7, j8);
        int iIntValue = list != null ? list.get(0).intValue() : -1;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder("onError:");
        sb.append(str);
        sb.append("  ");
        sb.append(threadCurrentThread);
        sb.append("  it:");
        CancellableContinuationImpl cancellableContinuationImpl = this.f109648b;
        sb.append(cancellableContinuationImpl);
        sb.append(" dir:");
        sb.append(this.f109649c);
        BLog.e("GRUrlDownloadManager", sb.toString());
        p.a aVar = new p.a(iIntValue, C3259x.a(iIntValue, "download error errorCode:"));
        this.f109650d.getClass();
        p.b(cancellableContinuationImpl, aVar, this.f109647a, this.f109651e);
    }

    public final void onFinish(String str, String str2, String str3) {
        super.onFinish(str, str2, str3);
        p.a aVar = new p.a(0);
        Thread threadCurrentThread = Thread.currentThread();
        GRResourceInfo gRResourceInfo = this.f109647a;
        String source = gRResourceInfo.getSource();
        Object obj = this.f109652f.element;
        StringBuilder sb = new StringBuilder("onFinish:");
        sb.append(str);
        sb.append("  ");
        sb.append(threadCurrentThread);
        sb.append(" url:");
        B.a(source, " name:", str3, " it:", sb);
        CancellableContinuationImpl cancellableContinuationImpl = this.f109648b;
        sb.append(cancellableContinuationImpl);
        sb.append(" fileName:");
        sb.append(obj);
        sb.append("  dir:");
        bilibili.live.app.service.resolver.b.a(sb, str2, "GRUrlDownloadManager");
        this.f109650d.getClass();
        p.b(cancellableContinuationImpl, aVar, gRResourceInfo, this.f109651e);
    }
}
