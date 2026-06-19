package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformReqOrBuilder.class */
public interface TfTransformReqOrBuilder extends MessageLiteOrBuilder {
    TfProvider getCachedProvider();

    int getCachedProviderValue();

    boolean getIsAuto();

    boolean getMaybeCache();

    String getMethod();

    ByteString getMethodBytes();

    TfResource getResource();

    int getResourceValue();

    String getTag();

    ByteString getTagBytes();

    String getUrl();

    ByteString getUrlBytes();
}
