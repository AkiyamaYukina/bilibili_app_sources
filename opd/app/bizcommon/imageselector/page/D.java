package com.bilibili.opd.app.bizcommon.imageselector.page;

import Km0.C2457e;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.droid.ToastHelper;
import com.bilibili.opd.app.bizcommon.imageselector.media.camera.MallMediaCameraSurfaceView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/D.class */
public final class D<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallMediaTakePhotoFragment f73750a;

    public D(MallMediaTakePhotoFragment mallMediaTakePhotoFragment) {
        this.f73750a = mallMediaTakePhotoFragment;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        C2457e mediaCameraManager;
        boolean zIsCancelled = task.isCancelled();
        MallMediaTakePhotoFragment mallMediaTakePhotoFragment = this.f73750a;
        if (zIsCancelled || task.isFaulted()) {
            ToastHelper.showToastShort(mallMediaTakePhotoFragment.getContext(), 2131829901);
            mallMediaTakePhotoFragment.finishAttachedActivity();
            return null;
        }
        MallMediaCameraSurfaceView mallMediaCameraSurfaceView = mallMediaTakePhotoFragment.f73856b;
        if (mallMediaCameraSurfaceView == null || (mediaCameraManager = mallMediaCameraSurfaceView.getMediaCameraManager()) == null) {
            return null;
        }
        mediaCameraManager.b(mallMediaTakePhotoFragment.f73865l);
        return null;
    }
}
