package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/M.class */
public final class M extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ez0.a f106678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Ex0.n f106679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Ex0.c f106680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Wy0.e f106681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Ly0.t f106682g;

    @NotNull
    public final Yy0.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final My0.d f106683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f106685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CaptionInfo> f106688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<BiliEditorStickerInfo> f106689o;

    @Inject
    public M(@NotNull Application application, @NotNull ez0.a aVar, @NotNull Ex0.n nVar, @NotNull Ex0.c cVar, @NotNull Wy0.e eVar, @NotNull Ly0.t tVar, @NotNull Yy0.b bVar, @NotNull My0.d dVar) {
        super(application);
        this.f106678c = aVar;
        this.f106679d = nVar;
        this.f106680e = cVar;
        this.f106681f = eVar;
        this.f106682g = tVar;
        this.h = bVar;
        this.f106683i = dVar;
        this.f106684j = new MutableLiveData<>();
        this.f106685k = new MutableLiveData<>();
        this.f106686l = new MutableLiveData<>();
        this.f106687m = new MutableLiveData<>();
        this.f106688n = new MutableLiveData<>();
        this.f106689o = new MutableLiveData<>();
        dVar.getClass();
        dVar.f16535k = new PH.s(this, 2);
        dVar.f16536l = new A50.B(this, 5);
        dVar.f16537m = new A50.C(this, 3);
        dVar.f16538n = new PH.u(this, 4);
        dVar.f16539o = new Ih1.a(this, 3);
    }

    public final void J0(@NotNull BackUpTag backUpTag) {
        this.f106683i.j(null);
        com.bilibili.studio.editor.timeline.i iVar = this.f106679d.f4833c;
        if (iVar != null) {
            iVar.a(this.f106680e.f4806b, backUpTag);
        }
    }

    public final void K0(@Nullable BiliEditorStickerInfo biliEditorStickerInfo) {
        this.h.z(biliEditorStickerInfo != null ? biliEditorStickerInfo.getIFx() : null, "BiliEditorStickerBatchEditViewModel.refreshStickerRect");
        this.f106683i.h.j(biliEditorStickerInfo);
    }

    public final void L0(long j7) {
        this.f106679d.o(j7);
    }

    public final void M0(@NotNull CaptionInfo captionInfo, @NotNull String str) {
        P50.p pVar = captionInfo.timelineCaption;
        if (pVar == null) {
            return;
        }
        String text = pVar.getText();
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.areEqual(str, text);
        }
        pVar.setText(str);
        captionInfo.isTemp = false;
        captionInfo.text = str;
        captionInfo.textOrigin = str;
        L0(pVar.getInPoint());
        this.f106682g.C(pVar);
    }

    public final void N0() {
        this.f106679d.t();
    }
}
