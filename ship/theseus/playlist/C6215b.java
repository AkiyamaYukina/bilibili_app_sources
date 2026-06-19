package com.bilibili.ship.theseus.playlist;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/b.class */
public final class C6215b implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractActivityC6216c f95336a;

    public C6215b(AbstractActivityC6216c abstractActivityC6216c) {
        this.f95336a = abstractActivityC6216c;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        AbstractActivityC6216c abstractActivityC6216c = this.f95336a;
        if (abstractActivityC6216c.f95340E) {
            return;
        }
        abstractActivityC6216c.f95340E = true;
        ((P) abstractActivityC6216c.generatedComponent()).d((UnitedPlaylistActivity) UnsafeCasts.unsafeCast(abstractActivityC6216c));
    }
}
