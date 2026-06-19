package com.bilibili.studio.centerplus.model;

import com.bilibili.base.MainThread;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/h.class */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f105177c;

    public /* synthetic */ h(boolean z6, boolean z7, Function2 function2) {
        this.f105175a = z6;
        this.f105176b = z7;
        this.f105177c = function2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z6 = this.f105175a;
        boolean z7 = this.f105176b;
        final Function2 function2 = this.f105177c;
        l lVar = l.f105184a;
        boolean z8 = false;
        if (z7) {
            Boolean bool = Boolean.FALSE;
            final PreviewData previewDataA = lVar.a();
            if (z6) {
                final boolean z9 = false;
                MainThread.postOnMainThread(new Function0(function2, z9, previewDataA) { // from class: com.bilibili.studio.centerplus.model.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function2 f105178a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f105179b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final PreviewData f105180c;

                    {
                        this.f105178a = function2;
                        this.f105179b = z9;
                        this.f105180c = previewDataA;
                    }

                    public final Object invoke() {
                        this.f105178a.invoke(Boolean.valueOf(this.f105179b), this.f105180c);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                function2.invoke(bool, previewDataA);
            }
            Unit unit = Unit.INSTANCE;
        } else {
            PreviewData previewData = l.f105185b;
            if (previewData != null) {
                z8 = true;
            }
            PreviewData previewDataA2 = previewData;
            if (previewData == null) {
                previewDataA2 = lVar.a();
            }
            if (z6) {
                final boolean z10 = z8;
                final PreviewData previewData2 = previewDataA2;
                MainThread.postOnMainThread(new Function0(function2, z10, previewData2) { // from class: com.bilibili.studio.centerplus.model.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function2 f105178a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f105179b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final PreviewData f105180c;

                    {
                        this.f105178a = function2;
                        this.f105179b = z10;
                        this.f105180c = previewData2;
                    }

                    public final Object invoke() {
                        this.f105178a.invoke(Boolean.valueOf(this.f105179b), this.f105180c);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                function2.invoke(Boolean.valueOf(z8), previewDataA2);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
