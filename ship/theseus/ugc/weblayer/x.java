package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.note.RspNoteListByOid;
import com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/x.class */
public final class x extends BiliApiDataCallback<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NoteListFloatLayerComponent.b f98708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RspNoteListByOid.Note f98709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98710d;

    public x(NoteListFloatLayerComponent.b bVar, RspNoteListByOid.Note note, int i7) {
        this.f98708b = bVar;
        this.f98709c = note;
        this.f98710d = i7;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        NoteListFloatLayerComponent.e eVar = this.f98708b.f98645a;
        return false;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Void r52) {
        RspNoteListByOid.Note note = this.f98709c;
        note.isRecommended = !note.isRecommended;
        note.recommendAmount--;
        NoteListFloatLayerComponent.b bVar = this.f98708b;
        ArrayList arrayList = (ArrayList) bVar.f98651g;
        int i7 = this.f98710d;
        RspNoteListByOid.Note note2 = (RspNoteListByOid.Note) arrayList.get(i7);
        note2.isRecommended = note.isRecommended;
        note2.recommendAmount = note.recommendAmount;
        bVar.f98645a.f98657a.notifyItemChanged(i7);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        defpackage.a.b("note cancel recommend failed > ", th != null ? th.getMessage() : null, this.f98708b.h);
    }
}
