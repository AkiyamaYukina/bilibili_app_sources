package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.intelligence.music.api.bean.PollingMusicResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/M.class */
public final class M extends BiliApiDataCallback<PollingMusicResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f107736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f107737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f107738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.studio.editor.moudle.intelligence.vm.p f107739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Yv0.e f107740g;

    public M(String str, long j7, I i7, String str2, com.bilibili.studio.editor.moudle.intelligence.vm.p pVar, Yv0.e eVar) {
        this.f107735b = str;
        this.f107736c = j7;
        this.f107737d = i7;
        this.f107738e = str2;
        this.f107739f = pVar;
        this.f107740g = eVar;
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
    public final void onDataSuccess(PollingMusicResponse pollingMusicResponse) {
        ArrayList arrayList;
        List<PollingMusicResponse.Music> musics;
        PollingMusicResponse pollingMusicResponse2 = pollingMusicResponse;
        if (pollingMusicResponse2 == null || (musics = pollingMusicResponse2.getMusics()) == null || musics.isEmpty()) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            List<PollingMusicResponse.Music> musics2 = pollingMusicResponse2.getMusics();
            arrayList = arrayList2;
            if (musics2 != null) {
                Iterator<T> it = musics2.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        arrayList2.add(String.valueOf(((PollingMusicResponse.Music) it.next()).getSid()));
                    }
                }
            }
        }
        this.f107737d.j(arrayList, this.f107735b, this.f107740g, this.f107738e, this.f107736c, this.f107739f);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
        BLog.e("NetMusicRecLogic", "startPollingMusicRec onError");
        HashMap map = new HashMap();
        map.put("upload_id", this.f107735b);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f107736c;
        C9270a.a(this.f107737d, this.f107738e, "music_recom", jCurrentTimeMillis, false, "music rec net error", null, map, 96);
        this.f107739f.c(jCurrentTimeMillis, "音乐推荐网络异常");
    }
}
