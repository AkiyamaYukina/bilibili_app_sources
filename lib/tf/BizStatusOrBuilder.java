package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/BizStatusOrBuilder.class */
public interface BizStatusOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    String getMessage();

    ByteString getMessageBytes();
}
