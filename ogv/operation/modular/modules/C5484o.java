package com.bilibili.ogv.operation.modular.modules;

import android.graphics.Bitmap;
import com.google.common.base.Optional;
import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/o.class */
public final class C5484o implements com.bilibili.ogvcommon.image.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleEmitter<Optional<Bitmap>> f70734a;

    public C5484o(SingleEmitter<Optional<Bitmap>> singleEmitter) {
        this.f70734a = singleEmitter;
    }

    @Override // com.bilibili.ogvcommon.image.c
    public final void onFailure() {
        SingleEmitter<Optional<Bitmap>> singleEmitter = this.f70734a;
        if (singleEmitter.isDisposed()) {
            return;
        }
        singleEmitter.onError(new RuntimeException());
    }

    @Override // com.bilibili.ogvcommon.image.c
    public final void onResult(Bitmap bitmap) {
        SingleEmitter<Optional<Bitmap>> singleEmitter = this.f70734a;
        if (singleEmitter.isDisposed()) {
            return;
        }
        singleEmitter.onSuccess(Optional.fromNullable(Bitmap.createBitmap(bitmap)));
    }
}
