package com.bilibili.upper.module.partitionTag.partitionTopic.repository;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/repository/UpperTopicRepository$requestTopicList$1$onDataSuccess$2.class */
final /* synthetic */ class UpperTopicRepository$requestTopicList$1$onDataSuccess$2 extends FunctionReferenceImpl implements Function1<String, String> {
    public static final UpperTopicRepository$requestTopicList$1$onDataSuccess$2 INSTANCE = new UpperTopicRepository$requestTopicList$1$onDataSuccess$2();

    public UpperTopicRepository$requestTopicList$1$onDataSuccess$2() {
        super(1, StringsKt.class, "trimStart", "trimStart(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    public final String invoke(String str) {
        return StringsKt.trimStart(str).toString();
    }
}
