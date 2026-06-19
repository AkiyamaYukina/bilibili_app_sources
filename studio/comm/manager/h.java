package com.bilibili.studio.comm.manager;

import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvResource;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvResources;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/h.class */
public final class h extends c<IgvResource> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final h f105394g = new c();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/h$a.class */
    public final class a extends BiliApiCallback<GeneralResponse<IgvResources>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f105395b;

        public a(long j7) {
            this.f105395b = j7;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f105395b;
            h hVar = h.f105394g;
            hVar.e(androidx.core.content.c.b(jCurrentTimeMillis, "服务端接口失败, ", th != null ? th.getMessage() : null, ", 耗时:"));
            hVar.f();
            Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
            Xz0.j.c("router_topic_id", Xz0.g.f28463b);
            Map mapB = Xz0.j.b(Xz0.k.f28474a);
            HashMap map = (HashMap) mapB;
            map.put("if_success", "0");
            map.put("failed_reason", "2");
            map.put("receive_num", pf.h.a(0, jCurrentTimeMillis, "receive_time", map));
            map.put("people_bag", "");
            Neurons.reportExposure$default(false, "creation.choose-matter.data-transfer.receive-server.show", mapB, (List) null, 8, (Object) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
        @Override // com.bilibili.okretro.BiliApiCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSuccess(com.bilibili.okretro.GeneralResponse<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvResources> r8) {
            /*
                Method dump skipped, instruction units count: 305
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.manager.h.a.onSuccess(java.lang.Object):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // com.bilibili.studio.comm.manager.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r6, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.manager.h.a(long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.studio.comm.manager.c
    @NotNull
    public final String b() {
        return "igv_all_resource.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    @Override // com.bilibili.studio.comm.manager.c
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.IgvResource> c() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.manager.h.c():java.util.List");
    }
}
