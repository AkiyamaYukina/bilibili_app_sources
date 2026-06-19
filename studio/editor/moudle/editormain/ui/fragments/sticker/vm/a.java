package com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm;

import A90.f;
import DJ.e;
import Yy0.g;
import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/vm/a.class */
public final class a extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final g f106978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Wy0.d f106979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public P50.g f106980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public BiliEditorStickerInfo f106981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f106982g;

    @NotNull
    public final MutableLiveData<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f106983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f106984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public BiliEditorStickerInfo f106985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f106986l;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/vm/a$a.class */
    public static final class C1190a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f106987a;

        public C1190a(a aVar) {
            this.f106987a = aVar;
        }
    }

    @Inject
    public a(@NotNull Application application, @NotNull g gVar, @NotNull Wy0.d dVar) {
        super(application);
        this.f106978c = gVar;
        this.f106979d = dVar;
        this.f106982g = new MutableLiveData<>();
        this.h = new MutableLiveData<>();
        this.f106984j = "";
        gVar.h = new C1190a(this);
    }

    public final void J0(@NotNull EditStickerItem editStickerItem, @NotNull e eVar, @NotNull f fVar, @NotNull com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.g gVar) {
        BuildersKt.launch$default(((Yv0.c) this).b, (CoroutineContext) null, (CoroutineStart) null, new BiliEditorStickerListViewModel$handleDownloadStickerV2$1(this, editStickerItem, fVar, gVar, eVar, null), 3, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c9, code lost:
    
        if (r0 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cf, code lost:
    
        r0.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d6, code lost:
    
        r0 = r0.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02df, code lost:
    
        if (r0 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e2, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e9, code lost:
    
        r0 = r0.f29327b.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f5, code lost:
    
        if (r0 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f8, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ff, code lost:
    
        r15 = r0.g(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x030a, code lost:
    
        r8.f106980e = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0312, code lost:
    
        if (r15 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0315, code lost:
    
        com.bilibili.studio.videoeditor.extension.h.c(r15, "key_sticker_object", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x031e, code lost:
    
        r10.invoke(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0326, code lost:
    
        r0.n(r8.f106980e, "应用贴纸");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0339, code lost:
    
        if (r8.f106979d.f27447g != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x033c, code lost:
    
        r0 = r8.f106980e;
        r0.f29334j = r0.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034f, code lost:
    
        if ((r0 instanceof P50.o) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0352, code lost:
    
        r0 = r0;
        r0.l(r0.getInPoint() + 33000, r0.getOutPoint() - 33000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0377, code lost:
    
        if ((r0 instanceof P50.r) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x037a, code lost:
    
        r0 = (P50.r) r0;
        r0.l(r0.getInPoint() + 33000, r0.getOutPoint() - 33000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x039c, code lost:
    
        if (r0 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x039f, code lost:
    
        r0.j();
        r0.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (android.text.TextUtils.isEmpty(r0 != null ? r0.getFxId() : null) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r0 = r8.f106980e;
        r0 = r9.getStickerType();
        r0 = r0 instanceof P50.r;
        r0 = r0.f29351a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r0 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r0 != 5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        r0 = r0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        r0 = r0;
        r0 = r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (r15 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual("video_fx_type_music_rhythm", com.bilibili.studio.videoeditor.extension.h.a(r15, "key_type_video_fx")) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        r0.postValue(2131841839);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        r0 = r0.j(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        r0 = r8.f106980e;
        r0 = r0.f29354d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
    
        if (r0 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
        r0 = r0.f29359j;
        r0 = r0.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
    
        r0 = r0.f29327b.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        if (r0 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
    
        r15 = r0.b(r0, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        if (r15 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (r15.getStickerType() == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        if (r15.getStickerType() != 5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        if (r15.getEditFxSticker() == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
    
        r15.setSelectedByUser(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
    
        r0 = r15.getIFx();
        r8.f106980e = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0167, code lost:
    
        r0 = r0.l(r0.f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0175, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0178, code lost:
    
        r15.setClipId(r0.id);
        r15.setClipPath(r0.videoPath);
        r15.setTrimInClip(r0.getTrimIn() + ((long) ((r15.inPoint - r0.getInPoint()) * r0.playRate)));
        com.bilibili.studio.videoeditor.extension.h.c(r0, "key_sticker_object", r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b3, code lost:
    
        r10.invoke(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01be, code lost:
    
        r0 = (com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo) com.bilibili.studio.videoeditor.extension.h.a(r0, "key_sticker_object");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cc, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d4, code lost:
    
        if (r8.f106983i != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
    
        if (r0.getStickerType() != r9.getStickerType()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ef, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.getEditCustomizeSticker(), r9.getEditCustomizeSticker()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fe, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.getEditFxSticker(), r9.getEditFxSticker()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0201, code lost:
    
        r0 = r0.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0208, code lost:
    
        if (r0 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x020e, code lost:
    
        r0.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0214, code lost:
    
        r8.f106980e = null;
        r10.invoke((java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0224, code lost:
    
        r0.setStickerType(r9.getStickerType());
        r0.setEditCustomizeSticker(r9.getEditCustomizeSticker());
        r0.setEditFxSticker(r9.getEditFxSticker());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024a, code lost:
    
        if (r9.getStickerType() != 2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024d, code lost:
    
        r0 = r9.getEditCustomizeSticker();
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0259, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x025c, code lost:
    
        r0 = r0.previewUri;
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0269, code lost:
    
        if (r0 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x026c, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0276, code lost:
    
        r0 = r9.getPreviewItem();
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0282, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0285, code lost:
    
        r0 = r0.getRemoteUrl();
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0292, code lost:
    
        if (r0 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0295, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0299, code lost:
    
        r0.setCover(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a6, code lost:
    
        if (r0.getStickerType() == 1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02af, code lost:
    
        if (r0.getStickerType() != 5) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02b7, code lost:
    
        if (r0.getEditFxSticker() == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ba, code lost:
    
        r0.setSelectedByUser(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c0, code lost:
    
        r0 = r0.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r9.getEditCustomizeSticker() == null) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem, kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a.K0(com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem, kotlin.jvm.functions.Function1):void");
    }
}
