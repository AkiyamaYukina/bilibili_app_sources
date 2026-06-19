package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformRespOrBuilder.class */
public interface TfTransformRespOrBuilder extends MessageLiteOrBuilder {
    TfCode getCode();

    int getCodeValue();

    boolean getIsCache();

    TfUrlMethod getMethod();

    int getMethodValue();

    TfProvider getProvider();

    int getProviderValue();

    boolean getTf();

    TfTypeExt getTypeExt();

    int getTypeExtValue();

    String getUrl();

    ByteString getUrlBytes();
}
