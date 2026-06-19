package com.bilibili.pegasus.channelv3.movie.head;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.accounts.BiliAccounts;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/j.class */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f75422a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = this.f75422a;
        if (!BiliAccounts.get(mVar.f75427a).isLogin()) {
            Qp0.c.b(mVar.f75427a);
            return;
        }
        ChannelMovieHeadVM channelMovieHeadVMB = mVar.b();
        channelMovieHeadVMB.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(channelMovieHeadVMB), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieHeadVM$followMovie$1(channelMovieHeadVMB, null), 3, (Object) null);
        e.a(mVar.b(), MovieButtonName.LIKE, mVar.b().f75382d.f75406g);
    }
}
