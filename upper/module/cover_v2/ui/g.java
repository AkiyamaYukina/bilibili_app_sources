package com.bilibili.upper.module.cover_v2.ui;

import HS0.y0;
import android.util.SparseIntArray;
import android.view.View;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.room.ui.common.tab.top.BaseRoomLiveRankFragmentV3;
import com.bilibili.studio.videoeditor.util.V;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/g.class */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112960b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f112959a = i7;
        this.f112960b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f112959a) {
            case 0:
                MultiCoverActivity multiCoverActivity = (MultiCoverActivity) this.f112960b;
                int i7 = MultiCoverActivity.f112864K;
                if (!V.c()) {
                    EH0.p.f4125a.getClass();
                    if (!EH0.p.h()) {
                        multiCoverActivity.S6(false);
                    } else {
                        multiCoverActivity.R6(2, new y0(multiCoverActivity, 2));
                    }
                    break;
                }
                break;
            default:
                BaseRoomLiveRankFragmentV3 baseRoomLiveRankFragmentV3 = (BaseRoomLiveRankFragmentV3) this.f112960b;
                SparseIntArray sparseIntArray = BaseRoomLiveRankFragmentV3.L;
                LiveLog.Companion companion = LiveLog.Companion;
                if (companion.matchLevel(3)) {
                    String str = "showUnRank OnClick" == 0 ? "" : "showUnRank OnClick";
                    LiveLogDelegate logDelegate = companion.getLogDelegate();
                    if (logDelegate != null) {
                        LiveLogDelegate.onLog$default(logDelegate, 3, "BaseRoomLiveRankFragmentV3", str, (Throwable) null, 8, (Object) null);
                    }
                    BLog.i("BaseRoomLiveRankFragmentV3", str);
                }
                QK.a aVar = baseRoomLiveRankFragmentV3.F;
                if (aVar != null) {
                    aVar.a("2");
                }
                break;
        }
    }
}
