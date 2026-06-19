package com.bilibili.studio.editor.moudle.music.manager;

import com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.MaterialLabelError;
import hz0.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/d.class */
public final class d implements IntelligenceModDownloadLogic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f107917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.a f107918b;

    public d(c cVar, c.a aVar) {
        this.f107917a = cVar;
        this.f107918b = aVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
    public final void a(long j7, String str) {
        this.f107917a.f107912c = 2;
        c cVar = this.f107917a;
        c.a aVar = this.f107918b;
        if (cVar.f107915f) {
            BLog.e("MusicRecImageRecManager", "callbackModFail isReleased=true");
            return;
        }
        hz0.c cVar2 = aVar.a;
        if (cVar2.c != null) {
            Function1 function1 = null;
            EditorAIRecResult editorAIRecResult = new EditorAIRecResult("", MaterialLabelError.ERROR_MOD_DOWNLOAD, null);
            Function1 function12 = cVar2.b;
            if (function12 != null) {
                function1 = function12;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("onImageRecOver");
            }
            function1.invoke(editorAIRecResult);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
    public final void b(long j7, String str, String str2) {
        this.f107917a.f107912c = 1;
        BuildersKt.launch$default(this.f107917a.f107910a, Dispatchers.getIO(), (CoroutineStart) null, new MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1(this.f107917a, this.f107918b, null), 2, (Object) null);
    }
}
