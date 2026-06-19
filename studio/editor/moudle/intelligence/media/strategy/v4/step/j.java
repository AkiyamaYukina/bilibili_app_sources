package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step;

import androidx.compose.runtime.C4277b;
import com.alipay.sdk.app.PayTask;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step/j.class */
public final class j extends com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107507g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f107508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f107509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final vz0.a f107510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f107511l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step/j$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f107513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f107514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<fA0.b> f107515d;

        public a(int i7, int i8, int i9) {
            List<fA0.b> arrayList;
            this.f107512a = i7;
            this.f107513b = i8;
            this.f107514c = i9;
            if (i8 < 1 || i9 < 1 || i8 > i9 || i9 > i7) {
                arrayList = new ArrayList();
            } else {
                IntRange intRange = new IntRange(i8, i9);
                ArrayList arrayList2 = new ArrayList();
                IntIterator it = intRange.iterator();
                while (it.hasNext()) {
                    fA0.b bVar = new fA0.b(this.f107512a, it.nextInt());
                    bVar = bVar.a() ? bVar : null;
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                }
                arrayList = CollectionsKt.toMutableList(arrayList2);
            }
            this.f107515d = arrayList;
        }

        @NotNull
        public final List<Integer> a() {
            if (this.f107515d.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            int iNextInt = Random.Default.nextInt(this.f107515d.size());
            List<Integer> listSorted = CollectionsKt.sorted(this.f107515d.get(iNextInt).b());
            if (!this.f107515d.get(iNextInt).a()) {
                this.f107515d.remove(iNextInt);
            }
            return listSorted;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("从");
            sb.append(this.f107512a);
            sb.append("筛选");
            sb.append(this.f107513b);
            sb.append("~");
            return C4277b.a(this.f107514c, "个素材", sb);
        }
    }

    public j(@NotNull uz0.b bVar) {
        super(bVar);
        this.f107507g = bVar.l;
        this.h = bVar.m;
        this.f107508i = PayTask.f60018j;
        this.f107509j = bVar.f;
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.d dVar = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.d) com.bilibili.studio.centerplus.util.i.a();
        this.f107510k = dVar != null ? dVar.f107412b : null;
        this.f107511l = bVar.n;
    }

    public static a f(int i7, Igv.Range range) {
        if (range == null || range.getMin() < 1 || range.getMax() < 1 || range.getMin() > range.getMax() || i7 < range.getMin()) {
            return null;
        }
        return new a(i7, (int) range.getMin(), Math.min(i7, (int) range.getMax()));
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @NotNull
    public final String a() {
        return "[服务端策略][选择素材]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x08e3  */
    /* JADX WARN: Type inference failed for: r0v480 */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r23v29 */
    /* JADX WARN: Type inference failed for: r23v30 */
    /* JADX WARN: Type inference failed for: r23v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step.a, com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step.j, java.lang.Object] */
    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJob r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a>> r9) {
        /*
            Method dump skipped, instruction units count: 3628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step.j.c(com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJob, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
