package com.bilibili.module.vip.combine;

import android.view.ViewGroup;
import com.bili.rvext.ThreadLayoutInflater;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.video.story.player.M;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/m.class */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66188a;

    public final Object invoke(Object obj) {
        switch (this.f66188a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return ((RecordInfo) obj).asrCacheKey;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new s9.d(M.a(viewGroup, ThreadLayoutInflater.Companion, 2131501256, viewGroup, false));
        }
    }
}
