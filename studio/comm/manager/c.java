package com.bilibili.studio.comm.manager;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.bilibili.aurorasdk.AuroraVersion;
import com.bilibili.base.BiliContext;
import com.bilibili.montage.MontageVersion;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListByIdBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateUrlRatio;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/c.class */
public abstract class c<T> implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<? extends T> f105381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<? extends T> f105382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f105383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f105384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<Function0<Unit>> f105385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Long, List<Pair<Integer, Integer>>> f105386f = new ConcurrentHashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/c$a.class */
    public static final class a extends BiliApiCallback<GeneralResponse<EditorTemplateListByIdBean>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c<T> f105387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Long> f105388c;

        public a(c<T> cVar, List<Long> list) {
            this.f105387b = cVar;
            this.f105388c = list;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            Iterator<T> it = this.f105388c.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                c<T> cVar = this.f105387b;
                List<Pair<Integer, Integer>> list = cVar.f105386f.get(Long.valueOf(jLongValue));
                if (list != null && list.size() == 0) {
                    cVar.f105386f.remove(Long.valueOf(jLongValue));
                }
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onSuccess(GeneralResponse<EditorTemplateListByIdBean> generalResponse) {
            EditorTemplateListByIdBean editorTemplateListByIdBean;
            List<EditorTemplateTabItemBean> list;
            GeneralResponse<EditorTemplateListByIdBean> generalResponse2 = generalResponse;
            if (generalResponse2 == null || (editorTemplateListByIdBean = generalResponse2.data) == null || (list = editorTemplateListByIdBean.list) == null) {
                return;
            }
            for (EditorTemplateTabItemBean editorTemplateTabItemBean : list) {
                List<EditorTemplateUrlRatio> list2 = editorTemplateTabItemBean.downloadUrlArr;
                if (list2 != null) {
                    this.f105387b.f105386f.put(Long.valueOf(editorTemplateTabItemBean.id), SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(list2), new IC.a(2)), new IC.b(1))));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.bilibili.studio.comm.manager.c] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.bilibili.studio.comm.manager.c] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.bilibili.studio.comm.manager.c] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.bilibili.studio.comm.manager.c] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(com.bilibili.studio.comm.manager.c r5, long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.manager.c.d(com.bilibili.studio.comm.manager.c, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public abstract String b();

    @NotNull
    public abstract List<T> c();

    public final void e(@NotNull String str) {
        BLog.e("IgvResource", str);
    }

    public final void f() {
        synchronized (this) {
            List<Function0<Unit>> list = this.f105385e;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
            }
            this.f105385e = null;
        }
    }

    public final void g(@NotNull Collection<Long> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (this.f105386f.get(Long.valueOf(jLongValue)) == null) {
                this.f105386f.put(Long.valueOf(jLongValue), CollectionsKt.emptyList());
                arrayList.add(Long.valueOf(jLongValue));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        TC0.g gVar = (TC0.g) ServiceGenerator.createService(TC0.g.class);
        String strP = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
        com.bilibili.studio.editor.timeline.d dVar = com.bilibili.studio.editor.timeline.d.f108285a;
        dVar.getClass();
        String auroraVersion = AuroraVersion.getAuroraVersion();
        String str = auroraVersion;
        if (auroraVersion == null) {
            str = "";
        }
        dVar.getClass();
        gVar.getTemplateItemListById(strP, 0, "mon", str, MontageVersion.getVersion()).enqueue(new a(this, arrayList));
    }

    public final void h(@NotNull List<? extends T> list) {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        try {
            File file = new File(application.getCacheDir(), "upper_album_intelligence");
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file, b());
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FilesKt.l(file2, JSON.toJSONString(list));
        } catch (Exception e7) {
            e("write error, " + e7 + ".message");
        }
    }
}
