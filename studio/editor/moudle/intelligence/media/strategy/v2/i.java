package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import X1.C3081k;
import androidx.annotation.WorkerThread;
import androidx.compose.foundation.text.selection.P0;
import com.bilibili.app.comm.aphro.preview.page.p;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.trace.AlbumIntelligenceTrace;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/i.class */
public final class i<T> extends com.bilibili.studio.editor.moudle.intelligence.media.strategy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.intelligence.media.strategy.c f107433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f107434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final d f107435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final g f107436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final c f107437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final b f107438f;
    public volatile boolean h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final AlbumIntelligenceTrace f107444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f107445n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public volatile List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> f107439g = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> f107440i = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f107441j = LazyKt.lazy(new p(this, 2));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f107442k = LazyKt.lazy(new K3.g(8));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f107443l = Executors.newSingleThreadExecutor();

    public i(@NotNull com.bilibili.studio.editor.moudle.intelligence.media.strategy.c cVar, @Nullable a aVar, @Nullable d dVar, @Nullable g gVar, @Nullable c cVar2, @Nullable b bVar) {
        this.f107433a = cVar;
        this.f107434b = aVar;
        this.f107435c = dVar;
        this.f107436d = gVar;
        this.f107437e = cVar2;
        this.f107438f = bVar;
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.d dVar2 = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.d) com.bilibili.studio.centerplus.util.i.a();
        this.f107444m = dVar2 != null ? dVar2.f107413c : null;
        int i7 = cVar.f107407a;
        this.f107445n = i7 != 1 ? i7 != 2 ? i7 != 3 ? MediaStrategyItem.SOURCE_FROM_OTHER : "视频" : "图片" : MediaStrategyItem.SOURCE_FROM_ALL;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024e  */
    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem r8) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.i.a(com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem):void");
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    @WorkerThread
    public final void b(@Nullable final Function0<Unit> function0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ExecutorService executorService = this.f107443l;
        final String strValueOf = String.valueOf(jCurrentTimeMillis);
        executorService.submit(new Runnable(this, function0, strValueOf) { // from class: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final i f107430a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f107431b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f107432c;

            {
                this.f107430a = this;
                this.f107431b = function0;
                this.f107432c = strValueOf;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = this.f107430a;
                Function0 function02 = this.f107431b;
                String str = this.f107432c;
                c cVar = iVar.f107437e;
                int iB = cVar != null ? cVar.b() : 0;
                ay.b.a(androidx.constraintlayout.widget.e.a(iB, "[生成结果][", iVar.f107445n, "] 自动生成开始，兜底素材数量：", ", "), iVar.h, "intelligence_rec_tag");
                synchronized (iVar) {
                    AlbumIntelligenceTrace albumIntelligenceTrace = iVar.f107444m;
                    if (albumIntelligenceTrace != null) {
                        albumIntelligenceTrace.e(str, iB, 0, false, false, iVar.f107445n);
                    }
                    if (iVar.h) {
                        iVar.h = false;
                        iVar.e(str);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        AlbumIntelligenceTrace albumIntelligenceTrace2 = iVar.f107444m;
                        if (albumIntelligenceTrace2 != null) {
                            AlbumIntelligenceTrace.a(albumIntelligenceTrace2, str, iVar.f107445n, 0, null, null, "未新增素材", 24);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
                function02.invoke();
            }
        });
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    @Nullable
    public final Object c(boolean z6, @NotNull Continuation continuation) {
        if (z6) {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            c cVar = this.f107437e;
            int iB = cVar != null ? cVar.b() : 0;
            P0.a(iB, "intelligence_rec_tag", C3081k.b("[生成结果][", this.f107445n, "] 是否强制生成：", ", 兜底素材数量：", this.f107439g.isEmpty() && this.h));
            synchronized (this) {
                if (this.f107439g.isEmpty() && this.h) {
                    AlbumIntelligenceTrace albumIntelligenceTrace = this.f107444m;
                    if (albumIntelligenceTrace != null) {
                        albumIntelligenceTrace.e(strValueOf, iB, 0, true, false, this.f107445n);
                    }
                    this.h = false;
                    e(strValueOf);
                    Unit unit = Unit.INSTANCE;
                } else {
                    String str = !this.f107439g.isEmpty() ? "当前已有结果" : "未新增素材";
                    AlbumIntelligenceTrace albumIntelligenceTrace2 = this.f107444m;
                    if (albumIntelligenceTrace2 != null) {
                        AlbumIntelligenceTrace.a(albumIntelligenceTrace2, strValueOf, this.f107445n, 0, null, null, str, 24);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        this.f107440i.clear();
        this.f107440i.addAll(this.f107439g);
        return this.f107439g;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.a
    public final void d() {
        int i7 = this.f107433a.f107407a;
        Pair pair = i7 != 1 ? i7 != 2 ? i7 != 3 ? null : new Pair("upper_album_last_tag_video", "upper_album_last_cover_video") : new Pair("upper_album_last_tag_image", "upper_album_last_cover_image") : new Pair("upper_album_last_tag_all", "upper_album_last_cover_item_all");
        if (pair != null) {
            BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new StrategyManagerImpl$saveCurShowResult$1(this, pair, null), 2, (Object) null);
        }
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new StrategyManagerImpl$saveCurSortedItems$1(this, null), 2, (Object) null);
        this.f107443l.shutdown();
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0af9 A[PHI: r26
  0x0af9: PHI (r26v38 java.lang.String) = (r26v37 java.lang.String), (r26v42 java.lang.String) binds: [B:140:0x05a2, B:254:0x0ae4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0fb5  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x1055  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x107b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x10a4  */
    /* JADX WARN: Type inference failed for: r1v141, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v148, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 5087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.i.e(java.lang.String):void");
    }
}
