package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import android.app.Application;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/x.class */
public final class x extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b f106746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Ny0.d f106747d;

    @Inject
    public x(@NotNull Application application, @NotNull com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar, @NotNull Ny0.d dVar) {
        super(application);
        this.f106746c = bVar;
        this.f106747d = dVar;
    }
}
