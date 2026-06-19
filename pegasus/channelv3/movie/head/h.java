package com.bilibili.pegasus.channelv3.movie.head;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.pegasus.utils.AbstractC5763g;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/h.class */
public final class h extends AbstractC5763g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f75419a;

    public h(f fVar) {
        this.f75419a = fVar;
    }

    public final void b(Map<Long, gg.b> map) {
        f fVar = this.f75419a;
        gg.b bVar = map.get(Long.valueOf(fVar.f75412f));
        if (bVar == null || fVar.f75412f != bVar.a || fVar.f75410d == bVar.b) {
            return;
        }
        ChannelMovieHeadVM channelMovieHeadVM = (ChannelMovieHeadVM) fVar.f75409c.getValue();
        MutableLiveData<p> mutableLiveData = channelMovieHeadVM.f75388k;
        p pVar = channelMovieHeadVM.f75384f;
        pVar.f75451c = !pVar.f75451c;
        mutableLiveData.setValue(pVar);
    }

    @Override // com.bilibili.pegasus.utils.AbstractC5763g
    public final Context c() {
        return this.f75419a.f75407a;
    }
}
