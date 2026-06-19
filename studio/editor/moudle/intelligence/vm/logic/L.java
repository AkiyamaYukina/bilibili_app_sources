package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.intelligence.music.api.bean.MusicResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/L.class */
public final class L extends BiliApiDataCallback<MusicResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f107729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f107730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f107731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.studio.editor.moudle.intelligence.vm.p f107732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f107733g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Yv0.e f107734i;

    public L(String str, long j7, I i7, String str2, com.bilibili.studio.editor.moudle.intelligence.vm.p pVar, String str3, String str4, Yv0.e eVar) {
        this.f107728b = str;
        this.f107729c = j7;
        this.f107730d = i7;
        this.f107731e = str2;
        this.f107732f = pVar;
        this.f107733g = str3;
        this.h = str4;
        this.f107734i = eVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(MusicResponse musicResponse) {
        ArrayList arrayList;
        List<MusicResponse.Music> musics;
        MusicResponse.Polling polling;
        Long timeout;
        MusicResponse.Polling polling2;
        Long intervalTime;
        MusicResponse.Polling polling3;
        Long beginTime;
        MusicResponse musicResponse2 = musicResponse;
        I i7 = this.f107730d;
        i7.getClass();
        long jLongValue = (musicResponse2 == null || (polling3 = musicResponse2.getPolling()) == null || (beginTime = polling3.getBeginTime()) == null) ? 1000L : beginTime.longValue();
        long jLongValue2 = (musicResponse2 == null || (polling2 = musicResponse2.getPolling()) == null || (intervalTime = polling2.getIntervalTime()) == null) ? 200L : intervalTime.longValue();
        long jLongValue3 = (musicResponse2 == null || (polling = musicResponse2.getPolling()) == null || (timeout = polling.getTimeout()) == null) ? 3000L : timeout.longValue();
        com.bilibili.studio.editor.moudle.intelligence.vm.p pVar = this.f107732f;
        String str = this.f107728b;
        Yv0.e eVar = this.f107734i;
        String str2 = this.f107731e;
        long j7 = this.f107729c;
        if (musicResponse2 != null && musicResponse2.isPolling) {
            CoroutineScope coroutineScope = com.bilibili.studio.editor.moudle.intelligence.logic.l.f107360a;
            com.bilibili.studio.editor.moudle.intelligence.logic.l.a(str, this.f107733g, this.h, jLongValue, jLongValue2, jLongValue3, new M(str, j7, i7, str2, pVar, eVar));
            return;
        }
        if (musicResponse2 == null || (musics = musicResponse2.getMusics()) == null || musics.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            List<MusicResponse.Music> musics2 = musicResponse2.getMusics();
            if (musics2 != null) {
                Iterator<T> it = musics2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((MusicResponse.Music) it.next()).getSid()));
                }
            }
        }
        i7.j(arrayList, str, eVar, str2, j7, pVar);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
        BLog.e("NetMusicRecLogic", "startNetMusicRec onError");
        HashMap map = new HashMap();
        map.put("upload_id", this.f107728b);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f107729c;
        C9270a.a(this.f107730d, this.f107731e, "music_recom", jCurrentTimeMillis, false, "music rec net error", null, map, 96);
        this.f107732f.c(jCurrentTimeMillis, "音乐推荐网络异常");
    }
}
