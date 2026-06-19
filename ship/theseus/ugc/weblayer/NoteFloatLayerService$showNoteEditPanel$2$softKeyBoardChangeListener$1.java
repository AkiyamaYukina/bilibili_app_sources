package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.playerbizcommon.utils.l;
import com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1.class */
public final class NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusWebUIComponent f98625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NoteFloatLayerService f98626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef<Job> f98627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f98628d;

    public NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1(TheseusWebUIComponent theseusWebUIComponent, NoteFloatLayerService noteFloatLayerService, Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope) {
        this.f98625a = theseusWebUIComponent;
        this.f98626b = noteFloatLayerService;
        this.f98627c = objectRef;
        this.f98628d = coroutineScope;
    }

    @Override // com.bilibili.playerbizcommon.utils.l.a
    public final void keyBoardHide() {
        this.f98625a.j(0);
        NoteFloatLayerService.a aVar = this.f98626b.f98618x;
        if (aVar != null) {
            aVar.onKeyboardEvent(false, 0);
        }
        Job job = (Job) this.f98627c.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.bilibili.playerbizcommon.utils.l.a
    public final void keyBoardShow(int i7) {
        NoteFloatLayerService noteFloatLayerService = this.f98626b;
        NoteFloatLayerService.a aVar = noteFloatLayerService.f98618x;
        if (aVar != null) {
            aVar.onKeyboardEvent(true, i7);
        }
        this.f98625a.j(i7);
        Ref.ObjectRef<Job> objectRef = this.f98627c;
        objectRef.element = BuildersKt.launch$default(this.f98628d, (CoroutineContext) null, (CoroutineStart) null, new NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1$keyBoardShow$1(noteFloatLayerService, objectRef, null), 3, (Object) null);
    }
}
