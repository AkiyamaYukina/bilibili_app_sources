package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step;

import H41.H;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvStrategy;
import java.util.Comparator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.comparisons.ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step/ServerFilterStep.class */
public final class ServerFilterStep extends com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107489g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f107490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f107491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f107492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f107493l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step/ServerFilterStep$a.class */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Long.valueOf(((IgvStrategy) t8).getWeight()), Long.valueOf(((IgvStrategy) t7).getWeight()));
        }
    }

    public ServerFilterStep(@NotNull uz0.b bVar) {
        super(bVar);
        this.f107489g = bVar.h;
        this.h = bVar.i;
        this.f107490i = bVar.j;
        this.f107491j = bVar.k;
        this.f107492k = bVar.n;
        this.f107493l = LazyKt.lazy(new H(7));
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @NotNull
    public final String a() {
        return "[服务端策略][筛选素材]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0831, code lost:
    
        if ((1 <= r0 && r0 < r0) != false) goto L222;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x095d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0725 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJob r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a>> r10) {
        /*
            Method dump skipped, instruction units count: 3220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step.ServerFilterStep.c(com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJob, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
