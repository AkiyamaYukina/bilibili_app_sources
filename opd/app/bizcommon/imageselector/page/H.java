package com.bilibili.opd.app.bizcommon.imageselector.page;

import Km0.C2453a;
import Km0.C2457e;
import android.hardware.Camera;
import android.view.View;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.opd.app.bizcommon.imageselector.media.camera.MallMediaCameraSurfaceView;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/H.class */
public final class H implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaTakePhotoFragment f73762c;

    public H(Ref.LongRef longRef, View view, MallMediaTakePhotoFragment mallMediaTakePhotoFragment) {
        this.f73760a = longRef;
        this.f73761b = view;
        this.f73762c = mallMediaTakePhotoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2457e mediaCameraManager;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73760a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) {
            return;
        }
        MallMediaTakePhotoFragment mallMediaTakePhotoFragment = this.f73762c;
        boolean z6 = false;
        if (mallMediaTakePhotoFragment.f73863j) {
            mallMediaTakePhotoFragment.f73863j = false;
        }
        MallMediaCameraSurfaceView mallMediaCameraSurfaceView = mallMediaTakePhotoFragment.f73856b;
        if (mallMediaCameraSurfaceView == null || (mediaCameraManager = mallMediaCameraSurfaceView.getMediaCameraManager()) == null) {
            return;
        }
        MallMediaTakePhotoFragment mallMediaTakePhotoFragment2 = this.f73762c;
        mallMediaTakePhotoFragment2.getClass();
        com.bilibili.bililive.infra.web.ui.f fVar = new com.bilibili.bililive.infra.web.ui.f(mallMediaTakePhotoFragment2);
        C2453a.C0069a c0069a = C2453a.f12957a;
        Camera camera = mediaCameraManager.f12970a;
        int i7 = mediaCameraManager.f12971b;
        if (camera == null) {
            fVar.a();
            return;
        }
        C2453a.C0069a c0069a2 = C2453a.f12957a;
        c0069a2.f12958a = fVar;
        if (i7 == 1) {
            z6 = true;
        }
        c0069a2.f12959b = z6;
        try {
            camera.setOneShotPreviewCallback(c0069a2);
        } catch (Exception e7) {
            fVar.a();
        }
    }
}
