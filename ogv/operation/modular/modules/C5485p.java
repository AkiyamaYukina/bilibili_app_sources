package com.bilibili.ogv.operation.modular.modules;

import android.view.Choreographer;
import com.bilibili.ogv.operation.inlineplayer1.OGVBannerInlinePlayerFragment;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/p.class */
public final class C5485p implements OGVBannerInlinePlayerFragment.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5488t f70735a;

    public C5485p(C5488t c5488t) {
        this.f70735a = c5488t;
    }

    @Override // com.bilibili.ogv.operation.inlineplayer1.OGVBannerInlinePlayerFragment.a
    public final void a(int i7) {
        final C5488t c5488t = this.f70735a;
        if (i7 == 4) {
            c5488t.f70761v = true;
            c5488t.notifyPropertyChanged(695);
            return;
        }
        if (i7 == 5) {
            c5488t.n(true);
            c5488t.f70761v = false;
            c5488t.notifyPropertyChanged(695);
            if (true != c5488t.f70763x) {
                c5488t.f70763x = true;
                c5488t.notifyPropertyChanged(302);
            }
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(c5488t) { // from class: com.bilibili.ogv.operation.modular.modules.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5488t f70741a;

                {
                    this.f70741a = c5488t;
                }

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    C5488t c5488t2 = this.f70741a;
                    if (c5488t2.f70763x) {
                        c5488t2.f70763x = false;
                        c5488t2.notifyPropertyChanged(302);
                    }
                }
            });
            return;
        }
        if (i7 == 6 || i7 == 10) {
            c5488t.f70761v = false;
            c5488t.notifyPropertyChanged(695);
            if (true != c5488t.f70763x) {
                c5488t.f70763x = true;
                c5488t.notifyPropertyChanged(302);
            }
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(c5488t) { // from class: com.bilibili.ogv.operation.modular.modules.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5488t f70741a;

                {
                    this.f70741a = c5488t;
                }

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    C5488t c5488t2 = this.f70741a;
                    if (c5488t2.f70763x) {
                        c5488t2.f70763x = false;
                        c5488t2.notifyPropertyChanged(302);
                    }
                }
            });
            c5488t.n(true);
        }
    }

    @Override // com.bilibili.ogv.operation.inlineplayer1.OGVBannerInlinePlayerFragment.a
    public final void b(boolean z6) {
        this.f70735a.n(z6);
    }
}
