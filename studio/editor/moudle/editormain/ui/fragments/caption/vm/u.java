package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/u.class */
public final class u extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ny0.c f106729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b f106730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Ny0.d f106731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Ny0.g f106732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Wy0.d f106733g;

    @NotNull
    public final com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Q> f106734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Float> f106735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<P> f106736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CaptionInfo> f106737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f106743r;

    @Inject
    public u(@NotNull Application application, @NotNull Ny0.c cVar, @NotNull com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar, @NotNull Ny0.d dVar, @NotNull Ny0.g gVar, @NotNull Wy0.d dVar2, @NotNull com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.a aVar) {
        super(application);
        this.f106729c = cVar;
        this.f106730d = bVar;
        this.f106731e = dVar;
        this.f106732f = gVar;
        this.f106733g = dVar2;
        this.h = aVar;
        this.f106734i = new MutableLiveData<>();
        this.f106735j = new MutableLiveData<>();
        this.f106736k = new MutableLiveData<>();
        this.f106737l = new MutableLiveData<>();
        this.f106738m = new MutableLiveData<>();
        this.f106739n = new MutableLiveData<>();
        this.f106740o = new MutableLiveData<>();
        this.f106741p = new MutableLiveData<>();
        this.f106742q = new MutableLiveData<>();
        this.f106743r = new MutableLiveData<>();
        dVar.f17486a.f24409a = true;
        bVar.f107170r = new C6563q(this);
        bVar.f107171s = new PH.c(this, 2);
        bVar.f107172t = new t(this);
        bVar.f107173u = new PH.e(this, 3);
        bVar.f107174v = new PH.f(this, 2);
        bVar.f107175w = new PH.g(this, 1);
        bVar.f107176x = new A50.p(this, 4);
        gVar.f17506j = new PH.i(this, 4);
        gVar.f17507k = new PH.j(this, 3);
        aVar.f107151e = new PH.k(this, 1);
    }

    public final boolean J0(boolean z6) {
        boolean zC = this.h.c();
        if (zC && z6) {
            this.f106740o.setValue(Boolean.FALSE);
        }
        return zC;
    }
}
