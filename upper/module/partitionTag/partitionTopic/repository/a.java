package com.bilibili.upper.module.partitionTag.partitionTopic.repository;

import com.bilibili.adcommon.utils.e;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partitiontopicv2.n;
import hw0.C7511a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;
import vI0.C8791b;
import yI0.C9045a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/repository/a.class */
public final class a extends BiliApiDataCallback<UpperPublishTopicBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C9045a f113810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1<UpperPublishTopicBean, Unit> f113811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1<C8791b, Unit> f113812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f113813e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(C9045a c9045a, Function1<? super UpperPublishTopicBean, Unit> function1, Function1<? super C8791b, Unit> function12, long j7) {
        this.f113810b = c9045a;
        this.f113811c = function1;
        this.f113812d = function12;
        this.f113813e = j7;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(UpperPublishTopicBean upperPublishTopicBean) {
        UpperPublishTopicBean upperPublishTopicBean2 = upperPublishTopicBean;
        BLog.i("UpperRecTopicTagRepository", "recommendTopic success");
        if (upperPublishTopicBean2 != null) {
            String str = m.a;
            m.g = upperPublishTopicBean2.requestId;
        }
        this.f113810b.f129666c = null;
        Function1<UpperPublishTopicBean, Unit> function1 = this.f113811c;
        if (function1 != null) {
            function1.invoke(upperPublishTopicBean2);
        }
        Function1<C8791b, Unit> function12 = this.f113812d;
        if (function12 != null) {
            C9045a.a(this.f113810b, 2, upperPublishTopicBean2 != null ? upperPublishTopicBean2.tags : null, function12);
        }
        String strP = null;
        if (upperPublishTopicBean2 != null) {
            List list = upperPublishTopicBean2.topics;
            List listEmptyList = list;
            if (list == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            strP = CollectionsKt.p(CollectionsKt.filterNotNull(listEmptyList), System.lineSeparator(), (CharSequence) null, (CharSequence) null, new n(0), 30);
        }
        String strE = SequencesKt.e(StringsKt.lineSequence("\n                   【标签话题】    \n                    请求话题接口 /x/vupre/app/topic/type 成功 \n                     \n                    后端返回的话题是 \n                    " + strP + "\n                    "), System.lineSeparator(), (CharSequence) null, (CharSequence) null, UpperRecTopicTagRepository$recommendTopicAndTags$1$onDataSuccess$str$1.INSTANCE, 30);
        BLog.ifmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{strE});
        C7511a.a(0, "manuscript-load-huati", "success", System.currentTimeMillis() - this.f113813e, strE);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        e.a("recommendTopic error, ", "UpperRecTopicTagRepository", th);
        this.f113810b.f129666c = null;
        Function1<UpperPublishTopicBean, Unit> function1 = this.f113811c;
        if (function1 != null) {
            function1.invoke((Object) null);
        }
        Function1<C8791b, Unit> function12 = this.f113812d;
        if (function12 != null) {
            C9045a.a(this.f113810b, 2, null, function12);
        }
        String message = th != null ? th.getMessage() : null;
        String str = message;
        if (message == null) {
            str = "";
        }
        BLog.ifmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"【标签话题】话题接口 /x/vupre/app/topic/type 报错 ".concat(str)});
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f113813e;
        String message2 = null;
        if (th != null) {
            message2 = th.getMessage();
        }
        if (message2 == null) {
            message2 = "";
        }
        C7511a.a(-1, "manuscript-load-huati", "fail", jCurrentTimeMillis - j7, "/x/vupre/app/topic/type ".concat(message2));
    }
}
