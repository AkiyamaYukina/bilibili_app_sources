package com.bilibili.studio.videoeditor.editor.draftupdate.handle;

import GO.f;
import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo.d;
import com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo.j;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import gC0.b;
import hC0.AbstractC7422a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/handle/EditVideoInfoDataHandler.class */
@Keep
public final class EditVideoInfoDataHandler extends AbstractC7422a<EditVideoInfo> {

    @Nullable
    private b<EditVideoInfo> handle876;

    @Nullable
    private b<EditVideoInfo> handler741;

    @Nullable
    private b<EditVideoInfo> handlerCaptionUpdate;

    @Nullable
    private b<EditVideoInfo> handlerMaterialClean;

    @Nullable
    private j nvsCaptionUpgrade;

    @Nullable
    private b<EditVideoInfo> oldHandler;

    public EditVideoInfoDataHandler() {
        initHandler();
    }

    private final void initHandler() {
        this.oldHandler = new b<>();
        this.handler741 = new b<>();
        this.handlerCaptionUpdate = new b<>();
        this.handlerMaterialClean = new d();
        this.nvsCaptionUpgrade = new j();
        b bVar = new b();
        this.handle876 = bVar;
        b<EditVideoInfo> bVar2 = this.oldHandler;
        if (bVar2 != null) {
            bVar2.f119751b = this.handler741;
        }
        b<EditVideoInfo> bVar3 = this.handler741;
        if (bVar3 != null) {
            bVar3.f119751b = this.handlerCaptionUpdate;
        }
        b<EditVideoInfo> bVar4 = this.handlerCaptionUpdate;
        if (bVar4 != null) {
            bVar4.f119751b = this.handlerMaterialClean;
        }
        b<EditVideoInfo> bVar5 = this.handlerMaterialClean;
        if (bVar5 != null) {
            bVar5.f119751b = this.nvsCaptionUpgrade;
        }
        j jVar = this.nvsCaptionUpgrade;
        if (jVar != null) {
            jVar.f119751b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateEditVideoInfo$lambda$0(Function1 function1, boolean z6) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z6));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    @Override // hC0.AbstractC7422a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkProjectUpdate(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r5, @org.jetbrains.annotations.Nullable java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            r8 = r0
            r0 = r5
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            gC0.b<com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo> r0 = r0.handle876
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L22
            r0 = r9
            r1 = r5
            r2 = r6
            boolean r0 = r0.c(r1, r2)
            r1 = 1
            if (r0 != r1) goto L22
            goto L70
        L22:
            r0 = r4
            gC0.b<com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo> r0 = r0.handlerCaptionUpdate
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3b
            r0 = r9
            r1 = r5
            r2 = r6
            boolean r0 = r0.c(r1, r2)
            r1 = 1
            if (r0 != r1) goto L3b
            goto L70
        L3b:
            r0 = r4
            gC0.b<com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo> r0 = r0.handlerMaterialClean
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L54
            r0 = r9
            r1 = r5
            r2 = r6
            boolean r0 = r0.c(r1, r2)
            r1 = 1
            if (r0 != r1) goto L54
            goto L70
        L54:
            r0 = r4
            com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo.j r0 = r0.nvsCaptionUpgrade
            r9 = r0
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L72
            r0 = r8
            r7 = r0
            r0 = r9
            r1 = r5
            r2 = r6
            boolean r0 = r0.c(r1, r2)
            r1 = 1
            if (r0 != r1) goto L72
        L70:
            r0 = 1
            r7 = r0
        L72:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.editor.draftupdate.handle.EditVideoInfoDataHandler.checkProjectUpdate(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: updateEditVideoInfo, reason: avoid collision after fix types in other method */
    public void updateEditVideoInfo2(@NotNull EditVideoInfo editVideoInfo, @Nullable String str, @Nullable Function1<? super Boolean, Unit> function1) {
        b<EditVideoInfo> bVar = this.handlerMaterialClean;
        if (bVar != null) {
            bVar.f119750a = str;
        }
        b<EditVideoInfo> bVar2 = this.oldHandler;
        if (bVar2 != null) {
            bVar2.a(editVideoInfo, str, new f(function1, 3));
        }
    }

    @Override // hC0.AbstractC7422a
    public /* bridge */ /* synthetic */ void updateEditVideoInfo(EditVideoInfo editVideoInfo, String str, Function1 function1) {
        updateEditVideoInfo2(editVideoInfo, str, (Function1<? super Boolean, Unit>) function1);
    }
}
