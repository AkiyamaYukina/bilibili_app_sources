package com.bilibili.playset.playlist.search2;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/l.class */
public final class l implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f85464a;

    public l(m mVar) {
        this.f85464a = mVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        m mVar = this.f85464a;
        if (mVar.f85468E) {
            return;
        }
        mVar.f85468E = true;
        b bVar = (b) mVar.generatedComponent();
        bVar.getClass();
    }
}
