package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.RecTagResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vI0.C8791b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/a.class */
@StabilityInferred(parameters = 1)
public abstract class a {

    /* JADX INFO: renamed from: com.bilibili.upper.module.partitionTag.partitiontopicv2.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C1231a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final C8791b f113912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final RecTagResponse f113913b;

        public C1231a(@Nullable C8791b c8791b, @Nullable RecTagResponse recTagResponse) {
            this.f113912a = c8791b;
            this.f113913b = recTagResponse;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/a$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f113914a = new a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/a$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final UpperPublishTopicBean.Topic f113915a;

        public c(@NotNull UpperPublishTopicBean.Topic topic) {
            this.f113915a = topic;
        }
    }
}
