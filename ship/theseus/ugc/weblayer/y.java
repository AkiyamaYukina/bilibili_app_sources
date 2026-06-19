package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.note.RspNoteListByOid;
import com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/y.class */
public final class y extends BiliApiDataCallback<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NoteListFloatLayerComponent.b f98711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RspNoteListByOid.Note f98712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98713d;

    public y(NoteListFloatLayerComponent.b bVar, RspNoteListByOid.Note note, int i7) {
        this.f98711b = bVar;
        this.f98712c = note;
        this.f98713d = i7;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        NoteListFloatLayerComponent.e eVar = this.f98711b.f98645a;
        return false;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Void r52) {
        RspNoteListByOid.Note note = this.f98712c;
        note.isRecommended = !note.isRecommended;
        note.recommendAmount++;
        NoteListFloatLayerComponent.b bVar = this.f98711b;
        ArrayList arrayList = (ArrayList) bVar.f98651g;
        int i7 = this.f98713d;
        RspNoteListByOid.Note note2 = (RspNoteListByOid.Note) arrayList.get(i7);
        note2.isRecommended = note.isRecommended;
        note2.recommendAmount = note.recommendAmount;
        bVar.f98645a.f98657a.notifyItemChanged(i7);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        defpackage.a.b("note confirm recommend failed > ", th != null ? th.getMessage() : null, this.f98711b.h);
    }
}
