package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import UD.X0;
import Xz0.p;
import com.bilibili.studio.centerplus.util.UpperCoroutineExceptionHandler;
import com.bilibili.studio.centerplus.util.i;
import com.bilibili.studio.editor.moudle.intelligence.media.bean.AnalysisMediaNum;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaSortedItem;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.trace.AlbumIntelligenceTrace;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/ServerStrategyManagerNew.class */
public final class ServerStrategyManagerNew extends com.bilibili.studio.editor.moudle.intelligence.media.strategy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final uz0.b f107456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f107457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f107458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f107459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f107460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final AlbumIntelligenceTrace f107461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f107462g;

    @NotNull
    public volatile g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public g f107463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public volatile c f107464j;

    public ServerStrategyManagerNew(@NotNull uz0.b bVar) {
        this.f107456a = bVar;
        int i7 = bVar.b;
        this.f107457b = i7 != 1 ? i7 != 2 ? i7 != 3 ? MediaStrategyItem.SOURCE_FROM_OTHER : "视频" : "图片" : MediaStrategyItem.SOURCE_FROM_ALL;
        this.f107458c = new f(bVar);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new UpperCoroutineExceptionHandler()).plus(new CoroutineName("ServerStrategyManager")));
        this.f107459d = CoroutineScope;
        this.f107460e = new a(bVar, CoroutineScope);
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.d dVar = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.d) i.a();
        this.f107461f = dVar != null ? dVar.f107413c : null;
        g gVar = b.f107467a;
        this.h = gVar;
        this.f107463i = gVar;
        this.f107464j = new c(-1, null);
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    public final void a(@NotNull MediaStrategyItem mediaStrategyItem) {
        Long lValueOf;
        MediaSortedItem mediaSortedItemPollLast;
        final f fVar = this.f107458c;
        fVar.getClass();
        ConcurrentHashMap<String, MediaStrategyItem> concurrentHashMap = mediaStrategyItem.isVideo() ? fVar.f107480d : fVar.f107481e;
        if (concurrentHashMap.containsKey(mediaStrategyItem.getMaterialKey())) {
            concurrentHashMap.put(mediaStrategyItem.getMaterialKey(), mediaStrategyItem);
            fVar.a(mediaStrategyItem);
        } else {
            ImageItem source = mediaStrategyItem.getSource();
            long j7 = source != null ? source.addTime : 0L;
            final long j8 = j7;
            BLog.d(fVar.f107477a, new Function0(fVar, j8) { // from class: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f f107475a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f107476b;

                {
                    this.f107475a = fVar;
                    this.f107476b = j8;
                }

                public final Object invoke() {
                    f fVar2 = this.f107475a;
                    String str = fVar2.f107478b;
                    int size = fVar2.f107482f.size();
                    long j9 = fVar2.f107483g;
                    StringBuilder sbA = androidx.constraintlayout.widget.e.a(size, "[", str, "] 校验素材数量：", ", addTime = ");
                    sbA.append(this.f107476b);
                    return Ld.c.a(sbA, j9, ", minAddTime = ");
                }
            });
            if (j7 <= fVar.f107483g) {
                return;
            }
            if (mediaStrategyItem.isVideo()) {
                fVar.f107480d.put(mediaStrategyItem.getMaterialKey(), mediaStrategyItem);
            } else {
                fVar.f107481e.put(mediaStrategyItem.getMaterialKey(), mediaStrategyItem);
            }
            synchronized (fVar) {
                synchronized (fVar.f107482f) {
                    lValueOf = null;
                    try {
                        Result.Companion companion = Result.Companion;
                        fVar.f107482f.add(new MediaSortedItem(mediaStrategyItem));
                        if (fVar.f107482f.size() == fVar.f107479c) {
                            MediaSortedItem mediaSortedItemLast = fVar.f107482f.last();
                            long j9 = 0;
                            if (mediaSortedItemLast != null) {
                                ImageItem imageItem = mediaSortedItemLast.getImageItem();
                                j9 = 0;
                                if (imageItem != null) {
                                    j9 = imageItem.addTime;
                                }
                            }
                            fVar.f107483g = j9;
                        } else if (fVar.f107482f.size() > fVar.f107479c) {
                            mediaSortedItemPollLast = fVar.f107482f.pollLast();
                        }
                        Result.constructor-impl(Unit.INSTANCE);
                    } finally {
                    }
                    mediaSortedItemPollLast = null;
                }
            }
            if (mediaSortedItemPollLast != null) {
                ImageItem imageItem2 = mediaSortedItemPollLast.getImageItem();
                if (imageItem2 == null || !imageItem2.isVideo()) {
                    fVar.f107481e.remove(mediaSortedItemPollLast.getMaterialKey());
                } else {
                    fVar.f107480d.remove(mediaSortedItemPollLast.getMaterialKey());
                }
            }
            String str = fVar.f107477a;
            String str2 = fVar.f107478b;
            ImageItem source2 = mediaStrategyItem.getSource();
            String str3 = source2 != null ? source2.path : null;
            ImageItem source3 = mediaStrategyItem.getSource();
            if (source3 != null) {
                lValueOf = Long.valueOf(source3.addTime);
            }
            int size = fVar.f107482f.size();
            StringBuilder sbA = G0.b.a("[", str2, "] 添加素材：", str3, ", ");
            sbA.append(lValueOf);
            sbA.append(", ");
            sbA.append(size);
            BLog.i(str, sbA.toString());
            fVar.a(mediaStrategyItem);
        }
        this.f107462g++;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    public final void b(@Nullable Function0<Unit> function0) {
        List<? extends MediaStrategyItem> listPlus = CollectionsKt.plus(this.f107458c.f107480d.values(), this.f107458c.f107481e.values());
        f("自动生成开始，素材数量：" + listPlus.size() + ", " + this.f107462g);
        g(listPlus, false);
        BuildersKt.launch$default(this.f107459d, (CoroutineContext) null, (CoroutineStart) null, new ServerStrategyManagerNew$autoGenerateResult$1(this, listPlus, function0, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew$getRecommendStrategy$1
            if (r0 == 0) goto L2b
            r0 = r7
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew$getRecommendStrategy$1 r0 = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew$getRecommendStrategy$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L35
        L2b:
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew$getRecommendStrategy$1 r0 = new com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew$getRecommendStrategy$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L35:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L61
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L78
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r7
            java.lang.Object r0 = r0.e(r1)
            r1 = r10
            if (r0 != r1) goto L78
            r0 = r10
            return r0
        L78:
            r0 = r5
            r1 = r5
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.g r1 = r1.h
            r0.f107463i = r1
            r0 = r5
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.g r0 = r0.h
            java.util.List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> r0 = r0.f107488d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew.c(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    public final void d() {
        CoroutineScopeKt.cancel$default(this.f107459d, (CancellationException) null, 1, (Object) null);
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new ServerStrategyManagerNew$release$1(this, null), 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void f(String str) {
        BLog.e(this.f107456a.a, "[" + this.f107457b + "] : " + str);
    }

    public final boolean g(List<? extends MediaStrategyItem> list, boolean z6) {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AlbumIntelligenceTrace albumIntelligenceTrace = this.f107461f;
        if (albumIntelligenceTrace != null) {
            albumIntelligenceTrace.e(strValueOf, list.size(), this.f107462g, z6, true, this.f107457b);
        }
        synchronized (this.f107460e) {
            Deferred<g> deferred = this.f107464j.f107469b;
            if ((deferred != null ? deferred.isCompleted() : true) && this.f107464j.f107468a < this.f107462g) {
                a aVar = this.f107460e;
                int i7 = this.f107462g;
                aVar.getClass();
                this.f107464j = new c(i7, BuildersKt.async$default(aVar.f107466b, (CoroutineContext) null, (CoroutineStart) null, new GenerateJobFactory$newJob$deferred$1(aVar, strValueOf, i7, list, null), 3, (Object) null));
                return true;
            }
            Unit unit = Unit.INSTANCE;
            AlbumIntelligenceTrace albumIntelligenceTrace2 = this.f107461f;
            if (albumIntelligenceTrace2 == null) {
                return false;
            }
            AlbumIntelligenceTrace.a(albumIntelligenceTrace2, strValueOf, this.f107457b, 0, null, null, "当前任务:" + this.f107464j, 24);
            return false;
        }
    }

    public final void h(g gVar, List<? extends MediaStrategyItem> list) {
        synchronized (this) {
            if (gVar.f107486b > this.h.f107486b && (this.h.f107488d.isEmpty() || !gVar.f107488d.isEmpty())) {
                this.h = gVar;
                i(gVar.f107487c, gVar.f107485a, gVar.f107488d, list);
            }
        }
    }

    public final void i(long j7, String str, List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            MediaStrategyItem mediaStrategyItem = (MediaStrategyItem) it.next();
            if (mediaStrategyItem.isVideo()) {
                arrayList3.add(mediaStrategyItem);
            } else {
                arrayList4.add(mediaStrategyItem);
            }
        }
        Iterator it2 = SequencesKt.filter(CollectionsKt.asSequence(arrayList3), new com.bilibili.ad.adview.story.iaa.c(1)).iterator();
        int i8 = 0;
        while (true) {
            i7 = i8;
            if (!it2.hasNext()) {
                break;
            }
            MediaStrategyItem mediaStrategyItem2 = (MediaStrategyItem) it2.next();
            String label = mediaStrategyItem2.getLabel();
            if (label == null) {
                label = "";
            }
            int i9 = i7;
            if (mediaStrategyItem2.isCoverAnalysisLabel()) {
                i9 = i7 + 1;
            }
            arrayList.add(label);
            Integer num = (Integer) linkedHashMap.get(label);
            linkedHashMap.put(label, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            i8 = i9;
        }
        Iterator it3 = SequencesKt.filter(CollectionsKt.asSequence(arrayList4), new X0(3)).iterator();
        while (it3.hasNext()) {
            String label2 = ((MediaStrategyItem) it3.next()).getLabel();
            String str2 = label2;
            if (label2 == null) {
                str2 = "";
            }
            arrayList2.add(str2);
            Integer num2 = (Integer) linkedHashMap2.get(str2);
            linkedHashMap2.put(str2, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a aVar = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) it4.next();
            aVar.f107399l = i7;
            aVar.f107402o = arrayList3.size();
            aVar.f107403p = arrayList4.size();
            aVar.f107400m = arrayList;
            aVar.f107401n = arrayList2;
            aVar.f107405r = str;
        }
        AnalysisMediaNum analysisMediaNum = new AnalysisMediaNum();
        analysisMediaNum.videoCount = arrayList3.size();
        analysisMediaNum.imageCount = arrayList4.size();
        AlbumIntelligenceTrace albumIntelligenceTrace = this.f107461f;
        if (albumIntelligenceTrace != null) {
            AlbumIntelligenceTrace.a(albumIntelligenceTrace, str, this.f107457b, list.size(), arrayList3, arrayList4, null, 32);
        }
        p.b("_SELECT_", 0, System.currentTimeMillis() - j7, this.f107457b, analysisMediaNum, i7 > 0);
    }
}
