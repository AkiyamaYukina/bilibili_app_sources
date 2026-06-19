package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfQueryRespOrBuilder.class */
public interface TfQueryRespOrBuilder extends MessageLiteOrBuilder {
    TfCode getCode();

    int getCodeValue();

    boolean getIsCache();

    boolean getIsValid();

    String getProductTag();

    ByteString getProductTagBytes();

    TfProvider getProvider();

    int getProviderValue();

    TfTypeExt getTypeExt();

    int getTypeExtValue();
}
