package com.bilibili.studio.videoeditor.capturev3.music;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import com.bilibili.studio.videoeditor.util.C6630c;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/h.class */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f109271a;

    public /* synthetic */ h(n nVar) {
        this.f109271a = nVar;
    }

    public final Object invoke(Object obj) {
        MusicInfo value;
        Unit unit;
        Application application;
        String string;
        MusicInfo musicInfo = (MusicInfo) obj;
        if (musicInfo == null) {
            unit = Unit.INSTANCE;
        } else {
            int state = musicInfo.getState();
            n nVar = this.f109271a;
            if (state != 1) {
                if (state == 3) {
                    nVar.p().b(musicInfo.getStartTime(), nVar.q(musicInfo.getInitProgress()), musicInfo.getLocalPath(), false);
                    if (C6630c.a(BiliContext.application()) && (application = BiliContext.application()) != null && (string = application.getString(2131842174)) != null && string.length() != 0) {
                        nVar.r().h.postValue(string);
                    }
                }
            } else if (musicInfo.getType() == 1 && (value = nVar.r().f189a.getValue()) != null) {
                Job job = nVar.f109279c;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                MusicInfo value2 = nVar.r().f189a.getValue();
                if (value2 != null && value2.getState() != 2) {
                    value2.setState(2);
                    nVar.r().f189a.postValue(value2);
                }
                Xz0.d.z(Xz0.d.f28458a, "capture", "start", "bgm", String.valueOf(value.getId()));
                nVar.f109279c = BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new MusicManagerImpl$downloadMusic$1(value, nVar, null), 3, (Object) null);
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
