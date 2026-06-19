package com.bilibili.studio.editor.moudle.editormain.track.manager;

import Kx0.d;
import Mx0.g;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.BiliEditorMaterialPanelTrackView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/manager/a.class */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f106182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorMaterialPanelTrackView f106183b;

    public a(g gVar, BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView) {
        this.f106182a = gVar;
        this.f106183b = biliEditorMaterialPanelTrackView;
    }

    @Override // Kx0.d
    public final List a() {
        ArrayList arrayList = new ArrayList();
        g gVar = this.f106182a;
        arrayList.add(g.b(gVar));
        SequencesKt.toCollection(SequencesKt.flatMapIterable(CollectionsKt.asSequence(this.f106183b.getAllMaterial()), new EditorTrackManager$initVideoCoverTrackAdsorbProvider$provider$1$provideAdsorbList$1(gVar)), arrayList);
        return arrayList;
    }
}
