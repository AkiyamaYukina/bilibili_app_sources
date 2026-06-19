package com.bilibili.studio.videoeditor;

import P50.m;
import VC0.C2926b;
import android.app.Activity;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditorEnterInfo;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upper.module.honour.ui.KingHonourPublishActivity;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/h.class */
public final class C6600h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f109670a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.timeline.i f109672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f109673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public EditVideoInfo f109674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f109675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public FO.a f109676g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PbTemplateEngine f109671b = new Object();

    @NotNull
    public final C6599g h = new m.b(this) { // from class: com.bilibili.studio.videoeditor.g

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6600h f109576a;

        {
            this.f109576a = this;
        }

        public final void a(long j7) {
            FO.a aVar = this.f109576a.f109676g;
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final c f109677i = new c(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.room.ui.multivoicelink.ui.i f109678j = new com.bilibili.bililive.room.ui.multivoicelink.ui.i(this);

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.h$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/h$a.class */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.h$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/h$b.class */
    public static final class b implements C2926b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f109679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6600h f109680b;

        public b(a aVar, C6600h c6600h) {
            this.f109679a = aVar;
            this.f109680b = c6600h;
        }

        @Override // VC0.C2926b.a
        public final void a(EditorTemplateTabItemBean editorTemplateTabItemBean) {
            a aVar = this.f109679a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // VC0.C2926b.a
        public final void b(EditVideoInfo editVideoInfo, EditorTemplateTabItemBean editorTemplateTabItemBean) {
            com.bilibili.studio.editor.timeline.i iVar = this.f109680b.f109672c;
            if (iVar != null) {
                iVar.b(editVideoInfo, true, "applyPbToTimeline");
            }
            a aVar = this.f109679a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // VC0.C2926b.a
        public final void c(EditorTemplateTabItemBean editorTemplateTabItemBean, String str) {
            a aVar = this.f109679a;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.h$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/h$c.class */
    public static final class c implements m.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6600h f109681a;

        public c(C6600h c6600h) {
            this.f109681a = c6600h;
        }

        public final void a() {
            C6600h c6600h;
            FO.a aVar = this.f109681a.f109676g;
            if (aVar == null || (c6600h = ((KingHonourPublishActivity) aVar.a).f113293U) == null) {
                return;
            }
            C6600h.d(c6600h, 3);
        }

        public final void b() {
        }

        public final void c() {
            FO.a aVar = this.f109681a.f109676g;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.studio.videoeditor.pb.PbTemplateEngine, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.studio.videoeditor.g] */
    public C6600h(@NotNull Activity activity) {
        this.f109670a = activity;
    }

    public static void d(C6600h c6600h, int i7) {
        com.bilibili.studio.editor.timeline.i iVar;
        R50.r rVar;
        UpperTimeline upperTimeline;
        long j7 = (i7 & 1) != 0 ? -1L : 0L;
        if (c6600h.b()) {
            com.bilibili.studio.editor.timeline.i iVar2 = c6600h.f109672c;
            if (iVar2 != null && iVar2.h() == 3) {
                c6600h.c();
                return;
            }
            com.bilibili.studio.editor.timeline.i iVar3 = c6600h.f109672c;
            long videoDuration = (iVar3 == null || (upperTimeline = iVar3.f108300b) == null) ? 0L : upperTimeline.getVideoDuration();
            if (videoDuration == 0 || (iVar = c6600h.f109672c) == null) {
                return;
            }
            long j8 = j7;
            if (j7 == -1) {
                j8 = iVar.j();
            }
            if (videoDuration - j8 < UpperTimeline.MIN_CLIP_DURATION) {
                j8 = 0;
            }
            com.bilibili.studio.editor.timeline.i iVar4 = c6600h.f109672c;
            if (iVar4 == null || (rVar = iVar4.f108304f) == null) {
                return;
            }
            rVar.b.playbackTimeline(R50.v.p(iVar4.i()), j8, videoDuration, 1, true, 64);
        }
    }

    public final void a(@Nullable EditorTemplateTabItemBean editorTemplateTabItemBean, @Nullable a aVar) {
        EditVideoInfo editVideoInfo;
        List<BClip> userTrackBClipList;
        BiliTemplateEngineManager biliTemplateEngineManager;
        EditorEnterInfo editorEnterInfo;
        if (!b()) {
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (editorTemplateTabItemBean == null || (editVideoInfo = this.f109674e) == null || ((userTrackBClipList = editVideoInfo.getUserTrackBClipList()) != null && userTrackBClipList.isEmpty())) {
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        c();
        PbTemplateEngine.a aVar2 = new PbTemplateEngine.a();
        EditVideoInfo editVideoInfo2 = this.f109674e;
        aVar2.f109863a = editVideoInfo2;
        aVar2.f109864b = editorTemplateTabItemBean;
        aVar2.f109869g = (editVideoInfo2 == null || (editorEnterInfo = editVideoInfo2.getEditorEnterInfo()) == null) ? 0 : editorEnterInfo.getVideoCount();
        aVar2.f109875n = 7;
        aVar2.f109876o = PbTemplateEngine.Scene.KING_HONOUR;
        if (this.f109675f == null) {
            synchronized (C6600h.class) {
                try {
                    if (this.f109675f == null) {
                        BiliTemplateEngineManager biliTemplateEngineManager2 = new BiliTemplateEngineManager(7);
                        this.f109675f = biliTemplateEngineManager2;
                        biliTemplateEngineManager2.i(this.f109670a);
                        biliTemplateEngineManager = this.f109675f;
                        if (biliTemplateEngineManager != null) {
                            biliTemplateEngineManager.f109919k = null;
                        }
                    } else {
                        Unit unit = Unit.INSTANCE;
                        biliTemplateEngineManager = this.f109675f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            biliTemplateEngineManager = this.f109675f;
        }
        if (biliTemplateEngineManager != null) {
            this.f109671b.c(this.f109670a, biliTemplateEngineManager, aVar2, new b(aVar, this));
        }
    }

    public final boolean b() {
        com.bilibili.studio.editor.timeline.i iVar = this.f109672c;
        return (iVar != null ? iVar.f108300b : null) != null;
    }

    public final void c() {
        com.bilibili.studio.editor.timeline.i iVar = this.f109672c;
        if (iVar != null) {
            iVar.n();
        }
    }
}
