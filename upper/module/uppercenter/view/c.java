package com.bilibili.upper.module.uppercenter.view;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.bilibili.upper.module.uppercenter.view.DanmakuView;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/c.class */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DanmakuView.b f114220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DanmakuView f114221b;

    public /* synthetic */ c(DanmakuView.b bVar, DanmakuView danmakuView) {
        this.f114220a = bVar;
        this.f114221b = danmakuView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer numValueOf;
        DanmakuView.b bVar = this.f114220a;
        DanmakuView danmakuView = this.f114221b;
        if (bVar.f114196g != DanmakuView.State.RUNNING) {
            return;
        }
        DanmakuView danmakuView2 = bVar.h;
        boolean z6 = true;
        if (danmakuView2.getLines() < 1) {
            numValueOf = null;
        } else {
            int iD = RangesKt.d(RangesKt.until(0, danmakuView2.getLines()), Random.Default);
            DanmakuView.c cVar = bVar.f114193d;
            while (cVar != null) {
                boolean z7 = z6;
                if (cVar.f114198b == iD) {
                    z7 = z6;
                    if (cVar.f114201e < danmakuView2.getLineSpaceWidth() + cVar.f114197a.getRoot().getMeasuredWidth()) {
                        z7 = false;
                    }
                }
                cVar = cVar.f114202f;
                z6 = z7;
            }
            numValueOf = null;
            if (z6) {
                numValueOf = Integer.valueOf(iD);
            }
        }
        if (numValueOf == null) {
            bVar.f114190a.getClass();
            bVar.f114191b.postDelayed(new c(bVar, bVar.h), 300L);
            return;
        }
        ViewBinding viewBinding = (ViewBinding) bVar.f114192c.acquire();
        ViewBinding viewBindingA = viewBinding;
        if (viewBinding == null) {
            viewBindingA = bVar.f114190a.a(danmakuView);
        }
        if (!bVar.f114190a.c(viewBindingA)) {
            bVar.f114196g = DanmakuView.State.IDLE;
            return;
        }
        int iIntValue = numValueOf.intValue();
        View root = viewBindingA.getRoot();
        DanmakuView danmakuView3 = bVar.h;
        danmakuView3.addView(root);
        int i7 = DanmakuView.f114182f;
        root.measure(i7, i7);
        int measuredWidth = root.getMeasuredWidth();
        int measuredHeight = root.getMeasuredHeight();
        int lineSpaceHeight = (danmakuView3.getLineSpaceHeight() + measuredHeight) * iIntValue;
        int measuredWidth2 = danmakuView3.getMeasuredWidth();
        root.layout(measuredWidth2, lineSpaceHeight, measuredWidth + measuredWidth2, measuredHeight + lineSpaceHeight);
        DanmakuView.c<VB> cVar2 = new DanmakuView.c<>(viewBindingA, numValueOf.intValue(), System.currentTimeMillis());
        DanmakuView.c<VB> cVar3 = bVar.f114194e;
        if (cVar3 != 0) {
            cVar3.f114202f = cVar2;
        }
        bVar.f114194e = cVar2;
        if (bVar.f114193d == null) {
            bVar.f114193d = cVar2;
        }
        bVar.f114190a.getClass();
        bVar.f114191b.postDelayed(new c(bVar, bVar.h), 300L);
    }
}
