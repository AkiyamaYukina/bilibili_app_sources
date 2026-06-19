package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import android.os.CountDownTimer;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/w.class */
public final class CountDownTimerC6585w extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f107865a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC6585w(long j7, y yVar) {
        super(j7, 1000L);
        this.f107865a = yVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        BLog.e("FrameLogic", "【智能成片】抽帧超时了奥～");
        y yVar = this.f107865a;
        if (yVar.f107875f.get()) {
            BLog.e("FrameLogic", "【智能成片】抽帧已经结束拉～");
            return;
        }
        if (yVar.f130976c) {
            BLog.e("FrameLogic", "【智能成片】智能成片流程已经cancel了～");
            return;
        }
        BLog.e("FrameLogic", "【智能成片】强制结束抽帧");
        com.bilibili.studio.editor.moudle.intelligence.frame.d dVar = yVar.f107873d;
        if (dVar != null) {
            dVar.f107308j.set(true);
            dVar.f107303d.cancel();
            dVar.b();
            if (dVar.f107302c != null) {
                dVar.e(dVar.f107305f);
            }
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j7) {
        v0.b(j7, "【智能成片】抽帧倒计时 millisUntilFinished=", "FrameLogic");
    }
}
