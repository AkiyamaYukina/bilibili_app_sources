package com.bilibili.opd.app.bizcommon.imageselector.page;

import Km0.C2457e;
import android.os.Message;
import android.view.View;
import com.bilibili.opd.app.bizcommon.imageselector.media.camera.MallMediaCameraSurfaceView;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/E.class */
public final class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaTakePhotoFragment f73753c;

    public E(Ref.LongRef longRef, View view, MallMediaTakePhotoFragment mallMediaTakePhotoFragment) {
        this.f73751a = longRef;
        this.f73752b = view;
        this.f73753c = mallMediaTakePhotoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73751a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < 1000) {
            return;
        }
        MallMediaTakePhotoFragment mallMediaTakePhotoFragment = this.f73753c;
        MallMediaCameraSurfaceView mallMediaCameraSurfaceView = mallMediaTakePhotoFragment.f73856b;
        int i7 = 0;
        if (mallMediaCameraSurfaceView != null) {
            C2457e mediaCameraManager = mallMediaCameraSurfaceView.getMediaCameraManager();
            i7 = 0;
            if (mediaCameraManager != null) {
                i7 = 0;
                if (mediaCameraManager.f12971b == 0) {
                    i7 = 1;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 2;
                mediaCameraManager.f12974e.sendMessage(messageObtain);
                mediaCameraManager.b(i7);
            }
        }
        mallMediaTakePhotoFragment.f73865l = i7;
    }
}
