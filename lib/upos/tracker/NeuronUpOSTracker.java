package com.bilibili.lib.upos.tracker;

import AT0.c;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upos.videoupload.utils.UpOSTracker;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upos/tracker/NeuronUpOSTracker.class */
public final class NeuronUpOSTracker implements UpOSTracker {

    @NotNull
    public static final String CANCEL = "upos.upload.cancel";

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String INIT = "upos.upload.init";

    @NotNull
    public static final String MERGE = "upos.upload.merge";

    @NotNull
    public static final String PART_END = "upos.upload.part.end";

    @NotNull
    public static final String PART_START = "upos.upload.part.start";

    @NotNull
    public static final String PAUSE = "upos.upload.pause";

    @NotNull
    public static final String PREUPLOAD = "upos.upload.preupload";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upos/tracker/NeuronUpOSTracker$a.class */
    public static final class a {
    }

    @Override // com.bilibili.upos.videoupload.utils.UpOSTracker
    public void onDelete(@NotNull Map<String, String> map) {
        new Gson().toJson(map);
        try {
            Neurons.trackT(true, CANCEL, map, 1, new c(8));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bilibili.upos.videoupload.utils.UpOSTracker
    public void onInit(@NotNull Map<String, String> map) {
        new Gson().toJson(map);
        try {
            Neurons.trackT(true, INIT, map, 1, new c(8));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bilibili.upos.videoupload.utils.UpOSTracker
    public void onMerge(@NotNull Map<String, String> map) {
        new Gson().toJson(map);
        try {
            Neurons.trackT(true, MERGE, map, 1, new c(8));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bilibili.upos.videoupload.utils.UpOSTracker
    public void onPartEnd(@NotNull Map<String, String> map) {
        new Gson().toJson(map);
        try {
            Neurons.trackT(true, PART_END, map, 1, new c(8));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bilibili.upos.videoupload.utils.UpOSTracker
    public void onPartStart(@NotNull Map<String, String> map) {
        new Gson().toJson(map);
        try {
            Neurons.trackT(true, PART_START, map, 1, new c(8));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bilibili.upos.videoupload.utils.UpOSTracker
    public void onPause(@NotNull Map<String, String> map) {
        new Gson().toJson(map);
        try {
            Neurons.trackT(true, PAUSE, map, 1, new c(8));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bilibili.upos.videoupload.utils.UpOSTracker
    public void onPreUpload(@NotNull Map<String, String> map) {
        new Gson().toJson(map);
        try {
            Neurons.trackT(true, PREUPLOAD, map, 1, new c(8));
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
