package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateEventOrBuilder.class */
public interface TfActivateEventOrBuilder extends MessageLiteOrBuilder {
    boolean getIsAuto();

    boolean getIsSuccess();

    String getRawStatus();

    ByteString getRawStatusBytes();

    TfTypeExt getTypeExt();

    int getTypeExtValue();
}
