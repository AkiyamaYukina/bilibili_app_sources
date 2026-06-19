package com.bilibili.studio.comm.report.editor.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/report/editor/bean/EditorAction.class */
@Keep
public class EditorAction {
    public static final String ACTION_APPEND_VT = "appendVideoTrack";
    public static final String ACTION_GRAB_IMAGE = "grabImageFromTimeline";
    public static final String ACTION_REMOVE_CLIP = "removeAllClips";
    public static final String ACTION_REMOVE_TL = "removeTimeline";
    public static final String ACTION_SEEK = "seekTimeline";
    public static final String ACTION_STOP = "stop";
    public static final String ACTION_STOP_INTERRUPT = "stopInterrupt";
    public static final String ACTION_TRIM_IN = "changeTrimInPoint";
    public static final String ACTION_TRIM_OUT = "changeTrimOutPoint";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f105447a;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f105448t;

    public EditorAction(String str, long j7) {
        this.f105447a = str;
        this.f105448t = j7;
    }
}
