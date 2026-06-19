package com.bilibili.pegasus.channelv3.movie.head;

import com.bilibili.pegasus.utils.AbstractC5761e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/g.class */
public final class g extends AbstractC5761e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f75418a;

    public g(f fVar) {
        this.f75418a = fVar;
    }

    public final int b() {
        return 2131845213;
    }

    public final void d(boolean z6) {
        e.a((ChannelMovieHeadVM) this.f75418a.f75409c.getValue(), MovieButtonName.COLLECT, this.f75418a.f75410d);
        eg.a aVar = this.f75418a.f75407a.f75285D;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channelManager");
            aVar = null;
        }
        f fVar = this.f75418a;
        eg.a.b(aVar, fVar.f75412f, fVar.f75410d);
    }

    public final CharSequence e() {
        return this.f75418a.f75411e;
    }

    public final boolean f() {
        return this.f75418a.f75410d;
    }
}
