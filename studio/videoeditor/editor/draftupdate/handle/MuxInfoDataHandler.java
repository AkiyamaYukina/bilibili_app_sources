package com.bilibili.studio.videoeditor.editor.draftupdate.handle;

import GO.g;
import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.help.mux.MuxInfo;
import gC0.b;
import hC0.AbstractC7422a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/handle/MuxInfoDataHandler.class */
@Keep
public final class MuxInfoDataHandler extends AbstractC7422a<MuxInfo> {

    @Nullable
    private b<MuxInfo> beginHandler;

    @Nullable
    private String engineType;

    @Nullable
    private b<MuxInfo> lastHandler;

    public MuxInfoDataHandler() {
        initHandler();
    }

    private final void initHandler() {
        this.beginHandler = new b<>();
        b bVar = new b();
        b<MuxInfo> bVar2 = this.beginHandler;
        if (bVar2 != null) {
            bVar2.f119751b = bVar;
        }
        this.lastHandler = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateEditVideoInfo$lambda$0(Function1 function1, boolean z6) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z6));
        }
        return Unit.INSTANCE;
    }

    @Override // hC0.AbstractC7422a
    public boolean checkProjectUpdate(@Nullable MuxInfo muxInfo, @Nullable String str) {
        if (muxInfo == null) {
            return false;
        }
        b<MuxInfo> bVar = this.lastHandler;
        boolean z6 = false;
        if (bVar != null) {
            z6 = false;
            if (bVar.c(muxInfo, str)) {
                z6 = true;
            }
        }
        return z6;
    }

    @Nullable
    public final String getEngineType() {
        return this.engineType;
    }

    public final void setEngineType(@Nullable String str) {
        this.engineType = str;
    }

    /* JADX INFO: renamed from: updateEditVideoInfo, reason: avoid collision after fix types in other method */
    public void updateEditVideoInfo2(@NotNull MuxInfo muxInfo, @Nullable String str, @Nullable Function1<? super Boolean, Unit> function1) {
        b<MuxInfo> bVar = this.beginHandler;
        if (bVar != null) {
            bVar.a(muxInfo, str, new g(function1, 5));
        }
    }

    @Override // hC0.AbstractC7422a
    public /* bridge */ /* synthetic */ void updateEditVideoInfo(MuxInfo muxInfo, String str, Function1 function1) {
        updateEditVideoInfo2(muxInfo, str, (Function1<? super Boolean, Unit>) function1);
    }
}
