package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.alibaba.fastjson.JSON;
import com.bilibili.studio.editor.asr.bean.AudioLabelComputeConfigNew;
import java.util.concurrent.Callable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/c.class */
public final /* synthetic */ class CallableC6566c implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AudioLabelComputeConfigNew audioLabelComputeConfigNew;
        try {
            audioLabelComputeConfigNew = (AudioLabelComputeConfigNew) JSON.parseObject(zw0.b.r(), AudioLabelComputeConfigNew.class);
        } catch (Exception e7) {
            BLog.e(e7.toString());
            audioLabelComputeConfigNew = null;
        }
        return audioLabelComputeConfigNew;
    }
}
