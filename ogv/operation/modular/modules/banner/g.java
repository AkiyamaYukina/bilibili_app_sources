package com.bilibili.ogv.operation.modular.modules.banner;

import android.view.Choreographer;
import com.bilibili.ogv.operation.inlineplayer1.OGVBannerInlinePlayerFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/g.class */
public final class g implements OGVBannerInlinePlayerFragment.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f70457a;

    public g(i iVar) {
        this.f70457a = iVar;
    }

    @Override // com.bilibili.ogv.operation.inlineplayer1.OGVBannerInlinePlayerFragment.a
    public final void a(int i7) {
        final i iVar = this.f70457a;
        if (i7 == 4) {
            if (true == iVar.f70433b) {
                return;
            }
            iVar.f70433b = true;
            iVar.notifyPropertyChanged(695);
            return;
        }
        if (i7 == 5) {
            iVar.o(true);
            if (iVar.f70433b) {
                iVar.f70433b = false;
                iVar.notifyPropertyChanged(695);
            }
            if (true != iVar.f70434c) {
                iVar.f70434c = true;
                iVar.notifyPropertyChanged(302);
            }
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(iVar) { // from class: com.bilibili.ogv.operation.modular.modules.banner.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final i f70452a;

                {
                    this.f70452a = iVar;
                }

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    i iVar2 = this.f70452a;
                    if (iVar2.f70434c) {
                        iVar2.f70434c = false;
                        iVar2.notifyPropertyChanged(302);
                    }
                }
            });
            return;
        }
        if (i7 == 6 || i7 == 10) {
            if (iVar.f70433b) {
                iVar.f70433b = false;
                iVar.notifyPropertyChanged(695);
            }
            if (true != iVar.f70434c) {
                iVar.f70434c = true;
                iVar.notifyPropertyChanged(302);
            }
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(iVar) { // from class: com.bilibili.ogv.operation.modular.modules.banner.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final i f70452a;

                {
                    this.f70452a = iVar;
                }

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    i iVar2 = this.f70452a;
                    if (iVar2.f70434c) {
                        iVar2.f70434c = false;
                        iVar2.notifyPropertyChanged(302);
                    }
                }
            });
            iVar.o(true);
        }
    }

    @Override // com.bilibili.ogv.operation.inlineplayer1.OGVBannerInlinePlayerFragment.a
    public final void b(boolean z6) {
        this.f70457a.o(z6);
    }
}
