package com.bilibili.upper.module.template.fragment;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.bilibili.upper.module.template.vm.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/g.class */
public final class g implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplatePreviewFragment f114006a;

    public g(TemplatePreviewFragment templatePreviewFragment) {
        this.f114006a = templatePreviewFragment;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        j jVarJf = this.f114006a.jf();
        jVarJf.f114057b.b(surfaceTexture);
        jVarJf.J0(1);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
