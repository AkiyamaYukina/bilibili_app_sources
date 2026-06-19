package com.bilibili.studio.videoeditor.capturev3.music;

import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/c.class */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f109259a;

    public /* synthetic */ c(f fVar) {
        this.f109259a = fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        IndependentCaptureFragment independentCaptureFragment;
        int iIntValue = ((Integer) obj).intValue();
        f fVar = this.f109259a;
        if (iIntValue == 0) {
            IndependentCaptureFragment independentCaptureFragment2 = fVar.f109270g;
            if (independentCaptureFragment2 != null) {
                independentCaptureFragment2.Jg();
            }
        } else if (iIntValue == 1 && (independentCaptureFragment = fVar.f109270g) != null) {
            independentCaptureFragment.Ig();
        }
        return Unit.INSTANCE;
    }
}
