package com.bilibili.studio.editor.asr;

import com.bilibili.app.authorspace.ui.pages.s;
import com.bilibili.base.MainThread;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/k.class */
public final class k extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.IntRef f105587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f105590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f105591e;

    public k(Ref.IntRef intRef, int i7, int i8, l lVar, s sVar) {
        this.f105587a = intRef;
        this.f105588b = i7;
        this.f105589c = i8;
        this.f105590d = lVar;
        this.f105591e = sVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        final Ref.IntRef intRef = this.f105587a;
        final int i7 = this.f105588b;
        final int i8 = this.f105589c;
        final l lVar = this.f105590d;
        final s sVar = this.f105591e;
        MainThread.runOnMainThread(new Function0(intRef, i7, this, i8, lVar, sVar) { // from class: com.bilibili.studio.editor.asr.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.IntRef f105581a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f105582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final k f105583c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f105584d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final l f105585e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final s f105586f;

            {
                this.f105581a = intRef;
                this.f105582b = i7;
                this.f105583c = this;
                this.f105584d = i8;
                this.f105585e = lVar;
                this.f105586f = sVar;
            }

            public final Object invoke() {
                Unit unit;
                Ref.IntRef intRef2 = this.f105581a;
                int i9 = intRef2.element;
                int i10 = this.f105582b;
                if (i9 > i10) {
                    this.f105583c.cancel();
                } else {
                    int i11 = this.f105584d;
                    if (i9 + i11 > i10) {
                        intRef2.element = i10;
                    }
                    if (this.f105585e.f105593b) {
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                    this.f105586f.invoke(Integer.valueOf(intRef2.element));
                    intRef2.element += i11;
                }
                unit = Unit.INSTANCE;
                return unit;
            }
        });
    }
}
