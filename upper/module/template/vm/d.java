package com.bilibili.upper.module.template.vm;

import By0.J0;
import com.bilibili.base.MainThread;
import com.bilibili.biligame.ui.pointmall.record.G;
import kntr.base.imageloader.ImageState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f114039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f114040c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f114038a = i7;
        this.f114039b = obj;
        this.f114040c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f114038a) {
            case 0:
                Throwable th = (Throwable) obj;
                g gVar = (g) this.f114039b;
                gVar.f114049d.postValue(101);
                if (gVar.f114051f != null) {
                    gVar.M0();
                    gVar.f114050e.postValue(new Pair<>(-1, ""));
                }
                MainThread.runOnMainThread(new G(1, (J0) this.f114040c, th));
                break;
            default:
                ImageState imageState = (ImageState) obj;
                if ((imageState instanceof ImageState.Success) || (imageState instanceof ImageState.Error)) {
                    ((Function1) this.f114039b).invoke(((kntr.common.comment.share.a) this.f114040c).a);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
