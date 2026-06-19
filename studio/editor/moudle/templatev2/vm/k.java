package com.bilibili.studio.editor.moudle.templatev2.vm;

import aC0.InterfaceC3194a;
import androidx.lifecycle.ViewModel;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/k.class */
public final class k extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final b f108193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f108194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ey0.a f108195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final EditVideoInfo f108196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final EditVideoInfo f108197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final c f108198f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/k$a.class */
    public interface a {
        void a(@Nullable InterfaceC3194a interfaceC3194a);

        void b(@Nullable com.bilibili.studio.editor.moudle.musicv3.ui.l lVar);

        void c(float f7);

        void d();

        void e(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/k$b.class */
    public interface b {
        void a();

        void b(boolean z6, boolean z7, boolean z8);

        void c(@NotNull Function1<? super Boolean, Unit> function1);

        void d();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/k$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f108199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public EditorTemplateTabItemBean f108200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public MusicDownloadData f108201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f108202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f108203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f108204f;
    }

    public k() {
        this(null, null, null, null, null, null, 63, null);
    }

    public k(@Nullable b bVar, @Nullable a aVar, @Nullable ey0.a aVar2, @Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoInfo editVideoInfo2, @Nullable c cVar) {
        this.f108193a = bVar;
        this.f108194b = aVar;
        this.f108195c = aVar2;
        this.f108196d = editVideoInfo;
        this.f108197e = editVideoInfo2;
        this.f108198f = cVar;
    }

    public /* synthetic */ k(b bVar, a aVar, ey0.a aVar2, EditVideoInfo editVideoInfo, EditVideoInfo editVideoInfo2, c cVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : bVar, (i7 & 2) != 0 ? null : aVar, (i7 & 4) != 0 ? null : aVar2, (i7 & 8) != 0 ? null : editVideoInfo, (i7 & 16) != 0 ? null : editVideoInfo2, (i7 & 32) != 0 ? null : cVar);
    }
}
