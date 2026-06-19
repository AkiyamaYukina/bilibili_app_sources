package com.bilibili.ship.theseus.ugc.weblayer;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/e.class */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f98677b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f98676a = i7;
        this.f98677b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98676a) {
            case 0:
                NoteFloatLayerService noteFloatLayerService = (NoteFloatLayerService) this.f98677b;
                Job job = noteFloatLayerService.f98613s;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                Job job2 = noteFloatLayerService.f98614t;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                break;
            default:
                com.bilibili.studio.videoeditor.help.compiler.sdk.i iVar = (com.bilibili.studio.videoeditor.help.compiler.sdk.i) this.f98677b;
                Iterator<CC0.g> it = iVar.f109706m.iterator();
                while (it.hasNext()) {
                    it.next().g(iVar.f109698d.dstMediaPath);
                }
                break;
        }
    }
}
