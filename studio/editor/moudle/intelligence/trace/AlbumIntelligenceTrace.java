package com.bilibili.studio.editor.moudle.intelligence.trace;

import Nn0.f;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.studio.editor.moudle.intelligence.trace.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/AlbumIntelligenceTrace.class */
public final class AlbumIntelligenceTrace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f107542a = LazyKt.lazy(new f(this, 6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f107543b = String.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<d> f107544c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<c> f107545d = CollectionsKt.mutableListOf(new c[]{c.f107554a});

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/AlbumIntelligenceTrace$a.class */
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlbumIntelligenceTrace f107546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, AlbumIntelligenceTrace albumIntelligenceTrace) {
            super(key);
            this.f107546a = albumIntelligenceTrace;
        }

        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            this.f107546a.getClass();
            BLog.e("AlbumIntelligenceTrace", th);
        }
    }

    public static void a(AlbumIntelligenceTrace albumIntelligenceTrace, String str, String str2, int i7, Collection collection, Collection collection2, String str3, int i8) {
        if ((i8 & 8) != 0) {
            collection = null;
        }
        if ((i8 & 16) != 0) {
            collection2 = null;
        }
        if ((i8 & 32) != 0) {
            str3 = null;
        }
        albumIntelligenceTrace.getClass();
        final d.i iVar = new d.i(str, str2, i7);
        iVar.f107560e = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("未生成坑位原因", str3)});
        final int i9 = 0;
        final Collection collection3 = collection;
        final Collection collection4 = collection2;
        albumIntelligenceTrace.f(iVar, new Function0(iVar, i9, collection3, collection4) { // from class: com.bilibili.studio.editor.moudle.intelligence.trace.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f107547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f107548b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f107549c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Object f107550d;

            {
                this.f107547a = i9;
                this.f107548b = iVar;
                this.f107549c = collection3;
                this.f107550d = collection4;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 420
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.trace.a.invoke():java.lang.Object");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.studio.editor.moudle.intelligence.trace.d, com.bilibili.studio.editor.moudle.intelligence.trace.d$g, com.bilibili.studio.editor.moudle.intelligence.trace.d$h] */
    public static void b(AlbumIntelligenceTrace albumIntelligenceTrace, String str, String str2, Map map, Object obj, int i7) {
        if ((i7 & 4) != 0) {
            map = null;
        }
        if ((i7 & 8) != 0) {
            obj = null;
        }
        albumIntelligenceTrace.getClass();
        final ?? gVar = new d.g(str, str2, null);
        final Map map2 = map;
        final Object obj2 = obj;
        albumIntelligenceTrace.f(gVar, new Function0(gVar, map2, obj2) { // from class: com.bilibili.studio.editor.moudle.intelligence.trace.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d.h f107551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map f107552b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f107553c;

            {
                this.f107551a = gVar;
                this.f107552b = map2;
                this.f107553c = obj2;
            }

            public final Object invoke() {
                Map<String, Object> map3 = this.f107552b;
                Map<String, Object> linkedHashMap = map3;
                if (map3 == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                this.f107551a.f107560e = linkedHashMap;
                Object obj3 = this.f107553c;
                linkedHashMap.put("客户端策略信息", obj3 != null ? obj3.toString() : null);
                return Unit.INSTANCE;
            }
        });
    }

    public final void c(@NotNull String str, int i7, int i8, @NotNull String str2, boolean z6) {
        d dVar = new d(android.support.v4.media.a.a("[", str, "]素材分析开始"), d.m.class, null, 28);
        dVar.f107560e = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("轮次", Integer.valueOf(i7)), TuplesKt.to("当前轮次需要分析的素材数量", Integer.valueOf(i8)), TuplesKt.to("是否是封面分析", Boolean.valueOf(z6)), TuplesKt.to("错误信息", str2)});
        f(dVar, null);
    }

    public final void d(@NotNull String str, int i7, int i8, int i9, int i10, int i11) {
        d dVar = new d(android.support.v4.media.a.a("[", str, "]素材过滤开始"), d.o.class, null, 28);
        dVar.f107560e = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("轮次", Integer.valueOf(i7)), TuplesKt.to("上一轮过滤素材数量", Integer.valueOf(i8)), TuplesKt.to("当前轮次需要过滤的素材数量", Integer.valueOf(i9)), TuplesKt.to("当前轮次需要分析的素材数量", Integer.valueOf(i10)), TuplesKt.to("所有素材数量", Integer.valueOf(i11))});
        f(dVar, null);
    }

    public final void e(@NotNull String str, int i7, int i8, boolean z6, boolean z7, @NotNull String str2) {
        d.g gVar;
        if (z6) {
            gVar = new d.g(str, p.a("[", str2, "]强制生成结果[", z7 ? "服务端策略" : "本地策略", "]"), d.o.class);
        } else {
            gVar = new d.g(str, p.a("[", str2, "]自动生成结果[", z7 ? "服务端策略" : "本地策略", "]"), d.l.class);
        }
        gVar.f107560e = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("符合要求素材数量", Integer.valueOf(i7)), TuplesKt.to("版本", Integer.valueOf(i8))});
        f(gVar, null);
    }

    public final void f(d dVar, Function0<Unit> function0) {
        BuildersKt.launch$default((CoroutineScope) this.f107542a.getValue(), (CoroutineContext) null, (CoroutineStart) null, new AlbumIntelligenceTrace$trace$1(this, dVar, function0, System.currentTimeMillis(), null), 3, (Object) null);
    }
}
