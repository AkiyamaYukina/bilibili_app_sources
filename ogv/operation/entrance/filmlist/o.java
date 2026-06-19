package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.relation.FollowStateManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/o.class */
public final class o implements FollowStateManager.FollowChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f70055a;

    public o(p pVar) {
        this.f70055a = pVar;
    }

    @Override // com.bilibili.relation.FollowStateManager.FollowChangeListener
    public final void onFollowChange(boolean z6) {
        p pVar = this.f70055a;
        if (z6 == pVar.f70077w) {
            return;
        }
        pVar.f70077w = z6;
        pVar.notifyPropertyChanged(232);
    }
}
