package com.bilibili.studio.editor.moudle.templatev2.vm;

import Ez0.d;
import I.E;
import androidx.fragment.app.A;
import androidx.room.m;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicTabItem;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabBean;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository.class */
public final class BiliEditorTemplateRepository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static CoroutineScope f108127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static MutableSharedFlow<a> f108128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static MutableSharedFlow<c> f108129e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static d f108131g;

    @Nullable
    public static c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static a f108132i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BiliEditorTemplateRepository f108125a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f108126b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f108130f = new b(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final e f108133j = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f108134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final List<EditorMusicItem> f108135b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String str, @Nullable List<? extends EditorMusicItem> list) {
            this.f108134a = str;
            this.f108135b = list;
        }

        public final boolean a(@NotNull String str) {
            List<EditorMusicItem> list;
            return (!Intrinsics.areEqual(this.f108134a, str) || (list = this.f108135b) == null || list.isEmpty()) ? false : true;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f108134a, aVar.f108134a) && Intrinsics.areEqual(this.f108135b, aVar.f108135b);
        }

        public final int hashCode() {
            int iHashCode = this.f108134a.hashCode();
            List<EditorMusicItem> list = this.f108135b;
            return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public final String toString() {
            List<EditorMusicItem> list = this.f108135b;
            return "RecMusicResult(recommendSid='" + this.f108134a + "', recMusicList=" + (list != null ? Integer.valueOf(list.size()) : null) + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f108136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f108137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f108138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f108139d;

        public b() {
            this(0);
        }

        public b(int i7) {
            this.f108136a = "";
            this.f108137b = "";
            this.f108138c = "";
            this.f108139d = "";
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f108136a, bVar.f108136a) && Intrinsics.areEqual(this.f108137b, bVar.f108137b) && Intrinsics.areEqual(this.f108138c, bVar.f108138c) && Intrinsics.areEqual(this.f108139d, bVar.f108139d);
        }

        public final int hashCode() {
            return this.f108139d.hashCode() + E.a(E.a(this.f108136a.hashCode() * 31, 31, this.f108137b), 31, this.f108138c);
        }

        @NotNull
        public final String toString() {
            return A.a(this.f108138c, ", recommendSid=", this.f108139d, ")", G0.b.a("RequestParams(tag=", this.f108136a, ", ratio=", this.f108137b, ", templateBindSid="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f108140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final List<EditorMusicItem> f108141b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull String str, @Nullable List<? extends EditorMusicItem> list) {
            this.f108140a = str;
            this.f108141b = list;
        }

        public final boolean a(@NotNull String str) {
            List<EditorMusicItem> list;
            return Intrinsics.areEqual(this.f108140a, str) && (str.length() == 0 || !((list = this.f108141b) == null || list.isEmpty()));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f108140a, cVar.f108140a) && Intrinsics.areEqual(this.f108141b, cVar.f108141b);
        }

        public final int hashCode() {
            int iHashCode = this.f108140a.hashCode();
            List<EditorMusicItem> list = this.f108141b;
            return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public final String toString() {
            List<EditorMusicItem> list = this.f108141b;
            return "TemplateBindMusicResult(musicSids='" + this.f108140a + "', musicList=" + (list != null ? Integer.valueOf(list.size()) : null) + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$d.class */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f108142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f108143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final List<? extends EditorTemplateTabBean> f108144c;

        public d(@NotNull String str, @NotNull String str2, @Nullable List<? extends EditorTemplateTabBean> list) {
            this.f108142a = str;
            this.f108143b = str2;
            this.f108144c = list;
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            List<? extends EditorTemplateTabBean> list;
            return Intrinsics.areEqual(this.f108142a, str) && Intrinsics.areEqual(this.f108143b, str2) && (list = this.f108144c) != null && !list.isEmpty();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f108142a, dVar.f108142a) && Intrinsics.areEqual(this.f108143b, dVar.f108143b) && Intrinsics.areEqual(this.f108144c, dVar.f108144c);
        }

        public final int hashCode() {
            int iA = E.a(this.f108142a.hashCode() * 31, 31, this.f108143b);
            List<? extends EditorTemplateTabBean> list = this.f108144c;
            return iA + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public final String toString() {
            List<? extends EditorTemplateTabBean> list = this.f108144c;
            return "TemplateResult(tag='" + this.f108142a + "', ratio='" + this.f108143b + "', tabList=" + (list != null ? Integer.valueOf(list.size()) : null) + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$e.class */
    public static final class e implements d.a {
        @Override // Ez0.d.a
        public final void a(String str, List<? extends EditorMusicTabItem> list) {
            EditorMusicTabItem editorMusicTabItem;
            List<EditorMusicItem> list2;
            a aVar = new a(str, (list == null || (editorMusicTabItem = (EditorMusicTabItem) CollectionsKt.firstOrNull(list)) == null || (list2 = editorMusicTabItem.filterItems) == null) ? null : CollectionsKt.toList(list2));
            BLog.i("BiliEditorTemplateRepository", "onRecMusicResult, " + aVar);
            MutableSharedFlow<a> mutableSharedFlow = BiliEditorTemplateRepository.f108128d;
            if (mutableSharedFlow != null) {
                mutableSharedFlow.tryEmit(aVar);
            }
        }

        @Override // Ez0.d.a
        public final void b(String str, List<? extends EditorMusicItem> list) {
            c cVar = new c(str, list != null ? CollectionsKt.toList(list) : null);
            BLog.i("BiliEditorTemplateRepository", "onTemplateBindResult, " + cVar);
            MutableSharedFlow<c> mutableSharedFlow = BiliEditorTemplateRepository.f108129e;
            if (mutableSharedFlow != null) {
                mutableSharedFlow.tryEmit(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository.a(com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository.b(com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void c(d dVar, c cVar, a aVar, int i7) {
        if ((i7 & 1) != 0) {
            dVar = null;
        }
        if ((i7 & 2) != 0) {
            cVar = null;
        }
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        b bVar = f108130f;
        if (dVar != null && dVar.a(bVar.f108136a, bVar.f108137b)) {
            f108131g = dVar;
        }
        if (cVar != null && cVar.a(bVar.f108138c)) {
            h = cVar;
        }
        if (aVar == null || !aVar.a(bVar.f108139d)) {
            return;
        }
        f108132i = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r7) {
        /*
            r0 = r7
            if (r0 == 0) goto L15
            r0 = r7
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo r0 = r0.getIntelligenceInfo()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L15
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.recMusicIds
            r8 = r0
            goto L17
        L15:
            r0 = 0
            r8 = r0
        L17:
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3b
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2c
            goto L3b
        L2c:
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 62
            java.lang.String r0 = kotlin.collections.CollectionsKt.p(r0, r1, r2, r3, r4, r5)
            return r0
        L3b:
            r0 = r7
            if (r0 == 0) goto L4a
            r0 = r7
            java.lang.String r0 = r0.getRecMusicSids()
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L4d
        L4a:
            java.lang.String r0 = ""
            r7 = r0
        L4d:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository.d(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):java.lang.String");
    }

    public static void e() {
        if (f108126b.compareAndSet(false, true)) {
            f108127c = m.a(null, 1, null, Dispatchers.getIO());
            BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
            f108128d = SharedFlowKt.MutableSharedFlow(2, 2, bufferOverflow);
            f108129e = SharedFlowKt.MutableSharedFlow(2, 2, bufferOverflow);
            Ez0.d dVar = Ez0.e.b().f4910a;
            CopyOnWriteArrayList<d.a> copyOnWriteArrayList = dVar.f4901l;
            e eVar = f108133j;
            if (!copyOnWriteArrayList.contains(eVar)) {
                dVar.f4901l.add(eVar);
            }
            if (dVar.h) {
                eVar.a(dVar.f4896f, dVar.f4894d);
            }
            if (dVar.f4899j) {
                eVar.b(dVar.f4897g, dVar.f4892b);
            }
        }
    }

    public static void f(@Nullable EditVideoInfo editVideoInfo, @Nullable EditorAIRecResult editorAIRecResult, int i7) {
        e();
        CoroutineScope coroutineScope = f108127c;
        if (coroutineScope != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BiliEditorTemplateRepository$preInit$1(editVideoInfo, i7, editorAIRecResult, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r11, int r12, com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult r13, boolean r14, kotlin.coroutines.jvm.internal.SuspendLambda r15, int r16) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository.h(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, int, com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult, boolean, kotlin.coroutines.jvm.internal.SuspendLambda, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository.g(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
