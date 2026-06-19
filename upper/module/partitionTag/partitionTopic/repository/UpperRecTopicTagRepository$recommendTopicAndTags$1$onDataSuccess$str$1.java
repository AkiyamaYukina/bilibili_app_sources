package com.bilibili.upper.module.partitionTag.partitionTopic.repository;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/repository/UpperRecTopicTagRepository$recommendTopicAndTags$1$onDataSuccess$str$1.class */
final /* synthetic */ class UpperRecTopicTagRepository$recommendTopicAndTags$1$onDataSuccess$str$1 extends FunctionReferenceImpl implements Function1<String, String> {
    public static final UpperRecTopicTagRepository$recommendTopicAndTags$1$onDataSuccess$str$1 INSTANCE = new UpperRecTopicTagRepository$recommendTopicAndTags$1$onDataSuccess$str$1();

    public UpperRecTopicTagRepository$recommendTopicAndTags$1$onDataSuccess$str$1() {
        super(1, StringsKt.class, "trimStart", "trimStart(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    public final String invoke(String str) {
        return StringsKt.trimStart(str).toString();
    }
}
