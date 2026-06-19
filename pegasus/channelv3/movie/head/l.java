package com.bilibili.pegasus.channelv3.movie.head;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bapis.bilibili.app.interfaces.v1.CommentType;
import com.bapis.bilibili.app.interfaces.v1.MediaCommentReply;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.menu.NormalMenuItem;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/l.class */
public final /* synthetic */ class l implements NormalMenuItem.OnMenuClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f75425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75426b;

    public /* synthetic */ l(m mVar, b bVar) {
        this.f75425a = mVar;
        this.f75426b = bVar;
    }

    @Override // com.bilibili.lib.ui.menu.NormalMenuItem.OnMenuClickListener
    public final void onMenuClick(View view) {
        m mVar = this.f75425a;
        ChannelMovieHeadVM channelMovieHeadVMB = mVar.b();
        b bVar = this.f75426b;
        String str = bVar.f75398e;
        HashMap<String, String> mapB = e.b(channelMovieHeadVMB);
        mapB.put("action_type", str);
        Unit unit = Unit.INSTANCE;
        Neurons.reportClick(false, "traffic.movie-channel-detail.popup-review.button.click", mapB);
        if (bVar.f75399f != CommentType.comment_type_judge) {
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(bVar.f75395b), (Context) null, 2, (Object) null);
            return;
        }
        ChannelMovieHeadVM channelMovieHeadVMB2 = mVar.b();
        Td.i iVar = new Td.i(bVar, 2);
        MediaCommentReply mediaCommentReply = channelMovieHeadVMB2.f75381c;
        if (mediaCommentReply != null) {
            iVar.invoke(mediaCommentReply);
        } else {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(channelMovieHeadVMB2), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieHeadVM$mediaCommentAuth$1(channelMovieHeadVMB2, bVar.f75397d, iVar, null), 3, (Object) null);
        }
    }
}
