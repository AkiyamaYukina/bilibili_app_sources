package com.bilibili.ogv.misc.topicplaylist;

import android.view.View;
import com.bilibili.droid.ToastHelper;
import com.bilibili.ogv.misc.topicplaylist.TopicPlayListVo;
import com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/g.class */
public final class g implements BangumiBottomSheet.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavoTopicPlayListSubFragment f69656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69657b;

    public g(FavoTopicPlayListSubFragment favoTopicPlayListSubFragment, int i7) {
        this.f69656a = favoTopicPlayListSubFragment;
        this.f69657b = i7;
    }

    @Override // com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet.b
    public final void a(int i7, View view) {
        int i8;
        final FavoTopicPlayListSubFragment favoTopicPlayListSubFragment = this.f69656a;
        if (favoTopicPlayListSubFragment.f69624g) {
            return;
        }
        int size = ((ArrayList) favoTopicPlayListSubFragment.f69622e).size();
        final int i9 = this.f69657b;
        if (i9 <= size && (i8 = ((TopicPlayListVo.TopicPlayListItemVo) ((ArrayList) favoTopicPlayListSubFragment.f69622e).get(i9)).f69630a) > 0) {
            aY0.a aVarCancelCollectPlayList = j.f69663a.cancelCollectPlayList(i8);
            Functions.v vVar = Functions.a;
            com.bilibili.okretro.call.rxjava.c.a(com.bilibili.okretro.call.rxjava.d.a(aVarCancelCollectPlayList, new Action(favoTopicPlayListSubFragment, i9) { // from class: com.bilibili.ogv.misc.topicplaylist.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FavoTopicPlayListSubFragment f69654a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f69655b;

                {
                    this.f69654a = favoTopicPlayListSubFragment;
                    this.f69655b = i9;
                }

                public final void run() {
                    FavoTopicPlayListSubFragment favoTopicPlayListSubFragment2 = this.f69654a;
                    ((ArrayList) favoTopicPlayListSubFragment2.f69622e).remove(this.f69655b);
                    c cVar = favoTopicPlayListSubFragment2.f69621d;
                    if (cVar != null) {
                        cVar.h = favoTopicPlayListSubFragment2.f69622e;
                        cVar.notifySectionData();
                    }
                    ToastHelper.showToastShort(favoTopicPlayListSubFragment2.getContext(), 2131821880);
                }
            }, new ae.d(favoTopicPlayListSubFragment)), favoTopicPlayListSubFragment.getLifecycle());
        }
    }
}
