package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.tuple.ImmutablePair;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.partitionTag.partition.model.UpperTagBeanV5;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicRequestParam;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/d.class */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f113921a;

    public /* synthetic */ d(e eVar) {
        this.f113921a = eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        int size;
        Unit unit;
        int i7;
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        UpperPublishTopicBean.Topic topic = (UpperPublishTopicBean.Topic) obj2;
        e eVar = this.f113921a;
        Long l7 = (Long) eVar.f113924c.left;
        long j7 = topic.topicId;
        boolean canEditTopic = true;
        AI0.i iVar = eVar.f113922a;
        if (l7 != null && l7.longValue() == j7) {
            UpperTopicRequestParam upperTopicRequestParam = iVar.f260f;
            if (upperTopicRequestParam != null) {
                canEditTopic = upperTopicRequestParam.getCanEditTopic();
            }
            if (canEditTopic) {
                iVar.J0();
                eVar.f113924c = new ImmutablePair<>(0L, -1);
                eVar.notifyItemChanged(iIntValue);
            }
        } else {
            AI0.f fVar = eVar.f113927f;
            fVar.getClass();
            UpperTopicRequestParam upperTopicRequestParam2 = iVar.f260f;
            boolean z6 = (upperTopicRequestParam2 != null ? upperTopicRequestParam2.getTopicId() : -1L) > 0;
            UpperTopicRequestParam upperTopicRequestParam3 = iVar.f260f;
            String topicName = upperTopicRequestParam3 != null ? upperTopicRequestParam3.getTopicName() : null;
            String str = topicName;
            if (topicName == null) {
                str = "";
            }
            if (z6) {
                CopyOnWriteArrayList<UpperTagBeanV5> copyOnWriteArrayList = fVar.f245l;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<UpperTagBeanV5> it = copyOnWriteArrayList.iterator();
                    int i8 = 0;
                    while (true) {
                        i7 = i8;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!TextUtils.equals(it.next().tagText, str)) {
                            int i9 = i8 + 1;
                            i8 = i9;
                            if (i9 < 0) {
                                CollectionsKt.throwCountOverflow();
                                i8 = i9;
                            }
                        }
                    }
                } else {
                    i7 = 0;
                }
                size = i7 + 1;
            } else {
                size = fVar.f245l.size();
            }
            boolean z7 = size >= 10;
            FragmentActivity fragmentActivity = eVar.f113923b;
            if (z7 && fragmentActivity != null) {
                Resources resources = fragmentActivity.getResources();
                ToastHelper.showToastShort(fragmentActivity, resources != null ? resources.getQuantityString(2131689775, 10, String.valueOf((Object) 10)) : null);
            }
            if (z7) {
                unit = Unit.INSTANCE;
                return unit;
            }
            UpperTopicRequestParam upperTopicRequestParam4 = iVar.f260f;
            if ((upperTopicRequestParam4 == null || topic.topicId != upperTopicRequestParam4.getTopicId()) && !eVar.f113925d) {
                eVar.f113925d = true;
                UpperTopicRequestParam upperTopicRequestParam5 = iVar.f260f;
                String topicParent = null;
                if (upperTopicRequestParam5 != null) {
                    topicParent = upperTopicRequestParam5.getTopicParent();
                }
                String string = "";
                if (Intrinsics.areEqual(topicParent, "GAME_FACTORY")) {
                    Activity activity = BiliContext.topActivity();
                    boolean zIsActive = ActivityExtKt.isActive(activity);
                    Context fapp = activity;
                    if (!zIsActive) {
                        fapp = FoundationAlias.getFapp();
                    }
                    string = fapp.getString(2131850675);
                }
                if (string.length() > 0) {
                    ToastHelper.showToastShort(fragmentActivity, string);
                }
            }
            eVar.f113922a.I0(topic.topicId, topic.missionId, 1, topic.topicName, topic.description);
            eVar.notifyItemChanged(iIntValue);
            if (((Number) eVar.f113924c.right).intValue() >= 0 && ((Number) eVar.f113924c.right).intValue() < eVar.f113926e.size()) {
                eVar.notifyItemChanged(((Number) eVar.f113924c.right).intValue());
            }
            eVar.f113924c = new ImmutablePair<>(Long.valueOf(topic.topicId), num);
        }
        eVar.notifyItemChanged(0, new b());
        unit = Unit.INSTANCE;
        return unit;
    }
}
