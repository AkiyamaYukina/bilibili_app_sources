package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.timecal;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/timecal/PartTimeStrategyConfig.class */
@Keep
public class PartTimeStrategyConfig {
    public int imageFrameCount = 1;
    public int videoFrameCount = 3;
    public long minFrameInterval = TransitionInfo.DEFAULT_DURATION;
    public int materialMaxFrameCount = 15;
    public long videoDividerDuration = 120000000;
    public int lessVideoDividerCount = 3;
    public int moreVideoDividerCount = 7;
    public int totalFrameCount = 20;
}
