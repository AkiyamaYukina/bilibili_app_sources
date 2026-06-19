package com.bilibili.upper.module.partitionTag.partitionTopic.repository;

import Nk.g;
import com.bilibili.adcommon.utils.e;
import com.bilibili.upper.api.bean.archive.UpperRcmdTagBean;
import com.bilibili.upper.api.custom.UpperGeneralResponse;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.RecTagResponse;
import hw0.C7511a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;
import vI0.C8791b;
import yI0.C9045a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/repository/b.class */
public final class b extends LE0.a<List<? extends UpperRcmdTagBean>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C9045a f113814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1<RecTagResponse, Unit> f113815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1<C8791b, Unit> f113816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f113817e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(C9045a c9045a, Function1<? super RecTagResponse, Unit> function1, Function1<? super C8791b, Unit> function12, long j7) {
        this.f113814b = c9045a;
        this.f113815c = function1;
        this.f113816d = function12;
        this.f113817e = j7;
    }

    @Override // LE0.a
    public final void d(List<? extends UpperRcmdTagBean> list, UpperGeneralResponse<List<? extends UpperRcmdTagBean>> upperGeneralResponse) {
        List<? extends UpperRcmdTagBean> list2 = list;
        BLog.i("UpperRecTopicTagRepository", "recommendTags success");
        if (upperGeneralResponse != null) {
            String str = m.a;
            m.h = upperGeneralResponse.requestId;
        }
        this.f113814b.f129667d = null;
        Function1<RecTagResponse, Unit> function1 = this.f113815c;
        if (function1 != null) {
            function1.invoke(new RecTagResponse(true, null, upperGeneralResponse != null ? upperGeneralResponse.requestId : null, list2));
        }
        String strE = SequencesKt.e(StringsKt.lineSequence("\n                        【标签话题】\n                        请求标签接口 x/vupre/app/archive/tags成功 \n                        \n                        后端返回是\n                        " + CollectionsKt.p(CollectionsKt.filterNotNull(list2 == null ? CollectionsKt.emptyList() : list2), System.lineSeparator(), (CharSequence) null, (CharSequence) null, new g(4), 30) + "\n                    "), System.lineSeparator(), (CharSequence) null, (CharSequence) null, UpperRecTopicTagRepository$recommendTopicAndTags$2$onDataSuccess$str$2.INSTANCE, 30);
        BLog.ifmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{strE});
        C9045a c9045a = this.f113814b;
        ArrayList arrayList = null;
        if (list2 != null) {
            List<? extends UpperRcmdTagBean> list3 = list2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                } else {
                    arrayList2.add(((UpperRcmdTagBean) it.next()).tag);
                }
            }
        }
        C9045a.a(c9045a, 1, arrayList, this.f113816d);
        C7511a.a(0, "manuscript-load-biaoqian", "success", System.currentTimeMillis() - this.f113817e, strE);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        e.a("recommendTags error, ", "UpperRecTopicTagRepository", th);
        this.f113814b.f129667d = null;
        Function1<RecTagResponse, Unit> function1 = this.f113815c;
        if (function1 != null) {
            function1.invoke(new RecTagResponse(false, "", null, null));
        }
        C9045a.a(this.f113814b, 1, null, this.f113816d);
        String message = th != null ? th.getMessage() : null;
        String str = message;
        if (message == null) {
            str = "";
        }
        BLog.efmt("~0bitian~", "\n------------------------ \n   \n%s\n\n------------------------\n  ", new Object[]{"【标签话题】 标签接口 x/vupre/app/archive/tags报错 ".concat(str)});
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f113817e;
        String message2 = null;
        if (th != null) {
            message2 = th.getMessage();
        }
        C7511a.a(-1, "manuscript-load-biaoqian", "fail", jCurrentTimeMillis - j7, "x/vupre/app/archive/tags ".concat(message2 == null ? "" : message2));
    }
}
