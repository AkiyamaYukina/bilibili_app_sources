package com.bilibili.lib.tf;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfQueryReqOrBuilder.class */
public interface TfQueryReqOrBuilder extends MessageLiteOrBuilder {
    TfProvider getCachedProvider();

    int getCachedProviderValue();

    boolean getMaybeCache();

    TfResource getResource();

    int getResourceValue();
}
