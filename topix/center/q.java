package com.bilibili.topix.center;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/q.class */
@StabilityInferred(parameters = 1)
public final class q {
    public static void a(@NotNull TopixCenterItemType topixCenterItemType, @NotNull IpTopicItem ipTopicItem, int i7, @NotNull String str) {
        Pair pair = TuplesKt.to("sub_module", topixCenterItemType.getLabel());
        Pair pair2 = TuplesKt.to("server_info", ipTopicItem.getServerInfo());
        Pair pairA = com.bilibili.app.authorspace.ui.pages.p.a(i7, 1, "pos");
        Pair pair3 = TuplesKt.to("entity", "newtopic");
        Pair pair4 = TuplesKt.to("entity_id", String.valueOf(ipTopicItem.getId()));
        String rcmdText = ipTopicItem.getRcmdText();
        String str2 = rcmdText;
        if (rcmdText == null) {
            str2 = "";
        }
        Neurons.reportClick(false, "dt.new-topic-center.topic-card.topic.click", MapsKt.mapOf(new Pair[]{pair, pair2, pairA, pair3, pair4, TuplesKt.to("participation_tag", str2), TuplesKt.to("topic_tag", ipTopicItem.getRcmdIconUrl()), TuplesKt.to("action_type", str)}));
    }

    public static void b(@NotNull TopixCenterItemType topixCenterItemType, @NotNull TopicItem topicItem, int i7) {
        Pair pair = TuplesKt.to("sub_module", topixCenterItemType.getLabel());
        Pair pair2 = TuplesKt.to("server_info", topicItem.getServerInfo());
        Pair pairA = com.bilibili.app.authorspace.ui.pages.p.a(i7, 1, "pos");
        Pair pair3 = TuplesKt.to("entity", "newtopic");
        Pair pair4 = TuplesKt.to("entity_id", String.valueOf(topicItem.getId()));
        String rcmdText = topicItem.getRcmdText();
        String str = rcmdText;
        if (rcmdText == null) {
            str = "";
        }
        Neurons.reportClick(false, "dt.new-topic-center.topic-card.topic.click", MapsKt.mapOf(new Pair[]{pair, pair2, pairA, pair3, pair4, TuplesKt.to("participation_tag", str), TuplesKt.to("topic_tag", topicItem.getRcmdIconUrl()), TuplesKt.to("action_type", "jump_biz_detail")}));
    }

    public static void c(@NotNull TopixCenterItemType topixCenterItemType, @NotNull TopicItem topicItem, int i7) {
        Pair pair = TuplesKt.to("sub_module", topixCenterItemType.getLabel());
        Pair pair2 = TuplesKt.to("server_info", topicItem.getServerInfo());
        Pair pairA = com.bilibili.app.authorspace.ui.pages.p.a(i7, 1, "pos");
        Pair pair3 = TuplesKt.to("entity", "newtopic");
        Pair pair4 = TuplesKt.to("entity_id", String.valueOf(topicItem.getId()));
        String rcmdText = topicItem.getRcmdText();
        String str = rcmdText;
        if (rcmdText == null) {
            str = "";
        }
        Neurons.reportExposure$default(false, "dt.new-topic-center.topic-card.topic.show", MapsKt.mapOf(new Pair[]{pair, pair2, pairA, pair3, pair4, TuplesKt.to("participation_tag", str), TuplesKt.to("topic_tag", topicItem.getRcmdIconUrl())}), (List) null, 8, (Object) null);
    }
}
