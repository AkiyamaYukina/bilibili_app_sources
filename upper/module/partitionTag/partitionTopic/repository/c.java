package com.bilibili.upper.module.partitionTag.partitionTopic.repository;

import AI0.g;
import G0.d;
import Nk.h;
import androidx.room.B;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.w;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;
import yI0.C9047c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/repository/c.class */
public final class c extends BiliApiDataCallback<UpperPublishTopicBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C9047c f113819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f113820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f113821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f113822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f113823g;
    public final String h;

    public c(boolean z6, C9047c c9047c, long j7, String str, String str2, String str3, String str4) {
        this.f113818b = z6;
        this.f113819c = c9047c;
        this.f113820d = j7;
        this.f113821e = str;
        this.f113822f = str2;
        this.f113823g = str3;
        this.h = str4;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(UpperPublishTopicBean upperPublishTopicBean) {
        UpperPublishTopicBean upperPublishTopicBean2 = upperPublishTopicBean;
        if (upperPublishTopicBean2 != null) {
            String str = m.a;
            m.g = upperPublishTopicBean2.requestId;
        }
        List list = upperPublishTopicBean2 != null ? upperPublishTopicBean2.topics : null;
        boolean z6 = this.f113818b;
        C9047c c9047c = this.f113819c;
        if (list != null) {
            gH0.b.a("【参与话题请求结果】topics = " + upperPublishTopicBean2.topics);
            if (z6) {
                ((ArrayList) c9047c.f129674d).clear();
            }
            ((ArrayList) c9047c.f129674d).addAll(upperPublishTopicBean2.topics);
            c9047c.f129671a++;
            g gVar = c9047c.f129675e;
            if (gVar != null) {
                gVar.invoke(new UpperTopicResponse(true, upperPublishTopicBean2.topics, null, z6));
            }
            if (upperPublishTopicBean2.maxPage <= c9047c.f129671a) {
                c9047c.f129673c = true;
            }
        } else {
            c9047c.f129673c = true;
            g gVar2 = c9047c.f129675e;
            if (gVar2 != null) {
                gVar2.invoke(new UpperTopicResponse(false, null, null, z6));
            }
        }
        c9047c.f129672b = false;
        String str2 = this.f113821e;
        String str3 = this.f113822f;
        String str4 = this.f113823g;
        String str5 = this.h;
        int i7 = c9047c.f129671a;
        boolean z7 = c9047c.f129673c;
        List list2 = null;
        if (upperPublishTopicBean2 != null) {
            list2 = upperPublishTopicBean2.topics;
        }
        List listEmptyList = list2;
        if (list2 == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        String strP = CollectionsKt.p(CollectionsKt.filterNotNull(listEmptyList), System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), new h(1), 24);
        StringBuilder sb = new StringBuilder("\n                                /x/vupre/app/topic/type 接口分页请求成功 \n                                \n                                请求参数:\n                                childTypeId = ");
        d.a(this.f113820d, "\n                                title = ", str2, sb);
        B.a("\n                                filename = ", str3, "\n                                desc = ", str4, sb);
        bf.a.a(i7, "\n                                uploadId = ", str5, "\n                                pn = ", sb);
        w.a("\n                                \n                                分页状态\n                                isEnding = ", "\n                                isLoading = false\n                                \n                                接口返回：\n                                ", strP, sb, z7);
        sb.append("\n                                ");
        BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{SequencesKt.e(StringsKt.lineSequence(sb.toString()), System.lineSeparator(), (CharSequence) null, (CharSequence) null, UpperTopicRepository$requestTopicList$1$onDataSuccess$2.INSTANCE, 30)});
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        C9047c c9047c = this.f113819c;
        g gVar = c9047c.f129675e;
        if (gVar != null) {
            gVar.invoke(new UpperTopicResponse(false, null, "", this.f113818b));
        }
        c9047c.f129672b = false;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        String str = this.f113821e;
        String str2 = this.f113823g;
        String str3 = this.h;
        StringBuilder sbA = l0.a("\n                                /x/vupre/app/topic/type 接口请求报错 ", message, "\n                                childTypeId = ");
        d.a(this.f113820d, "\n                                title = ", str, sbA);
        sbA.append("\n                                filename = ");
        B.a(this.f113822f, "\n                                desc = ", str2, "\n                                uploadId = ", sbA);
        sbA.append(str3);
        sbA.append("\n                                ");
        BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{StringsKt.trimIndent(sbA.toString())});
    }
}
