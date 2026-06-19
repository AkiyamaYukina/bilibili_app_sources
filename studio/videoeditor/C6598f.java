package com.bilibili.studio.videoeditor;

import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/f.class */
public final class C6598f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f109573a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f109574b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f109575c = true;

    @JvmStatic
    public static final void a(int i7) {
        if (f109575c) {
            try {
                HashMap map = new HashMap();
                map.put("track_id", Xz0.g.d());
                map.put("page_step", String.valueOf(i7));
                map.put("step_timeout", String.valueOf(System.currentTimeMillis() - (i7 == 100 ? f109573a : f109574b)));
                Neurons.trackT$default(false, "creation.center-plus.upload_page.track_t", map, 0, (Function0) null, 24, (Object) null);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            f109574b = System.currentTimeMillis();
            if (i7 == 100) {
                f109575c = false;
            }
        }
    }

    @JvmStatic
    public static final void b(int i7, long j7, int i8, long j8) {
        try {
            HashMap map = new HashMap();
            map.put("material_type", String.valueOf(i7));
            map.put("process_timeout", String.valueOf(j7));
            map.put("material_count", String.valueOf(i8));
            map.put("invalidate_video_count", String.valueOf(j8));
            Neurons.trackT$default(false, "creation.center-plus.material_loader.track_t", map, 0, (Function0) null, 24, (Object) null);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
