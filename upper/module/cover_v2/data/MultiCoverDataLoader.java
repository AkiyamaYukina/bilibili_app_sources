package com.bilibili.upper.module.cover_v2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplateGroup;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/MultiCoverDataLoader.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverDataLoader {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final GH0.b f112778f = new GH0.b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<MultiCoverTemplateGroup> f112779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f112780b = new CompositeDisposable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<DownloadTask> f112781c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f112782d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final GH0.n f112783e = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/MultiCoverDataLoader$DownloadTask.class */
    public final class DownloadTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiCoverTemplate f112784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public Function1<? super Boolean, Unit> f112785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList<b> f112786c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f112787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f112788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MultiCoverDataLoader f112789f;

        public DownloadTask(@NotNull MultiCoverDataLoader multiCoverDataLoader, @NotNull MultiCoverTemplate multiCoverTemplate, QH0.e eVar) {
            this.f112789f = multiCoverDataLoader;
            this.f112784a = multiCoverTemplate;
            this.f112785b = eVar;
        }

        public final void a(boolean z6) {
            if (this.f112788e) {
                return;
            }
            this.f112788e = true;
            this.f112785b.invoke(Boolean.valueOf(z6));
            this.f112789f.f112781c.remove(this);
            if (EntryPointKt.getMemleakOptEnable()) {
                this.f112785b = MultiCoverDataLoader.f112778f;
            }
        }

        public final b b() {
            b bVar = new b(new MultiCoverDataLoader$DownloadTask$nextState$state$1(this));
            this.f112786c.add(bVar);
            return bVar;
        }

        public final void c() {
            if (this.f112787d) {
                ArrayList<b> arrayList = this.f112786c;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<b> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().f112795b) {
                            return;
                        }
                    }
                }
                ArrayList<b> arrayList2 = this.f112786c;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator<b> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().f112796c) {
                            a(false);
                            return;
                        }
                    }
                }
                a(true);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/MultiCoverDataLoader$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Function1<? super Boolean, Unit> f112790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final b f112791b = new b(new MultiCoverDataLoader$FetchTask$coverTemplatesState$1(this));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f112792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MultiCoverDataLoader f112793d;

        public a(@NotNull MultiCoverDataLoader multiCoverDataLoader, GH0.e eVar) {
            this.f112793d = multiCoverDataLoader;
            this.f112790a = eVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/MultiCoverDataLoader$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FunctionReferenceImpl f112794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f112795b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f112796c;

        public b(@NotNull Function1<? super Boolean, Unit> function1) {
            this.f112794a = (FunctionReferenceImpl) function1;
        }

        public final void a() {
            this.f112795b = false;
            this.f112796c = false;
            this.f112794a.invoke(Boolean.FALSE);
        }

        public final void b() {
            this.f112795b = false;
            this.f112796c = true;
            this.f112794a.invoke(Boolean.TRUE);
        }

        public final void c(@Nullable Object obj) {
            if (obj == null) {
                a();
            } else {
                b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader r3, com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate r4) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader.a(com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader, com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.util.List r5) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader.b(java.util.List):void");
    }
}
