package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTransformEventOrBuilder.class */
public interface TfTransformEventOrBuilder extends MessageLiteOrBuilder {
    TfCode getCode();

    int getCodeValue();

    boolean getIsAuto();

    boolean getIsCache();

    String getMessage();

    ByteString getMessageBytes();

    TfUrlMethod getMethod();

    int getMethodValue();

    String getOutUrl();

    ByteString getOutUrlBytes();

    TfResource getResource();

    int getResourceValue();

    String getTag();

    ByteString getTagBytes();

    boolean getTf();

    TfTypeExt getTypeExt();

    int getTypeExtValue();

    String getUrl();

    ByteString getUrlBytes();
}
