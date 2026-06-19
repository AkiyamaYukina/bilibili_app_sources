package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import Bd1.n;
import com.bilibili.droid.ToastHelper;
import com.bilibili.ogv.misc.seasonlist.BangumiSeasonListFragment;
import com.bilibili.upper.api.bean.Child;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.PartitionTagTopicActivity;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.Semaphore;
import lh0.C7855a;
import rq0.l;
import rx.functions.Action1;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import uI0.C8716e;
import xI0.C8962a;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/a.class */
public final /* synthetic */ class a implements C8716e.a, Action1, IjkMediaPlayer.OnRawDataWriteListener, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f113796a;

    public /* synthetic */ a(Object obj) {
        this.f113796a = obj;
    }

    @Override // uI0.C8716e.a
    public void a(Child child) {
        PartitionAFragment partitionAFragment = (PartitionAFragment) this.f113796a;
        C8962a c8962a = partitionAFragment.f113754e;
        if (c8962a != null && c8962a.g() != null && child.id != partitionAFragment.f113754e.g().childTypeId) {
            partitionAFragment.f113754e.g().childTypeId = child.id;
            m.e();
            PartitionTagTopicActivity partitionTagTopicActivity = partitionAFragment.f113751b;
            partitionTagTopicActivity.X6().h();
            partitionTagTopicActivity.X6().i(true);
            partitionTagTopicActivity.X6().c();
            PartitionTagAFragment partitionTagAFragment = partitionTagTopicActivity.f113731P;
            C8962a c8962a2 = partitionTagAFragment.f113778l;
            partitionTagAFragment.f113769b.setText(partitionTagAFragment.lf(c8962a2 != null ? c8962a2.g().childTypeId : -1L));
        }
        PartitionTagTopicActivity partitionTagTopicActivity2 = partitionAFragment.f113751b;
        if (partitionTagTopicActivity2 != null) {
            partitionTagTopicActivity2.V6();
            String strE = partitionAFragment.f113754e.e();
            zG0.a.r();
            a.a aVar = a.a.a;
            zG0.h.n(strE);
        }
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        BangumiSeasonListFragment bangumiSeasonListFragment = (BangumiSeasonListFragment) this.f113796a;
        bangumiSeasonListFragment.showErrorTips();
        String message = th.getMessage();
        if (message == null || message.length() == 0) {
            return;
        }
        ToastHelper.showToastShort(bangumiSeasonListFragment.getContext(), th.getMessage());
    }

    public void call(Object obj) {
        ((n) this.f113796a).invoke(obj);
    }

    public int onRawDataWrite(IMediaPlayer iMediaPlayer, byte[] bArr, int i7, int i8, int i9, int i10, int i11) {
        Ds0.a aVar;
        C7855a c7855a;
        l lVar = (l) this.f113796a;
        lVar.getClass();
        BLog.i("VideoRecorder", "record raw data");
        if (lVar.f126929j) {
            try {
                Semaphore semaphore = lVar.f126931l;
                if (semaphore != null) {
                    semaphore.acquire();
                }
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
            IjkMediaPlayer ijkMediaPlayer = lVar.f126922b;
            if (ijkMediaPlayer != null) {
                ijkMediaPlayer.setOnRawDataWriteListener((IjkMediaPlayer.OnRawDataWriteListener) null);
            }
        }
        Ds0.b bVar = lVar.f126925e;
        if (bVar == null || (aVar = bVar.f3163b) == null || (c7855a = aVar.f3158d) == null) {
            return 0;
        }
        c7855a.e(i8, bArr);
        return 0;
    }
}
