package com.bilibili.studio.videoeditor.capturev3.logic;

import android.content.Context;
import android.view.OrientationEventListener;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Accelerometer f109217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f109218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f109219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public IndependentCaptureViewModel f109220d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/d$a.class */
    public static final class a extends OrientationEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f109221a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, Context context) {
            super(context, 3);
            this.f109221a = dVar;
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i7) {
            Integer num;
            d dVar = this.f109221a;
            BLog.d("CaptureOrientationLogicManager", " onScreenRotate start orientation=" + i7 + ",mOrientation=" + dVar.f109219c);
            if (i7 == -1) {
                return;
            }
            Integer num2 = dVar.f109219c;
            if (i7 >= 0 && i7 < 36) {
                num = 0;
            } else if (55 <= i7 && i7 < 126) {
                num = 1;
            } else if (145 <= i7 && i7 < 216) {
                num = 2;
            } else if (235 > i7 || i7 >= 306) {
                num = num2;
                if (325 <= i7) {
                    num = num2;
                    if (i7 < 351) {
                        num = 0;
                    }
                }
            } else {
                num = 3;
            }
            if (!Intrinsics.areEqual(num, dVar.f109219c)) {
                dVar.f109219c = num;
                IndependentCaptureViewModel independentCaptureViewModel = dVar.f109220d;
                if (independentCaptureViewModel != null) {
                    BLog.e("IndependentCaptureViewModel", " onOrientationChanged " + num);
                    independentCaptureViewModel.f109301n.g.postValue(num);
                }
            }
            BLog.d("CaptureOrientationLogicManager", " onScreenRotate end mOrientation=" + dVar.f109219c);
        }
    }

    public d(@NotNull Context context) {
        this.f109217a = new Accelerometer(context.getApplicationContext());
        this.f109218b = new a(this, context.getApplicationContext());
    }
}
