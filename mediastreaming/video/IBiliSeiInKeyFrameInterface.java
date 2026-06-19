package com.bilibili.mediastreaming.video;

import java.util.ArrayList;
import kotlin.Pair;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/video/IBiliSeiInKeyFrameInterface.class */
public interface IBiliSeiInKeyFrameInterface {
    @Nullable
    ArrayList<Pair<String, byte[]>> getKeyFrameSei(long j7);
}
