package com.bilibili.mall.kmm.detailVideo.comment;

import Zg0.C3174a;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.utils.bus.GloBus;
import com.bilibili.biligame.widget.dialog.BiligameCommonDialog;
import com.bilibili.mall.kmm.detailVideo.comment.vm.MallDetailCommentLoadStatus;
import com.mall.videodetail.vd.mall.comment.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ls.f;
import ps.v;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f65614c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f65612a = i7;
        this.f65613b = obj;
        this.f65614c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f65612a) {
            case 0:
                C3174a c3174a = (C3174a) obj;
                MallDetailCommentLoadStatus mallDetailCommentLoadStatus = c3174a.f29623e;
                MallDetailCommentLoadStatus mallDetailCommentLoadStatus2 = MallDetailCommentLoadStatus.ERROR;
                MallDetailCommentPageVM mallDetailCommentPageVM = (MallDetailCommentPageVM) this.f65613b;
                if (mallDetailCommentLoadStatus == mallDetailCommentLoadStatus2) {
                    mallDetailCommentPageVM.f65609f = mallDetailCommentPageVM.f65609f == 2 ? 3 : 2;
                }
                int i7 = mallDetailCommentPageVM.f65609f;
                c3174a.f29622d = i7;
                c3174a.f29621c = "按热度";
                if (i7 == 2) {
                    c3174a.f29621c = "按时间";
                }
                ((g) this.f65614c).invoke(c3174a);
                break;
            default:
                BiligameCommonDialog biligameCommonDialog = (BiligameCommonDialog) obj;
                f adapter = ((v) this.f65613b).getAdapter();
                f fVar = adapter instanceof f ? adapter : null;
                if (fVar != null) {
                    BiligameMainGame biligameMainGame = (BiligameMainGame) this.f65614c;
                    fVar.O(biligameMainGame.gameBaseId);
                    GloBus.get().post(new Ep.f("played", biligameMainGame.gameBaseId));
                }
                biligameCommonDialog.dismiss();
                break;
        }
        return Unit.INSTANCE;
    }
}
