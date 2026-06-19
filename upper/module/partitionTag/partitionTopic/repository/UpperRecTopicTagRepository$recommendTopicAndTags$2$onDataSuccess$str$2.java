package com.bilibili.upper.module.partitionTag.partitionTopic.repository;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/repository/UpperRecTopicTagRepository$recommendTopicAndTags$2$onDataSuccess$str$2.class */
final /* synthetic */ class UpperRecTopicTagRepository$recommendTopicAndTags$2$onDataSuccess$str$2 extends FunctionReferenceImpl implements Function1<String, String> {
    public static final UpperRecTopicTagRepository$recommendTopicAndTags$2$onDataSuccess$str$2 INSTANCE = new UpperRecTopicTagRepository$recommendTopicAndTags$2$onDataSuccess$str$2();

    public UpperRecTopicTagRepository$recommendTopicAndTags$2$onDataSuccess$str$2() {
        super(1, StringsKt.class, "trimStart", "trimStart(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    public final String invoke(String str) {
        return StringsKt.trimStart(str).toString();
    }
}
