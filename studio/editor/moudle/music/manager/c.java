package com.bilibili.studio.editor.moudle.music.manager;

import Yv0.e;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.MaterialLabelError;
import hz0.c;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/c.class */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f107912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f107913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f107914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f107915f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f107910a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IntelligenceModDownloadLogic f107911b = new IntelligenceModDownloadLogic();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final xz0.a f107916g = new xz0.a();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/c$a.class */
    public interface a {
        void a(@NotNull String str);

        void b(@NotNull MaterialLabelError materialLabelError);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/c$b.class */
    public interface b {
        void a();
    }

    public final void a(MaterialLabelError materialLabelError, a aVar) {
        if (this.f107915f) {
            BLog.e("MusicRecImageRecManager", "callbackRecFail isReleased=true");
        } else {
            aVar.b(materialLabelError);
        }
    }

    public final void b(List list, c.b bVar) {
        BuildersKt.launch$default(this.f107910a, Dispatchers.getIO(), (CoroutineStart) null, new MusicRecImageRecManager$imageRecMulti$1(this, list, bVar, null), 2, (Object) null);
    }
}
