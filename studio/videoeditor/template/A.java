package com.bilibili.studio.videoeditor.template;

import android.os.Bundle;
import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.pegasus.data.FeedbackType;
import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/A.class */
public final /* synthetic */ class A implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109904a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f109905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f109906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f109907d;

    public /* synthetic */ A(BiliTemplateEngineManager biliTemplateEngineManager, String str, Bundle bundle) {
        this.f109905b = biliTemplateEngineManager;
        this.f109906c = str;
        this.f109907d = bundle;
    }

    public /* synthetic */ A(q9.q qVar, FeedbackType feedbackType, DislikeReason dislikeReason) {
        this.f109905b = qVar;
        this.f109906c = feedbackType;
        this.f109907d = dislikeReason;
    }

    public final Object invoke() {
        switch (this.f109904a) {
            case 0:
                Bundle bundle = (Bundle) this.f109907d;
                BiliTemplateEngineManager biliTemplateEngineManager = (BiliTemplateEngineManager) this.f109905b;
                InterfaceC7041a interfaceC7041a = biliTemplateEngineManager.f109914e;
                if (interfaceC7041a != null) {
                    String str = (String) this.f109906c;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    interfaceC7041a.s(biliTemplateEngineManager.g(bundle), str2);
                }
                break;
            default:
                q9.q qVar = (q9.q) this.f109905b;
                la.b.b(qVar);
                FeedbackType feedbackType = (FeedbackType) this.f109906c;
                DislikeReason dislikeReason = (DislikeReason) this.f109907d;
                la.a.f(qVar, feedbackType, dislikeReason);
                la.a.d(qVar, feedbackType, dislikeReason);
                la.i.g(qVar, feedbackType, dislikeReason);
                break;
        }
        return Unit.INSTANCE;
    }
}
